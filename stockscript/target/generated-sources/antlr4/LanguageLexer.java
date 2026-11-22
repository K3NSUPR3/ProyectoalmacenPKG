// Generated from src/main/antlr4/com/stockscript/Language.g4 by ANTLR 4.9.2
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
		FLOAT_LITERAL=32, STRING_LITERAL=33, CHAR_LITERAL=34, ID=35, WS=36, COMMENT=37;
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
			"STRING_LITERAL", "CHAR_LITERAL", "ID", "WS", "COMMENT"
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
			"STRING_LITERAL", "CHAR_LITERAL", "ID", "WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u00af\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \6 \u00c4\n \r \16 \u00c5"+
		"\3!\6!\u00c9\n!\r!\16!\u00ca\3!\3!\6!\u00cf\n!\r!\16!\u00d0\3\"\3\"\7"+
		"\"\u00d5\n\"\f\"\16\"\u00d8\13\"\3\"\3\"\3#\3#\3#\3#\3$\3$\7$\u00e2\n"+
		"$\f$\16$\u00e5\13$\3%\6%\u00e8\n%\r%\16%\u00e9\3%\3%\3&\3&\3&\3&\7&\u00f2"+
		"\n&\f&\16&\u00f5\13&\3&\3&\3\u00d6\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\7\3\2\62;\5"+
		"\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\3\2\uf421"+
		"\3\uf421\3\u00ff\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2"+
		"\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23]\3\2"+
		"\2\2\25`\3\2\2\2\27b\3\2\2\2\31d\3\2\2\2\33f\3\2\2\2\35h\3\2\2\2\37j\3"+
		"\2\2\2!l\3\2\2\2#o\3\2\2\2%r\3\2\2\2\'u\3\2\2\2)x\3\2\2\2+z\3\2\2\2-\177"+
		"\3\2\2\2/\u0084\3\2\2\2\61\u008d\3\2\2\2\63\u0092\3\2\2\2\65\u009a\3\2"+
		"\2\2\67\u009f\3\2\2\29\u00ae\3\2\2\2;\u00b0\3\2\2\2=\u00b5\3\2\2\2?\u00c3"+
		"\3\2\2\2A\u00c8\3\2\2\2C\u00d2\3\2\2\2E\u00db\3\2\2\2G\u00df\3\2\2\2I"+
		"\u00e7\3\2\2\2K\u00ed\3\2\2\2MN\7]\2\2N\4\3\2\2\2OP\7_\2\2P\6\3\2\2\2"+
		"QR\7*\2\2R\b\3\2\2\2ST\7+\2\2T\n\3\2\2\2UV\7}\2\2V\f\3\2\2\2WX\7\177\2"+
		"\2X\16\3\2\2\2YZ\7<\2\2Z\20\3\2\2\2[\\\7?\2\2\\\22\3\2\2\2]^\7-\2\2^_"+
		"\7-\2\2_\24\3\2\2\2`a\7-\2\2a\26\3\2\2\2bc\7/\2\2c\30\3\2\2\2de\7,\2\2"+
		"e\32\3\2\2\2fg\7\61\2\2g\34\3\2\2\2hi\7@\2\2i\36\3\2\2\2jk\7>\2\2k \3"+
		"\2\2\2lm\7@\2\2mn\7?\2\2n\"\3\2\2\2op\7>\2\2pq\7?\2\2q$\3\2\2\2rs\7?\2"+
		"\2st\7?\2\2t&\3\2\2\2uv\7#\2\2vw\7?\2\2w(\3\2\2\2xy\t\7\2\2y*\3\2\2\2"+
		"z{\7n\2\2{|\7q\2\2|}\7v\2\2}~\7g\2\2~,\3\2\2\2\177\u0080\7r\2\2\u0080"+
		"\u0081\7t\2\2\u0081\u0082\7q\2\2\u0082\u0083\7o\2\2\u0083.\3\2\2\2\u0084"+
		"\u0085\7g\2\2\u0085\u0086\7v\2\2\u0086\u0087\7k\2\2\u0087\u0088\7s\2\2"+
		"\u0088\u0089\7w\2\2\u0089\u008a\7g\2\2\u008a\u008b\7v\2\2\u008b\u008c"+
		"\7c\2\2\u008c\60\3\2\2\2\u008d\u008e\7o\2\2\u008e\u008f\7k\2\2\u008f\u0090"+
		"\7p\2\2\u0090\u0091\7k\2\2\u0091\62\3\2\2\2\u0092\u0093\7r\2\2\u0093\u0094"+
		"\7c\2\2\u0094\u0095\7n\2\2\u0095\u0096\7c\2\2\u0096\u0097\7p\2\2\u0097"+
		"\u0098\7e\2\2\u0098\u0099\7c\2\2\u0099\64\3\2\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7d\2\2\u009c\u009d\7q\2\2\u009d\u009e\7z\2\2\u009e\66\3\2\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7z\2\2"+
		"\u00a38\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7d\2"+
		"\2\u00a7\u00a8\7q\2\2\u00a8\u00af\7z\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7q\2\2\u00ad\u00af\7z\2\2\u00ae"+
		"\u00a4\3\2\2\2\u00ae\u00a9\3\2\2\2\u00af:\3\2\2\2\u00b0\u00b1\7c\2\2\u00b1"+
		"\u00b2\7w\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7q\2\2\u00b4<\3\2\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7s\2\2"+
		"\u00b9\u00ba\7w\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd"+
		"\7c\2\2\u00bd\u00be\7f\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7t\2\2\u00c0"+
		"\u00c1\7c\2\2\u00c1>\3\2\2\2\u00c2\u00c4\t\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6@\3\2\2\2"+
		"\u00c7\u00c9\t\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\7\60\2\2"+
		"\u00cd\u00cf\t\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1B\3\2\2\2\u00d2\u00d6\7$\2\2\u00d3\u00d5"+
		"\13\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da"+
		"\7$\2\2\u00daD\3\2\2\2\u00db\u00dc\7)\2\2\u00dc\u00dd\13\2\2\2\u00dd\u00de"+
		"\7)\2\2\u00deF\3\2\2\2\u00df\u00e3\t\3\2\2\u00e0\u00e2\t\4\2\2\u00e1\u00e0"+
		"\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"H\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\t\5\2\2\u00e7\u00e6\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ec\b%\2\2\u00ecJ\3\2\2\2\u00ed\u00ee\7\61\2\2\u00ee"+
		"\u00ef\7\61\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f2\n\6\2\2\u00f1\u00f0\3"+
		"\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\b&\2\2\u00f7L\3\2\2\2\13"+
		"\2\u00ae\u00c5\u00ca\u00d0\u00d6\u00e3\u00e9\u00f3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}