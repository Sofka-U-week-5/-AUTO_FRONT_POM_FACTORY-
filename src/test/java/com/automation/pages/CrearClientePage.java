package com.automation.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:5173/addUser")
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
        return mensajeModal.getText();
    }
}
