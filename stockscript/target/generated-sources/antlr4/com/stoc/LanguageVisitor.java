// Generated from com\stoc\Language.g4 by ANTLR 4.9.2
package com.stoc;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LanguageParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LanguageParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(LanguageParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(LanguageParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LanguageParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(LanguageParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#condicion_activada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion_activada(LanguageParser.Condicion_activadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#condicion_desactivada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion_desactivada(LanguageParser.Condicion_desactivadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#estructura_de_condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura_de_condicion(LanguageParser.Estructura_de_condicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(LanguageParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(LanguageParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(LanguageParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(LanguageParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(LanguageParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LanguageParser.TipoContext ctx);
}