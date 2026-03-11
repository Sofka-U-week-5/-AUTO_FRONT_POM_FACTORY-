

package test.java.com.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Page Object para la página de registro de clientes/administradores.
 * Contiene los elementos y acciones relacionadas con el formulario de registro.
 */
public class CrearClientePage extends PageObject {

    @FindBy(id = "nombre")
    private WebElementFacade campoNombre;

    @FindBy(id = "email")
    private WebElementFacade campoEmail;

    @FindBy(id = "password")
    private WebElementFacade campoPassword;

    @FindBy(xpath = "//button[contains(text(),'Registrar Administrador')] | //form//button[@type='submit']")
    private WebElementFacade botonRegistrar;

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
}
