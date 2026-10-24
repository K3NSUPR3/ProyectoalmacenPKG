package com.stoc;

import org.antlr.v4.gui.Trees;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

public class Main {

    private static final String EXTENSION = "lang";
    private static final String DIRBASE = "src/test/resources/";

    public static void main(String[] args) throws IOException, ReflectiveOperationException {
        String files[] = args.length == 0 ? new String[] { "test." + EXTENSION } : args;
        System.out.println("Dirbase: " + DIRBASE);
        for (String file : files) {
            System.out.println("START: " + file);

            CharStream in = CharStreams.fromFileName(DIRBASE + file);
            LanguageLexer lexer = new LanguageLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            tokens.fill();
            System.out.println("TOKENS:");
            tokens.getTokens().forEach(token -> {
                System.out.println(
                        "Texto: " + token.getText() +
                                "| Tipo: " + LanguageLexer.VOCABULARY.getSymbolicName(token.getType()) +
                                "| Ln" + token.getLine() + ", Col" + token.getCharPositionInLine());
            });

            LanguageParser parser = new LanguageParser(tokens);
            String entryRule = parser.getRuleNames()[0];
            ParserRuleContext tree = (ParserRuleContext) parser.getClass()
                    .getMethod(entryRule)
                    .invoke(parser);

            Trees.inspect(tree, parser);

            LanguageCustomVisitor visitor = new LanguageCustomVisitor();
            visitor.visit(tree);

            System.out.println("FINISH: " + file);
        }
    }
}
