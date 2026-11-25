# StockScript · Plataforma Web de Aprendizaje y Compilador

Plataforma web interactiva para dar a conocer, aprender y ejecutar programas escritos en **StockScript**, un lenguaje de programación específico de dominio (DSL) orientado a la gestión y control de almacenes e inventarios.

Desarrollado para la asignatura **Lenguajes y Autómatas II** (Docente: M.S.C. Alma Lilia Núñez González).

---

## 1. Arquitectura del Sistema

La plataforma integra el intérprete original desarrollado en **Java + ANTLR4** con una interfaz web interactiva sin alterar la gramática ni la lógica del patrón Visitor original:

```
┌────────────────────────────────────────────────────────────────┐
│                  Frontend (HTML, CSS, JS)                      │
│  Módulo 1: Inicio · Módulo 2: Tutoriales · Módulo 3: Editor    │
└──────────────────────────────┬─────────────────────────────────┘
                               │ HTTP / JSON (/api/compile)
                               ▼
┌────────────────────────────────────────────────────────────────┐
│                Servidor Local Node.js (server.js)              │
│  Sirve la interfaz web y gestiona archivos/ejemplos (.stoc)    │
└──────────────────────────────┬─────────────────────────────────┘
                               │ stdin (código .stoc) / stdout (JSON)
                               ▼
┌────────────────────────────────────────────────────────────────┐
│             Backend Java (ANTLR4 + Patrón Visitor)             │
│  WebCompiler.java -> LanguageLexer -> LanguageParser ->        │
│  LanguageCustomVisitor.java (ejecución real y tabla símbolos)  │
└────────────────────────────────────────────────────────────────┘
```

---

## 2. Módulos de la Plataforma

1. **Módulo 1 · Inicio (Landing Page):** Identidad visual de StockScript, propósito del lenguaje, características principales, ejemplo rápido y navegación directa a tutoriales y editor.
2. **Módulo 2 · Tutorial Interactivo y Academia StockScript:** Explicación de tipos de datos (`lote`, `prom`, `palanca`, `etiqueta`, `mini`), operadores, condicionales (`ibox`, `eibox`/`iebox`, `ebox` con interruptor `[1]`/`[0]`), ciclos `auto` con separador `🐟` y niveles `[a]..[z]`, preguntas de comprobación rápida y botones **"Probar código"** que cargan los ejemplos directamente en el editor.
3. **Módulo 3 · Editor y Ejecución en Línea (`.stoc`):** Editor con numeración de líneas, botón **Compilar**, consola de salida, panel de errores (léxicos, sintácticos, semánticos y de ejecución con salto a la línea afectada), tabla de tokens, tabla de símbolos, botones para **Importar** (`.stoc` desde disco local), **Exportar** (`.stoc`), **Guardar/Abrir** y **Limpiar**.

---

## 3. Tecnologías Utilizadas

- **Lenguaje e Intérprete (Backend):** Java (JDK), ANTLR 4.9.2 (`Language.g4` + `LanguageCustomVisitor.java`).
- **Servidor HTTP / API Local:** Node.js (módulos nativos `http`, `fs`, `path`, `child_process`, sin dependencias externas de npm).
- **Frontend:** HTML5, CSS3 (diseño responsivo con media queries) y JavaScript vanilla.
- **Control de Versiones:** Git / GitHub.

---

## 4. Requisitos e Instalación Local

### Requisitos previos
- **Java JDK** instalado y disponible en el `PATH` (`java` y `javac`).
- **Node.js** instalado (`node` y `npm`).
- Dependencias de ANTLR 4.9.2 en el repositorio local de Maven (`~/.m2/repository`).

### Ejecución local

#### Opción A: Script automático (Windows)
Haz doble clic en **`Iniciar_StockScript.bat`**. Automáticamente compilará las clases Java, iniciará el servidor local y abrirá el navegador en `http://localhost:3000`.

#### Opción B: Desde la terminal
```bash
cd PáginaWeb
npm start
```
Esto ejecuta `node scripts/build-java.js` (que compila los archivos Java y genera `compiler-java/classpath.txt`) y levanta el servidor en **`http://localhost:3000`**.

---

## 5. Modificaciones Técnicas Realizadas para Integrar el Backend

Respetando la restricción de **no reemplazar ni modificar la lógica original del intérprete** (`Language.g4` y `LanguageCustomVisitor.java`), únicamente se añadieron los siguientes componentes técnicos de integración:

1. **`stockscript/src/main/java/com/stockscript/WebCompiler.java`:**
   - Adaptador que lee el código fuente desde `stdin`, invoca a `LanguageLexer`, `LanguageParser` y `LanguageCustomVisitor`, captura la salida estándar (`System.out`), recolecta errores léxicos/sintácticos/semánticos/de ejecución y devuelve un JSON estructurado (`ok`, `diagnostics`, `tokens`, `salida`, `simbolos`).
2. **`PáginaWeb/scripts/build-java.js`:**
   - Script de compilación que compila las fuentes Java originales junto con `WebCompiler.java` y escribe el archivo `compiler-java/classpath.txt` con las rutas locales del equipo.
3. **`PáginaWeb/server.js`:**
   - Expone los endpoints REST locales:
     - `POST /api/compile` — Envía el código `.stoc` al subproceso Java (`WebCompiler`) con un límite de seguridad de 15 segundos y retorna el JSON.
     - `GET /api/examples` — Sirve los ejemplos predefinidos en `PáginaWeb/examples/`.
     - `GET/POST/DELETE /api/files` — Gestiona archivos `.stoc` guardados localmente.

---

## 6. Casos de Prueba Incluidos

Dentro de `PáginaWeb/examples/` y la Academia Interactiva se incluyen casos válidos e inválidos para verificar todas las fases:

1. **Declaraciones y aritmética (`01-declaraciones.json`):** Tipos `lote`, `prom`, `etiqueta`, `mini`, operaciones con paréntesis e impresión con `etiquetadora`.
2. **Condicionales e interruptor `[0]` (`02-condicionales.json`):** Evaluación de `ibox`/`eibox`/`iebox`/`ebox` y omisión de bloques desactivados con `[0]`.
3. **Ciclos `auto` anidados (`03-ciclos.json`):** Niveles jerárquicos `[a]` y `[b]` con separador `🐟`.
4. **Error semántico de anidación (`04-error-anidacion.json`):** Detecta el uso inválido de `[b]` en la raíz (esperaba `[a]`).
5. **Error de ejecución (`05-error-division.json`):** Detecta división entre cero en tiempo de ejecución.
6. **Importación y exportación `.stoc`:** Carga de archivos locales desde el explorador y descarga conservando la extensión `.stoc`.
