package com.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Clase base para todas las páginas del proyecto.
 * Extiende PageObject de Serenity para aprovechar sus funcionalidades.
 * Las páginas específicas deben heredar de esta clase.
 */
public abstract class BasePage extends PageObject {

    /**
     * Método para esperar a que la página cargue completamente.
     * Puede ser sobrescrito por las páginas hijas según necesidad.
     */
    public void waitForPageToLoad() {
        waitForRenderedElements(getDriver().findElements(org.openqa.selenium.By.tagName("body")).get(0));
    }
}
