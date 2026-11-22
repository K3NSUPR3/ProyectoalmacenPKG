// Generated from src/main/antlr4/com/stockscript/Language.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageParser extends Parser {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOL) | (1L << IF) | (1L << FOR) | (1L << PRINT) | (1L << ID))) != 0) );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOL))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
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

	public static class IncrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode OP_INCREMENTO() { return getToken(LanguageParser.OP_INCREMENTO, 0); }
		public TerminalNode OP_CIERRE() { return getToken(LanguageParser.OP_CIERRE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIncremento(this);
			else return visitor.visitChildren(this);
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
			setState(66);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(PRINT);
			setState(69);
			match(PAR_IZQ);
			setState(70);
			expresion();
			setState(71);
			match(PAR_DER);
			setState(72);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IF);
			setState(75);
			match(CO_IZQ);
			setState(76);
			((CondicionContext)_localctx).idNivel = match(ID);
			setState(77);
			match(CO_DER);
			setState(78);
			match(PAR_IZQ);
			setState(79);
			((CondicionContext)_localctx).cond = comparacion();
			setState(80);
			match(PAR_DER);
			setState(81);
			match(CO_IZQ);
			setState(82);
			((CondicionContext)_localctx).interruptor = match(INT_LITERAL);
			setState(83);
			match(CO_DER);
			setState(84);
			match(LL_IZQ);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOL) | (1L << IF) | (1L << FOR) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(85);
				instruccion();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(LL_DER);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(92);
				eibox_part();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(98);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitEibox_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eibox_partContext eibox_part() throws RecognitionException {
		Eibox_partContext _localctx = new Eibox_partContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_eibox_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ELSEIF);
			setState(102);
			match(CO_IZQ);
			setState(103);
			((Eibox_partContext)_localctx).idNivel = match(ID);
			setState(104);
			match(CO_DER);
			setState(105);
			match(PAR_IZQ);
			setState(106);
			((Eibox_partContext)_localctx).cond = comparacion();
			setState(107);
			match(PAR_DER);
			setState(108);
			match(CO_IZQ);
			setState(109);
			((Eibox_partContext)_localctx).interruptor = match(INT_LITERAL);
			setState(110);
			match(CO_DER);
			setState(111);
			match(LL_IZQ);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOL) | (1L << IF) | (1L << FOR) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(112);
				instruccion();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitEbox_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ebox_partContext ebox_part() throws RecognitionException {
		Ebox_partContext _localctx = new Ebox_partContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ebox_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ELSE);
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(121);
				match(CO_IZQ);
				setState(122);
				((Ebox_partContext)_localctx).idNivel = match(ID);
				setState(123);
				match(CO_DER);
				}
				break;
			}
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CO_IZQ) {
				{
				setState(126);
				match(CO_IZQ);
				setState(127);
				((Ebox_partContext)_localctx).interruptor = match(INT_LITERAL);
				setState(128);
				match(CO_DER);
				}
			}

			setState(131);
			match(LL_IZQ);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOL) | (1L << IF) | (1L << FOR) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(132);
				instruccion();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ciclo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(FOR);
			setState(141);
			match(CO_IZQ);
			setState(142);
			((CicloContext)_localctx).idNivel = match(ID);
			setState(143);
			match(CO_DER);
			setState(144);
			match(CO_IZQ);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_IZQ) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << CHAR_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(145);
				((CicloContext)_localctx).parte1 = expresion();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_ASIG) {
					{
					setState(146);
					match(OP_ASIG);
					setState(147);
					((CicloContext)_localctx).parte1Inicial = expresion();
					}
				}

				}
			}

			setState(152);
			match(ALMACENADOR);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_IZQ) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << CHAR_LITERAL) | (1L << ID))) != 0)) {
				{
				setState(153);
				((CicloContext)_localctx).parte2 = comparacion();
				}
			}

			setState(156);
			match(ALMACENADOR);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(157);
				((CicloContext)_localctx).parte3 = incremento();
				}
			}

			setState(160);
			match(CO_DER);
			setState(161);
			match(CO_IZQ);
			setState(162);
			((CicloContext)_localctx).interruptor = match(INT_LITERAL);
			setState(163);
			match(CO_DER);
			setState(164);
			match(LL_IZQ);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOL) | (1L << IF) | (1L << FOR) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(165);
				instruccion();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
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
			setState(173);
			termino();
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					_la = _input.LA(1);
					if ( !(_la==OP_SUMA || _la==OP_RESTA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(175);
					termino();
					}
					} 
				}
				setState(180);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
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
			setState(181);
			factor();
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					_la = _input.LA(1);
					if ( !(_la==OP_MULT || _la==OP_DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(183);
					factor();
					}
					} 
				}
				setState(188);
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

	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode OP_MAYOR() { return getToken(LanguageParser.OP_MAYOR, 0); }
		public TerminalNode OP_MENOR() { return getToken(LanguageParser.OP_MENOR, 0); }
		public TerminalNode OP_MAYORIGUAL() { return getToken(LanguageParser.OP_MAYORIGUAL, 0); }
		public TerminalNode OP_MENORIGUAL() { return getToken(LanguageParser.OP_MENORIGUAL, 0); }
		public TerminalNode OP_IGUAL() { return getToken(LanguageParser.OP_IGUAL, 0); }
		public TerminalNode OP_DIFERENTE() { return getToken(LanguageParser.OP_DIFERENTE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(189);
				expresion();
				}
				break;
			case 2:
				{
				setState(190);
				match(ID);
				}
				break;
			}
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MAYOR) | (1L << OP_MENOR) | (1L << OP_MAYORIGUAL) | (1L << OP_MENORIGUAL) | (1L << OP_IGUAL) | (1L << OP_DIFERENTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(194);
				expresion();
				}
				break;
			case 2:
				{
				setState(195);
				match(ID);
				}
				break;
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode INT_LITERAL() { return getToken(LanguageParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(LanguageParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(LanguageParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(LanguageParser.CHAR_LITERAL, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(INT_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(FLOAT_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				match(CHAR_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(PAR_IZQ);
				setState(204);
				expresion();
				setState(205);
				match(PAR_DER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
				match(ID);
				setState(208);
				match(OP_INCREMENTO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				match(ID);
				setState(210);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MAYOR) | (1L << OP_MENOR) | (1L << OP_MAYORIGUAL) | (1L << OP_MENORIGUAL) | (1L << OP_IGUAL) | (1L << OP_DIFERENTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(211);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16"+
		"\2#\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\tY\n\t\f\t\16\t\\\13\t\3\t\3\t\7\t`\n\t\f\t\16\tc\13\t\3\t\5\tf\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nt\n\n\f\n\16\nw\13"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\177\n\13\3\13\3\13\3\13\5\13\u0084"+
		"\n\13\3\13\3\13\7\13\u0088\n\13\f\13\16\13\u008b\13\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0097\n\f\5\f\u0099\n\f\3\f\3\f\5\f\u009d"+
		"\n\f\3\f\3\f\5\f\u00a1\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a9\n\f\f\f\16"+
		"\f\u00ac\13\f\3\f\3\f\3\r\3\r\3\r\7\r\u00b3\n\r\f\r\16\r\u00b6\13\r\3"+
		"\16\3\16\3\16\7\16\u00bb\n\16\f\16\16\16\u00be\13\16\3\17\3\17\5\17\u00c2"+
		"\n\17\3\17\3\17\3\17\5\17\u00c7\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d7\n\20\3\20\2\2\21\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36\2\6\3\2\27\33\3\2\f\r\3\2\16\17\3\2"+
		"\20\25\2\u00e7\2!\3\2\2\2\4-\3\2\2\2\69\3\2\2\2\b;\3\2\2\2\n=\3\2\2\2"+
		"\fB\3\2\2\2\16F\3\2\2\2\20L\3\2\2\2\22g\3\2\2\2\24z\3\2\2\2\26\u008e\3"+
		"\2\2\2\30\u00af\3\2\2\2\32\u00b7\3\2\2\2\34\u00c1\3\2\2\2\36\u00d6\3\2"+
		"\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7"+
		"\2\2\3&\3\3\2\2\2\'.\5\6\4\2(.\5\n\6\2).\5\f\7\2*.\5\16\b\2+.\5\20\t\2"+
		",.\5\26\f\2-\'\3\2\2\2-(\3\2\2\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2"+
		"\2.\5\3\2\2\2/\60\5\b\5\2\60\61\7%\2\2\61\62\7\n\2\2\62\63\5\30\r\2\63"+
		"\64\7\t\2\2\64:\3\2\2\2\65\66\5\b\5\2\66\67\7%\2\2\678\7\t\2\28:\3\2\2"+
		"\29/\3\2\2\29\65\3\2\2\2:\7\3\2\2\2;<\t\2\2\2<\t\3\2\2\2=>\7%\2\2>?\7"+
		"\n\2\2?@\5\30\r\2@A\7\t\2\2A\13\3\2\2\2BC\7%\2\2CD\7\13\2\2DE\7\t\2\2"+
		"E\r\3\2\2\2FG\7 \2\2GH\7\5\2\2HI\5\30\r\2IJ\7\6\2\2JK\7\t\2\2K\17\3\2"+
		"\2\2LM\7\34\2\2MN\7\3\2\2NO\7%\2\2OP\7\4\2\2PQ\7\5\2\2QR\5\34\17\2RS\7"+
		"\6\2\2ST\7\3\2\2TU\7!\2\2UV\7\4\2\2VZ\7\7\2\2WY\5\4\3\2XW\3\2\2\2Y\\\3"+
		"\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]a\7\b\2\2^`\5\22\n\2_"+
		"^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2df\5\24\13"+
		"\2ed\3\2\2\2ef\3\2\2\2f\21\3\2\2\2gh\7\36\2\2hi\7\3\2\2ij\7%\2\2jk\7\4"+
		"\2\2kl\7\5\2\2lm\5\34\17\2mn\7\6\2\2no\7\3\2\2op\7!\2\2pq\7\4\2\2qu\7"+
		"\7\2\2rt\5\4\3\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3"+
		"\2\2\2xy\7\b\2\2y\23\3\2\2\2z~\7\35\2\2{|\7\3\2\2|}\7%\2\2}\177\7\4\2"+
		"\2~{\3\2\2\2~\177\3\2\2\2\177\u0083\3\2\2\2\u0080\u0081\7\3\2\2\u0081"+
		"\u0082\7!\2\2\u0082\u0084\7\4\2\2\u0083\u0080\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0089\7\7\2\2\u0086\u0088\5\4\3\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\b\2\2\u008d"+
		"\25\3\2\2\2\u008e\u008f\7\37\2\2\u008f\u0090\7\3\2\2\u0090\u0091\7%\2"+
		"\2\u0091\u0092\7\4\2\2\u0092\u0098\7\3\2\2\u0093\u0096\5\30\r\2\u0094"+
		"\u0095\7\n\2\2\u0095\u0097\5\30\r\2\u0096\u0094\3\2\2\2\u0096\u0097\3"+
		"\2\2\2\u0097\u0099\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009c\7\26\2\2\u009b\u009d\5\34\17\2\u009c\u009b"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\7\26\2\2"+
		"\u009f\u00a1\5\f\7\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\7\3\2\2\u00a4\u00a5\7!\2\2\u00a5"+
		"\u00a6\7\4\2\2\u00a6\u00aa\7\7\2\2\u00a7\u00a9\5\4\3\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\b\2\2\u00ae\27\3\2\2"+
		"\2\u00af\u00b4\5\32\16\2\u00b0\u00b1\t\3\2\2\u00b1\u00b3\5\32\16\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\31\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00bc\5\36\20\2\u00b8"+
		"\u00b9\t\4\2\2\u00b9\u00bb\5\36\20\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3"+
		"\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\33\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c2\5\30\r\2\u00c0\u00c2\7%\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\t\5\2\2\u00c4"+
		"\u00c7\5\30\r\2\u00c5\u00c7\7%\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\35\3\2\2\2\u00c8\u00d7\7%\2\2\u00c9\u00d7\7!\2\2\u00ca\u00d7"+
		"\7\"\2\2\u00cb\u00d7\7#\2\2\u00cc\u00d7\7$\2\2\u00cd\u00ce\7\5\2\2\u00ce"+
		"\u00cf\5\30\r\2\u00cf\u00d0\7\6\2\2\u00d0\u00d7\3\2\2\2\u00d1\u00d2\7"+
		"%\2\2\u00d2\u00d7\7\13\2\2\u00d3\u00d4\7%\2\2\u00d4\u00d5\t\5\2\2\u00d5"+
		"\u00d7\5\30\r\2\u00d6\u00c8\3\2\2\2\u00d6\u00c9\3\2\2\2\u00d6\u00ca\3"+
		"\2\2\2\u00d6\u00cb\3\2\2\2\u00d6\u00cc\3\2\2\2\u00d6\u00cd\3\2\2\2\u00d6"+
		"\u00d1\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\37\3\2\2\2\26#-9Zaeu~\u0083\u0089"+
		"\u0096\u0098\u009c\u00a0\u00aa\u00b4\u00bc\u00c1\u00c6\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}