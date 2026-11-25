===============================================================================
README: StockScript - Lenguaje de Control de Almacen e Inventarios
===============================================================================

1. Descripción General
-------------------------------------------------------------------------------
StockScript es un lenguaje de programación diseñado específicamente para la
automatización y control de tareas en un entorno de almacén o planta de
producción. Su sintaxis es intuitiva y orientada a procesos industriales,
utilizando terminología familiar como "lotes", "palancas" (para interruptores),
"etiquetas" y la icónica "etiquetadora" para la salida de datos.

El lenguaje se ejecuta mediante un analizador generado por ANTLR 4 y un
Visitor personalizado (`LanguageCustomVisitor.java`) que controla tanto el
flujo de ejecución como la semántica de los interruptores y la anidación.

2. Características Clave
-------------------------------------------------------------------------------
- Tipado Estático: Se deben declarar los tipos de datos antes de usarlos.
- Control de Flujo Industrial: Estructuras `ibox`, `eibox`, `iebox`, `ebox`.
- Ciclos Autonómicos: Estructura `auto` con control de anidación por niveles
  jerárquicos (a, b, c...).
- Salida Integrada: La instrucción `etiquetadora(valor)` imprime en consola.
- Depuración Visual: El sistema imprime el estado de memoria y las operaciones
  paso a paso en la consola.

3. Tipos de Datos
-------------------------------------------------------------------------------
- `lote`: Para números enteros (ej. cantidad de productos).
- `prom`: Para números decimales (ej. peso, precio).
- `palanca`: Para valores booleanos (true/false).
- `etiqueta`: Para cadenas de texto entre comillas dobles (ej. "Stock Crítico").
- `mini`: Para caracteres individuales entre comillas simples (ej. 'A').

4. Sintaxis y Estructuras
-------------------------------------------------------------------------------
4.1 Terminador de Sentencia
Todas las sentencias deben terminar con dos puntos `:`.

4.2 Declaración
Sintaxis: `[tipo] [identificador] = [valor]:`
Ejemplo: `lote stockMinimo = 50:`

4.3 Asignación
Sintaxis: `[identificador] = [valor]:`
Ejemplo: `stockMinimo = 100:`

4.4 Incremento
Sintaxis: `[identificador]++:`
Ejemplo: `stockMinimo++:`

4.5 Impresión / Salida
Sintaxis: `etiquetadora([expresion]):`
Ejemplo: `etiquetadora(stockMinimo):`

5. Estructuras de Control
-------------------------------------------------------------------------------
5.1 Condicionales (ibox, eibox, ebox)
El sistema de condicionales utiliza la estructura `ibox` (if), `eibox`
(else if), y `ebox` (else).
Lo más distintivo de StockScript es el **interruptor de control** entre
corchetes justo después de la condición.

- `[1]`: Activa el bloque y evalúa la condición. Si es verdadera, ejecuta.
- `[0]`: Desactiva el bloque, tratándolo como un comentario. Se omite
  completamente la evaluación y ejecución.

Ejemplo:
```text
lote stock = 50:
ibox [a](stock > 60)[1]{
    etiquetadora("Stock optimo")
} eibox [a](stock > 40)[1]{
    etiquetadora("Stock por debajo de 60 pero sobre 40")
} ebox [a][1]{
    etiquetadora("Stock por debajo de 40")
}