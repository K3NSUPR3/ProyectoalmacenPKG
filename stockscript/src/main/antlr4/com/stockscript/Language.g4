grammar Language;

// ========================================== REGLAS SINTÁCTICAS (PARSER)
// ==========================================

programa: instruccion+ EOF;

instruccion:
	declaracion
	| asignacion
	| incremento
	| impresion
	| condicion
	| ciclo;

declaracion:
	tipo ID OP_ASIG expresion OP_CIERRE
	| tipo ID OP_CIERRE;

tipo: ENT | FLOAT | BOOL | STRING | CHAR;

asignacion: ID OP_ASIG expresion OP_CIERRE;

incremento: ID OP_INCREMENTO;

impresion:
	PRINT PAR_IZQ expresion PAR_DER OP_CIERRE;

// Condicional: ibox [a](condicion) [1]{ ... } (eibox/iebox [a](condicion) [1]{ ... })* (ebox { ... })?
condicion:
	IF CO_IZQ idNivel=ID CO_DER PAR_IZQ cond=comparacion PAR_DER CO_IZQ interruptor=INT_LITERAL CO_DER LL_IZQ instruccion* LL_DER
	(eibox_part)*
	(ebox_part)?;

eibox_part:
	ELSEIF CO_IZQ idNivel=ID CO_DER PAR_IZQ cond=comparacion PAR_DER CO_IZQ interruptor=INT_LITERAL CO_DER LL_IZQ instruccion* LL_DER;

ebox_part:
	ELSE (CO_IZQ idNivel=ID CO_DER)? (CO_IZQ interruptor=INT_LITERAL CO_DER)? LL_IZQ instruccion* LL_DER;

// Ciclo: auto [a] [i++ 🐟 i <= 2 🐟 ] [1]{ ... }
ciclo:
	FOR CO_IZQ idNivel=ID CO_DER CO_IZQ (parte1=expresion (OP_ASIG parte1Inicial=expresion)?)? ALMACENADOR (
		parte2=comparacion
	)? ALMACENADOR (parte3=incremento)? CO_DER CO_IZQ interruptor=INT_LITERAL CO_DER LL_IZQ instruccion* LL_DER;

expresion: termino ((OP_SUMA | OP_RESTA) termino)*;

termino: factor ((OP_MULT | OP_DIV) factor)*;

comparacion:
	expresion (op=(OP_MAYOR | OP_MENOR | OP_MAYORIGUAL | OP_MENORIGUAL | OP_IGUAL | OP_DIFERENTE) expresion)?;

factor:
	ID
	| INT_LITERAL
	| FLOAT_LITERAL
	| STRING_LITERAL
	| CHAR_LITERAL
	| BOOL_LITERAL
	| PAR_IZQ expresion PAR_DER
	| ID OP_INCREMENTO
	| ID (
		OP_MAYOR
		| OP_MENOR
		| OP_MAYORIGUAL
		| OP_MENORIGUAL
		| OP_IGUAL
		| OP_DIFERENTE
	) expresion;

// ========================================== REGLAS LÉXICAS (LEXER)
// ==========================================


// Tokens de delimitadores
CO_IZQ: '[';
CO_DER: ']';
PAR_IZQ: '(';
PAR_DER: ')';
LL_IZQ: '{';
LL_DER: '}';
OP_CIERRE: ':';

// Operadores
OP_ASIG: '=';
OP_INCREMENTO: '++';
OP_SUMA: '+';
OP_RESTA: '-';
OP_MULT: '*';
OP_DIV: '/';

OP_MAYOR: '>';
OP_MENOR: '<';
OP_MAYORIGUAL: '>=';
OP_MENORIGUAL: '<=';
OP_IGUAL: '==';
OP_DIFERENTE: '!=';

// Separador temático
ALMACENADOR: '🐟';

// ========================================== Palabras reservadas 
// Tipos de datos
ENT: 'lote';
FLOAT: 'prom';
STRING: 'etiqueta'; 
CHAR: 'mini';
BOOL: 'palanca';

// Estructuras de control
IF:'ibox';
ELSE:'ebox';
ELSEIF: ('eibox' | 'iebox');
FOR:'auto';

//Impresion
PRINT: 'etiquetadora';

// Literales y Tokens
INT_LITERAL: [0-9]+;
FLOAT_LITERAL: [0-9]+ '.' [0-9]+;
STRING_LITERAL: '"' .*? '"';
CHAR_LITERAL: '\'' . '\'';
BOOL_LITERAL: 'right'| 'left' | 'true' | 'false';

ID: [a-zA-Z_][a-zA-Z0-9_]*;


// Ignorar espacios en blanco y comentarios
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
