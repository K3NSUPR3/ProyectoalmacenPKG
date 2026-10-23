// Generated from c:/Users/sonic/Downloads/TEC/Semestre 8/Lenguajes y autómatas 2/ProyectoalmacenPKG/stockscript/src/main/antlr4/com/stoc/Language.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LanguageParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LanguageParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(LanguageParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(LanguageParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(LanguageParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(LanguageParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(LanguageParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(LanguageParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(LanguageParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(LanguageParser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#condicion_activada}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_activada(LanguageParser.Condicion_activadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#condicion_activada}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_activada(LanguageParser.Condicion_activadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#condicion_desactivada}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_desactivada(LanguageParser.Condicion_desactivadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#condicion_desactivada}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_desactivada(LanguageParser.Condicion_desactivadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#estructura_de_condicion}.
	 * @param ctx the parse tree
	 */
	void enterEstructura_de_condicion(LanguageParser.Estructura_de_condicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#estructura_de_condicion}.
	 * @param ctx the parse tree
	 */
	void exitEstructura_de_condicion(LanguageParser.Estructura_de_condicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(LanguageParser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(LanguageParser.CicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(LanguageParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(LanguageParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(LanguageParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(LanguageParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(LanguageParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(LanguageParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(LanguageParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(LanguageParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LanguageParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LanguageParser.TipoContext ctx);
}