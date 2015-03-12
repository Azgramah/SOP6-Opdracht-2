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
     * @param x variable one.
     * @param y this variable is added to variable one.
     * @returns the addition of variable one and variable two.
     */
    public static int add(int x, int y)
    {
        if(x != 0)
        {
            return x + y;   
        }
        
        else return y;
    }
    
    /**
     * Substract one number from the other
     * @param x variable one.
     * @param y this variable is removed from variable one.
     * @returns the addition of variable one and variable two.
     */
    public static int substract(int x, int y)
    {
        if(x != 0)
        {
            return x - y;   
        }
        
        else return -y;
    }
    
    /**
     * Multiplies one number to the other
     * @param x variable one.
     * @param y this variable is multiplied with variable one.
     * @returns the addition of variable one and variable two.
     */
    public static int multiply(int x, int y)
    {
        return x * y;
    }
    
    /**
     * Divides one number through the other
     * @param x variable one.
     * @param y this variable divides variable one through itself.
     * @returns the addition of variable one and variable two.
     */
    public static int divide(int x, int y)
    {
        return x / y;
    }
}
