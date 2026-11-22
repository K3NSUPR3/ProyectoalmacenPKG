// Generated from com\stockscript\Language.g4 by ANTLR 4.9.2
package com.stockscript;
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
	 * Visit a parse tree produced by {@link LanguageParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LanguageParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LanguageParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(LanguageParser.IncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(LanguageParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(LanguageParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#eibox_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEibox_part(LanguageParser.Eibox_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#ebox_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEbox_part(LanguageParser.Ebox_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(LanguageParser.CicloContext ctx);
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
	 * Visit a parse tree produced by {@link LanguageParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(LanguageParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(LanguageParser.FactorContext ctx);
}