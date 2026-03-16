package com.automation.pages;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.annotations.DefaultUrl;

@DefaultUrl("\"http://localhost:5173/addUser")
public class CrearClientePage extends PageObject {
    @FindBy(id = "nombre")
    private WebElementFacade campoNombre;
    @FindBy(id = "email")
    private WebElementFacade campoEmail;
    @FindBy(id = "password")
    private WebElementFacade campoPassword;
    @FindBy(xpath = "//button[contains(text(),'Registrar Administrador')] | //form//button[@type='submit']")
    private WebElementFacade botonRegistrar;
    @FindBy(id = "swal2-title")
    private WebElementFacade mensajeModal;
    @FindBy(css = "select")
    private WebElementFacade dropdownClientes;
    @FindBy(css = "button.swal2-confirm")
    private WebElementFacade botonConfirmarModal;
    //Metodos 
    public void ingresarNombre(String nombre) {
        campoNombre.type(nombre);
    }
    public void ingresarEmail(String email) {
        campoEmail.type(email);
    }
    public void ingresarPassword(String password) {
        campoPassword.type(password);
    }
    public void clickBotonRegistrar() {
        botonRegistrar.click();
    }
    public String obtenerMensajeModal() {
        mensajeModal.waitUntilVisible();
        String mensaje = mensajeModal.getText();
        confirmarModal();
        return mensaje;
    }
    public String obtenerUltimoCliente() {
        dropdownClientes.waitUntilVisible();
        List<WebElement> opciones = dropdownClientes.findElements(By.tagName("option"));;
        return opciones.get(opciones.size() -1 ).getText();
    }
    public void confirmarModal() {
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        botonConfirmarModal.waitUntilVisible();
        botonConfirmarModal.click();
    }
    public void waitForUrlToChange(String urlEsperada) {
        new org.openqa.selenium.support.ui.WebDriverWait(getDriver(), java.time.Duration.ofSeconds(10))
        .until(org.openqa.selenium.support.ui.ExpectedConditions.urlToBe(urlEsperada));
    }
}
