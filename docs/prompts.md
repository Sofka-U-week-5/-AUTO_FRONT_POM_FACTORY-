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

## Prompt 2 - Page Object para Registro de Administrador

**Fecha:** 2026-03-11

**Prompt:**
```
Extiende el Page Object CrearClientePage.java agregando los elementos de una página de registro de administrador.

Requisitos del Page Object:
- Localizar los campos nombre, email y password utilizando su id.
- El botón de registro no tiene id, por lo tanto debe localizarse usando el siguiente XPath:
  //button[contains(text(),'Registrar Administrador')] | //form//button[@type='submit']

El prompt debe indicar claramente que:
- Se deben declarar los elementos en el Page Object.
- Usar las anotaciones correspondientes de Serenity/Selenium para localizarlos.
- Mantener buenas prácticas de Page Object.
- Incluir el botón localizado con el XPath indicado.
```

**Resultado:**
Se implementó `CrearClientePage.java` con:
- Campos `campoNombre`, `campoEmail`, `campoPassword` localizados por `@FindBy(id = "...")`
- Botón `botonRegistrar` localizado por `@FindBy(xpath = "...")`
- Métodos de interacción: `ingresarNombre()`, `ingresarEmail()`, `ingresarPassword()`, `clickBotonRegistrar()`
- Extensión de `PageObject` de Serenity y uso de `WebElementFacade`

**Notas:**
- El XPath del botón usa `|` (OR) para ser flexible ante diferentes variantes del HTML
