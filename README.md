# Automatización Screenplay - PUP

Pruebas automatizadas con **Serenity BDD + Screenplay** para el proyecto PUP (Gestión de Usuarios y Pedidos).

## Repositorio bajo prueba

git clone https://github.com/Sofka-U/Diagnostico-Semana0.git

Por defecto se ejecuta en **local**. Para usar **GitHub Codespaces**, actualizar la URL en:

```
src/test/java/com/automation/constants/Urls.java
```

## Iniciar Docker
cd /home/omar/proyectos/Diagnostico-Semana0/Backend && docker-compose up -d

## Iniciar frontend
- cd Frontend && npm i 
- cp .env.template .env
- npm run dev 

Y ya estará arriba el proyecto

Cambiar `BASE_URL` por la URL del Codespace.

## Ejecutar tests

```bash
./gradlew clean test aggregate
```

##  Nota importante sobre los datos de prueba

El feature utiliza **nombre** y **correo** para el registro de usuario. Si ejecutas las pruebas por primera vez, pasarán correctamente. Sin embargo, **si ejecutas las pruebas nuevamente sin modificar los datos**, fallarán porque el usuario ya existe en el sistema.

**Recomendación:** Antes de volver a ejecutar las pruebas, actualiza el nombre y correo en el archivo feature ubicado en:
```
src/test/resources/features/
```

## Ver reporte

Abrir en el navegador:

```
target/site/serenity/index.html
```
