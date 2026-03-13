Feature: Registro cliente

  Scenario Outline: Registro de un cliente
    Given el usuario esta en la pagina de crear cuenta
    When ingresa el nombre "<nombre>", el correo "<correo>" y la contrasena "<contrasena>"
    And hace clic en el boton de registrar
    Then deberia ver el mensaje "<mensaje>"

    Examples:
      | nombre     | correo          | contrasena | mensaje        |
      | Juan Perez | juan@mail.com   | Abcd1234   | Usuario creado |