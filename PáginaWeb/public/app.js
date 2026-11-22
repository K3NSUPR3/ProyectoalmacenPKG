const $ = (selector) => document.querySelector(selector);
const $$ = (selector) => Array.from(document.querySelectorAll(selector));

const code = $('#code');
const lineNumbers = $('#line-numbers');
const statusEl = $('#status');
const errorCount = $('#error-count');
const fileSelect = $('#file-select');
const fileName = $('#file-name');
const cursorInfo = $('#cursor-info');
const autoCompile = $('#auto-compile');

const panelErrores = $('#panel-errores');
const panelTokens = $('#panel-tokens');
const panelSalida = $('#panel-salida');
const panelSimbolos = $('#panel-simbolos');

let examples = {};
let currentFile = '';
let lastResult = null;
let autoTimer = null;

function escapeHtml(value) {
  return String(value).replace(/[&<>"']/g, (char) => ({
    '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#39;'
  }[char]));
}

function setStatus(text, kind) {
  statusEl.textContent = text;
  statusEl.className = 'status' + (kind ? ' ' + kind : '');
}

async function api(url, options) {
  const response = await fetch(url, options);
  let data = {};
  try { data = await response.json(); } catch (error) { data = {}; }
  if (!response.ok) throw new Error(data.error || `Error HTTP ${response.status}`);
  return data;
}

function activateTab(name) {
  $$('[data-tab]').forEach((button) => button.classList.toggle('active', button.dataset.tab === name));
  $$('.view').forEach((view) => view.classList.toggle('active', view.id === name));
}

function activateResult(name) {
  $$('.result-tab').forEach((button) => button.classList.toggle('active', button.dataset.result === name));
  $$('.result-panel').forEach((panel) => panel.classList.toggle('active', panel.id === `panel-${name}`));
}

function updateLineNumbers() {
  const total = code.value.split('\n').length;
  lineNumbers.innerHTML = Array.from({ length: total }, (_, index) =>
    `<div class="line-number" data-line="${index + 1}">${index + 1}</div>`
  ).join('');
  applyErrorMarkers();
  lineNumbers.scrollTop = code.scrollTop;
}

function applyErrorMarkers() {
  const lines = new Set((lastResult && lastResult.diagnostics ? lastResult.diagnostics : [])
    .map((diagnostic) => Number(diagnostic.linea))
    .filter((line) => line > 0));
  lineNumbers.querySelectorAll('.line-number').forEach((element) => {
    element.classList.toggle('has-error', lines.has(Number(element.dataset.line)));
  });
}

function updateCursor() {
  const before = code.value.slice(0, code.selectionStart);
  const parts = before.split('\n');
  cursorInfo.textContent = `Ln ${parts.length}, Col ${parts[parts.length - 1].length + 1}`;
}

function selectLine(line) {
  const lines = code.value.split('\n');
  if (line < 1 || line > lines.length) return;
  let start = 0;
  for (let index = 0; index < line - 1; index++) start += lines[index].length + 1;
  code.focus();
  code.setSelectionRange(start, start + lines[line - 1].length);
  const lineHeight = parseFloat(getComputedStyle(code).lineHeight) || 21;
  code.scrollTop = Math.max(0, (line - 3) * lineHeight);
  lineNumbers.scrollTop = code.scrollTop;
}

function renderResult(result) {
  lastResult = result;
  const diagnostics = result.diagnostics || [];
  errorCount.textContent = diagnostics.length;
  errorCount.classList.toggle('has-errors', diagnostics.length > 0);

  if (diagnostics.length) {
    panelErrores.innerHTML = diagnostics.map((diagnostic) => {
      const line = Number(diagnostic.linea) || 1;
      const column = Number(diagnostic.columna) || 0;
      return `<button class="error-item" data-line="${line}">
        <span class="error-head">
          <span class="fase fase-${escapeHtml(diagnostic.fase)}">${escapeHtml(diagnostic.fase)}</span>
          <span>Línea ${line}, columna ${column}</span>
        </span>
        <span class="error-message">${escapeHtml(diagnostic.mensaje)}</span>
      </button>`;
    }).join('');
    panelErrores.querySelectorAll('.error-item').forEach((item) => {
      item.addEventListener('click', () => selectLine(Number(item.dataset.line)));
    });
    setStatus(`${diagnostics.length} error${diagnostics.length === 1 ? '' : 'es'}`, 'error');
    activateResult('errores');
  } else {
    panelErrores.innerHTML = '<div class="success-box">Compilación correcta: no se detectaron errores léxicos, sintácticos ni semánticos.</div>';
    setStatus('Sin errores', 'ok');
  }

  const tokens = result.tokens || [];
  panelTokens.innerHTML = tokens.length
    ? `<table class="data-table"><thead><tr><th>Línea</th><th>Col</th><th>Token</th><th>Texto</th></tr></thead><tbody>${tokens.map((token) =>
        `<tr><td>${Number(token.linea) || 0}</td><td>${Number(token.columna) || 0}</td><td>${escapeHtml(token.tipo)}</td><td>${escapeHtml(token.texto)}</td></tr>`
      ).join('')}</tbody></table>`
    : '<div class="empty">Sin tokens.</div>';

  panelSalida.innerHTML = result.salida
    ? `<pre class="output-pre">${escapeHtml(result.salida)}</pre>`
    : '<div class="empty">El programa no imprimió nada.</div>';

  const simbolos = result.simbolos || [];
  panelSimbolos.innerHTML = simbolos.length
    ? `<table class="data-table"><thead><tr><th>Variable</th><th>Tipo</th><th>Valor</th></tr></thead><tbody>${simbolos.map((simbolo) =>
        `<tr><td>${escapeHtml(simbolo.nombre)}</td><td>${escapeHtml(simbolo.tipo)}</td><td>${escapeHtml(simbolo.valor)}</td></tr>`
      ).join('')}</tbody></table>`
    : '<div class="empty">Sin símbolos.</div>';

  applyErrorMarkers();
}

async function compile() {
  setStatus('Compilando...', 'working');
  try {
    const result = await api('/api/compile', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ content: code.value })
    });
    renderResult(result);
  } catch (error) {
    renderResult({
      ok: false,
      diagnostics: [{ fase: 'sistema', linea: 1, columna: 0, mensaje: error.message }],
      tokens: [], salida: '', simbolos: []
    });
  }
}

function updateFileName() { fileName.textContent = currentFile || 'sin guardar.stoc'; }

async function loadFiles() {
  const files = await api('/api/files');
  fileSelect.innerHTML = '<option value="">— archivos guardados —</option>' +
    files.map((file) => `<option value="${escapeHtml(file.nombre)}">${escapeHtml(file.nombre)}</option>`).join('');
}

async function loadExample(id) {
  const example = examples[id];
  if (!example) return;
  if (code.value.trim() && !confirm('¿Reemplazar el contenido actual del editor?')) return;
  code.value = example.contenido;
  currentFile = '';
  updateFileName();
  updateLineNumbers();
  updateCursor();
  activateTab('editor');
  await compile();
}

$$('[data-tab]').forEach((button) => button.addEventListener('click', () => activateTab(button.dataset.tab)));
$$('.result-tab').forEach((button) => button.addEventListener('click', () => activateResult(button.dataset.result)));
$$('[data-example]').forEach((button) => button.addEventListener('click', () => loadExample(button.dataset.example)));

$('#btn-compile').addEventListener('click', compile);

code.addEventListener('input', () => {
  updateLineNumbers();
  updateCursor();
  if (autoCompile.checked) {
    clearTimeout(autoTimer);
    autoTimer = setTimeout(compile, 700);
  }
});
code.addEventListener('click', updateCursor);
code.addEventListener('keyup', updateCursor);
code.addEventListener('scroll', () => { lineNumbers.scrollTop = code.scrollTop; });
code.addEventListener('keydown', (event) => {
  if (event.key !== 'Tab') return;
  event.preventDefault();
  const start = code.selectionStart;
  const end = code.selectionEnd;
  code.value = code.value.slice(0, start) + '  ' + code.value.slice(end);
  code.selectionStart = code.selectionEnd = start + 2;
  code.dispatchEvent(new Event('input'));
});

$('#btn-new').addEventListener('click', () => {
  if (code.value.trim() && !confirm('¿Crear un archivo nuevo? Se perderán los cambios no guardados.')) return;
  code.value = '';
  currentFile = '';
  lastResult = null;
  updateFileName();
  updateLineNumbers();
  updateCursor();
  panelErrores.innerHTML = '<div class="empty">Compila para ver los resultados.</div>';
  errorCount.textContent = '0';
  errorCount.classList.remove('has-errors');
  setStatus('Listo');
});

$('#btn-open').addEventListener('click', async () => {
  const name = fileSelect.value;
  if (!name) { alert('Selecciona primero un archivo guardado.'); return; }
  try {
    const data = await api('/api/files/' + encodeURIComponent(name));
    if (code.value.trim() && !confirm('¿Reemplazar el contenido actual del editor?')) return;
    code.value = data.contenido;
    currentFile = name;
    updateFileName();
    updateLineNumbers();
    updateCursor();
    setStatus(`Archivo ${name} abierto`, 'ok');
  } catch (error) { alert(error.message); }
});

$('#btn-save').addEventListener('click', async () => {
  let name = currentFile;
  if (!name) {
    const entered = prompt('Nombre del archivo .stoc:', 'programa.stoc');
    if (!entered || !entered.trim()) return;
    name = entered.trim();
    if (!/\.stoc$/i.test(name)) name += '.stoc';
  }
  if (!/^[A-Za-z0-9_-]+\.stoc$/.test(name)) {
    alert('Nombre inválido. Usa letras, números, guion o guion bajo y la extensión .stoc.');
    return;
  }
  try {
    await api('/api/files', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ name, content: code.value })
    });
    currentFile = name;
    updateFileName();
    await loadFiles();
    fileSelect.value = name;
    setStatus(`Guardado ${name}`, 'ok');
  } catch (error) { alert(error.message); }
});

$('#btn-delete').addEventListener('click', async () => {
  const name = currentFile || fileSelect.value;
  if (!name) { alert('No hay ningún archivo seleccionado.'); return; }
  if (!confirm(`¿Eliminar ${name}?`)) return;
  try {
    await api('/api/files/' + encodeURIComponent(name), { method: 'DELETE' });
    if (currentFile === name) { currentFile = ''; updateFileName(); }
    await loadFiles();
    setStatus(`Eliminado ${name}`, 'ok');
  } catch (error) { alert(error.message); }
});

$('#btn-download').addEventListener('click', () => {
  const blob = new Blob([code.value], { type: 'text/plain;charset=utf-8' });
  const link = document.createElement('a');
  link.href = URL.createObjectURL(blob);
  link.download = currentFile || 'programa.stoc';
  document.body.appendChild(link);
  link.click();
  document.body.removeChild(link);
  URL.revokeObjectURL(link.href);
});

document.addEventListener('keydown', (event) => {
  if ((event.ctrlKey || event.metaKey) && event.key.toLowerCase() === 's') {
    event.preventDefault();
    $('#btn-save').click();
  }
});

async function init() {
  const list = await api('/api/examples');
  examples = list.reduce((map, example) => { map[example.id] = example; return map; }, {});
  await loadFiles();
  updateLineNumbers();
  updateCursor();
}

init().catch((error) => setStatus(error.message, 'error'));
