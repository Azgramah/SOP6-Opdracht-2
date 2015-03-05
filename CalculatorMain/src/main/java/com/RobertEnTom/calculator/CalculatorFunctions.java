/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RobertEnTom.calculator;

/**
 *
 * @author Robert
 */
public class CalculatorFunctions 
{
    public static int Add(int x, int y)
    {
        int sum = x + y;
        System.out.println(sum);
        return sum;
    }
    
    public static int Substract(int x, int y)
    {
        int sum = x - y;
        System.out.println(sum);
        return sum;
    }
    
    public static int Multiply(int x, int y)
    {
        int sum = x * y;
        System.out.println(sum);
        return sum;
    }
    
    public static int Divide(int x, int y)
    {
        int sum = x / y;
        System.out.println(sum);
        return sum;
    }
}
