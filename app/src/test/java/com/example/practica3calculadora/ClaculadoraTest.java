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
    public void testCalculate() {
        assertEquals( "La operacion no se ha podido realizar.", "1", calc.calculate("-3+4"));
        assertEquals( "La operacion no se ha podido realizar.", "-7", calc.calculate("-3-4"));
        assertEquals( "La operacion no se ha podido realizar.", "100", calc.calculate("10*10"));
    }
}
