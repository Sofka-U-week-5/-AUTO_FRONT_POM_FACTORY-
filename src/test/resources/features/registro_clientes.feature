Feature: Registro cliente

  Scenario Outline: Registro de un cliente
    Given el usuario está en la página de crear cuenta
    When ingresa el nombre "<nombre>", el correo "<correo>" y la contraseña "<contraseña>"
    And hace clic en el botón de registrar
    Then debería ver el mensaje "<mensaje>"

    Examples:
      | nombre     | correo          | contraseña | mensaje        |
      | Juan Pérez | juan@mail.com   | Abcd1234   | Usuario creado |