/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator;

/**
 *
 * @author Robert
 */
public class CalculatorFunctions 
{
    private CalculatorFunctions()
    {
        
    }
    
    /**
     * Adds one number to the other
     * @param x variable.
     * @param y this variable is added to variable one.
     * @returns the addition of variable one and variable two.
     */
    public static int add(int x, int y)
    {
        return x + y;
    }
    
    public static int substract(int x, int y)
    {
        return x - y;
    }
    
    public static int multiply(int x, int y)
    {
        return x * y;
    }
    
    public static int divide(int x, int y)
    {
        return x / y;
    }
}
