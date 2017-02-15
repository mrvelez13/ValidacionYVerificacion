/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationsuma;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 311B-03
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Operaciones.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int valUno = 2254;
        int valDos = 4525;
        Operaciones instance = new Operaciones();
        int expResult = 6779;
        int result = instance.sumar(valUno, valDos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Operaciones.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int valUno = 1145;
        int valDos = 5524;
        Operaciones instance = new Operaciones();
        int expResult = -4379;
        int result = instance.restar(valUno, valDos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Operaciones.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int valUno = 552;
        int valDos = 544;
        Operaciones instance = new Operaciones();
        int expResult = 300288;
        int result = instance.multiplicar(valUno, valDos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Operaciones.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int valUno = 8785;
        int valDos = 445;
        Operaciones instance = new Operaciones();
        int expResult = 19;
        int result = instance.dividir(valUno, valDos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
