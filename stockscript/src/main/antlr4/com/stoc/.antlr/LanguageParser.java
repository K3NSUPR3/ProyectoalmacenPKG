// Generated from c:/Users/sonic/Downloads/TEC/Semestre 8/Lenguajes y autómatas 2/ProyectoalmacenPKG/stockscript/src/main/antlr4/com/stoc/Language.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_declaracion = 2, RULE_asignacion = 3, 
		RULE_impresion = 4, RULE_condicion_activada = 5, RULE_condicion_desactivada = 6, 
		RULE_estructura_de_condicion = 7, RULE_ciclo = 8, RULE_comparacion = 9, 
		RULE_expresion = 10, RULE_termino = 11, RULE_factor = 12, RULE_tipo = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "declaracion", "asignacion", "impresion", 
			"condicion_activada", "condicion_desactivada", "estructura_de_condicion", 
			"ciclo", "comparacion", "expresion", "termino", "factor", "tipo"
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
			"'{'", "'}'", "'['", "']'", "'a'", "'++'", "'--'", "'('", "')'", "'\\uD83D\uDC1F'"
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

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LanguageParser.EOF, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				instruccion();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 280349076806224550L) != 0) );
			setState(33);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode OP_CIERRE() { return getToken(LanguageParser.OP_CIERRE, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public Condicion_activadaContext condicion_activada() {
			return getRuleContext(Condicion_activadaContext.class,0);
		}
		public Condicion_desactivadaContext condicion_desactivada() {
			return getRuleContext(Condicion_desactivadaContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				declaracion();
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_CIERRE) {
					{
					setState(36);
					match(OP_CIERRE);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				asignacion();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_CIERRE) {
					{
					setState(40);
					match(OP_CIERRE);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				impresion();
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_CIERRE) {
					{
					setState(44);
					match(OP_CIERRE);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				condicion_activada();
				setState(48);
				match(OP_CIERRE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				condicion_desactivada();
				setState(51);
				match(OP_CIERRE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				ciclo();
				setState(54);
				match(OP_CIERRE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				comparacion();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_CIERRE) {
					{
					setState(57);
					match(OP_CIERRE);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				expresion();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_CIERRE) {
					{
					setState(61);
					match(OP_CIERRE);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(LanguageParser.ASIG, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			tipo();
			setState(67);
			match(ID);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIG) {
				{
				setState(68);
				match(ASIG);
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(69);
					comparacion();
					}
					break;
				case 2:
					{
					setState(70);
					expresion();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(LanguageParser.ASIG, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode INCREMENTO() { return getToken(LanguageParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(LanguageParser.DECREMENTO, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(ID);
				setState(76);
				match(ASIG);
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(77);
					comparacion();
					}
					break;
				case 2:
					{
					setState(78);
					expresion();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(ID);
				setState(82);
				_la = _input.LA(1);
				if ( !(_la==INCREMENTO || _la==DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LanguageParser.PRINT, 0); }
		public TerminalNode PAR_CLOSEL() { return getToken(LanguageParser.PAR_CLOSEL, 0); }
		public TerminalNode PAR_CLOSER() { return getToken(LanguageParser.PAR_CLOSER, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(PRINT);
			setState(86);
			match(PAR_CLOSEL);
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(87);
				comparacion();
				}
				break;
			case 2:
				{
				setState(88);
				expresion();
				}
				break;
			}
			setState(91);
			match(PAR_CLOSER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Condicion_activadaContext extends ParserRuleContext {
		public TerminalNode VERDADERO() { return getToken(LanguageParser.VERDADERO, 0); }
		public TerminalNode RESERVA_IBOX() { return getToken(LanguageParser.RESERVA_IBOX, 0); }
		public List<Estructura_de_condicionContext> estructura_de_condicion() {
			return getRuleContexts(Estructura_de_condicionContext.class);
		}
		public Estructura_de_condicionContext estructura_de_condicion(int i) {
			return getRuleContext(Estructura_de_condicionContext.class,i);
		}
		public TerminalNode RESERVA_EIBOX() { return getToken(LanguageParser.RESERVA_EIBOX, 0); }
		public TerminalNode RESERVA_EBOX() { return getToken(LanguageParser.RESERVA_EBOX, 0); }
		public TerminalNode LL_CLOSEL() { return getToken(LanguageParser.LL_CLOSEL, 0); }
		public TerminalNode LL_CLOSER() { return getToken(LanguageParser.LL_CLOSER, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Condicion_activadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_activada; }
	}

	public final Condicion_activadaContext condicion_activada() throws RecognitionException {
		Condicion_activadaContext _localctx = new Condicion_activadaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicion_activada);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(VERDADERO);
				setState(94);
				match(RESERVA_IBOX);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PAR_CLOSEL) {
					{
					{
					setState(95);
					estructura_de_condicion();
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RESERVA_EIBOX:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(RESERVA_EIBOX);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PAR_CLOSEL) {
					{
					{
					setState(102);
					estructura_de_condicion();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESERVA_EBOX) {
					{
					setState(108);
					match(RESERVA_EBOX);
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LL_CLOSEL) {
						{
						setState(109);
						match(LL_CLOSEL);
						setState(113);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 280349076806224550L) != 0)) {
							{
							{
							setState(110);
							instruccion();
							}
							}
							setState(115);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(116);
						match(LL_CLOSER);
						}
					}

					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Condicion_desactivadaContext extends ParserRuleContext {
		public TerminalNode FALSO() { return getToken(LanguageParser.FALSO, 0); }
		public TerminalNode RESERVA_IBOX() { return getToken(LanguageParser.RESERVA_IBOX, 0); }
		public List<Estructura_de_condicionContext> estructura_de_condicion() {
			return getRuleContexts(Estructura_de_condicionContext.class);
		}
		public Estructura_de_condicionContext estructura_de_condicion(int i) {
			return getRuleContext(Estructura_de_condicionContext.class,i);
		}
		public TerminalNode RESERVA_EIBOX() { return getToken(LanguageParser.RESERVA_EIBOX, 0); }
		public TerminalNode RESERVA_EBOX() { return getToken(LanguageParser.RESERVA_EBOX, 0); }
		public TerminalNode LL_CLOSEL() { return getToken(LanguageParser.LL_CLOSEL, 0); }
		public TerminalNode LL_CLOSER() { return getToken(LanguageParser.LL_CLOSER, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Condicion_desactivadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_desactivada; }
	}

	public final Condicion_desactivadaContext condicion_desactivada() throws RecognitionException {
		Condicion_desactivadaContext _localctx = new Condicion_desactivadaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicion_desactivada);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(FALSO);
				setState(124);
				match(RESERVA_IBOX);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PAR_CLOSEL) {
					{
					{
					setState(125);
					estructura_de_condicion();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RESERVA_EIBOX:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(RESERVA_EIBOX);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PAR_CLOSEL) {
					{
					{
					setState(132);
					estructura_de_condicion();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESERVA_EBOX) {
					{
					setState(138);
					match(RESERVA_EBOX);
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LL_CLOSEL) {
						{
						setState(139);
						match(LL_CLOSEL);
						setState(143);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 280349076806224550L) != 0)) {
							{
							{
							setState(140);
							instruccion();
							}
							}
							setState(145);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(146);
						match(LL_CLOSER);
						}
					}

					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Estructura_de_condicionContext extends ParserRuleContext {
		public TerminalNode PAR_CLOSEL() { return getToken(LanguageParser.PAR_CLOSEL, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PAR_CLOSER() { return getToken(LanguageParser.PAR_CLOSER, 0); }
		public TerminalNode LL_CLOSEL() { return getToken(LanguageParser.LL_CLOSEL, 0); }
		public TerminalNode LL_CLOSER() { return getToken(LanguageParser.LL_CLOSER, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Estructura_de_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura_de_condicion; }
	}

	public final Estructura_de_condicionContext estructura_de_condicion() throws RecognitionException {
		Estructura_de_condicionContext _localctx = new Estructura_de_condicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_estructura_de_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(PAR_CLOSEL);
			setState(154);
			comparacion();
			setState(155);
			match(PAR_CLOSER);
			setState(156);
			match(LL_CLOSEL);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 280349076806224550L) != 0)) {
				{
				{
				setState(157);
				instruccion();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(LL_CLOSER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CicloContext extends ParserRuleContext {
		public TerminalNode AUTO() { return getToken(LanguageParser.AUTO, 0); }
		public List<TerminalNode> CO_CLOSEL() { return getTokens(LanguageParser.CO_CLOSEL); }
		public TerminalNode CO_CLOSEL(int i) {
			return getToken(LanguageParser.CO_CLOSEL, i);
		}
		public Estructura_de_condicionContext estructura_de_condicion() {
			return getRuleContext(Estructura_de_condicionContext.class,0);
		}
		public List<TerminalNode> CO_CLOSER() { return getTokens(LanguageParser.CO_CLOSER); }
		public TerminalNode CO_CLOSER(int i) {
			return getToken(LanguageParser.CO_CLOSER, i);
		}
		public TerminalNode ALMACENADOR() { return getToken(LanguageParser.ALMACENADOR, 0); }
		public TerminalNode INCREMENTO() { return getToken(LanguageParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(LanguageParser.DECREMENTO, 0); }
		public TerminalNode INICIALIZADOR_AUTO() { return getToken(LanguageParser.INICIALIZADOR_AUTO, 0); }
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(AUTO);
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CO_CLOSEL:
				{
				setState(166);
				match(CO_CLOSEL);
				setState(167);
				estructura_de_condicion();
				setState(168);
				match(CO_CLOSER);
				setState(169);
				match(ALMACENADOR);
				setState(170);
				match(CO_CLOSEL);
				setState(171);
				match(INCREMENTO);
				}
				break;
			case DECREMENTO:
				{
				setState(173);
				match(DECREMENTO);
				setState(174);
				match(CO_CLOSER);
				setState(175);
				match(CO_CLOSEL);
				setState(176);
				match(INICIALIZADOR_AUTO);
				setState(177);
				match(CO_CLOSER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode OP_MAYORQ() { return getToken(LanguageParser.OP_MAYORQ, 0); }
		public TerminalNode OP_MENORQ() { return getToken(LanguageParser.OP_MENORQ, 0); }
		public TerminalNode ASIG_IGUALACION() { return getToken(LanguageParser.ASIG_IGUALACION, 0); }
		public TerminalNode MAYOR_IGUALACION() { return getToken(LanguageParser.MAYOR_IGUALACION, 0); }
		public TerminalNode MENOR_IGUALACION() { return getToken(LanguageParser.MENOR_IGUALACION, 0); }
		public TerminalNode BOOLEAN() { return getToken(LanguageParser.BOOLEAN, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			expresion();
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 506806140930L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(182);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> OP_SUM() { return getTokens(LanguageParser.OP_SUM); }
		public TerminalNode OP_SUM(int i) {
			return getToken(LanguageParser.OP_SUM, i);
		}
		public List<TerminalNode> OP_RES() { return getTokens(LanguageParser.OP_RES); }
		public TerminalNode OP_RES(int i) {
			return getToken(LanguageParser.OP_RES, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			termino();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SUM || _la==OP_RES) {
				{
				{
				setState(185);
				_la = _input.LA(1);
				if ( !(_la==OP_SUM || _la==OP_RES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				termino();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> OP_MUL() { return getTokens(LanguageParser.OP_MUL); }
		public TerminalNode OP_MUL(int i) {
			return getToken(LanguageParser.OP_MUL, i);
		}
		public List<TerminalNode> OP_DIV() { return getTokens(LanguageParser.OP_DIV); }
		public TerminalNode OP_DIV(int i) {
			return getToken(LanguageParser.OP_DIV, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			factor();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MUL || _la==OP_DIV) {
				{
				{
				setState(193);
				_la = _input.LA(1);
				if ( !(_la==OP_MUL || _la==OP_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				factor();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode PAR_CLOSEL() { return getToken(LanguageParser.PAR_CLOSEL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_CLOSER() { return getToken(LanguageParser.PAR_CLOSER, 0); }
		public TerminalNode ENT() { return getToken(LanguageParser.ENT, 0); }
		public TerminalNode PROM() { return getToken(LanguageParser.PROM, 0); }
		public TerminalNode BOOLEAN() { return getToken(LanguageParser.BOOLEAN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(LanguageParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR() { return getToken(LanguageParser.CHAR, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_CLOSEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(PAR_CLOSEL);
				setState(201);
				expresion();
				setState(202);
				match(PAR_CLOSER);
				}
				break;
			case ENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(ENT);
				}
				break;
			case PROM:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(PROM);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(BOOLEAN);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
				match(STRING_LITERAL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				match(CHAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ENT_LITERAL() { return getToken(LanguageParser.ENT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(LanguageParser.FLOAT_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(LanguageParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(LanguageParser.STRING_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(LanguageParser.CHARACTER_LITERAL, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 135107988821114884L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u00d7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000\u000b"+
		"\u0000\f\u0000\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003"+
		"\u0001&\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001?\b\u0001\u0003\u0001A\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002H\b\u0002\u0003\u0002J\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003P\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003T\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005a\b\u0005\n\u0005\f\u0005"+
		"d\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005h\b\u0005\n\u0005\f\u0005"+
		"k\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005p\b\u0005\n\u0005"+
		"\f\u0005s\t\u0005\u0001\u0005\u0003\u0005v\b\u0005\u0003\u0005x\b\u0005"+
		"\u0003\u0005z\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u007f\b\u0006\n\u0006\f\u0006\u0082\t\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u0086\b\u0006\n\u0006\f\u0006\u0089\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u008e\b\u0006\n\u0006\f\u0006\u0091\t\u0006\u0001"+
		"\u0006\u0003\u0006\u0094\b\u0006\u0003\u0006\u0096\b\u0006\u0003\u0006"+
		"\u0098\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u009f\b\u0007\n\u0007\f\u0007\u00a2\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b3\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u00bc\b\n\n\n\f\n\u00bf"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c4\b\u000b\n\u000b"+
		"\f\u000b\u00c7\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d3\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u0000\u0005\u0001\u000001\u0003\u0000\u0001\u0001!"+
		"\"$&\u0001\u0000\u001b\u001c\u0001\u0000\u001d\u001e\u0002\u0000\u0002"+
		"\u000258\u00f0\u0000\u001d\u0001\u0000\u0000\u0000\u0002@\u0001\u0000"+
		"\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006S\u0001\u0000\u0000\u0000"+
		"\bU\u0001\u0000\u0000\u0000\ny\u0001\u0000\u0000\u0000\f\u0097\u0001\u0000"+
		"\u0000\u0000\u000e\u0099\u0001\u0000\u0000\u0000\u0010\u00a5\u0001\u0000"+
		"\u0000\u0000\u0012\u00b4\u0001\u0000\u0000\u0000\u0014\u00b8\u0001\u0000"+
		"\u0000\u0000\u0016\u00c0\u0001\u0000\u0000\u0000\u0018\u00d2\u0001\u0000"+
		"\u0000\u0000\u001a\u00d4\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0002"+
		"\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001"+
		"\u0000\u0000\u0000#%\u0003\u0004\u0002\u0000$&\u0005\u001f\u0000\u0000"+
		"%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&A\u0001\u0000\u0000"+
		"\u0000\')\u0003\u0006\u0003\u0000(*\u0005\u001f\u0000\u0000)(\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*A\u0001\u0000\u0000\u0000+-\u0003"+
		"\b\u0004\u0000,.\u0005\u001f\u0000\u0000-,\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.A\u0001\u0000\u0000\u0000/0\u0003\n\u0005\u000001\u0005"+
		"\u001f\u0000\u00001A\u0001\u0000\u0000\u000023\u0003\f\u0006\u000034\u0005"+
		"\u001f\u0000\u00004A\u0001\u0000\u0000\u000056\u0003\u0010\b\u000067\u0005"+
		"\u001f\u0000\u00007A\u0001\u0000\u0000\u00008:\u0003\u0012\t\u00009;\u0005"+
		"\u001f\u0000\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";A\u0001\u0000\u0000\u0000<>\u0003\u0014\n\u0000=?\u0005\u001f\u0000\u0000"+
		">=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000"+
		"\u0000@#\u0001\u0000\u0000\u0000@\'\u0001\u0000\u0000\u0000@+\u0001\u0000"+
		"\u0000\u0000@/\u0001\u0000\u0000\u0000@2\u0001\u0000\u0000\u0000@5\u0001"+
		"\u0000\u0000\u0000@8\u0001\u0000\u0000\u0000@<\u0001\u0000\u0000\u0000"+
		"A\u0003\u0001\u0000\u0000\u0000BC\u0003\u001a\r\u0000CI\u00059\u0000\u0000"+
		"DG\u0005#\u0000\u0000EH\u0003\u0012\t\u0000FH\u0003\u0014\n\u0000GE\u0001"+
		"\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000"+
		"ID\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0005\u0001\u0000"+
		"\u0000\u0000KL\u00059\u0000\u0000LO\u0005#\u0000\u0000MP\u0003\u0012\t"+
		"\u0000NP\u0003\u0014\n\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000"+
		"\u0000PT\u0001\u0000\u0000\u0000QR\u00059\u0000\u0000RT\u0007\u0000\u0000"+
		"\u0000SK\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000T\u0007\u0001"+
		"\u0000\u0000\u0000UV\u0005\u0012\u0000\u0000VY\u00052\u0000\u0000WZ\u0003"+
		"\u0012\t\u0000XZ\u0003\u0014\n\u0000YW\u0001\u0000\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u00053\u0000\u0000\\\t"+
		"\u0001\u0000\u0000\u0000]^\u0005\u000f\u0000\u0000^b\u0005\u0013\u0000"+
		"\u0000_a\u0003\u000e\u0007\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cz\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ei\u0005\u0015\u0000\u0000"+
		"fh\u0003\u000e\u0007\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jw\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000lu\u0005\u0014\u0000\u0000mq\u0005"+
		"+\u0000\u0000np\u0003\u0002\u0001\u0000on\u0001\u0000\u0000\u0000ps\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tv\u0005,\u0000\u0000"+
		"um\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000"+
		"\u0000wl\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000"+
		"\u0000\u0000y]\u0001\u0000\u0000\u0000ye\u0001\u0000\u0000\u0000z\u000b"+
		"\u0001\u0000\u0000\u0000{|\u0005\u000e\u0000\u0000|\u0080\u0005\u0013"+
		"\u0000\u0000}\u007f\u0003\u000e\u0007\u0000~}\u0001\u0000\u0000\u0000"+
		"\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u0098\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0083\u0087\u0005\u0015\u0000\u0000\u0084"+
		"\u0086\u0003\u000e\u0007\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u0095\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u0093\u0005\u0014\u0000\u0000\u008b"+
		"\u008f\u0005+\u0000\u0000\u008c\u008e\u0003\u0002\u0001\u0000\u008d\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0094"+
		"\u0005,\u0000\u0000\u0093\u008b\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u008a\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001"+
		"\u0000\u0000\u0000\u0097{\u0001\u0000\u0000\u0000\u0097\u0083\u0001\u0000"+
		"\u0000\u0000\u0098\r\u0001\u0000\u0000\u0000\u0099\u009a\u00052\u0000"+
		"\u0000\u009a\u009b\u0003\u0012\t\u0000\u009b\u009c\u00053\u0000\u0000"+
		"\u009c\u00a0\u0005+\u0000\u0000\u009d\u009f\u0003\u0002\u0001\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0005,\u0000\u0000\u00a4\u000f\u0001\u0000\u0000\u0000\u00a5\u00b2"+
		"\u0005\u0007\u0000\u0000\u00a6\u00a7\u0005-\u0000\u0000\u00a7\u00a8\u0003"+
		"\u000e\u0007\u0000\u00a8\u00a9\u0005.\u0000\u0000\u00a9\u00aa\u00054\u0000"+
		"\u0000\u00aa\u00ab\u0005-\u0000\u0000\u00ab\u00ac\u00050\u0000\u0000\u00ac"+
		"\u00b3\u0001\u0000\u0000\u0000\u00ad\u00ae\u00051\u0000\u0000\u00ae\u00af"+
		"\u0005.\u0000\u0000\u00af\u00b0\u0005-\u0000\u0000\u00b0\u00b1\u0005/"+
		"\u0000\u0000\u00b1\u00b3\u0005.\u0000\u0000\u00b2\u00a6\u0001\u0000\u0000"+
		"\u0000\u00b2\u00ad\u0001\u0000\u0000\u0000\u00b3\u0011\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0003\u0014\n\u0000\u00b5\u00b6\u0007\u0001\u0000\u0000"+
		"\u00b6\u00b7\u0003\u0014\n\u0000\u00b7\u0013\u0001\u0000\u0000\u0000\u00b8"+
		"\u00bd\u0003\u0016\u000b\u0000\u00b9\u00ba\u0007\u0002\u0000\u0000\u00ba"+
		"\u00bc\u0003\u0016\u000b\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be\u0015\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c5\u0003\u0018\f\u0000\u00c1\u00c2"+
		"\u0007\u0003\u0000\u0000\u00c2\u00c4\u0003\u0018\f\u0000\u00c3\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u0017\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"2\u0000\u0000\u00c9\u00ca\u0003\u0014\n\u0000\u00ca\u00cb\u00053\u0000"+
		"\u0000\u00cb\u00d3\u0001\u0000\u0000\u0000\u00cc\u00d3\u0005\t\u0000\u0000"+
		"\u00cd\u00d3\u0005\u0005\u0000\u0000\u00ce\u00d3\u0005\u0001\u0000\u0000"+
		"\u00cf\u00d3\u0005\u0002\u0000\u0000\u00d0\u00d3\u0005\u000b\u0000\u0000"+
		"\u00d1\u00d3\u00059\u0000\u0000\u00d2\u00c8\u0001\u0000\u0000\u0000\u00d2"+
		"\u00cc\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d2"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u0019\u0001\u0000\u0000\u0000\u00d4\u00d5\u0007\u0004\u0000\u0000\u00d5"+
		"\u001b\u0001\u0000\u0000\u0000\u001d\u001f%)-:>@GIOSYbiquwy\u0080\u0087"+
		"\u008f\u0093\u0095\u0097\u00a0\u00b2\u00bd\u00c5\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}