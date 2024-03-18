package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testSum() {
        App app = new App();
        assertEquals(5, app.sum(2, 3), "La suma debe ser 5");
        assertEquals(-1, app.sum(2, -3), "La suma debe ser -1");
    }

    @Test
    void testGreet() {
        App app = new App();
        String result = app.greet("Pedro");
        assertEquals("Hola, Pedro!", result, "El saludo debe ser correcto");
    }

    @Test 
    void testR(){

    }
}