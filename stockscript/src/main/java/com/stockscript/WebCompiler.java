package com.stockscript;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class WebCompiler {

    private static class Diagnostic {
        final String fase;
        final int linea;
        final int columna;
        final String mensaje;

        Diagnostic(String fase, int linea, int columna, String mensaje) {
            this.fase = fase;
            this.linea = linea;
            this.columna = columna;
            this.mensaje = mensaje;
        }
    }

    private static class TokenInfo {
        final String texto;
        final String tipo;
        final int linea;
        final int columna;

        TokenInfo(String texto, String tipo, int linea, int columna) {
            this.texto = texto;
            this.tipo = tipo;
            this.linea = linea;
            this.columna = columna;
        }
    }

    private static class Collector extends BaseErrorListener {
        private final List<Diagnostic> diagnostics;
        private final String fase;

        Collector(List<Diagnostic> diagnostics, String fase) {
            this.diagnostics = diagnostics;
            this.fase = fase;
        }

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                                int charPositionInLine, String msg, RecognitionException e) {
            int columna = charPositionInLine;
            if (offendingSymbol instanceof Token) {
                columna = ((Token) offendingSymbol).getCharPositionInLine();
            }
            diagnostics.add(new Diagnostic(fase, line, columna, msg));
        }
    }

    public static void main(String[] args) throws Exception {
        String source = readAll(System.in);
        List<Diagnostic> diagnostics = new ArrayList<>();
        List<TokenInfo> tokensInfo = new ArrayList<>();

        CharStream input = CharStreams.fromString(source);
        LanguageLexer lexer = new LanguageLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new Collector(diagnostics, "lexica"));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        for (Token token : tokens.getTokens()) {
            if (token.getType() == Token.EOF) continue;
            String symbolic = LanguageLexer.VOCABULARY.getSymbolicName(token.getType());
            tokensInfo.add(new TokenInfo(token.getText(), symbolic, token.getLine(), token.getCharPositionInLine()));
        }

        LanguageParser parser = new LanguageParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new Collector(diagnostics, "sintactica"));
        LanguageParser.ProgramaContext tree = parser.programa();

        String salida = "";
        String simbolos = "[]";
        if (diagnostics.isEmpty()) {
            PrintStream original = System.out;
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            try {
                PrintStream capture = new PrintStream(buffer, true, "UTF-8");
                System.setOut(capture);
                LanguageCustomVisitor visitor = new LanguageCustomVisitor();
                visitor.visit(tree);
                simbolos = symbolsJson(visitor.getMemoria());
                capture.flush();
            } catch (Throwable error) {
                String mensaje = error.getMessage();
                if (mensaje == null || mensaje.isEmpty()) mensaje = error.getClass().getSimpleName();
                addRuntimeDiagnostic(diagnostics, mensaje);
            } finally {
                System.setOut(original);
            }
            salida = buffer.toString("UTF-8");
        }

        System.out.println(buildJson(diagnostics, tokensInfo, salida, simbolos));
    }

    private static String readAll(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] chunk = new byte[8192];
        int read;
        while ((read = in.read(chunk)) != -1) out.write(chunk, 0, read);
        return out.toString("UTF-8");
    }

    private static void addRuntimeDiagnostic(List<Diagnostic> diagnostics, String raw) {
        String mensaje = raw;
        String fase = "semantica";
        if (mensaje.contains("ERROR DE EJECUCION")) fase = "ejecucion";
        int linea = 1;
        Matcher matcher = Pattern.compile("\\[Linea\\s+(\\d+)\\]").matcher(mensaje);
        if (matcher.find()) {
            try { linea = Integer.parseInt(matcher.group(1)); } catch (NumberFormatException ignored) { linea = 1; }
        }
        mensaje = mensaje.replaceFirst("^ERROR\\s+(SEMANTICO|DE EJECUCION)\\s*", "");
        mensaje = mensaje.replaceFirst("^\\[Linea\\s+\\d+\\]:\\s*", "");
        diagnostics.add(new Diagnostic(fase, linea, 0, mensaje));
    }

    private static String buildJson(List<Diagnostic> diagnostics, List<TokenInfo> tokens,
                                    String salida, String simbolos) {
        List<String> diagJson = new ArrayList<>();
        for (Diagnostic d : diagnostics) {
            diagJson.add("{\"fase\":\"" + escape(d.fase) + "\",\"linea\":" + d.linea
                    + ",\"columna\":" + d.columna + ",\"mensaje\":\"" + escape(d.mensaje) + "\"}");
        }
        List<String> tokenJson = new ArrayList<>();
        for (TokenInfo t : tokens) {
            tokenJson.add("{\"texto\":\"" + escape(t.texto) + "\",\"tipo\":\"" + escape(t.tipo)
                    + "\",\"linea\":" + t.linea + ",\"columna\":" + t.columna + "}");
        }
        return "{\"ok\":" + diagnostics.isEmpty()
                + ",\"diagnostics\":[" + String.join(",", diagJson) + "]"
                + ",\"tokens\":[" + String.join(",", tokenJson) + "]"
                + ",\"salida\":\"" + escape(salida) + "\""
                + ",\"simbolos\":[" + simbolos + "]}";
    }

    private static String symbolsJson(Map<String, Simbolo> memory) {
        List<String> items = new ArrayList<>();
        List<String> nombres = new ArrayList<>(memory.keySet());
        Collections.sort(nombres);
        for (String nombre : nombres) {
            Simbolo simbolo = memory.get(nombre);
            items.add("{\"nombre\":\"" + escape(nombre) + "\",\"tipo\":\""
                    + escape(simbolo.tipo.name()) + "\",\"valor\":\""
                    + escape(String.valueOf(simbolo.valor)) + "\"}");
        }
        return String.join(",", items);
    }

    private static String escape(String value) {
        if (value == null) return "";
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            switch (c) {
                case '"': out.append("\\\""); break;
                case '\\': out.append("\\\\"); break;
                case '\n': out.append("\\n"); break;
                case '\r': out.append("\\r"); break;
                case '\t': out.append("\\t"); break;
                case '\b': out.append("\\b"); break;
                case '\f': out.append("\\f"); break;
                default:
                    if (c < 0x20) out.append(String.format("\\u%04x", (int) c));
                    else out.append(c);
            }
        }
        return out.toString();
    }
}
