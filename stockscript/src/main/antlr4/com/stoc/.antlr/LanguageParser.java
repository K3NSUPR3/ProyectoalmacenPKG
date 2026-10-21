// Generated from c:/Users/conor/Music/ProyectoAlmacenPKD/stockscript/src/main/antlr4/com/stoc/Language.g4 by ANTLR 4.13.1
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
		BOOLEAN=1, STRING_LITERAL=2, CHARACTERES=3, ID_CON_ASIGNACION=4, PROM=5, 
		LOTE=6, OBJECT=7, ENT=8, STRING=9, CHAR=10, BOOL=11, FLOAT=12, FALSO=13, 
		VERDADERO=14, PRINT=15, RESERVA_IBOX=16, RESERVA_EBOX=17, RESERVA_EIBOX=18, 
		FOR=19, WHILE=20, DO=21, LENGTH=22, SIZE=23, OP_SUM=24, OP_RES=25, OP_MUL=26, 
		OP_DIV=27, OP_CIERRE=28, OP_MAYORQ=29, OP_MENORQ=30, ASIG=31, ASIG_IGUALACION=32, 
		MAYOR_IGUALACION=33, MENOR_IGUALACION=34, AND=35, OR=36, NOT=37, CONCATENACION=38, 
		LL_CLOSEL=39, LL_CLOSER=40, INCREMENTO=41, DECREMENTO=42, PAR_CLOSEL=43, 
		PAR_CLOSER=44, ALMACENADOR=45, FLOAT_LITERAL=46, ENT_LITERAL=47, BOOLEAN_LITERAL=48, 
		CHARACTER_LITERAL=49, ID=50, WS=51, LINE_COMMENT=52;
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_declaracion = 2, RULE_asignacion = 3, 
		RULE_impresion = 4, RULE_condicion = 5, RULE_estructura_de_condicion = 6, 
		RULE_ciclo = 7, RULE_comparacion = 8, RULE_expresion = 9, RULE_termino = 10, 
		RULE_factor = 11, RULE_tipo = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "declaracion", "asignacion", "impresion", 
			"condicion", "estructura_de_condicion", "ciclo", "comparacion", "expresion", 
			"termino", "factor", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'ChupapiStorage'", "'lote'", 
			"'etiqueta'", "'mini'", "'palanca'", "'prom'", "'IZQ'", "'DER'", "'etiquetadora'", 
			"'ibox'", "'ebox'", "'eibox'", "'auto'", "'whe'", "'do'", "'lenght'", 
			"'size'", "'+'", "'-'", "'*'", "'/'", "';'", "'>'", "'<'", "'='", "'=='", 
			"'>='", "'<='", "'&&'", "'||'", "'!'", "'<+>'", "'{'", "'}'", "'++'", 
			"'--'", "'('", "')'", "'\\uD83D\uDC1F'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "STRING_LITERAL", "CHARACTERES", "ID_CON_ASIGNACION", 
			"PROM", "LOTE", "OBJECT", "ENT", "STRING", "CHAR", "BOOL", "FLOAT", "FALSO", 
			"VERDADERO", "PRINT", "RESERVA_IBOX", "RESERVA_EBOX", "RESERVA_EIBOX", 
			"FOR", "WHILE", "DO", "LENGTH", "SIZE", "OP_SUM", "OP_RES", "OP_MUL", 
			"OP_DIV", "OP_CIERRE", "OP_MAYORQ", "OP_MENORQ", "ASIG", "ASIG_IGUALACION", 
			"MAYOR_IGUALACION", "MENOR_IGUALACION", "AND", "OR", "NOT", "CONCATENACION", 
			"LL_CLOSEL", "LL_CLOSER", "INCREMENTO", "DECREMENTO", "PAR_CLOSEL", "PAR_CLOSER", 
			"ALMACENADOR", "FLOAT_LITERAL", "ENT_LITERAL", "BOOLEAN_LITERAL", "CHARACTER_LITERAL", 
			"ID", "WS", "LINE_COMMENT"
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				instruccion();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2190227164464422L) != 0) );
			setState(31);
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
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				declaracion();
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_CIERRE) {
					{
					setState(34);
					match(OP_CIERRE);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				asignacion();
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_CIERRE) {
					{
					setState(38);
					match(OP_CIERRE);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				impresion();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_CIERRE) {
					{
					setState(42);
					match(OP_CIERRE);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				condicion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				ciclo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				comparacion();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_CIERRE) {
					{
					setState(48);
					match(OP_CIERRE);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				expresion();
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_CIERRE) {
					{
					setState(52);
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
			setState(57);
			tipo();
			setState(58);
			match(ID);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIG) {
				{
				setState(59);
				match(ASIG);
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(60);
					comparacion();
					}
					break;
				case 2:
					{
					setState(61);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(ID);
				setState(67);
				match(ASIG);
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(68);
					comparacion();
					}
					break;
				case 2:
					{
					setState(69);
					expresion();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(ID);
				setState(73);
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
			setState(76);
			match(PRINT);
			setState(77);
			match(PAR_CLOSEL);
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(78);
				comparacion();
				}
				break;
			case 2:
				{
				setState(79);
				expresion();
				}
				break;
			}
			setState(82);
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
	public static class CondicionContext extends ParserRuleContext {
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
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicion);
		int _la;
		try {
			int _alt;
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESERVA_IBOX:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(RESERVA_IBOX);
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(85);
						estructura_de_condicion();
						}
						} 
					}
					setState(90);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case RESERVA_EIBOX:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(RESERVA_EIBOX);
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(92);
						estructura_de_condicion();
						}
						} 
					}
					setState(97);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RESERVA_EBOX) {
					{
					setState(98);
					match(RESERVA_EBOX);
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LL_CLOSEL) {
						{
						setState(99);
						match(LL_CLOSEL);
						setState(103);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2190227164464422L) != 0)) {
							{
							{
							setState(100);
							instruccion();
							}
							}
							setState(105);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(106);
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
		enterRule(_localctx, 12, RULE_estructura_de_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(PAR_CLOSEL);
			setState(114);
			comparacion();
			setState(115);
			match(PAR_CLOSER);
			setState(116);
			match(LL_CLOSEL);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2190227164464422L) != 0)) {
				{
				{
				setState(117);
				instruccion();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
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
		public TerminalNode FOR() { return getToken(LanguageParser.FOR, 0); }
		public List<TerminalNode> ALMACENADOR() { return getTokens(LanguageParser.ALMACENADOR); }
		public TerminalNode ALMACENADOR(int i) {
			return getToken(LanguageParser.ALMACENADOR, i);
		}
		public TerminalNode PAR_CLOSEL() { return getToken(LanguageParser.PAR_CLOSEL, 0); }
		public TerminalNode LL_CLOSEL() { return getToken(LanguageParser.LL_CLOSEL, 0); }
		public TerminalNode LL_CLOSER() { return getToken(LanguageParser.LL_CLOSER, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode WHILE() { return getToken(LanguageParser.WHILE, 0); }
		public TerminalNode PAR_CLOSER() { return getToken(LanguageParser.PAR_CLOSER, 0); }
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ciclo);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(FOR);
				{
				setState(126);
				declaracion();
				}
				setState(127);
				match(ALMACENADOR);
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(128);
					comparacion();
					}
					break;
				case 2:
					{
					setState(129);
					expresion();
					}
					break;
				}
				setState(132);
				match(ALMACENADOR);
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(133);
					asignacion();
					}
					break;
				case 2:
					{
					setState(134);
					expresion();
					}
					break;
				}
				setState(137);
				match(PAR_CLOSEL);
				setState(138);
				match(LL_CLOSEL);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2190227164464422L) != 0)) {
					{
					{
					setState(139);
					instruccion();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				match(LL_CLOSER);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(WHILE);
				setState(148);
				match(PAR_CLOSEL);
				setState(149);
				comparacion();
				setState(150);
				match(PAR_CLOSER);
				setState(151);
				match(LL_CLOSEL);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2190227164464422L) != 0)) {
					{
					{
					setState(152);
					instruccion();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(LL_CLOSER);
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
		enterRule(_localctx, 16, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			expresion();
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31675383810L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(164);
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
		enterRule(_localctx, 18, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			termino();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_SUM || _la==OP_RES) {
				{
				{
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==OP_SUM || _la==OP_RES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				termino();
				}
				}
				setState(173);
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
		enterRule(_localctx, 20, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			factor();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MUL || _la==OP_DIV) {
				{
				{
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==OP_MUL || _la==OP_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				factor();
				}
				}
				setState(181);
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
		enterRule(_localctx, 22, RULE_factor);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_CLOSEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(PAR_CLOSEL);
				setState(183);
				expresion();
				setState(184);
				match(PAR_CLOSER);
				}
				break;
			case ENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(ENT);
				}
				break;
			case PROM:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(PROM);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(BOOLEAN);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(STRING_LITERAL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				match(CHAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
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
		enterRule(_localctx, 24, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664964L) != 0)) ) {
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
		"\u0004\u00014\u00c5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001$\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001,\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00012\b\u0001\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0003"+
		"\u00018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002?\b\u0002\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003G\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003K\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004Q\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0005\u0005W\b\u0005\n\u0005\f\u0005Z\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005^\b\u0005\n\u0005\f\u0005a\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005f\b\u0005\n\u0005\f\u0005i\t\u0005\u0001\u0005"+
		"\u0003\u0005l\b\u0005\u0003\u0005n\b\u0005\u0003\u0005p\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006w\b"+
		"\u0006\n\u0006\f\u0006z\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0083\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0088\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u008d\b\u0007\n\u0007\f\u0007\u0090\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u009a\b\u0007\n\u0007\f\u0007\u009d"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a1\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u00aa\b\t\n\t\f\t\u00ad"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0005\n\u00b2\b\n\n\n\f\n\u00b5\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c1\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\u0005\u0001\u0000)*\u0003\u0000\u0001\u0001"+
		"\u001d\u001e \"\u0001\u0000\u0018\u0019\u0001\u0000\u001a\u001b\u0002"+
		"\u0000\u0002\u0002.1\u00de\u0000\u001b\u0001\u0000\u0000\u0000\u00027"+
		"\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006J\u0001\u0000"+
		"\u0000\u0000\bL\u0001\u0000\u0000\u0000\no\u0001\u0000\u0000\u0000\fq"+
		"\u0001\u0000\u0000\u0000\u000e\u00a0\u0001\u0000\u0000\u0000\u0010\u00a2"+
		"\u0001\u0000\u0000\u0000\u0012\u00a6\u0001\u0000\u0000\u0000\u0014\u00ae"+
		"\u0001\u0000\u0000\u0000\u0016\u00c0\u0001\u0000\u0000\u0000\u0018\u00c2"+
		"\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0001\u0000\u0000\u0000\u001f \u0005\u0000\u0000\u0001 \u0001\u0001\u0000"+
		"\u0000\u0000!#\u0003\u0004\u0002\u0000\"$\u0005\u001c\u0000\u0000#\"\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$8\u0001\u0000\u0000\u0000"+
		"%\'\u0003\u0006\u0003\u0000&(\u0005\u001c\u0000\u0000\'&\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(8\u0001\u0000\u0000\u0000)+\u0003\b"+
		"\u0004\u0000*,\u0005\u001c\u0000\u0000+*\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,8\u0001\u0000\u0000\u0000-8\u0003\n\u0005\u0000.8\u0003"+
		"\u000e\u0007\u0000/1\u0003\u0010\b\u000002\u0005\u001c\u0000\u000010\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000028\u0001\u0000\u0000\u0000"+
		"35\u0003\u0012\t\u000046\u0005\u001c\u0000\u000054\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u00007!\u0001\u0000\u0000"+
		"\u00007%\u0001\u0000\u0000\u00007)\u0001\u0000\u0000\u00007-\u0001\u0000"+
		"\u0000\u00007.\u0001\u0000\u0000\u00007/\u0001\u0000\u0000\u000073\u0001"+
		"\u0000\u0000\u00008\u0003\u0001\u0000\u0000\u00009:\u0003\u0018\f\u0000"+
		":@\u00052\u0000\u0000;>\u0005\u001f\u0000\u0000<?\u0003\u0010\b\u0000"+
		"=?\u0003\u0012\t\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000"+
		"?A\u0001\u0000\u0000\u0000@;\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000A\u0005\u0001\u0000\u0000\u0000BC\u00052\u0000\u0000CF\u0005\u001f"+
		"\u0000\u0000DG\u0003\u0010\b\u0000EG\u0003\u0012\t\u0000FD\u0001\u0000"+
		"\u0000\u0000FE\u0001\u0000\u0000\u0000GK\u0001\u0000\u0000\u0000HI\u0005"+
		"2\u0000\u0000IK\u0007\u0000\u0000\u0000JB\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000K\u0007\u0001\u0000\u0000\u0000LM\u0005\u000f\u0000"+
		"\u0000MP\u0005+\u0000\u0000NQ\u0003\u0010\b\u0000OQ\u0003\u0012\t\u0000"+
		"PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RS\u0005,\u0000\u0000S\t\u0001\u0000\u0000\u0000TX\u0005\u0010\u0000"+
		"\u0000UW\u0003\f\u0006\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Yp\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000[_\u0005\u0012\u0000\u0000\\^\u0003"+
		"\f\u0006\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]"+
		"\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`m\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000bk\u0005\u0011\u0000\u0000cg\u0005\'\u0000"+
		"\u0000df\u0003\u0002\u0001\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jl\u0005(\u0000\u0000kc\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000"+
		"mb\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000"+
		"\u0000oT\u0001\u0000\u0000\u0000o[\u0001\u0000\u0000\u0000p\u000b\u0001"+
		"\u0000\u0000\u0000qr\u0005+\u0000\u0000rs\u0003\u0010\b\u0000st\u0005"+
		",\u0000\u0000tx\u0005\'\u0000\u0000uw\u0003\u0002\u0001\u0000vu\u0001"+
		"\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000{|\u0005(\u0000\u0000|\r\u0001\u0000\u0000\u0000}~\u0005\u0013\u0000"+
		"\u0000~\u007f\u0003\u0004\u0002\u0000\u007f\u0082\u0005-\u0000\u0000\u0080"+
		"\u0083\u0003\u0010\b\u0000\u0081\u0083\u0003\u0012\t\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0005-\u0000\u0000\u0085\u0088\u0003\u0006\u0003\u0000\u0086\u0088\u0003"+
		"\u0012\t\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005+\u0000\u0000\u008a\u008e\u0005\'\u0000"+
		"\u0000\u008b\u008d\u0003\u0002\u0001\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0005(\u0000\u0000"+
		"\u0092\u00a1\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0014\u0000\u0000"+
		"\u0094\u0095\u0005+\u0000\u0000\u0095\u0096\u0003\u0010\b\u0000\u0096"+
		"\u0097\u0005,\u0000\u0000\u0097\u009b\u0005\'\u0000\u0000\u0098\u009a"+
		"\u0003\u0002\u0001\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005(\u0000\u0000\u009f\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a0}\u0001\u0000\u0000\u0000\u00a0\u0093\u0001\u0000"+
		"\u0000\u0000\u00a1\u000f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\u0012"+
		"\t\u0000\u00a3\u00a4\u0007\u0001\u0000\u0000\u00a4\u00a5\u0003\u0012\t"+
		"\u0000\u00a5\u0011\u0001\u0000\u0000\u0000\u00a6\u00ab\u0003\u0014\n\u0000"+
		"\u00a7\u00a8\u0007\u0002\u0000\u0000\u00a8\u00aa\u0003\u0014\n\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u0013\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b3\u0003\u0016\u000b\u0000\u00af\u00b0\u0007\u0003\u0000\u0000\u00b0"+
		"\u00b2\u0003\u0016\u000b\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u0015\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005+\u0000\u0000\u00b7\u00b8"+
		"\u0003\u0012\t\u0000\u00b8\u00b9\u0005,\u0000\u0000\u00b9\u00c1\u0001"+
		"\u0000\u0000\u0000\u00ba\u00c1\u0005\b\u0000\u0000\u00bb\u00c1\u0005\u0005"+
		"\u0000\u0000\u00bc\u00c1\u0005\u0001\u0000\u0000\u00bd\u00c1\u0005\u0002"+
		"\u0000\u0000\u00be\u00c1\u0005\n\u0000\u0000\u00bf\u00c1\u00052\u0000"+
		"\u0000\u00c0\u00b6\u0001\u0000\u0000\u0000\u00c0\u00ba\u0001\u0000\u0000"+
		"\u0000\u00c0\u00bb\u0001\u0000\u0000\u0000\u00c0\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u0017\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0007\u0004\u0000\u0000\u00c3\u0019\u0001\u0000\u0000"+
		"\u0000\u001b\u001d#\'+157>@FJPX_gkmox\u0082\u0087\u008e\u009b\u00a0\u00ab"+
		"\u00b3\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}