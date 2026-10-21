// Generated from com\stoc\Language.g4 by ANTLR 4.9.2
package com.stoc;
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
			"'--'", "'('", "')'", "'\uD83D\uDC1F'"
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING_LITERAL) | (1L << PROM) | (1L << ENT) | (1L << CHAR) | (1L << PRINT) | (1L << RESERVA_IBOX) | (1L << RESERVA_EIBOX) | (1L << FOR) | (1L << WHILE) | (1L << PAR_CLOSEL) | (1L << FLOAT_LITERAL) | (1L << ENT_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << ID))) != 0) );
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
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING_LITERAL) | (1L << PROM) | (1L << ENT) | (1L << CHAR) | (1L << PRINT) | (1L << RESERVA_IBOX) | (1L << RESERVA_EIBOX) | (1L << FOR) | (1L << WHILE) | (1L << PAR_CLOSEL) | (1L << FLOAT_LITERAL) | (1L << ENT_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << ID))) != 0)) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterEstructura_de_condicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitEstructura_de_condicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitEstructura_de_condicion(this);
			else return visitor.visitChildren(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING_LITERAL) | (1L << PROM) | (1L << ENT) | (1L << CHAR) | (1L << PRINT) | (1L << RESERVA_IBOX) | (1L << RESERVA_EIBOX) | (1L << FOR) | (1L << WHILE) | (1L << PAR_CLOSEL) | (1L << FLOAT_LITERAL) | (1L << ENT_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << ID))) != 0)) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING_LITERAL) | (1L << PROM) | (1L << ENT) | (1L << CHAR) | (1L << PRINT) | (1L << RESERVA_IBOX) | (1L << RESERVA_EIBOX) | (1L << FOR) | (1L << WHILE) | (1L << PAR_CLOSEL) | (1L << FLOAT_LITERAL) | (1L << ENT_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << ID))) != 0)) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING_LITERAL) | (1L << PROM) | (1L << ENT) | (1L << CHAR) | (1L << PRINT) | (1L << RESERVA_IBOX) | (1L << RESERVA_EIBOX) | (1L << FOR) | (1L << WHILE) | (1L << PAR_CLOSEL) | (1L << FLOAT_LITERAL) | (1L << ENT_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << ID))) != 0)) {
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
		enterRule(_localctx, 16, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			expresion();
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << OP_MAYORQ) | (1L << OP_MENORQ) | (1L << ASIG_IGUALACION) | (1L << MAYOR_IGUALACION) | (1L << MENOR_IGUALACION))) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << FLOAT_LITERAL) | (1L << ENT_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << CHARACTER_LITERAL))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u00c7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\2\3\2\3\3"+
		"\3\3\5\3&\n\3\3\3\3\3\5\3*\n\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\3\3\5\3\64"+
		"\n\3\3\3\3\3\5\38\n\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\5\4C\n\4\3"+
		"\5\3\5\3\5\3\5\5\5I\n\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\5\6S\n\6\3\6"+
		"\3\6\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\7\3\7\7\7`\n\7\f\7\16\7c\13\7"+
		"\3\7\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\3\7\5\7n\n\7\5\7p\n\7\5\7r\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0085\n\t\3\t\3\t\3\t\5\t\u008a\n\t\3\t\3\t\3\t\7\t\u008f\n\t\f\t"+
		"\16\t\u0092\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009c\n\t\f\t\16"+
		"\t\u009f\13\t\3\t\3\t\5\t\u00a3\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13"+
		"\u00ac\n\13\f\13\16\13\u00af\13\13\3\f\3\f\3\f\7\f\u00b4\n\f\f\f\16\f"+
		"\u00b7\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c3\n\r\3\16"+
		"\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\7\3\2+,\5\2\3\3\37"+
		" \"$\3\2\32\33\3\2\34\35\4\2\4\4\60\63\2\u00e0\2\35\3\2\2\2\49\3\2\2\2"+
		"\6;\3\2\2\2\bL\3\2\2\2\nN\3\2\2\2\fq\3\2\2\2\16s\3\2\2\2\20\u00a2\3\2"+
		"\2\2\22\u00a4\3\2\2\2\24\u00a8\3\2\2\2\26\u00b0\3\2\2\2\30\u00c2\3\2\2"+
		"\2\32\u00c4\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3"+
		"\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\2\2\3\"\3\3\2\2\2#%\5\6\4\2$&\7\36\2"+
		"\2%$\3\2\2\2%&\3\2\2\2&:\3\2\2\2\')\5\b\5\2(*\7\36\2\2)(\3\2\2\2)*\3\2"+
		"\2\2*:\3\2\2\2+-\5\n\6\2,.\7\36\2\2-,\3\2\2\2-.\3\2\2\2.:\3\2\2\2/:\5"+
		"\f\7\2\60:\5\20\t\2\61\63\5\22\n\2\62\64\7\36\2\2\63\62\3\2\2\2\63\64"+
		"\3\2\2\2\64:\3\2\2\2\65\67\5\24\13\2\668\7\36\2\2\67\66\3\2\2\2\678\3"+
		"\2\2\28:\3\2\2\29#\3\2\2\29\'\3\2\2\29+\3\2\2\29/\3\2\2\29\60\3\2\2\2"+
		"9\61\3\2\2\29\65\3\2\2\2:\5\3\2\2\2;<\5\32\16\2<B\7\64\2\2=@\7!\2\2>A"+
		"\5\22\n\2?A\5\24\13\2@>\3\2\2\2@?\3\2\2\2AC\3\2\2\2B=\3\2\2\2BC\3\2\2"+
		"\2C\7\3\2\2\2DE\7\64\2\2EH\7!\2\2FI\5\22\n\2GI\5\24\13\2HF\3\2\2\2HG\3"+
		"\2\2\2IM\3\2\2\2JK\7\64\2\2KM\t\2\2\2LD\3\2\2\2LJ\3\2\2\2M\t\3\2\2\2N"+
		"O\7\21\2\2OR\7-\2\2PS\5\22\n\2QS\5\24\13\2RP\3\2\2\2RQ\3\2\2\2ST\3\2\2"+
		"\2TU\7.\2\2U\13\3\2\2\2VZ\7\22\2\2WY\5\16\b\2XW\3\2\2\2Y\\\3\2\2\2ZX\3"+
		"\2\2\2Z[\3\2\2\2[r\3\2\2\2\\Z\3\2\2\2]a\7\24\2\2^`\5\16\b\2_^\3\2\2\2"+
		"`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bo\3\2\2\2ca\3\2\2\2dm\7\23\2\2ei\7)\2\2"+
		"fh\5\4\3\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2"+
		"ln\7*\2\2me\3\2\2\2mn\3\2\2\2np\3\2\2\2od\3\2\2\2op\3\2\2\2pr\3\2\2\2"+
		"qV\3\2\2\2q]\3\2\2\2r\r\3\2\2\2st\7-\2\2tu\5\22\n\2uv\7.\2\2vz\7)\2\2"+
		"wy\5\4\3\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2"+
		"}~\7*\2\2~\17\3\2\2\2\177\u0080\7\25\2\2\u0080\u0081\5\6\4\2\u0081\u0084"+
		"\7/\2\2\u0082\u0085\5\22\n\2\u0083\u0085\5\24\13\2\u0084\u0082\3\2\2\2"+
		"\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089"+
		"\7/\2\2\u0087\u008a\5\b\5\2\u0088\u008a\5\24\13\2\u0089\u0087\3\2\2\2"+
		"\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
		"\7-\2\2\u008c\u0090\7)\2\2\u008d\u008f\5\4\3\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7*\2\2\u0094\u00a3\3\2\2\2\u0095"+
		"\u0096\7\26\2\2\u0096\u0097\7-\2\2\u0097\u0098\5\22\n\2\u0098\u0099\7"+
		".\2\2\u0099\u009d\7)\2\2\u009a\u009c\5\4\3\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\177\3\2\2\2\u00a2\u0095\3\2\2\2\u00a3\21\3\2\2\2\u00a4\u00a5\5\24\13"+
		"\2\u00a5\u00a6\t\3\2\2\u00a6\u00a7\5\24\13\2\u00a7\23\3\2\2\2\u00a8\u00ad"+
		"\5\26\f\2\u00a9\u00aa\t\4\2\2\u00aa\u00ac\5\26\f\2\u00ab\u00a9\3\2\2\2"+
		"\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\25"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b5\5\30\r\2\u00b1\u00b2\t\5\2\2"+
		"\u00b2\u00b4\5\30\r\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\27\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00b9\7-\2\2\u00b9\u00ba\5\24\13\2\u00ba\u00bb\7.\2\2\u00bb\u00c3\3\2"+
		"\2\2\u00bc\u00c3\7\n\2\2\u00bd\u00c3\7\7\2\2\u00be\u00c3\7\3\2\2\u00bf"+
		"\u00c3\7\4\2\2\u00c0\u00c3\7\f\2\2\u00c1\u00c3\7\64\2\2\u00c2\u00b8\3"+
		"\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2"+
		"\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\31\3\2\2"+
		"\2\u00c4\u00c5\t\6\2\2\u00c5\33\3\2\2\2\35\37%)-\63\679@BHLRZaimoqz\u0084"+
		"\u0089\u0090\u009d\u00a2\u00ad\u00b5\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}