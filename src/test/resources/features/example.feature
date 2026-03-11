# language: es
@ejemplo @ignore
Característica: Ejemplo de feature
  Como usuario del sistema
  Quiero tener una plantilla de feature
  Para poder crear mis propios escenarios de prueba

  Antecedentes:
    # Pasos comunes que se ejecutan antes de cada escenario

  @smoke
  Escenario: Escenario de ejemplo
    # Dado alguna precondición
    # Cuando se realiza alguna acción
    # Entonces se verifica algún resultado

  Esquema del escenario: Escenario con ejemplos
    # Dado alguna precondición con "<parametro>"
    # Cuando se realiza alguna acción
    # Entonces se verifica "<resultado>"

    Ejemplos:
      | parametro | resultado |
      | valor1    | esperado1 |
      | valor2    | esperado2 |
