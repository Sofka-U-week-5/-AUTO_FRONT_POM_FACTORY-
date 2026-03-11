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

## Plantilla para Nuevos Prompts

```markdown
## Prompt X - [Título Descriptivo]

**Fecha:** YYYY-MM-DD

**Prompt:**
\`\`\`
[Copiar el prompt utilizado aquí]
\`\`\`

**Resultado:**
[Describir brevemente el resultado obtenido]

**Notas:**
[Observaciones adicionales si las hay]
```

---

## Consejos para Escribir Buenos Prompts

1. **Sé específico:** Incluye tecnologías, versiones y patrones a utilizar
2. **Define el alcance:** Indica qué debe y qué NO debe incluir
3. **Proporciona contexto:** Menciona la estructura existente del proyecto
4. **Indica formato:** Especifica cómo quieres que se organice el resultado
5. **Itera:** Si el resultado no es el esperado, refina el prompt y vuelve a intentar
