// Generated from com\stoc\Language.g4 by ANTLR 4.9.2
package com.stoc;
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
		BOOLEAN=1, STRING_LITERAL=2, MINI=3, ID_CON_ASIGNACION=4, PROM=5, LOTE=6, 
		AUTO=7, OBJECT=8, ENT=9, STRING=10, CHAR=11, BOOL=12, FLOAT=13, FALSO=14, 
		VERDADERO=15, BOOL_DER=16, BOOL_IZQ=17, PRINT=18, RESERVA_IBOX=19, RESERVA_EBOX=20, 
		RESERVA_EIBOX=21, FOR=22, WHILE=23, DO=24, LENGTH=25, SIZE=26, OP_SUM=27, 
		OP_RES=28, OP_MUL=29, OP_DIV=30, OP_CIERRE=31, OP_PUNTOCOMA=32, OP_MAYORQ=33, 
		OP_MENORQ=34, ASIG=35, ASIG_IGUALACION=36, MAYOR_IGUALACION=37, MENOR_IGUALACION=38, 
		AND=39, OR=40, NOT=41, CONCATENACION=42, LL_CLOSEL=43, LL_CLOSER=44, CO_CLOSEL=45, 
		CO_CLOSER=46, INICIALIZADOR_AUTO=47, INCREMENTO=48, DECREMENTO=49, PAR_CLOSEL=50, 
		PAR_CLOSER=51, ALMACENADOR=52, FLOAT_LITERAL=53, ENT_LITERAL=54, BOOLEAN_LITERAL=55, 
		CHARACTER_LITERAL=56, ID=57, WS=58, LINE_COMMENT=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "STRING_LITERAL", "MINI", "ID_CON_ASIGNACION", "PROM", "LOTE", 
			"AUTO", "OBJECT", "ENT", "STRING", "CHAR", "BOOL", "FLOAT", "FALSO", 
			"VERDADERO", "BOOL_DER", "BOOL_IZQ", "PRINT", "RESERVA_IBOX", "RESERVA_EBOX", 
			"RESERVA_EIBOX", "FOR", "WHILE", "DO", "LENGTH", "SIZE", "OP_SUM", "OP_RES", 
			"OP_MUL", "OP_DIV", "OP_CIERRE", "OP_PUNTOCOMA", "OP_MAYORQ", "OP_MENORQ", 
			"ASIG", "ASIG_IGUALACION", "MAYOR_IGUALACION", "MENOR_IGUALACION", "AND", 
			"OR", "NOT", "CONCATENACION", "LL_CLOSEL", "LL_CLOSER", "CO_CLOSEL", 
			"CO_CLOSER", "INICIALIZADOR_AUTO", "INCREMENTO", "DECREMENTO", "PAR_CLOSEL", 
			"PAR_CLOSER", "ALMACENADOR", "FLOAT_LITERAL", "ENT_LITERAL", "BOOLEAN_LITERAL", 
			"CHARACTER_LITERAL", "ID", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'ChupapiStorage'", "'lote'", 
			"'etiqueta'", "'mini'", "'palanca'", "'prom'", "'[0]'", "'[1]'", "'der'", 
			"'izq'", "'etiquetadora'", "'ibox'", "'ebox'", "'eibox'", null, "'whe'", 
			"'do'", "'lenght'", "'size'", "'+'", "'-'", "'*'", "'/'", "':'", "';'", 
			"'>'", "'<'", "'='", "'=='", "'>='", "'<='", "'&&'", "'||'", "'!'", "'<+>'", 
			"'{'", "'}'", "'['", "']'", "'a'", "'++'", "'--'", "'('", "')'", "'\uD83D\uDC1F'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "STRING_LITERAL", "MINI", "ID_CON_ASIGNACION", "PROM", 
			"LOTE", "AUTO", "OBJECT", "ENT", "STRING", "CHAR", "BOOL", "FLOAT", "FALSO", 
			"VERDADERO", "BOOL_DER", "BOOL_IZQ", "PRINT", "RESERVA_IBOX", "RESERVA_EBOX", 
			"RESERVA_EIBOX", "FOR", "WHILE", "DO", "LENGTH", "SIZE", "OP_SUM", "OP_RES", 
			"OP_MUL", "OP_DIV", "OP_CIERRE", "OP_PUNTOCOMA", "OP_MAYORQ", "OP_MENORQ", 
			"ASIG", "ASIG_IGUALACION", "MAYOR_IGUALACION", "MENOR_IGUALACION", "AND", 
			"OR", "NOT", "CONCATENACION", "LL_CLOSEL", "LL_CLOSER", "CO_CLOSEL", 
			"CO_CLOSER", "INICIALIZADOR_AUTO", "INCREMENTO", "DECREMENTO", "PAR_CLOSEL", 
			"PAR_CLOSER", "ALMACENADOR", "FLOAT_LITERAL", "ENT_LITERAL", "BOOLEAN_LITERAL", 
			"CHARACTER_LITERAL", "ID", "WS", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u0192\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0083\n\2\3\3\3\3\7\3\u0087\n\3\f\3"+
		"\16\3\u008a\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0098"+
		"\n\5\3\6\6\6\u009b\n\6\r\6\16\6\u009c\3\6\3\6\6\6\u00a1\n\6\r\6\16\6\u00a2"+
		"\3\7\6\7\u00a6\n\7\r\7\16\7\u00a7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3"+
		"\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\6\66\u0161\n\66\r\66\16\66\u0162\3\66\3\66\6\66\u0167\n\66\r\66\16\66"+
		"\u0168\3\67\6\67\u016c\n\67\r\67\16\67\u016d\38\38\38\38\58\u0174\n8\3"+
		"9\39\39\39\3:\3:\7:\u017c\n:\f:\16:\u017f\13:\3;\6;\u0182\n;\r;\16;\u0183"+
		"\3;\3;\3<\3<\3<\3<\7<\u018c\n<\f<\16<\u018f\13<\3<\3<\2\2=\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=\3\2"+
		"\t\5\2\f\f\17\17$$\3\2\62;\5\2\f\f\17\17))\5\2C\\aac|\6\2\62;C\\aac|\5"+
		"\2\13\f\16\17\"\"\4\2\f\f\17\17\3\3\2\uf421\3\uf421\3\u01a0\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3\u0082\3\2\2\2\5\u0084"+
		"\3\2\2\2\7\u008d\3\2\2\2\t\u0091\3\2\2\2\13\u009a\3\2\2\2\r\u00a5\3\2"+
		"\2\2\17\u00a9\3\2\2\2\21\u00ae\3\2\2\2\23\u00bd\3\2\2\2\25\u00c2\3\2\2"+
		"\2\27\u00cb\3\2\2\2\31\u00d0\3\2\2\2\33\u00d8\3\2\2\2\35\u00dd\3\2\2\2"+
		"\37\u00e1\3\2\2\2!\u00e5\3\2\2\2#\u00e9\3\2\2\2%\u00ed\3\2\2\2\'\u00fa"+
		"\3\2\2\2)\u00ff\3\2\2\2+\u0104\3\2\2\2-\u010a\3\2\2\2/\u010f\3\2\2\2\61"+
		"\u0113\3\2\2\2\63\u0116\3\2\2\2\65\u011d\3\2\2\2\67\u0122\3\2\2\29\u0124"+
		"\3\2\2\2;\u0126\3\2\2\2=\u0128\3\2\2\2?\u012a\3\2\2\2A\u012c\3\2\2\2C"+
		"\u012e\3\2\2\2E\u0130\3\2\2\2G\u0132\3\2\2\2I\u0134\3\2\2\2K\u0137\3\2"+
		"\2\2M\u013a\3\2\2\2O\u013d\3\2\2\2Q\u0140\3\2\2\2S\u0143\3\2\2\2U\u0145"+
		"\3\2\2\2W\u0149\3\2\2\2Y\u014b\3\2\2\2[\u014d\3\2\2\2]\u014f\3\2\2\2_"+
		"\u0151\3\2\2\2a\u0153\3\2\2\2c\u0156\3\2\2\2e\u0159\3\2\2\2g\u015b\3\2"+
		"\2\2i\u015d\3\2\2\2k\u0160\3\2\2\2m\u016b\3\2\2\2o\u0173\3\2\2\2q\u0175"+
		"\3\2\2\2s\u0179\3\2\2\2u\u0181\3\2\2\2w\u0187\3\2\2\2yz\7v\2\2z{\7t\2"+
		"\2{|\7w\2\2|\u0083\7g\2\2}~\7h\2\2~\177\7c\2\2\177\u0080\7n\2\2\u0080"+
		"\u0081\7u\2\2\u0081\u0083\7g\2\2\u0082y\3\2\2\2\u0082}\3\2\2\2\u0083\4"+
		"\3\2\2\2\u0084\u0088\7$\2\2\u0085\u0087\n\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7$\2\2\u008c\6\3\2\2\2\u008d\u008e"+
		"\7)\2\2\u008e\u008f\13\2\2\2\u008f\u0090\7)\2\2\u0090\b\3\2\2\2\u0091"+
		"\u0092\5s:\2\u0092\u0097\5G$\2\u0093\u0098\5\r\7\2\u0094\u0098\5\13\6"+
		"\2\u0095\u0098\5\3\2\2\u0096\u0098\5\7\4\2\u0097\u0093\3\2\2\2\u0097\u0094"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\n\3\2\2\2\u0099"+
		"\u009b\t\3\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\7\60\2\2\u009f"+
		"\u00a1\t\3\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\f\3\2\2\2\u00a4\u00a6\t\3\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\16\3\2\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\u00ad\7q\2\2\u00ad\20\3\2\2\2\u00ae\u00af\7E\2\2\u00af\u00b0\7j\2\2\u00b0"+
		"\u00b1\7w\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7r\2\2"+
		"\u00b4\u00b5\7k\2\2\u00b5\u00b6\7U\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8"+
		"\7q\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7i\2\2\u00bb"+
		"\u00bc\7g\2\2\u00bc\22\3\2\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7q\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\u00c1\7g\2\2\u00c1\24\3\2\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\u00c4\7v\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7s\2\2\u00c6\u00c7\7w\2\2"+
		"\u00c7\u00c8\7g\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7c\2\2\u00ca\26\3\2"+
		"\2\2\u00cb\u00cc\7o\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf"+
		"\7k\2\2\u00cf\30\3\2\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3"+
		"\7n\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7e\2\2\u00d6"+
		"\u00d7\7c\2\2\u00d7\32\3\2\2\2\u00d8\u00d9\7r\2\2\u00d9\u00da\7t\2\2\u00da"+
		"\u00db\7q\2\2\u00db\u00dc\7o\2\2\u00dc\34\3\2\2\2\u00dd\u00de\7]\2\2\u00de"+
		"\u00df\7\62\2\2\u00df\u00e0\7_\2\2\u00e0\36\3\2\2\2\u00e1\u00e2\7]\2\2"+
		"\u00e2\u00e3\7\63\2\2\u00e3\u00e4\7_\2\2\u00e4 \3\2\2\2\u00e5\u00e6\7"+
		"f\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7t\2\2\u00e8\"\3\2\2\2\u00e9\u00ea"+
		"\7k\2\2\u00ea\u00eb\7|\2\2\u00eb\u00ec\7s\2\2\u00ec$\3\2\2\2\u00ed\u00ee"+
		"\7g\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7s\2\2\u00f1"+
		"\u00f2\7w\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7c\2\2"+
		"\u00f5\u00f6\7f\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9"+
		"\7c\2\2\u00f9&\3\2\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7d\2\2\u00fc\u00fd"+
		"\7q\2\2\u00fd\u00fe\7z\2\2\u00fe(\3\2\2\2\u00ff\u0100\7g\2\2\u0100\u0101"+
		"\7d\2\2\u0101\u0102\7q\2\2\u0102\u0103\7z\2\2\u0103*\3\2\2\2\u0104\u0105"+
		"\7g\2\2\u0105\u0106\7k\2\2\u0106\u0107\7d\2\2\u0107\u0108\7q\2\2\u0108"+
		"\u0109\7z\2\2\u0109,\3\2\2\2\u010a\u010b\7c\2\2\u010b\u010c\7w\2\2\u010c"+
		"\u010d\7v\2\2\u010d\u010e\7q\2\2\u010e.\3\2\2\2\u010f\u0110\7y\2\2\u0110"+
		"\u0111\7j\2\2\u0111\u0112\7g\2\2\u0112\60\3\2\2\2\u0113\u0114\7f\2\2\u0114"+
		"\u0115\7q\2\2\u0115\62\3\2\2\2\u0116\u0117\7n\2\2\u0117\u0118\7g\2\2\u0118"+
		"\u0119\7p\2\2\u0119\u011a\7i\2\2\u011a\u011b\7j\2\2\u011b\u011c\7v\2\2"+
		"\u011c\64\3\2\2\2\u011d\u011e\7u\2\2\u011e\u011f\7k\2\2\u011f\u0120\7"+
		"|\2\2\u0120\u0121\7g\2\2\u0121\66\3\2\2\2\u0122\u0123\7-\2\2\u01238\3"+
		"\2\2\2\u0124\u0125\7/\2\2\u0125:\3\2\2\2\u0126\u0127\7,\2\2\u0127<\3\2"+
		"\2\2\u0128\u0129\7\61\2\2\u0129>\3\2\2\2\u012a\u012b\7<\2\2\u012b@\3\2"+
		"\2\2\u012c\u012d\7=\2\2\u012dB\3\2\2\2\u012e\u012f\7@\2\2\u012fD\3\2\2"+
		"\2\u0130\u0131\7>\2\2\u0131F\3\2\2\2\u0132\u0133\7?\2\2\u0133H\3\2\2\2"+
		"\u0134\u0135\7?\2\2\u0135\u0136\7?\2\2\u0136J\3\2\2\2\u0137\u0138\7@\2"+
		"\2\u0138\u0139\7?\2\2\u0139L\3\2\2\2\u013a\u013b\7>\2\2\u013b\u013c\7"+
		"?\2\2\u013cN\3\2\2\2\u013d\u013e\7(\2\2\u013e\u013f\7(\2\2\u013fP\3\2"+
		"\2\2\u0140\u0141\7~\2\2\u0141\u0142\7~\2\2\u0142R\3\2\2\2\u0143\u0144"+
		"\7#\2\2\u0144T\3\2\2\2\u0145\u0146\7>\2\2\u0146\u0147\7-\2\2\u0147\u0148"+
		"\7@\2\2\u0148V\3\2\2\2\u0149\u014a\7}\2\2\u014aX\3\2\2\2\u014b\u014c\7"+
		"\177\2\2\u014cZ\3\2\2\2\u014d\u014e\7]\2\2\u014e\\\3\2\2\2\u014f\u0150"+
		"\7_\2\2\u0150^\3\2\2\2\u0151\u0152\7c\2\2\u0152`\3\2\2\2\u0153\u0154\7"+
		"-\2\2\u0154\u0155\7-\2\2\u0155b\3\2\2\2\u0156\u0157\7/\2\2\u0157\u0158"+
		"\7/\2\2\u0158d\3\2\2\2\u0159\u015a\7*\2\2\u015af\3\2\2\2\u015b\u015c\7"+
		"+\2\2\u015ch\3\2\2\2\u015d\u015e\t\t\2\2\u015ej\3\2\2\2\u015f\u0161\t"+
		"\3\2\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\7\60\2\2\u0165\u0167\t"+
		"\3\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169l\3\2\2\2\u016a\u016c\t\3\2\2\u016b\u016a\3\2\2\2"+
		"\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016en\3"+
		"\2\2\2\u016f\u0170\7v\2\2\u0170\u0174\7\63\2\2\u0171\u0172\7h\2\2\u0172"+
		"\u0174\7\62\2\2\u0173\u016f\3\2\2\2\u0173\u0171\3\2\2\2\u0174p\3\2\2\2"+
		"\u0175\u0176\7)\2\2\u0176\u0177\n\4\2\2\u0177\u0178\7)\2\2\u0178r\3\2"+
		"\2\2\u0179\u017d\t\5\2\2\u017a\u017c\t\6\2\2\u017b\u017a\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017et\3\2\2\2"+
		"\u017f\u017d\3\2\2\2\u0180\u0182\t\7\2\2\u0181\u0180\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\b;\2\2\u0186v\3\2\2\2\u0187\u0188\7\61\2\2\u0188\u0189\7\61\2\2"+
		"\u0189\u018d\3\2\2\2\u018a\u018c\n\b\2\2\u018b\u018a\3\2\2\2\u018c\u018f"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u0190\u0191\b<\2\2\u0191x\3\2\2\2\20\2\u0082\u0088\u0097"+
		"\u009c\u00a2\u00a7\u0162\u0168\u016d\u0173\u017d\u0183\u018d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}