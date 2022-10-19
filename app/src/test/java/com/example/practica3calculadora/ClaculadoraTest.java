package com.example.practica3calculadora;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClaculadoraTest {
    private Calculadora calc;
    @Before
    public void setUp() {
        calc = new Calculadora();
        System.out.println("Ready for testing");
    }

    @After
    public void tearDown() {
        System.out.println("Done with testing");
    }

    @Test
    public void testCalculateDosPorTres() {
        assertEquals( "La operacion no se ha podido realizar.", "6", calc.calculate("2*3"));
    }

    @Test
    public void testCalculateUnoPorDosPorOcho() {
        assertEquals( "La operacion no se ha podido realizar.", "16", calc.calculate("1*2*8"));
    }

    @Test
    public void testCalculateDosPorDosMasTres() {
        assertEquals( "La operacion no se ha podido realizar.", "7", calc.calculate("2*2+3"));
    }

    @Test
    public void testCalculateTresMasDosPorDos() {
        assertEquals( "La operacion no se ha podido realizar.", "7", calc.calculate("3+2*2"));
    }

    @Test
    public void testCalculateTresMasDosPorDosMasCuatro() {
        assertEquals( "La operacion no se ha podido realizar.", "11", calc.calculate("3+2*2+4"));
    }

    @Test
    public void testCalculateMenosUnoMenosMenosUno() {
        assertEquals( "La operacion no se ha podido realizar.", "0", calc.calculate("-1--1"));
    }

    @Test
    public void testCalculateDosMenosMenosUno() {
        assertEquals( "La operacion no se ha podido realizar.", "-2", calc.calculate("2*-1"));
    }
}
