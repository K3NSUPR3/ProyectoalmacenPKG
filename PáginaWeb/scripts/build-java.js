const fs = require('fs');
const path = require('path');
const { spawnSync } = require('child_process');

const webRoot = path.resolve(__dirname, '..');
const repoRoot = path.resolve(webRoot, '..');
const stockDir = path.join(repoRoot, 'stockscript');
const grammar = path.join(stockDir, 'src', 'main', 'antlr4', 'com', 'stockscript', 'Language.g4');
const generatedRoot = path.join(stockDir, 'target', 'generated-sources', 'antlr4');
const generatedDir = path.join(generatedRoot, 'com', 'stockscript');
const classesDir = path.join(webRoot, 'compiler-java', 'classes');
const classpathFile = path.join(webRoot, 'compiler-java', 'classpath.txt');
const m2 = path.join(process.env.USERPROFILE || process.env.HOME || '', '.m2', 'repository');

const jarPaths = [
  'org/antlr/antlr4-runtime/4.9.2/antlr4-runtime-4.9.2.jar',
  'org/antlr/antlr4/4.9.2/antlr4-4.9.2.jar',
  'org/antlr/antlr-runtime/3.5.2/antlr-runtime-3.5.2.jar',
  'org/antlr/ST4/4.3/ST4-4.3.jar',
  'org/glassfish/javax.json/1.0.4/javax.json-1.0.4.jar',
  'com/ibm/icu/icu4j/61.1/icu4j-61.1.jar',
  'org/abego/treelayout/org.abego.treelayout.core/1.0.3/org.abego.treelayout.core-1.0.3.jar'
].map((relative) => path.join(m2, relative));

function run(command, args) {
  const result = spawnSync(command, args, { encoding: 'utf8', windowsHide: true });
  if (result.error) throw new Error(`No se pudo ejecutar ${command}: ${result.error.message}`);
  if (result.status !== 0) throw new Error(`${command} terminó con código ${result.status}:\n${result.stdout || ''}\n${result.stderr || ''}`);
}

function listJava(dir) {
  if (!fs.existsSync(dir)) return [];
  const files = [];
  for (const entry of fs.readdirSync(dir, { withFileTypes: true })) {
    const full = path.join(dir, entry.name);
    if (entry.isDirectory()) files.push(...listJava(full));
    else if (entry.name.endsWith('.java')) files.push(full);
  }
  return files;
}

function ensureParser() {
  if (fs.existsSync(path.join(generatedDir, 'LanguageParser.java'))) return;
  if (!fs.existsSync(grammar)) throw new Error(`No se encontró la gramática: ${grammar}`);
  const missing = jarPaths.filter((jar) => !fs.existsSync(jar));
  if (missing.length) throw new Error(`Faltan JARs de ANTLR en ${m2}:\n${missing.join('\n')}`);
  fs.mkdirSync(generatedRoot, { recursive: true });
  console.log('Generando parser Java desde Language.g4...');
  run('java', ['-cp', jarPaths.join(path.delimiter), 'org.antlr.v4.Tool', '-visitor',
    '-package', 'com.stockscript', '-o', generatedRoot, grammar]);
}

function compileJava() {
  const missing = jarPaths.filter((jar) => !fs.existsSync(jar));
  if (missing.length) throw new Error(`Faltan JARs de ANTLR en ${m2}:\n${missing.join('\n')}`);
  const sources = [
    ...listJava(path.join(stockDir, 'src', 'main', 'java')),
    ...listJava(generatedDir)
  ];
  if (!sources.length) throw new Error('No se encontraron fuentes Java para compilar.');
  fs.rmSync(classesDir, { recursive: true, force: true });
  fs.mkdirSync(classesDir, { recursive: true });
  console.log(`Compilando ${sources.length} archivos Java...`);
  run('javac', ['-encoding', 'UTF-8', '-cp', jarPaths.join(path.delimiter), '-d', classesDir, ...sources]);
  fs.writeFileSync(classpathFile, [classesDir, ...jarPaths].join(path.delimiter), 'utf8');
  console.log('Compilador Java listo.');
}

try {
  ensureParser();
  compileJava();
} catch (error) {
  console.error(`Error al preparar el compilador: ${error.message}`);
  process.exit(1);
}
