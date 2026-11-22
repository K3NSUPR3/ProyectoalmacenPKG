package com.stockscript;

import org.antlr.v4.gui.Trees;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    private static final String EXTENSION = "stoc";
    
    /**
     * Detección dinámica para evitar errores de ruta si se ejecuta desde la raíz o desde la subcarpeta
     */
    private static String resolveBaseDir() {
        if (new File("src/test/resources/").exists()) {
            return "src/test/resources/";
        } else if (new File("stockscript/src/test/resources/").exists()) {
            return "stockscript/src/test/resources/";
        }
        return "src/test/resources/";
    }

    public static void main(String[] args) throws IOException {
        String dirBase = resolveBaseDir();
        String files[] = args.length == 0 ? new String[] { "test." + EXTENSION } : args;
        System.out.println("Dirbase: " + dirBase);

        for (String file : files) {
            System.out.println("START: " + file);

            CharStream in = CharStreams.fromFileName(dirBase + file, StandardCharsets.UTF_8);
            LanguageLexer lexer = new LanguageLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            tokens.fill();
            System.out.println("\n--- TOKENS DETECTADOS ---");
            tokens.getTokens().forEach(token -> {
                System.out.println(
                        "Texto: " + token.getText() +
                        " | Tipo: " + LanguageLexer.VOCABULARY.getSymbolicName(token.getType()) +
                        " | Ln" + token.getLine() + ", Col" + token.getCharPositionInLine());
            });

            LanguageParser parser = new LanguageParser(tokens);
            
            // 1. Regla de entrada correcta según Language.g4
            LanguageParser.ProgramaContext tree = parser.programa();

            // 2. Despliegue de la ventana gráfica Swing oficial de ANTLR
            System.out.println("\nAbriendo árbol sintáctico gráfico...");
            try {
                Trees.inspect(tree, parser);
            } catch (Throwable t) {
                System.out.println("Ventana gráfica omitida: " + t.getMessage());
            }

            // 3. Ejecución del análisis semántico e interpretación
            System.out.println("\n--- EJECUCIÓN DEL PROGRAMA (VISITOR) ---");
            LanguageCustomVisitor visitor = new LanguageCustomVisitor();
            visitor.visit(tree);

            System.out.println("\nFINISH: " + file);
        }
    }
}
