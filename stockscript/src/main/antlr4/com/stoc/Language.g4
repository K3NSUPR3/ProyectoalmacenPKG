grammar Language;

programa: instruccion+ EOF;

instruccion:
	declaracion OP_CIERRE?
	| asignacion OP_CIERRE?
	| impresion OP_CIERRE?
	| condicion_activada OP_CIERRE
	| condicion_desactivada OP_CIERRE
	| ciclo OP_CIERRE
	| comparacion OP_CIERRE?
	| expresion OP_CIERRE?;

declaracion: tipo ID (ASIG (comparacion | expresion))?;

asignacion:
	ID ASIG (comparacion | expresion)
	| ID (INCREMENTO | DECREMENTO);

impresion:
	PRINT PAR_CLOSEL (comparacion | expresion) PAR_CLOSER;

condicion_activada:
	VERDADERO RESERVA_IBOX (estructura_de_condicion)* //IF ELSE IF & ELSE
	| RESERVA_EIBOX (estructura_de_condicion)* (
		RESERVA_EBOX (LL_CLOSEL instruccion* LL_CLOSER)? //OPCIONAL ELSE
	)?;

condicion_desactivada:
	FALSO RESERVA_IBOX (estructura_de_condicion)*
	| RESERVA_EIBOX (estructura_de_condicion)* (
		RESERVA_EBOX (LL_CLOSEL instruccion* LL_CLOSER)?
	)?;

estructura_de_condicion:
	PAR_CLOSEL comparacion PAR_CLOSER LL_CLOSEL instruccion* LL_CLOSER;

ciclo:
	AUTO (
		CO_CLOSEL condicion_activada CO_CLOSER ALMACENADOR CO_CLOSEL INCREMENTO
		| DECREMENTO CO_CLOSER CO_CLOSEL INICIALIZADOR_AUTO CO_CLOSER
	);

comparacion:
	expresion (
		OP_MAYORQ
		| OP_MENORQ
		| ASIG_IGUALACION
		| MAYOR_IGUALACION
		| MENOR_IGUALACION
		| BOOLEAN
	) expresion;

expresion: termino ((OP_SUM | OP_RES) termino)*;

termino: factor ((OP_MUL | OP_DIV) factor)*;

factor:
	PAR_CLOSEL expresion PAR_CLOSER
	| ENT
	| PROM
	| BOOLEAN
	| STRING_LITERAL
	| CHAR
	| ID;

tipo:
	ENT_LITERAL
	| FLOAT_LITERAL
	| BOOLEAN_LITERAL
	| STRING_LITERAL
	| CHARACTER_LITERAL;

BOOLEAN: 'true' | 'false';
STRING_LITERAL: '"' (~["\r\n])* '"';
MINI: '\'' . '\'';
ID_CON_ASIGNACION: ID ASIG (LOTE | PROM | BOOLEAN | MINI);

//definicion 
PROM: [0-9]+ '.' [0-9]+;
LOTE: [0-9]+;
AUTO: 'auto';

//Valores Minimos
OBJECT: 'ChupapiStorage';
ENT: 'lote';
STRING: 'etiqueta';
CHAR: 'mini';
BOOL: 'palanca';
FLOAT: 'prom';

// Valores booleanos 
FALSO: '[0]';
VERDADERO: '[1]';

BOOL_DER: 'der';
BOOL_IZQ: 'izq';

// Instrucciones 
PRINT: 'etiquetadora';

//Asociacion de vars borrar arriba partes solo referencia
RESERVA_IBOX: 'ibox';
RESERVA_EBOX: 'ebox';
RESERVA_EIBOX: 'eibox';

// Ciclos 
FOR: 'auto';
WHILE: 'whe';
DO: 'do';

// Funciones especiales 
LENGTH: 'lenght';
SIZE: 'size';

//2. OPERADORES ARITMÉTICOS 
OP_SUM: '+';
OP_RES: '-';
OP_MUL: '*';
OP_DIV: '/';
OP_CIERRE: ':';
OP_PUNTOCOMA: ';';
OP_MAYORQ: '>';
OP_MENORQ: '<';

// 3. OPERADORES DE COMPARACIÓN Logicos
ASIG: '=';
ASIG_IGUALACION: '==';
MAYOR_IGUALACION: '>=';
MENOR_IGUALACION: '<=';

//6. OPERADORES LÓGICOS 
AND: '&&';
OR: '||';
NOT: '!';

//4. CONCATENACIÓN 
CONCATENACION: '<+>';

//5. DELIMITADORES 
LL_CLOSEL: '{';
LL_CLOSER: '}';
CO_CLOSEL: '[';
CO_CLOSER: ']';

INICIALIZADOR_AUTO: 'a';

//incremento y decremento
INCREMENTO: '++';
DECREMENTO: '--';

PAR_CLOSEL: '(';
PAR_CLOSER: ')';

ALMACENADOR: '🐟';

//6. LITERALES Números decimales: 10.5, 3.14, etc.
FLOAT_LITERAL: [0-9]+ '.' [0-9]+;

// Números enteros: 10, 25, 100, etc. 
ENT_LITERAL: [0-9]+;

BOOLEAN_LITERAL: 't1' | 'f0';

// Un carácter entre comillas simples 
CHARACTER_LITERAL: '\'' ~['\r\n] '\'';

// Identificadores: nombres de variables 
ID: [a-zA-Z_][a-zA-Z_0-9]*;

//7. ESPACIOS Y COMENTARIOS Ignorar espacios, tabulaciones y saltos de línea
WS: [ \t\r\n\f]+ -> skip;
// Ignorar comentarios de una línea 
LINE_COMMENT: '//' ~[\r\n]* -> skip;
