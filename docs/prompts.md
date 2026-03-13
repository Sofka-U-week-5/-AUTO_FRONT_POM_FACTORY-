# Prompts Utilizados en el Proyecto

Este archivo documenta los prompts utilizados con GitHub Copilot u otras herramientas de IA durante el desarrollo del proyecto.

---

## Prompt 1 - Estructura Base del Proyecto

**Fecha:** 2026-03-11

**Prompt:**
```
Crea la estructura de carpetas y archivos base para un proyecto de automatización de pruebas web usando Serenity BDD + Cucumber + Gradle + Java, siguiendo el patrón Page Object Model (POM). El proyecto debe incluir:

- Estructura de carpetas bajo src/test/java con paquetes para pages, steps y runners
- Carpeta src/test/resources/features para los archivos .feature
- Un archivo serenity.conf básico en src/test/resources
- Un CucumberRunner vacío pero funcional
- No agregues lógica de negocio ni pruebas reales, solo el esqueleto.

Adicional, crea un archivo prompts para ir colocando los prompts usados crealo en un carpeta /docs
```

**Resultado:**
Se creó la estructura base del proyecto con:
- `src/test/java/com/automation/runners/CucumberRunner.java`
- `src/test/java/com/automation/pages/BasePage.java`
- `src/test/java/com/automation/steps/Hooks.java`
- `src/test/resources/features/example.feature`
- `src/test/resources/serenity.conf`
- `docs/prompts.md`

---

## Prompt 2 - Feature de Registro de Clientes

**Fecha:** 2026-03-11

**Prompt:**
```
Estoy escribiendo pruebas BDD con Gherkin para una pequeña aplicación web.

La aplicación tiene tres pantallas principales:
1. Una pantalla donde se muestran las órdenes de los clientes.
2. Una pantalla donde se pueden crear clientes ingresando nombre, correo y contraseña.
3. Una pantalla para crear órdenes, donde se ingresa el correo del cliente, el nombre de la orden y una descripción. 
   Solo se permite crear la orden si el correo pertenece a un cliente previamente registrado.

Quiero definir un feature relacionado con el registro de clientes desde la interfaz. 
El flujo consiste en que el usuario abre la página de registro, ingresa los datos requeridos 
(nombre, correo y contraseña) y presiona el botón de registro. 

Escribe el escenario utilizando Gherkin y utiliza Scenario Outline con una tabla de ejemplos 
para parametrizar los datos de entrada y el mensaje esperado después del registro.
```

**Resultado:**
Se creó el archivo `src/test/resources/features/registro_clientes.feature` con:
- Escenario de registro exitoso parametrizado con Scenario Outline
- Escenario de validación de campos con casos negativos
- Tags para categorización (@smoke, @validacion, @happy-path, @negative)
- Uso de Antecedentes para la precondición común

---

## Prompt 3 - Page Object CrearClientePage

**Fecha:** 2026-03-13

**Prompt:**
```
Requisitos del Page Object:
- Localizar los campos **nombre**, **email** y **password** utilizando su **id**.
- El botón de registro **no tiene id**, por lo tanto debe localizarse usando el siguiente **XPath**:

//button[contains(text(),'Registrar Administrador')] | //form//button[@type='submit']

- Se deben declarar los elementos en el Page Object.
- Usar las anotaciones correspondientes de Serenity/Selenium para localizarlos.
- Mantener buenas prácticas de Page Object.
- Incluir el botón localizado con el XPath indicado.

El documento se llamará CrearClientePage.java e irá en /pages
```

**Resultado:**
Se creó el archivo `src/test/java/com/automation/pages/CrearClientePage.java` con:
- Campos nombre, email y password localizados por ID usando @FindBy
- Botón de registro localizado por XPath
- Uso de WebElementFacade de Serenity BDD
- Métodos para interactuar con cada campo
- Método de conveniencia `registrarCliente()` para el flujo completo


