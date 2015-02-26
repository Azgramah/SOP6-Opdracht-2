/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RobertEnTom.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Robert
 */
public class CalculatorFunctionsTest {
    
    public CalculatorFunctionsTest() {
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
     * Test of Add method, of class CalculatorFunctions.
     */
    @org.junit.Test
    public void testAdd() {
        System.out.println("Add");
        int x = 1;
        int y = 1;
        int expResult = 2;
        int result = CalculatorFunctions.Add(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of Substract method, of class CalculatorFunctions.
     */
    @org.junit.Test
    public void testSubstract() {
        System.out.println("Substract");
        int x = 1;
        int y = 1;
        int expResult = 0;
        int result = CalculatorFunctions.Substract(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of Multiply method, of class CalculatorFunctions.
     */
    @org.junit.Test
    public void testMultiply() {
        System.out.println("Multiply");
        int x = 2;
        int y = 2;
        int expResult = 4;
        int result = CalculatorFunctions.Multiply(x, y);
        assertEquals(expResult, result);
    }
    
        @org.junit.Test
    public void testDivide() {
        System.out.println("Divide");
        int x = 2;
        int y = 2;
        int expResult = 1;
        int result = CalculatorFunctions.Divide(x, y);
        assertEquals(expResult, result);
    }
    
}
