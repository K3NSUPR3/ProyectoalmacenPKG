package com.stockscript;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

public class LanguageCustomVisitor extends LanguageBaseVisitor<Object> {


    // Tabla de simbolos en memoria
    private final Map<String, Simbolo> memory = new HashMap<>();

    // Contador de anidacion exclusivo para ciclos 'auto': 0 -> 'a', 1 -> 'b', ...,
    // 25 -> 'z'
    private int profundidad = 0;

    // Función para retornar el tipo de dato correcto.
    private Simbolo.TipoDato obtenerTipo(String tipo) {
        switch (tipo) {
            case "lote": return Simbolo.TipoDato.INT;
            case "prom": return Simbolo.TipoDato.FLOAT;
            case "palanca": return Simbolo.TipoDato.BOOLEAN;
            case "etiqueta": return Simbolo.TipoDato.STRING;
            case "mini": return Simbolo.TipoDato.CHAR;
            default: throw new IllegalArgumentException("Tipo de dato desconocido: " + tipo);
        }
    }

    // Recupera una variable solo si fue declarada y tiene un valor asignado.
    private Object validarExistencia(String id, ParserRuleContext ctx) {
        Simbolo simbolo = memory.get(id);
        if (simbolo == null || simbolo.valor == null) {
            String motivo = simbolo == null ? "no declarada" : "sin valor asignado";
            throw new IllegalStateException(
                "ERROR SEMANTICO [Linea " + ctx.getStart().getLine() +
                "]: Variable '" + id + "' " + motivo + "."
            );
        }
        return simbolo.valor;
    }

    // Función para asegurarse de que Símbolo no está vacío y retornar su valor para el incremento.
    private Object valorDe(String id) {
        Simbolo simbolo = memory.get(id);
        return simbolo == null ? null : simbolo.valor;
    }

    // Guardar o actualizar el valor y tipo de una variable.
    private void guardar(String id, Object valor) {
        Simbolo simbolo = memory.get(id);

        if (simbolo == null) {
            memory.put(id, new Simbolo(inferirTipo(valor), valor));
        } else {
            simbolo.valor = valor;
            simbolo.tipo = inferirTipo(valor);
        }
    }

    //Si el valor del símbolo (objeto con los 2 valores, tipo y el valor) Entonces tiene que inferir el tipo según el valor 
    // (si es una instancia de...), para así retornar el tipo de dato correspondiente.
    private Simbolo.TipoDato inferirTipo(Object valor) {
        if (valor instanceof Double || valor instanceof Float) return Simbolo.TipoDato.FLOAT;
        if (valor instanceof Boolean) return Simbolo.TipoDato.BOOLEAN;
        if (valor instanceof Character) return Simbolo.TipoDato.CHAR;
        if (valor instanceof String) return Simbolo.TipoDato.STRING;
        return Simbolo.TipoDato.INT;
    }

    // Indentación para mensajes de error dentro de bloques anidados
    private String indent() {
        StringBuilder espacios = new StringBuilder();
        for (int i = 0; i < profundidad; i++) {
            espacios.append("  ");
        }
        return espacios.toString();
    }

    // ===Función de validacion de identificador anidacion para ciclos 'auto' y condiciones
    private boolean validarAnidacion(
        String idNivel,
        int profundidad,
        ParserRuleContext ctx // 
) {
    // 1.- Primer validación, retorna un error de límite de identificador de anidación
    if (profundidad > 25) {
        throw new IllegalStateException(
            "ERROR SEMANTICO [Linea " + ctx.getStart().getLine() +
            "]: Limite de anidacion superado. Maximo permitido: [z]."
        );
    }
    // 2.- Segunda Validación, retorna un error al no concordar con el caracter según la profundidad del bloque de control.
    char esperado = (char) ('a' + profundidad);

    if (!idNivel.equals(String.valueOf(esperado))) {
        throw new IllegalArgumentException(
            "ERROR SEMANTICO [Linea " + ctx.getStart().getLine() +
            "]: Identificador de anidacion invalido '[" + idNivel +
            "]'. Se esperaba '[" + esperado + "]'."
        );

    }

    return true;
}



    // Símbolo inicial, principio y fin del código 
    @Override
    public Object visitPrograma(LanguageParser.ProgramaContext ctx) {
        
        for (LanguageParser.InstruccionContext inst : ctx.instruccion()) {
            visit(inst);
        }
        //Ventana de memoria.
       // MemoryScreen.Ventana(memory);
        return null;
    }

    // Declaración de variables, Para cuándo puede tenerse sólamente el tipo de dato y dejar un valor por defecto.
    @Override
    public Object visitDeclaracion(LanguageParser.DeclaracionContext ctx) {
        String tipo = ctx.tipo().getText();
        String id = ctx.ID().getText();
        Simbolo.TipoDato tipoDato = obtenerTipo(tipo); // Llama a la función obtener tipo.
        Object value;

        
        if (ctx.expresion() != null) {
            value = visit(ctx.expresion()); // Si la declaración es una expresión la busca para saber el tipo 
        } else {
            throw new IllegalStateException(
                "ERROR SEMANTICO [Linea " + ctx.getStart().getLine() +
                "]: Variable '" + id + "' declarada sin valor inicial."
            );
        }
        // Guradado en tabla de símbolos
        memory.put(id, new Simbolo(tipoDato, value));
        return value;
    }

    // Asignación de variables, para cuándo se asigna un valor.
    @Override
    public Object visitAsignacion(LanguageParser.AsignacionContext ctx) {
        String id = ctx.ID().getText();
        Object value = visit(ctx.expresion());
        guardar(id, value);
        return value;
    }

    // Incrementar valores de variables con el operador de incremento.
    @Override
    public Object visitIncremento(LanguageParser.IncrementoContext ctx) {
        String id = ctx.ID().getText();
        Object updated = incrementar(id, ctx);

        return updated;
    }

    // Función para incrementar valores
    private Object incrementar(String id, ParserRuleContext ctx) {
    Object current = validarExistencia(id, ctx);

    Object updated = current;

    if (current instanceof Integer) {
        updated = ((Integer) current) + 1;
    } else if (current instanceof Double) {
        updated = ((Double) current) + 1.0;
    }

    guardar(id, updated);
    return updated;
    }

    // Impresión de un valor con la etiquetadora.
    @Override
    public Object visitImpresion(LanguageParser.ImpresionContext ctx) {
        Object val = visit(ctx.expresion());
        System.out.println(indent() + "[Etiquetadora]: " + val);
        return val;
    }

    // Condiciones.
    @Override
    public Object visitCondicion(LanguageParser.CondicionContext ctx) {
        if (!validarAnidacion(ctx.idNivel.getText(), profundidad, ctx)) { // Validar el identificador de anidación con su función.
            return null;
        }

        boolean executed = false;
        if (interruptorActivo(ctx.interruptor.getText(), ctx, "ibox")) { //Verifica que el interruptor esté activo para ejecutar bloque.
            boolean cumple = evaluar(ctx.cond); //También tiene que evaluar si la condición es verdadera para ejecutarse
            if (cumple) {
                ejecutarBloque(ctx.instruccion());
                executed = true;
            }
        }

        // Las ramas eibox/iebox se prueban en orden, como un if/else-if normal.
        if (!executed) {
            for (LanguageParser.Eibox_partContext eb : ctx.eibox_part()) {
                //Se evalúan banderas de activación e identificadores de anidación
                if (!validarAnidacion(eb.idNivel.getText(), profundidad, eb)) {
                    continue;
                }
                if (!interruptorActivo(eb.interruptor.getText(), eb, "eibox/iebox")) {
                    continue;
                }

                boolean cumple = evaluar(eb.cond); // Si cumple la condición se ejecuta la instrucción que está dentro del bloque.
                if (cumple) {
                    ejecutarBloque(eb.instruccion());
                    executed = true;
                    break;
                }
            }
        }

        // ebox es la rama por defecto y solo se ejecuta si ninguna condición ganó.
        if (!executed && ctx.ebox_part() != null) {
            LanguageParser.Ebox_partContext eb = ctx.ebox_part();
            if (eb.idNivel != null && !validarAnidacion(eb.idNivel.getText(), profundidad, eb)) {
                return null;
            }
            if (eb.interruptor == null || interruptorActivo(eb.interruptor.getText(), eb, "ebox")) {
                ejecutarBloque(eb.instruccion());
            }
        }
        return null;
    }
    
    // Función para evaluar una comparación entre dos operandos y los envía a comparar()
    private boolean evaluar(LanguageParser.ComparacionContext ctx) {
        Object left = visit(ctx.expresion(0));
        if (ctx.op == null) {
            return isTruthy(left);
        }
        Object right = visit(ctx.expresion(1));
        return comparar(left, right, ctx.op.getText());
    }

    // La comparación usa evaluar para saber si es verdadera o falsa.
    @Override
    public Object visitComparacion(LanguageParser.ComparacionContext ctx) {
        return evaluar(ctx);
    }
    
    // Función para comparar dos objetos según el operador dado
    private boolean comparar(Object left, Object right, String op) {
        if (left instanceof Number && right instanceof Number) {
            //Convertir valores en double, para compararlos en caso de que no sean compatibles (entero o flotante).
            double l = ((Number) left).doubleValue();
            double r = ((Number) right).doubleValue();
            switch (op) {
                case ">": return l > r;
                case "<": return l < r;
                case ">=": return l >= r;
                case "<=": return l <= r;
                case "==": return l == r;
                case "!=": return l != r;
                default: return false;
            }
        }
        if ("==".equals(op)) return left != null && left.equals(right);
        if ("!=".equals(op)) return left == null ? right != null : !left.equals(right);
        return false;
    }


    // Función para evaluar la bandera de activación y saber si el bloque de control está activo o inactivo.
    private boolean interruptorActivo(String texto, ParserRuleContext ctx, String bloque) {
        int interruptor = Integer.parseInt(texto);
        if (interruptor == 1) return true;
        if (interruptor == 0) {
            return false;
        }
        throw new IllegalArgumentException(
            "ERROR SEMANTICO [Linea " + ctx.getStart().getLine()
            + "]: Interruptor invalido '[" + interruptor + "]' en " + bloque + ". Solo se permite [1] o [0]."
        );
    }

    // 
    private void ejecutarBloque(List<LanguageParser.InstruccionContext> instrucciones) {
        profundidad++;
        try {
            for (LanguageParser.InstruccionContext instruccion : instrucciones) {
                visit(instruccion);
            }
        } finally {
            profundidad--;
        }
    }
    
    // Ciclo
    @Override
    public Object visitCiclo(LanguageParser.CicloContext ctx) {
        // 1. Validar identificador de anidacion
                String idNivel = ctx.idNivel.getText();

                if (!validarAnidacion(idNivel, profundidad, ctx)) {
                    return null;
                }

        // 2. Verificacion del interruptor [1] activo o [0] comentario
        if (!interruptorActivo(ctx.interruptor.getText(), ctx, "auto")) {
            return null;
        }

        // La inicializacion admite tanto i++ como i=0.
        if (ctx.parte1Inicial != null) {
            String variable = ctx.parte1.getText();
            Object valorInicial = visit(ctx.parte1Inicial);
            guardar(variable, valorInicial);
        } else if (ctx.parte1 != null && !ctx.parte1.getText().contains("++")) {
            visit(ctx.parte1);
        }

        // Si parte1 es incremento (ej. i++), guardar su valor inicial para restaurarlo
        // al terminar el ciclo anidado
        String loopVar = null;
        Object initialVal = null;
        if (ctx.parte1Inicial == null && ctx.parte1 != null && ctx.parte1.getText().contains("++")) {
            loopVar = ctx.parte1.getText().replace("++", "").trim();
            if (memory.containsKey(loopVar)) {
                initialVal = valorDe(loopVar);
            } else {
                initialVal = validarExistencia(loopVar, ctx);
            }
        }

        // Aumentar profundidad para que cualquier ciclo 'auto' interno use la siguiente
        // letra ('b', 'c', ..., 'z')
        profundidad++;
        
        try{
        // Ciclo principal,
        int maxLoop = 10000;
        int iter = 1;

        while (iter <= maxLoop) {
            boolean cond = true;
            if (ctx.parte2 != null) {
                Object cVal = visit(ctx.parte2);
                cond = isTruthy(cVal);
            }

            if (!cond) {
                break;
            }

            // Ejecucion de las instrucciones dentro del ciclo
            for (LanguageParser.InstruccionContext inst : ctx.instruccion()) {
                visit(inst);
            }

            // Paso de actualizacion al cierre de la iteracion
            if (ctx.parte3 != null) {
                visit(ctx.parte3);
            } else if (ctx.parte1 != null && ctx.parte1.getText().contains("++")) {
                visit(ctx.parte1);
            }

            iter++;
        }
        }finally{

        // Restaurar variable para permitir ejecuciones limpias en ciclos padres
        /* if (loopVar != null && initialVal != null) {
            guardar(loopVar, initialVal);
        } */

        profundidad--;
        
        }
        return null;
    }

    // Expresiones (para evaluar sumas y restas)
    @Override
    public Object visitExpresion(LanguageParser.ExpresionContext ctx) {
        Object result = visit(ctx.termino(0));
        for (int i = 1; i < ctx.termino().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            Object next = visit(ctx.termino(i));

            if ("+".equals(op)) {
                if (result instanceof String || next instanceof String) {
                    result = String.valueOf(result) + String.valueOf(next);
                } else if (result instanceof Double || next instanceof Double) {
                    result = ((Number) result).doubleValue() + ((Number) next).doubleValue();
                } else if (result instanceof Number && next instanceof Number) {
                    result = ((Number) result).intValue() + ((Number) next).intValue();
                }
            } else if ("-".equals(op)) {
                if (result instanceof Double || next instanceof Double) {
                    result = ((Number) result).doubleValue() - ((Number) next).doubleValue();
                } else if (result instanceof Number && next instanceof Number) {
                    result = ((Number) result).intValue() - ((Number) next).intValue();
                }
            }
        }
        return result;
    }

    // Término (para evaluar multiplicaciones y divisiones)
    @Override
    public Object visitTermino(LanguageParser.TerminoContext ctx) {
        Object result = visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            Object next = visit(ctx.factor(i));

            if ("*".equals(op)) {
                if (result instanceof Double || next instanceof Double) {
                    result = ((Number) result).doubleValue() * ((Number) next).doubleValue();
                } else if (result instanceof Number && next instanceof Number) {
                    result = ((Number) result).intValue() * ((Number) next).intValue();
                }
            } else if ("/".equals(op)) {
            if (result instanceof Number && next instanceof Number) {

                double divisor = ((Number) next).doubleValue();
                if (divisor == 0.0) {
                    throw new ArithmeticException(
                        "ERROR DE EJECUCION [Linea " +
                        ctx.getStart().getLine() +
                        "]: No se permite dividir entre cero."
                    );
                }
                if (result instanceof Double || next instanceof Double) {
                    result = ((Number) result).doubleValue() / divisor;
                } else {
                    result = ((Number) result).intValue() / ((Number) next).intValue();
                }
            }
        }
        }
        return result;
    }


    // Factor 
    @Override
    public Object visitFactor(LanguageParser.FactorContext ctx) {
        // 1. Incremento en expresion (ej. i++)
        if (ctx.ID() != null && ctx.OP_INCREMENTO() != null) {
            String id = ctx.ID().getText();
            Object updated = incrementar(id, ctx);

            return updated;
        }

        // 2. Comparaciones: ID OP expresion
        if (ctx.ID() != null && ctx.expresion() != null && ctx.getChildCount() >= 3) {
            String id = ctx.ID().getText();
            Object left = validarExistencia(id, ctx);
            Object right = visit(ctx.expresion());
            String op = ctx.getChild(1).getText();
            return comparar(left, right, op);
        }

        // 3. Expresion entre parentesis
        if (ctx.PAR_IZQ() != null && ctx.expresion() != null) {
            return visit(ctx.expresion());
        }

        // 4. Identificadores y literales booleanos
        if (ctx.ID() != null) {
            String text = ctx.ID().getText();

            return validarExistencia(text, ctx);
        }

        // 5. Literales constantes
        if (ctx.INT_LITERAL() != null) {
            return Integer.parseInt(ctx.INT_LITERAL().getText());
        }

        if (ctx.FLOAT_LITERAL() != null) {
            return Double.parseDouble(ctx.FLOAT_LITERAL().getText());
        }

        if (ctx.STRING_LITERAL() != null) {
            String s = ctx.STRING_LITERAL().getText();
            return s.substring(1, s.length() - 1);
        }

        if (ctx.CHAR_LITERAL() != null) {
            return ctx.CHAR_LITERAL().getText().charAt(1);
        }

        if (ctx.BOOL_LITERAL() != null) {
            String literal = ctx.BOOL_LITERAL().getText();
            return "right".equals(literal) || "true".equals(literal);
        }

        return null;
    }
    
    // Función para evaluar la "verdad" de un objeto, útil para condiciones y ciclos
    private boolean isTruthy(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        } else if (obj instanceof Number) {
            return ((Number) obj).doubleValue() != 0;
        } else if (obj instanceof String) {
            return !((String) obj).isEmpty();
        }
        return obj != null;
    }

    public Map<String, Simbolo> getMemoria() {
        return memory;
    }
}

