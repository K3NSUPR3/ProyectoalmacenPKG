grammar Language;

OBJECT: 'ChupapiStorage';
ENT: 'lote';
FLOAT: 'prom';
STRING: 'etiqueta';
CHAR: 'mini';
BOOL: 'palanca';

// Valores booleanos 
FALSO: 'IZQ';
VERDADERO: 'DER';

// Instrucciones 
PRINT: 'etiquetadora';
IF: 'ibox';
ELSE: 'ebox';
ELSEIF: 'eibox';

// Ciclos 
FOR: 'auto';
WHILE: 'whe';
DO_WHILE: 'dowhe';

// Funciones especiales 
LENGTH: 'lenght';
SIZE: 'size';

//2. OPERADORES ARITMÉTICOS 
OP_SUM: '+';
OP_RES: '-';
OP_MUL: '*';
OP_DIV: '/';

//3. OPERADORES LÓGICOS 
AND: '&&';
OR: '||';
NOT: '!';

//4. CONCATENACIÓN 
CONCATENACION: '<+>';

//5. DELIMITADORES 
LL_CLOSEL: '{';
LL_CLOSER: '}';

PAR_CLOSEL: '(';
PAR_CLOSER: ')';

ALMACENADOR: '🐟';

//6. LITERALES Números decimales: 10.5, 3.14, etc.
FLOAT_LITERAL: [0-9]+ '.' [0-9]+;

// Números enteros: 10, 25, 100, etc. 
ENT_LITERAL: [0-9]+;

// Cadenas de texto entre comillas dobles 
STRING_LITERAL: '"' (~["\r\n])* '"';

// Un carácter entre comillas simples 
CHARACTER_LITERAL: '\'' ~['\r\n] '\'';

// Identificadores: nombres de variables 
ID: [a-zA-Z_][a-zA-Z_0-9]*;

//7. ESPACIOS Y COMENTARIOS Ignorar espacios, tabulaciones y saltos de línea
WS: [ \t\r\n\f]+ -> skip;
// Ignorar comentarios de una línea 
LINE_COMMENT: '//' ~[\r\n]* -> skip;
