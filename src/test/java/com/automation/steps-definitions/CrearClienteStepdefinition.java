package com.automation.stepsdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class CrearClienteStepdefinition {

    private com.automation.pages.CrearClientePage crearClientePage;     

    @Dado("el usuario está en la página de crear cuenta")
    public void elUsuarioEstaEnLaPaginaDeCrearCuenta() {
        crearClientePage.open();
    }

    @Cuando("ingresa el nombre {string}, el correo {string} y la contraseña {string}")
    public void ingresaElNombreElCorreoYLaContrasena(String nombre, String correo, String contrasena) {
        crearClientePage.ingresarNombre(nombre);
        crearClientePage.ingresarEmail(correo);
        crearClientePage.ingresarPassword(contrasena);
    }

    @Cuando("hace clic en el botón de registrar")
    public void haceClicEnElBotonDeRegistrar() {
        crearClientePage.clickBotonRegistrar();
    }

    @Entonces("debería ver el mensaje {string}")
    public void deberiaVerElMensaje(String mensajeEsperado) {
        String mensajeReal = crearClientePage.obtenerMensajeModal();
        org.junit.Assert.assertEquals(mensajeEsperado, mensajeReal);
    }
}
