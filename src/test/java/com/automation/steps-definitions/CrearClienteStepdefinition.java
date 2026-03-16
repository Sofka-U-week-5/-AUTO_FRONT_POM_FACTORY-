package com.automation.stepsdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class CrearClienteStepdefinition {

    private com.automation.pages.CrearClientePage crearClientePage;     

    @Dado("el usuario esta en la pagina de crear cuenta")
    public void elUsuarioEstaEnLaPaginaDeCrearCuenta() {
        crearClientePage.open();
    }

    @Cuando("ingresa el nombre {string}, el correo {string} y la contrasena {string}")
    public void ingresaElNombreElCorreoYLaContrasena(String nombre, String correo, String contrasena) {
        crearClientePage.ingresarNombre(nombre);
        crearClientePage.ingresarEmail(correo);
        crearClientePage.ingresarPassword(contrasena);
    }

    @Cuando("hace clic en el boton de registrar")
    public void haceClicEnElBotonDeRegistrar() {
        crearClientePage.clickBotonRegistrar();
    }

    @Entonces("deberia ver el mensaje {string}")
    public void deberiaVerElMensaje(String mensajeEsperado) {
        String mensajeReal = crearClientePage.obtenerMensajeModal();
        org.junit.Assert.assertEquals(mensajeEsperado, mensajeReal);
    }

    @Entonces("deberia ser redirigido a la pagina principal")
    public void deberiaSerRedirigidoALaPaginaPrincipal() {
        crearClientePage.waitForUrlToChange("http://localhost:5173/");
        String urlActual = crearClientePage.getDriver().getCurrentUrl();
        org.junit.Assert.assertEquals("http://localhost:5173/", urlActual);
    }

    @Entonces("el ultimo cliente en la lista deberia ser {string}")
    public void elUltimoClienteEnLaListaDeberiaSer(String nombreEsperado) {
        String ultimoCliente = crearClientePage.obtenerUltimoCliente();
        System.out.println(ultimoCliente);
        org.junit.Assert.assertTrue(ultimoCliente.contains(nombreEsperado));
    }
}
