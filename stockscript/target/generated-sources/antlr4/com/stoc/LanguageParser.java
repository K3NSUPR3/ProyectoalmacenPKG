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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING_LITERAL) | (1L << PROM) | (1L << AUTO) | (1L << ENT) | (1L << CHAR) | (1L << FALSO) | (1L << VERDADERO) | (1L << PRINT) | (1L << RESERVA_EIBOX) | (1L << PAR_CLOSEL) | (1L << FLOAT_LITERAL) | (1L << ENT_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << ID))) != 0) );
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterCondicion_activada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitCondicion_activada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitCondicion_activada(this);
			else return visitor.visitChildren(this);
		}
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
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING_LITERAL) | (1L << PROM) | (1L << AUTO) | (1L << ENT) | (1L << CHAR) | (1L << FALSO) | (1L << VERDADERO) | (1L << PRINT) | (1L << RESERVA_EIBOX) | (1L << PAR_CLOSEL) | (1L << FLOAT_LITERAL) | (1L << ENT_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << ID))) != 0)) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterCondicion_desactivada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitCondicion_desactivada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitCondicion_desactivada(this);
			else return visitor.visitChildren(this);
		}
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
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING_LITERAL) | (1L << PROM) | (1L << AUTO) | (1L << ENT) | (1L << CHAR) | (1L << FALSO) | (1L << VERDADERO) | (1L << PRINT) | (1L << RESERVA_EIBOX) | (1L << PAR_CLOSEL) | (1L << FLOAT_LITERAL) | (1L << ENT_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << ID))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << STRING_LITERAL) | (1L << PROM) | (1L << AUTO) | (1L << ENT) | (1L << CHAR) | (1L << FALSO) | (1L << VERDADERO) | (1L << PRINT) | (1L << RESERVA_EIBOX) | (1L << PAR_CLOSEL) | (1L << FLOAT_LITERAL) | (1L << ENT_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << ID))) != 0)) {
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

	public static class CicloContext extends ParserRuleContext {
		public TerminalNode AUTO() { return getToken(LanguageParser.AUTO, 0); }
		public List<TerminalNode> CO_CLOSEL() { return getTokens(LanguageParser.CO_CLOSEL); }
		public TerminalNode CO_CLOSEL(int i) {
			return getToken(LanguageParser.CO_CLOSEL, i);
		}
		public Condicion_activadaContext condicion_activada() {
			return getRuleContext(Condicion_activadaContext.class,0);
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
				condicion_activada();
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
		enterRule(_localctx, 18, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			expresion();
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << OP_MAYORQ) | (1L << OP_MENORQ) | (1L << ASIG_IGUALACION) | (1L << MAYOR_IGUALACION) | (1L << MENOR_IGUALACION))) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\2\3\2"+
		"\3\3\3\3\5\3(\n\3\3\3\3\3\5\3,\n\3\3\3\3\3\5\3\60\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\3\3\3\5\3A\n\3\5\3C\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\5\4J\n\4\5\4L\n\4\3\5\3\5\3\5\3\5\5\5R\n\5\3\5\3\5\5\5"+
		"V\n\5\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\7\3\7\3\7\7\7c\n\7\f\7\16\7"+
		"f\13\7\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\7\3\7\3\7\7\7r\n\7\f\7\16\7u"+
		"\13\7\3\7\5\7x\n\7\5\7z\n\7\5\7|\n\7\3\b\3\b\3\b\7\b\u0081\n\b\f\b\16"+
		"\b\u0084\13\b\3\b\3\b\7\b\u0088\n\b\f\b\16\b\u008b\13\b\3\b\3\b\3\b\7"+
		"\b\u0090\n\b\f\b\16\b\u0093\13\b\3\b\5\b\u0096\n\b\5\b\u0098\n\b\5\b\u009a"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u00a1\n\t\f\t\16\t\u00a4\13\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b5\n\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\7\f\u00be\n\f\f\f\16\f\u00c1\13\f\3\r\3\r\3"+
		"\r\7\r\u00c6\n\r\f\r\16\r\u00c9\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00d5\n\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\7\3\2\62\63\5\2\3\3#$&(\3\2\35\36\3\2\37 \4\2\4\4"+
		"\67:\2\u00f2\2\37\3\2\2\2\4B\3\2\2\2\6D\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2"+
		"\f{\3\2\2\2\16\u0099\3\2\2\2\20\u009b\3\2\2\2\22\u00a7\3\2\2\2\24\u00b6"+
		"\3\2\2\2\26\u00ba\3\2\2\2\30\u00c2\3\2\2\2\32\u00d4\3\2\2\2\34\u00d6\3"+
		"\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3"+
		"\2\2\2#$\7\2\2\3$\3\3\2\2\2%\'\5\6\4\2&(\7!\2\2\'&\3\2\2\2\'(\3\2\2\2"+
		"(C\3\2\2\2)+\5\b\5\2*,\7!\2\2+*\3\2\2\2+,\3\2\2\2,C\3\2\2\2-/\5\n\6\2"+
		".\60\7!\2\2/.\3\2\2\2/\60\3\2\2\2\60C\3\2\2\2\61\62\5\f\7\2\62\63\7!\2"+
		"\2\63C\3\2\2\2\64\65\5\16\b\2\65\66\7!\2\2\66C\3\2\2\2\678\5\22\n\289"+
		"\7!\2\29C\3\2\2\2:<\5\24\13\2;=\7!\2\2<;\3\2\2\2<=\3\2\2\2=C\3\2\2\2>"+
		"@\5\26\f\2?A\7!\2\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2\2B%\3\2\2\2B)\3\2\2\2"+
		"B-\3\2\2\2B\61\3\2\2\2B\64\3\2\2\2B\67\3\2\2\2B:\3\2\2\2B>\3\2\2\2C\5"+
		"\3\2\2\2DE\5\34\17\2EK\7;\2\2FI\7%\2\2GJ\5\24\13\2HJ\5\26\f\2IG\3\2\2"+
		"\2IH\3\2\2\2JL\3\2\2\2KF\3\2\2\2KL\3\2\2\2L\7\3\2\2\2MN\7;\2\2NQ\7%\2"+
		"\2OR\5\24\13\2PR\5\26\f\2QO\3\2\2\2QP\3\2\2\2RV\3\2\2\2ST\7;\2\2TV\t\2"+
		"\2\2UM\3\2\2\2US\3\2\2\2V\t\3\2\2\2WX\7\24\2\2X[\7\64\2\2Y\\\5\24\13\2"+
		"Z\\\5\26\f\2[Y\3\2\2\2[Z\3\2\2\2\\]\3\2\2\2]^\7\65\2\2^\13\3\2\2\2_`\7"+
		"\21\2\2`d\7\25\2\2ac\5\20\t\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2"+
		"e|\3\2\2\2fd\3\2\2\2gk\7\27\2\2hj\5\20\t\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2ly\3\2\2\2mk\3\2\2\2nw\7\26\2\2os\7-\2\2pr\5\4\3\2qp\3\2\2"+
		"\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vx\7.\2\2wo\3\2\2"+
		"\2wx\3\2\2\2xz\3\2\2\2yn\3\2\2\2yz\3\2\2\2z|\3\2\2\2{_\3\2\2\2{g\3\2\2"+
		"\2|\r\3\2\2\2}~\7\20\2\2~\u0082\7\25\2\2\177\u0081\5\20\t\2\u0080\177"+
		"\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u009a\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0089\7\27\2\2\u0086\u0088\5"+
		"\20\t\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0097\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0095\7\26"+
		"\2\2\u008d\u0091\7-\2\2\u008e\u0090\5\4\3\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0094\u0096\7.\2\2\u0095\u008d\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u008c\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u009a\3\2\2\2\u0099}\3\2\2\2\u0099\u0085\3\2\2\2\u009a\17\3"+
		"\2\2\2\u009b\u009c\7\64\2\2\u009c\u009d\5\24\13\2\u009d\u009e\7\65\2\2"+
		"\u009e\u00a2\7-\2\2\u009f\u00a1\5\4\3\2\u00a0\u009f\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\7.\2\2\u00a6\21\3\2\2\2\u00a7\u00b4\7\t\2\2"+
		"\u00a8\u00a9\7/\2\2\u00a9\u00aa\5\f\7\2\u00aa\u00ab\7\60\2\2\u00ab\u00ac"+
		"\7\66\2\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\7\62\2\2\u00ae\u00b5\3\2\2\2"+
		"\u00af\u00b0\7\63\2\2\u00b0\u00b1\7\60\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b3"+
		"\7\61\2\2\u00b3\u00b5\7\60\2\2\u00b4\u00a8\3\2\2\2\u00b4\u00af\3\2\2\2"+
		"\u00b5\23\3\2\2\2\u00b6\u00b7\5\26\f\2\u00b7\u00b8\t\3\2\2\u00b8\u00b9"+
		"\5\26\f\2\u00b9\25\3\2\2\2\u00ba\u00bf\5\30\r\2\u00bb\u00bc\t\4\2\2\u00bc"+
		"\u00be\5\30\r\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3"+
		"\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\27\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c7\5\32\16\2\u00c3\u00c4\t\5\2\2\u00c4\u00c6\5\32\16\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\31\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\64\2\2\u00cb\u00cc\5\26"+
		"\f\2\u00cc\u00cd\7\65\2\2\u00cd\u00d5\3\2\2\2\u00ce\u00d5\7\13\2\2\u00cf"+
		"\u00d5\7\7\2\2\u00d0\u00d5\7\3\2\2\u00d1\u00d5\7\4\2\2\u00d2\u00d5\7\r"+
		"\2\2\u00d3\u00d5\7;\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4"+
		"\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d3\3\2\2\2\u00d5\33\3\2\2\2\u00d6\u00d7\t\6\2\2\u00d7\35"+
		"\3\2\2\2\37!\'+/<@BIKQU[dkswy{\u0082\u0089\u0091\u0095\u0097\u0099\u00a2"+
		"\u00b4\u00bf\u00c7\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}