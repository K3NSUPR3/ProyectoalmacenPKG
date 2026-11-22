const http = require('http');
const fs = require('fs');
const path = require('path');
const { spawn } = require('child_process');

const webRoot = __dirname;
const publicDir = path.join(webRoot, 'public');
const storageDir = path.join(webRoot, 'storage', 'stoc');
const examplesDir = path.join(webRoot, 'examples');
const classpathFile = path.join(webRoot, 'compiler-java', 'classpath.txt');
const port = Number(process.env.PORT) || 3000;

fs.mkdirSync(storageDir, { recursive: true });

const mime = {
  '.html': 'text/html; charset=utf-8',
  '.css': 'text/css; charset=utf-8',
  '.js': 'text/javascript; charset=utf-8',
  '.json': 'application/json; charset=utf-8',
  '.svg': 'image/svg+xml',
  '.png': 'image/png',
  '.ico': 'image/x-icon'
};

function send(res, status, body, type) {
  res.writeHead(status, { 'Content-Type': type || 'application/json; charset=utf-8' });
  res.end(typeof body === 'string' || Buffer.isBuffer(body) ? body : JSON.stringify(body));
}

function readBody(req) {
  return new Promise((resolve, reject) => {
    const chunks = [];
    let size = 0;
    req.on('data', (chunk) => {
      size += chunk.length;
      if (size > 4 * 1024 * 1024) {
        reject(new Error('El archivo es demasiado grande (máximo 4 MB).'));
        req.destroy();
        return;
      }
      chunks.push(chunk);
    });
    req.on('end', () => resolve(Buffer.concat(chunks).toString('utf8')));
    req.on('error', reject);
  });
}

function safeName(name) {
  return typeof name === 'string' && /^[A-Za-z0-9_-]+\.stoc$/.test(name) ? name : null;
}

function fail(diagnostic) {
  return { ok: false, diagnostics: [diagnostic], tokens: [], salida: '', simbolos: [] };
}

function compile(code) {
  return new Promise((resolve) => {
    let classpath;
    try {
      classpath = fs.readFileSync(classpathFile, 'utf8').trim();
    } catch (error) {
      resolve(fail({ fase: 'sistema', linea: 1, columna: 0, mensaje: 'El compilador Java no está compilado. Ejecuta npm start.' }));
      return;
    }
    const child = spawn('java', ['-cp', classpath, 'com.stockscript.WebCompiler'], { cwd: webRoot, windowsHide: true });
    let stdout = '';
    let stderr = '';
    let done = false;
    const finish = (result) => {
      if (done) return;
      done = true;
      clearTimeout(timer);
      resolve(result);
    };
    const timer = setTimeout(() => {
      child.kill();
      finish(fail({ fase: 'ejecucion', linea: 1, columna: 0, mensaje: 'Tiempo de ejecución excedido (límite de 15 segundos).' }));
    }, 15000);
    child.stdout.on('data', (chunk) => { stdout += chunk.toString('utf8'); });
    child.stderr.on('data', (chunk) => { stderr += chunk.toString('utf8'); });
    child.on('error', (error) => finish(fail({ fase: 'sistema', linea: 1, columna: 0, mensaje: `No se pudo iniciar Java: ${error.message}` })));
    child.on('close', () => {
      try { finish(JSON.parse(stdout)); }
      catch (error) {
        const detail = (stderr || stdout || 'sin salida').trim().slice(0, 600);
        finish(fail({ fase: 'sistema', linea: 1, columna: 0, mensaje: `Respuesta inválida del compilador: ${detail}` }));
      }
    });
    child.stdin.on('error', () => {});
    child.stdin.end(code, 'utf8');
  });
}

function listExamples() {
  if (!fs.existsSync(examplesDir)) return [];
  return fs.readdirSync(examplesDir).filter((file) => file.endsWith('.json')).sort().map((file) => {
    const data = JSON.parse(fs.readFileSync(path.join(examplesDir, file), 'utf8'));
    return {
      id: path.basename(file, '.json'),
      titulo: data.titulo || file,
      descripcion: data.descripcion || '',
      categoria: data.categoria || 'general',
      contenido: data.contenido || ''
    };
  });
}

function listFiles() {
  return fs.readdirSync(storageDir).filter((file) => file.endsWith('.stoc')).map((file) => {
    const stats = fs.statSync(path.join(storageDir, file));
    return { nombre: file, tamano: stats.size, modificado: stats.mtime.toISOString() };
  }).sort((a, b) => a.nombre.localeCompare(b.nombre));
}

function serveStatic(res, pathname) {
  const relative = pathname === '/' ? 'index.html' : pathname.replace(/^\/+/, '');
  const file = path.resolve(publicDir, relative);
  if (file !== publicDir && !file.startsWith(publicDir + path.sep)) {
    send(res, 403, { error: 'Acceso denegado' });
    return;
  }
  fs.stat(file, (error, stats) => {
    if (error || !stats.isFile()) {
      send(res, 404, { error: 'No encontrado' });
      return;
    }
    res.writeHead(200, { 'Content-Type': mime[path.extname(file)] || 'application/octet-stream' });
    fs.createReadStream(file).pipe(res);
  });
}

const server = http.createServer(async (req, res) => {
  try {
    const parsed = new URL(req.url, `http://${req.headers.host || 'localhost'}`);
    const pathname = decodeURIComponent(parsed.pathname);

    if (pathname === '/api/compile' && req.method === 'POST') {
      const body = JSON.parse(await readBody(req) || '{}');
      const content = typeof body.content === 'string' ? body.content : '';
      send(res, 200, await compile(content));
      return;
    }
    if (pathname === '/api/examples' && req.method === 'GET') {
      send(res, 200, listExamples());
      return;
    }
    if (pathname === '/api/files' && req.method === 'GET') {
      send(res, 200, listFiles());
      return;
    }
    if (pathname === '/api/files' && req.method === 'POST') {
      const body = JSON.parse(await readBody(req) || '{}');
      const name = safeName(body.name);
      if (!name) { send(res, 400, { error: 'El nombre debe tener el formato nombre.stoc.' }); return; }
      if (typeof body.content !== 'string') { send(res, 400, { error: 'Falta el contenido.' }); return; }
      fs.writeFileSync(path.join(storageDir, name), body.content, 'utf8');
      send(res, 200, { nombre: name, guardado: true });
      return;
    }
    if (pathname.startsWith('/api/files/')) {
      const name = safeName(pathname.slice('/api/files/'.length));
      if (!name) { send(res, 400, { error: 'Nombre de archivo inválido.' }); return; }
      const file = path.join(storageDir, name);
      if (req.method === 'GET') {
        if (!fs.existsSync(file)) { send(res, 404, { error: 'El archivo no existe.' }); return; }
        send(res, 200, { nombre: name, contenido: fs.readFileSync(file, 'utf8') });
        return;
      }
      if (req.method === 'DELETE') {
        if (!fs.existsSync(file)) { send(res, 404, { error: 'El archivo no existe.' }); return; }
        fs.unlinkSync(file);
        send(res, 200, { nombre: name, eliminado: true });
        return;
      }
    }
    if (pathname.startsWith('/api/')) { send(res, 404, { error: 'Ruta API no encontrada.' }); return; }
    if (req.method !== 'GET' && req.method !== 'HEAD') { send(res, 405, { error: 'Método no permitido.' }); return; }
    serveStatic(res, pathname);
  } catch (error) {
    send(res, 500, { error: error.message });
  }
});

server.listen(port, () => console.log(`StockScript Web disponible en http://localhost:${port}`));
