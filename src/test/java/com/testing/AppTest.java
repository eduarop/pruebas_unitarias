package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    //assertArrayEquals(esperado, actual);

    @Test
    void testSuma() {
        App app = new App();
        assertEquals(5, app.suma(2, 3), "La suma debe ser 5");
        assertEquals(-1, app.suma(2, -3), "La suma debe ser -1");
    }

    @Test
    void testSaludo() {
        App app = new App();
        String result = app.saludo("Pedro");
        assertEquals("Hola, Pedro!", result, "El saludo debe ser correcto");
    }
}