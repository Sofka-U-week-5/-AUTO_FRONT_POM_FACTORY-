package com.automation.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;

/**
 * Clase para definir hooks de Cucumber.
 * Los hooks se ejecutan antes y después de cada escenario.
 */
public class Hooks {

    @Before
    public void setUp() {
        // Configuraciones previas a cada escenario
        // Ejemplo: limpiar datos, configurar estado inicial, etc.
    }

    @After
    public void tearDown() {
        // Limpieza después de cada escenario
        // Ejemplo: cerrar conexiones, limpiar cache, etc.
    }
}
