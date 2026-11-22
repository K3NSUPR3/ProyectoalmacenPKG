// Generated from com\stockscript\Language.g4 by ANTLR 4.9.2
package com.stockscript;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CO_IZQ=1, CO_DER=2, PAR_IZQ=3, PAR_DER=4, LL_IZQ=5, LL_DER=6, OP_CIERRE=7, 
		OP_ASIG=8, OP_INCREMENTO=9, OP_SUMA=10, OP_RESTA=11, OP_MULT=12, OP_DIV=13, 
		OP_MAYOR=14, OP_MENOR=15, OP_MAYORIGUAL=16, OP_MENORIGUAL=17, OP_IGUAL=18, 
		OP_DIFERENTE=19, ALMACENADOR=20, ENT=21, FLOAT=22, STRING=23, CHAR=24, 
		BOOL=25, IF=26, ELSE=27, ELSEIF=28, FOR=29, PRINT=30, INT_LITERAL=31, 
		FLOAT_LITERAL=32, STRING_LITERAL=33, CHAR_LITERAL=34, BOOL_LITERAL=35, 
		ID=36, WS=37, COMMENT=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CO_IZQ", "CO_DER", "PAR_IZQ", "PAR_DER", "LL_IZQ", "LL_DER", "OP_CIERRE", 
			"OP_ASIG", "OP_INCREMENTO", "OP_SUMA", "OP_RESTA", "OP_MULT", "OP_DIV", 
			"OP_MAYOR", "OP_MENOR", "OP_MAYORIGUAL", "OP_MENORIGUAL", "OP_IGUAL", 
			"OP_DIFERENTE", "ALMACENADOR", "ENT", "FLOAT", "STRING", "CHAR", "BOOL", 
			"IF", "ELSE", "ELSEIF", "FOR", "PRINT", "INT_LITERAL", "FLOAT_LITERAL", 
			"STRING_LITERAL", "CHAR_LITERAL", "BOOL_LITERAL", "ID", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "'{'", "'}'", "':'", "'='", "'++'", 
			"'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'\uD83D\uDC1F'", "'lote'", "'prom'", "'etiqueta'", "'mini'", "'palanca'", 
			"'ibox'", "'ebox'", null, "'auto'", "'etiquetadora'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CO_IZQ", "CO_DER", "PAR_IZQ", "PAR_DER", "LL_IZQ", "LL_DER", "OP_CIERRE", 
			"OP_ASIG", "OP_INCREMENTO", "OP_SUMA", "OP_RESTA", "OP_MULT", "OP_DIV", 
			"OP_MAYOR", "OP_MENOR", "OP_MAYORIGUAL", "OP_MENORIGUAL", "OP_IGUAL", 
			"OP_DIFERENTE", "ALMACENADOR", "ENT", "FLOAT", "STRING", "CHAR", "BOOL", 
			"IF", "ELSE", "ELSEIF", "FOR", "PRINT", "INT_LITERAL", "FLOAT_LITERAL", 
			"STRING_LITERAL", "CHAR_LITERAL", "BOOL_LITERAL", "ID", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u010e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u00b1\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \6 \u00c6\n \r \16"+
		" \u00c7\3!\6!\u00cb\n!\r!\16!\u00cc\3!\3!\6!\u00d1\n!\r!\16!\u00d2\3\""+
		"\3\"\7\"\u00d7\n\"\f\"\16\"\u00da\13\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00f4\n$\3%\3%\7%\u00f8"+
		"\n%\f%\16%\u00fb\13%\3&\6&\u00fe\n&\r&\16&\u00ff\3&\3&\3\'\3\'\3\'\3\'"+
		"\7\'\u0108\n\'\f\'\16\'\u010b\13\'\3\'\3\'\3\u00d8\2(\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\17\17\3\3\2\uf421\3\uf421\3\u0118\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\rY\3\2\2\2\17"+
		"[\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2"+
		"\33h\3\2\2\2\35j\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#q\3\2\2\2%t\3\2\2\2\'w"+
		"\3\2\2\2)z\3\2\2\2+|\3\2\2\2-\u0081\3\2\2\2/\u0086\3\2\2\2\61\u008f\3"+
		"\2\2\2\63\u0094\3\2\2\2\65\u009c\3\2\2\2\67\u00a1\3\2\2\29\u00b0\3\2\2"+
		"\2;\u00b2\3\2\2\2=\u00b7\3\2\2\2?\u00c5\3\2\2\2A\u00ca\3\2\2\2C\u00d4"+
		"\3\2\2\2E\u00dd\3\2\2\2G\u00f3\3\2\2\2I\u00f5\3\2\2\2K\u00fd\3\2\2\2M"+
		"\u0103\3\2\2\2OP\7]\2\2P\4\3\2\2\2QR\7_\2\2R\6\3\2\2\2ST\7*\2\2T\b\3\2"+
		"\2\2UV\7+\2\2V\n\3\2\2\2WX\7}\2\2X\f\3\2\2\2YZ\7\177\2\2Z\16\3\2\2\2["+
		"\\\7<\2\2\\\20\3\2\2\2]^\7?\2\2^\22\3\2\2\2_`\7-\2\2`a\7-\2\2a\24\3\2"+
		"\2\2bc\7-\2\2c\26\3\2\2\2de\7/\2\2e\30\3\2\2\2fg\7,\2\2g\32\3\2\2\2hi"+
		"\7\61\2\2i\34\3\2\2\2jk\7@\2\2k\36\3\2\2\2lm\7>\2\2m \3\2\2\2no\7@\2\2"+
		"op\7?\2\2p\"\3\2\2\2qr\7>\2\2rs\7?\2\2s$\3\2\2\2tu\7?\2\2uv\7?\2\2v&\3"+
		"\2\2\2wx\7#\2\2xy\7?\2\2y(\3\2\2\2z{\t\7\2\2{*\3\2\2\2|}\7n\2\2}~\7q\2"+
		"\2~\177\7v\2\2\177\u0080\7g\2\2\u0080,\3\2\2\2\u0081\u0082\7r\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7q\2\2\u0084\u0085\7o\2\2\u0085.\3\2\2\2\u0086"+
		"\u0087\7g\2\2\u0087\u0088\7v\2\2\u0088\u0089\7k\2\2\u0089\u008a\7s\2\2"+
		"\u008a\u008b\7w\2\2\u008b\u008c\7g\2\2\u008c\u008d\7v\2\2\u008d\u008e"+
		"\7c\2\2\u008e\60\3\2\2\2\u008f\u0090\7o\2\2\u0090\u0091\7k\2\2\u0091\u0092"+
		"\7p\2\2\u0092\u0093\7k\2\2\u0093\62\3\2\2\2\u0094\u0095\7r\2\2\u0095\u0096"+
		"\7c\2\2\u0096\u0097\7n\2\2\u0097\u0098\7c\2\2\u0098\u0099\7p\2\2\u0099"+
		"\u009a\7e\2\2\u009a\u009b\7c\2\2\u009b\64\3\2\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7d\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7z\2\2\u00a0\66\3\2\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7d\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7z\2\2"+
		"\u00a58\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7d\2"+
		"\2\u00a9\u00aa\7q\2\2\u00aa\u00b1\7z\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af\7q\2\2\u00af\u00b1\7z\2\2\u00b0"+
		"\u00a6\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b1:\3\2\2\2\u00b2\u00b3\7c\2\2\u00b3"+
		"\u00b4\7w\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7q\2\2\u00b6<\3\2\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7s\2\2"+
		"\u00bb\u00bc\7w\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7v\2\2\u00be\u00bf"+
		"\7c\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7t\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3>\3\2\2\2\u00c4\u00c6\t\2\2\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8@\3\2\2\2"+
		"\u00c9\u00cb\t\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\7\60\2\2"+
		"\u00cf\u00d1\t\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3B\3\2\2\2\u00d4\u00d8\7$\2\2\u00d5\u00d7"+
		"\13\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d9\3\2\2\2"+
		"\u00d8\u00d6\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc"+
		"\7$\2\2\u00dcD\3\2\2\2\u00dd\u00de\7)\2\2\u00de\u00df\13\2\2\2\u00df\u00e0"+
		"\7)\2\2\u00e0F\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4"+
		"\7i\2\2\u00e4\u00e5\7j\2\2\u00e5\u00f4\7v\2\2\u00e6\u00e7\7n\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\u00e9\7h\2\2\u00e9\u00f4\7v\2\2\u00ea\u00eb\7v\2\2"+
		"\u00eb\u00ec\7t\2\2\u00ec\u00ed\7w\2\2\u00ed\u00f4\7g\2\2\u00ee\u00ef"+
		"\7h\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7u\2\2\u00f2"+
		"\u00f4\7g\2\2\u00f3\u00e1\3\2\2\2\u00f3\u00e6\3\2\2\2\u00f3\u00ea\3\2"+
		"\2\2\u00f3\u00ee\3\2\2\2\u00f4H\3\2\2\2\u00f5\u00f9\t\3\2\2\u00f6\u00f8"+
		"\t\4\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00faJ\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe\t\5\2\2"+
		"\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b&\2\2\u0102L\3\2\2\2\u0103\u0104"+
		"\7\61\2\2\u0104\u0105\7\61\2\2\u0105\u0109\3\2\2\2\u0106\u0108\n\6\2\2"+
		"\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\b\'\2\2\u010d"+
		"N\3\2\2\2\f\2\u00b0\u00c7\u00cc\u00d2\u00d8\u00f3\u00f9\u00ff\u0109\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}