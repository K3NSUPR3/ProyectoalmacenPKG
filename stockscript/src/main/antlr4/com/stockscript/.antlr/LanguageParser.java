// Generated from c:/Users/sonic/Downloads/stockscript/stockscript/src/main/antlr4/com/stockscript/Language.g4 by ANTLR 4.13.1
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
		CO_IZQ=1, CO_DER=2, PAR_IZQ=3, PAR_DER=4, LL_IZQ=5, LL_DER=6, OP_CIERRE=7, 
		OP_ASIG=8, OP_INCREMENTO=9, OP_SUMA=10, OP_RESTA=11, OP_MULT=12, OP_DIV=13, 
		OP_MAYOR=14, OP_MENOR=15, OP_MAYORIGUAL=16, OP_MENORIGUAL=17, OP_IGUAL=18, 
		OP_DIFERENTE=19, ALMACENADOR=20, ENT=21, FLOAT=22, STRING=23, CHAR=24, 
		BOOL=25, IF=26, ELSE=27, ELSEIF=28, FOR=29, PRINT=30, INT_LITERAL=31, 
		FLOAT_LITERAL=32, STRING_LITERAL=33, CHAR_LITERAL=34, BOOL_LITERAL=35, 
		ID=36, WS=37, COMMENT=38;
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_declaracion = 2, RULE_tipo = 3, 
		RULE_asignacion = 4, RULE_incremento = 5, RULE_impresion = 6, RULE_condicion = 7, 
		RULE_eibox_part = 8, RULE_ebox_part = 9, RULE_ciclo = 10, RULE_expresion = 11, 
		RULE_termino = 12, RULE_comparacion = 13, RULE_factor = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "declaracion", "tipo", "asignacion", "incremento", 
			"impresion", "condicion", "eibox_part", "ebox_part", "ciclo", "expresion", 
			"termino", "comparacion", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "'{'", "'}'", "':'", "'='", "'++'", 
			"'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'\\uD83D\uDC1F'", "'lote'", "'prom'", "'etiqueta'", "'mini'", "'palanca'", 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				instruccion();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 70462210048L) != 0) );
			setState(35);
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
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
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
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				incremento();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				impresion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				condicion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				ciclo();
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
		public TerminalNode OP_ASIG() { return getToken(LanguageParser.OP_ASIG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode OP_CIERRE() { return getToken(LanguageParser.OP_CIERRE, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				tipo();
				setState(46);
				match(ID);
				setState(47);
				match(OP_ASIG);
				setState(48);
				expresion();
				setState(49);
				match(OP_CIERRE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				tipo();
				setState(52);
				match(ID);
				setState(53);
				match(OP_CIERRE);
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ENT() { return getToken(LanguageParser.ENT, 0); }
		public TerminalNode FLOAT() { return getToken(LanguageParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(LanguageParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(LanguageParser.CHAR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65011712L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode OP_ASIG() { return getToken(LanguageParser.OP_ASIG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode OP_CIERRE() { return getToken(LanguageParser.OP_CIERRE, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(60);
			match(OP_ASIG);
			setState(61);
			expresion();
			setState(62);
			match(OP_CIERRE);
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
	public static class IncrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode OP_INCREMENTO() { return getToken(LanguageParser.OP_INCREMENTO, 0); }
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIncremento(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
			setState(65);
			match(OP_INCREMENTO);
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
		public TerminalNode PAR_IZQ() { return getToken(LanguageParser.PAR_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(LanguageParser.PAR_DER, 0); }
		public TerminalNode OP_CIERRE() { return getToken(LanguageParser.OP_CIERRE, 0); }
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitImpresion(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(PRINT);
			setState(68);
			match(PAR_IZQ);
			setState(69);
			expresion();
			setState(70);
			match(PAR_DER);
			setState(71);
			match(OP_CIERRE);
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
		public Token idNivel;
		public ComparacionContext cond;
		public Token interruptor;
		public TerminalNode IF() { return getToken(LanguageParser.IF, 0); }
		public List<TerminalNode> CO_IZQ() { return getTokens(LanguageParser.CO_IZQ); }
		public TerminalNode CO_IZQ(int i) {
			return getToken(LanguageParser.CO_IZQ, i);
		}
		public List<TerminalNode> CO_DER() { return getTokens(LanguageParser.CO_DER); }
		public TerminalNode CO_DER(int i) {
			return getToken(LanguageParser.CO_DER, i);
		}
		public TerminalNode PAR_IZQ() { return getToken(LanguageParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(LanguageParser.PAR_DER, 0); }
		public TerminalNode LL_IZQ() { return getToken(LanguageParser.LL_IZQ, 0); }
		public TerminalNode LL_DER() { return getToken(LanguageParser.LL_DER, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(LanguageParser.INT_LITERAL, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<Eibox_partContext> eibox_part() {
			return getRuleContexts(Eibox_partContext.class);
		}
		public Eibox_partContext eibox_part(int i) {
			return getRuleContext(Eibox_partContext.class,i);
		}
		public Ebox_partContext ebox_part() {
			return getRuleContext(Ebox_partContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(IF);
			setState(74);
			match(CO_IZQ);
			setState(75);
			((CondicionContext)_localctx).idNivel = match(ID);
			setState(76);
			match(CO_DER);
			setState(77);
			match(PAR_IZQ);
			setState(78);
			((CondicionContext)_localctx).cond = comparacion();
			setState(79);
			match(PAR_DER);
			setState(80);
			match(CO_IZQ);
			setState(81);
			((CondicionContext)_localctx).interruptor = match(INT_LITERAL);
			setState(82);
			match(CO_DER);
			setState(83);
			match(LL_IZQ);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70462210048L) != 0)) {
				{
				{
				setState(84);
				instruccion();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(LL_DER);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(91);
				eibox_part();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(97);
				ebox_part();
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
	public static class Eibox_partContext extends ParserRuleContext {
		public Token idNivel;
		public ComparacionContext cond;
		public Token interruptor;
		public TerminalNode ELSEIF() { return getToken(LanguageParser.ELSEIF, 0); }
		public List<TerminalNode> CO_IZQ() { return getTokens(LanguageParser.CO_IZQ); }
		public TerminalNode CO_IZQ(int i) {
			return getToken(LanguageParser.CO_IZQ, i);
		}
		public List<TerminalNode> CO_DER() { return getTokens(LanguageParser.CO_DER); }
		public TerminalNode CO_DER(int i) {
			return getToken(LanguageParser.CO_DER, i);
		}
		public TerminalNode PAR_IZQ() { return getToken(LanguageParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(LanguageParser.PAR_DER, 0); }
		public TerminalNode LL_IZQ() { return getToken(LanguageParser.LL_IZQ, 0); }
		public TerminalNode LL_DER() { return getToken(LanguageParser.LL_DER, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(LanguageParser.INT_LITERAL, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public Eibox_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eibox_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterEibox_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitEibox_part(this);
		}
	}

	public final Eibox_partContext eibox_part() throws RecognitionException {
		Eibox_partContext _localctx = new Eibox_partContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_eibox_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ELSEIF);
			setState(101);
			match(CO_IZQ);
			setState(102);
			((Eibox_partContext)_localctx).idNivel = match(ID);
			setState(103);
			match(CO_DER);
			setState(104);
			match(PAR_IZQ);
			setState(105);
			((Eibox_partContext)_localctx).cond = comparacion();
			setState(106);
			match(PAR_DER);
			setState(107);
			match(CO_IZQ);
			setState(108);
			((Eibox_partContext)_localctx).interruptor = match(INT_LITERAL);
			setState(109);
			match(CO_DER);
			setState(110);
			match(LL_IZQ);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70462210048L) != 0)) {
				{
				{
				setState(111);
				instruccion();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(LL_DER);
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
	public static class Ebox_partContext extends ParserRuleContext {
		public Token idNivel;
		public Token interruptor;
		public TerminalNode ELSE() { return getToken(LanguageParser.ELSE, 0); }
		public TerminalNode LL_IZQ() { return getToken(LanguageParser.LL_IZQ, 0); }
		public TerminalNode LL_DER() { return getToken(LanguageParser.LL_DER, 0); }
		public List<TerminalNode> CO_IZQ() { return getTokens(LanguageParser.CO_IZQ); }
		public TerminalNode CO_IZQ(int i) {
			return getToken(LanguageParser.CO_IZQ, i);
		}
		public List<TerminalNode> CO_DER() { return getTokens(LanguageParser.CO_DER); }
		public TerminalNode CO_DER(int i) {
			return getToken(LanguageParser.CO_DER, i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode INT_LITERAL() { return getToken(LanguageParser.INT_LITERAL, 0); }
		public Ebox_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebox_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterEbox_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitEbox_part(this);
		}
	}

	public final Ebox_partContext ebox_part() throws RecognitionException {
		Ebox_partContext _localctx = new Ebox_partContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ebox_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ELSE);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(120);
				match(CO_IZQ);
				setState(121);
				((Ebox_partContext)_localctx).idNivel = match(ID);
				setState(122);
				match(CO_DER);
				}
				break;
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CO_IZQ) {
				{
				setState(125);
				match(CO_IZQ);
				setState(126);
				((Ebox_partContext)_localctx).interruptor = match(INT_LITERAL);
				setState(127);
				match(CO_DER);
				}
			}

			setState(130);
			match(LL_IZQ);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70462210048L) != 0)) {
				{
				{
				setState(131);
				instruccion();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(LL_DER);
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
		public Token idNivel;
		public ExpresionContext parte1;
		public ExpresionContext parte1Inicial;
		public ComparacionContext parte2;
		public IncrementoContext parte3;
		public Token interruptor;
		public TerminalNode FOR() { return getToken(LanguageParser.FOR, 0); }
		public List<TerminalNode> CO_IZQ() { return getTokens(LanguageParser.CO_IZQ); }
		public TerminalNode CO_IZQ(int i) {
			return getToken(LanguageParser.CO_IZQ, i);
		}
		public List<TerminalNode> CO_DER() { return getTokens(LanguageParser.CO_DER); }
		public TerminalNode CO_DER(int i) {
			return getToken(LanguageParser.CO_DER, i);
		}
		public List<TerminalNode> ALMACENADOR() { return getTokens(LanguageParser.ALMACENADOR); }
		public TerminalNode ALMACENADOR(int i) {
			return getToken(LanguageParser.ALMACENADOR, i);
		}
		public TerminalNode LL_IZQ() { return getToken(LanguageParser.LL_IZQ, 0); }
		public TerminalNode LL_DER() { return getToken(LanguageParser.LL_DER, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode INT_LITERAL() { return getToken(LanguageParser.INT_LITERAL, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public TerminalNode OP_ASIG() { return getToken(LanguageParser.OP_ASIG, 0); }
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitCiclo(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ciclo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(FOR);
			setState(140);
			match(CO_IZQ);
			setState(141);
			((CicloContext)_localctx).idNivel = match(ID);
			setState(142);
			match(CO_DER);
			setState(143);
			match(CO_IZQ);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 135291469832L) != 0)) {
				{
				setState(144);
				((CicloContext)_localctx).parte1 = expresion();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_ASIG) {
					{
					setState(145);
					match(OP_ASIG);
					setState(146);
					((CicloContext)_localctx).parte1Inicial = expresion();
					}
				}

				}
			}

			setState(151);
			match(ALMACENADOR);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 135291469832L) != 0)) {
				{
				setState(152);
				((CicloContext)_localctx).parte2 = comparacion();
				}
			}

			setState(155);
			match(ALMACENADOR);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(156);
				((CicloContext)_localctx).parte3 = incremento();
				}
			}

			setState(159);
			match(CO_DER);
			setState(160);
			match(CO_IZQ);
			setState(161);
			((CicloContext)_localctx).interruptor = match(INT_LITERAL);
			setState(162);
			match(CO_DER);
			setState(163);
			match(LL_IZQ);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70462210048L) != 0)) {
				{
				{
				setState(164);
				instruccion();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(LL_DER);
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
		public List<TerminalNode> OP_SUMA() { return getTokens(LanguageParser.OP_SUMA); }
		public TerminalNode OP_SUMA(int i) {
			return getToken(LanguageParser.OP_SUMA, i);
		}
		public List<TerminalNode> OP_RESTA() { return getTokens(LanguageParser.OP_RESTA); }
		public TerminalNode OP_RESTA(int i) {
			return getToken(LanguageParser.OP_RESTA, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expresion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			termino();
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					_la = _input.LA(1);
					if ( !(_la==OP_SUMA || _la==OP_RESTA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(174);
					termino();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public List<TerminalNode> OP_MULT() { return getTokens(LanguageParser.OP_MULT); }
		public TerminalNode OP_MULT(int i) {
			return getToken(LanguageParser.OP_MULT, i);
		}
		public List<TerminalNode> OP_DIV() { return getTokens(LanguageParser.OP_DIV); }
		public TerminalNode OP_DIV(int i) {
			return getToken(LanguageParser.OP_DIV, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_termino);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			factor();
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					_la = _input.LA(1);
					if ( !(_la==OP_MULT || _la==OP_DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(182);
					factor();
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public Token op;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode OP_MAYOR() { return getToken(LanguageParser.OP_MAYOR, 0); }
		public TerminalNode OP_MENOR() { return getToken(LanguageParser.OP_MENOR, 0); }
		public TerminalNode OP_MAYORIGUAL() { return getToken(LanguageParser.OP_MAYORIGUAL, 0); }
		public TerminalNode OP_MENORIGUAL() { return getToken(LanguageParser.OP_MENORIGUAL, 0); }
		public TerminalNode OP_IGUAL() { return getToken(LanguageParser.OP_IGUAL, 0); }
		public TerminalNode OP_DIFERENTE() { return getToken(LanguageParser.OP_DIFERENTE, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitComparacion(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			expresion();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) {
				{
				setState(189);
				((ComparacionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) ) {
					((ComparacionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				expresion();
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode INT_LITERAL() { return getToken(LanguageParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(LanguageParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(LanguageParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(LanguageParser.CHAR_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(LanguageParser.BOOL_LITERAL, 0); }
		public TerminalNode PAR_IZQ() { return getToken(LanguageParser.PAR_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(LanguageParser.PAR_DER, 0); }
		public TerminalNode OP_INCREMENTO() { return getToken(LanguageParser.OP_INCREMENTO, 0); }
		public TerminalNode OP_MAYOR() { return getToken(LanguageParser.OP_MAYOR, 0); }
		public TerminalNode OP_MENOR() { return getToken(LanguageParser.OP_MENOR, 0); }
		public TerminalNode OP_MAYORIGUAL() { return getToken(LanguageParser.OP_MAYORIGUAL, 0); }
		public TerminalNode OP_MENORIGUAL() { return getToken(LanguageParser.OP_MENORIGUAL, 0); }
		public TerminalNode OP_IGUAL() { return getToken(LanguageParser.OP_IGUAL, 0); }
		public TerminalNode OP_DIFERENTE() { return getToken(LanguageParser.OP_DIFERENTE, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(INT_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(FLOAT_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				match(CHAR_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				match(BOOL_LITERAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				match(PAR_IZQ);
				setState(200);
				expresion();
				setState(201);
				match(PAR_DER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				match(ID);
				setState(204);
				match(OP_INCREMENTO);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(205);
				match(ID);
				setState(206);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
				expresion();
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

	public static final String _serializedATN =
		"\u0004\u0001&\u00d3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0004\u0000"+
		" \b\u0000\u000b\u0000\f\u0000!\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001,\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00028\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007V\b"+
		"\u0007\n\u0007\f\u0007Y\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007]\b"+
		"\u0007\n\u0007\f\u0007`\t\u0007\u0001\u0007\u0003\u0007c\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\bq\b\b\n\b\f\bt\t\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t|\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0081"+
		"\b\t\u0001\t\u0001\t\u0005\t\u0085\b\t\n\t\f\t\u0088\t\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0094\b\n\u0003\n\u0096\b\n\u0001\n\u0001\n\u0003\n\u009a\b\n\u0001"+
		"\n\u0001\n\u0003\n\u009e\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00a6\b\n\n\n\f\n\u00a9\t\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00b0\b\u000b\n\u000b\f\u000b\u00b3\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u00b8\b\f\n\f\f\f\u00bb\t\f\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00c0\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00d1\b\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0004\u0001"+
		"\u0000\u0015\u0019\u0001\u0000\n\u000b\u0001\u0000\f\r\u0001\u0000\u000e"+
		"\u0013\u00e1\u0000\u001f\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000"+
		"\u0000\u00047\u0001\u0000\u0000\u0000\u00069\u0001\u0000\u0000\u0000\b"+
		";\u0001\u0000\u0000\u0000\n@\u0001\u0000\u0000\u0000\fC\u0001\u0000\u0000"+
		"\u0000\u000eI\u0001\u0000\u0000\u0000\u0010d\u0001\u0000\u0000\u0000\u0012"+
		"w\u0001\u0000\u0000\u0000\u0014\u008b\u0001\u0000\u0000\u0000\u0016\u00ac"+
		"\u0001\u0000\u0000\u0000\u0018\u00b4\u0001\u0000\u0000\u0000\u001a\u00bc"+
		"\u0001\u0000\u0000\u0000\u001c\u00d0\u0001\u0000\u0000\u0000\u001e \u0003"+
		"\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000"+
		"\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0001"+
		"\u0000\u0000\u0000#$\u0005\u0000\u0000\u0001$\u0001\u0001\u0000\u0000"+
		"\u0000%,\u0003\u0004\u0002\u0000&,\u0003\b\u0004\u0000\',\u0003\n\u0005"+
		"\u0000(,\u0003\f\u0006\u0000),\u0003\u000e\u0007\u0000*,\u0003\u0014\n"+
		"\u0000+%\u0001\u0000\u0000\u0000+&\u0001\u0000\u0000\u0000+\'\u0001\u0000"+
		"\u0000\u0000+(\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+*\u0001"+
		"\u0000\u0000\u0000,\u0003\u0001\u0000\u0000\u0000-.\u0003\u0006\u0003"+
		"\u0000./\u0005$\u0000\u0000/0\u0005\b\u0000\u000001\u0003\u0016\u000b"+
		"\u000012\u0005\u0007\u0000\u000028\u0001\u0000\u0000\u000034\u0003\u0006"+
		"\u0003\u000045\u0005$\u0000\u000056\u0005\u0007\u0000\u000068\u0001\u0000"+
		"\u0000\u00007-\u0001\u0000\u0000\u000073\u0001\u0000\u0000\u00008\u0005"+
		"\u0001\u0000\u0000\u00009:\u0007\u0000\u0000\u0000:\u0007\u0001\u0000"+
		"\u0000\u0000;<\u0005$\u0000\u0000<=\u0005\b\u0000\u0000=>\u0003\u0016"+
		"\u000b\u0000>?\u0005\u0007\u0000\u0000?\t\u0001\u0000\u0000\u0000@A\u0005"+
		"$\u0000\u0000AB\u0005\t\u0000\u0000B\u000b\u0001\u0000\u0000\u0000CD\u0005"+
		"\u001e\u0000\u0000DE\u0005\u0003\u0000\u0000EF\u0003\u0016\u000b\u0000"+
		"FG\u0005\u0004\u0000\u0000GH\u0005\u0007\u0000\u0000H\r\u0001\u0000\u0000"+
		"\u0000IJ\u0005\u001a\u0000\u0000JK\u0005\u0001\u0000\u0000KL\u0005$\u0000"+
		"\u0000LM\u0005\u0002\u0000\u0000MN\u0005\u0003\u0000\u0000NO\u0003\u001a"+
		"\r\u0000OP\u0005\u0004\u0000\u0000PQ\u0005\u0001\u0000\u0000QR\u0005\u001f"+
		"\u0000\u0000RS\u0005\u0002\u0000\u0000SW\u0005\u0005\u0000\u0000TV\u0003"+
		"\u0002\u0001\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000Z^\u0005\u0006\u0000\u0000[]\u0003\u0010"+
		"\b\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000ac\u0003\u0012\t\u0000ba\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000c\u000f\u0001\u0000\u0000\u0000de\u0005\u001c"+
		"\u0000\u0000ef\u0005\u0001\u0000\u0000fg\u0005$\u0000\u0000gh\u0005\u0002"+
		"\u0000\u0000hi\u0005\u0003\u0000\u0000ij\u0003\u001a\r\u0000jk\u0005\u0004"+
		"\u0000\u0000kl\u0005\u0001\u0000\u0000lm\u0005\u001f\u0000\u0000mn\u0005"+
		"\u0002\u0000\u0000nr\u0005\u0005\u0000\u0000oq\u0003\u0002\u0001\u0000"+
		"po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000uv\u0005\u0006\u0000\u0000v\u0011\u0001\u0000\u0000\u0000"+
		"w{\u0005\u001b\u0000\u0000xy\u0005\u0001\u0000\u0000yz\u0005$\u0000\u0000"+
		"z|\u0005\u0002\u0000\u0000{x\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|\u0080\u0001\u0000\u0000\u0000}~\u0005\u0001\u0000\u0000~\u007f"+
		"\u0005\u001f\u0000\u0000\u007f\u0081\u0005\u0002\u0000\u0000\u0080}\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0086\u0005\u0005\u0000\u0000\u0083\u0085\u0003"+
		"\u0002\u0001\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\u0006\u0000\u0000\u008a\u0013\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\u001d\u0000\u0000\u008c\u008d\u0005"+
		"\u0001\u0000\u0000\u008d\u008e\u0005$\u0000\u0000\u008e\u008f\u0005\u0002"+
		"\u0000\u0000\u008f\u0095\u0005\u0001\u0000\u0000\u0090\u0093\u0003\u0016"+
		"\u000b\u0000\u0091\u0092\u0005\b\u0000\u0000\u0092\u0094\u0003\u0016\u000b"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0090\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0099\u0005\u0014\u0000\u0000\u0098\u009a\u0003\u001a\r\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0005\u0014\u0000\u0000"+
		"\u009c\u009e\u0003\n\u0005\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005\u0002\u0000\u0000\u00a0\u00a1\u0005\u0001\u0000\u0000\u00a1"+
		"\u00a2\u0005\u001f\u0000\u0000\u00a2\u00a3\u0005\u0002\u0000\u0000\u00a3"+
		"\u00a7\u0005\u0005\u0000\u0000\u00a4\u00a6\u0003\u0002\u0001\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0005\u0006\u0000\u0000\u00ab\u0015\u0001\u0000\u0000\u0000\u00ac"+
		"\u00b1\u0003\u0018\f\u0000\u00ad\u00ae\u0007\u0001\u0000\u0000\u00ae\u00b0"+
		"\u0003\u0018\f\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u0017\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b9\u0003\u001c\u000e\u0000\u00b5\u00b6\u0007"+
		"\u0002\u0000\u0000\u00b6\u00b8\u0003\u001c\u000e\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u0019\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf\u0003"+
		"\u0016\u000b\u0000\u00bd\u00be\u0007\u0003\u0000\u0000\u00be\u00c0\u0003"+
		"\u0016\u000b\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u001b\u0001\u0000\u0000\u0000\u00c1\u00d1\u0005"+
		"$\u0000\u0000\u00c2\u00d1\u0005\u001f\u0000\u0000\u00c3\u00d1\u0005 \u0000"+
		"\u0000\u00c4\u00d1\u0005!\u0000\u0000\u00c5\u00d1\u0005\"\u0000\u0000"+
		"\u00c6\u00d1\u0005#\u0000\u0000\u00c7\u00c8\u0005\u0003\u0000\u0000\u00c8"+
		"\u00c9\u0003\u0016\u000b\u0000\u00c9\u00ca\u0005\u0004\u0000\u0000\u00ca"+
		"\u00d1\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005$\u0000\u0000\u00cc\u00d1"+
		"\u0005\t\u0000\u0000\u00cd\u00ce\u0005$\u0000\u0000\u00ce\u00cf\u0007"+
		"\u0003\u0000\u0000\u00cf\u00d1\u0003\u0016\u000b\u0000\u00d0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00d0\u00c2\u0001\u0000\u0000\u0000\u00d0\u00c3\u0001"+
		"\u0000\u0000\u0000\u00d0\u00c4\u0001\u0000\u0000\u0000\u00d0\u00c5\u0001"+
		"\u0000\u0000\u0000\u00d0\u00c6\u0001\u0000\u0000\u0000\u00d0\u00c7\u0001"+
		"\u0000\u0000\u0000\u00d0\u00cb\u0001\u0000\u0000\u0000\u00d0\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d1\u001d\u0001\u0000\u0000\u0000\u0013!+7W^br{\u0080"+
		"\u0086\u0093\u0095\u0099\u009d\u00a7\u00b1\u00b9\u00bf\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}