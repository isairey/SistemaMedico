package com.clinica.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.clinica.servicios.CalculadoraIMC;

public class CalculadoraIMCTest {

    @Test
    public void testCalculoIMC() {
        double imc = CalculadoraIMC.calcularIMC(70, 1.75);
        assertEquals(22.86, imc, 0.1);
    }

    @Test
    public void testClasificacionNormal() {
        String resultado = CalculadoraIMC.clasificarIMC(22);
        assertEquals("Normal", resultado);
    }

    @Test
    public void testErrorDatosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraIMC.calcularIMC(0, 1.75);
        });
    }
}
