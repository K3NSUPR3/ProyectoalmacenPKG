@echo off
chcp 65001 >nul
title StockScript Web IDE

echo ========================================================
echo          Iniciando StockScript Web IDE
echo ========================================================
echo.

set "SCRIPT_DIR=%~dp0"
set "WEB_DIR="

for /d %%D in ("%SCRIPT_DIR%P*ginaWeb") do set "WEB_DIR=%%D"
if not defined WEB_DIR (
    for /d %%D in ("%SCRIPT_DIR%ProyectoalmacenPKG\P*ginaWeb") do set "WEB_DIR=%%D"
)

if not defined WEB_DIR (
    echo [ERROR] No se encontro la carpeta PaginaWeb del proyecto.
    pause
    exit /b 1
)

cd /d "%WEB_DIR%"

echo [1/3] Verificando herramientas instaladas...
where node >nul 2>nul
if %errorlevel% neq 0 (
    echo [ERROR] Node.js no esta instalado o no se encuentra en el PATH.
    echo Por favor instala Node.js desde https://nodejs.org/
    pause
    exit /b 1
)

where java >nul 2>nul
if %errorlevel% neq 0 (
    echo [ERROR] Java JDK no esta instalado o no se encuentra en el PATH.
    pause
    exit /b 1
)

echo [2/3] Compilando clases Java y preparando classpath...
node scripts/build-java.js
if %errorlevel% neq 0 (
    echo [ERROR] Ocurrio un problema al compilar los componentes de Java.
    pause
    exit /b 1
)

echo.
echo [3/3] Iniciando servidor y abriendo navegador...
start http://localhost:3000

echo.
echo ========================================================
echo   StockScript Web IDE esta activo en:
echo   http://localhost:3000
echo.
echo   Presiona Ctrl + C o cierra esta ventana para salir.
echo ========================================================
echo.

node server.js

pause
