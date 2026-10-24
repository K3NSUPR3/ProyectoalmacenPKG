grammar Language;

programa: instruccion+ EOF;

instruccion:
	declaracion OP_CIERRE?
	| asignacion OP_CIERRE?
	| impresion OP_CIERRE?
	| comparacion OP_CIERRE?
	| expresion OP_CIERRE?;

declaracion: tipo ID (ASIG (comparacion | expresion))?;

asignacion:
	ID ASIG (comparacion | expresion)
	| ID INCREMENTO
	| ID DECREMENTO;

impresion: PRINT PAR_IZQ (comparacion | expresion) PAR_DER;

comparacion:
	expresion (
		OP_MAYORQ
		| OP_MENORQ
		| ASIG_IGUALACION
		| MAYOR_IGUALACION
		| MENOR_IGUALACION
	) expresion;

expresion: termino ((OP_SUM | OP_RES) termino)*;

termino: factor | factor ((OP_MUL | OP_DIV) factor)*;

factor:
	PAR_IZQ expresion PAR_DER
	| INT_LITERAL
	| FLOAT_LITERAL
	| BOOLEAN_LITERAL
	| STRING_LITERAL
	| CHAR_LITERAL
	| ID;

tipo: ENT | FLOAT | BOOL | STRING | CHAR;

AUTO: 'auto';

ENT: 'lote';
FLOAT: 'prom';
BOOL: 'palanca';
STRING: 'etiqueta';
CHAR: 'mini';

PRINT: 'etiquetadora';

RESERVA_IBOX: 'ibox';
RESERVA_EIBOX: 'eibox';
RESERVA_EBOX: 'ebox';

BOOLEAN_LITERAL: 't1' | 'f0';

VERDADERO: '[1]';
FALSO: '[0]';

ASIG: '=';
ASIG_IGUALACION: '==';

OP_SUM: '+';
OP_RES: '-';
OP_MUL: '*';
OP_DIV: '/';

OP_MAYORQ: '>';
OP_MENORQ: '<';

MAYOR_IGUALACION: '>=';
MENOR_IGUALACION: '<=';

AND: '&&';
OR: '||';
NOT: '!';

INCREMENTO: '++';
DECREMENTO: '--';

CONCATENACION: '<+>';

//DELIMITADORES

PAR_IZQ: '(';
PAR_DER: ')';

LL_CLOSEL: '{';
LL_CLOSER: '}';

CO_CLOSEL: '[';
CO_CLOSER: ']';

OP_CIERRE: ':';
OP_PUNTOCOMA: ';';

//LITERALES

FLOAT_LITERAL: [0-9]+ '.' [0-9]+;

INT_LITERAL: [0-9]+;

STRING_LITERAL: '"' (~["\r\n])* '"';

CHAR_LITERAL: '\'' . '\'';

ID: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [ \t\r\n\f]+ -> skip;

LINE_COMMENT: '//' ~[\r\n]* -> skip;