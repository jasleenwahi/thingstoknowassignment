package com.knoldus.Question9.usingMathPackage;
//importing the math package
import com.knoldus.Question9.math.Calculator;

import java.util.Scanner;

public class UsingCalculatorMethods {
    public static void main(String args[])
    {
        int number1;
        int number2;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter the value of number 1: ");
        number1 = takeInput.nextInt();
        System.out.println("Enter the value of number 2: ");
        number2 = takeInput.nextInt();
        //using calculator class methods
        System.out.println("The answer of addtion is: "+Calculator.add(number1, number2));
        System.out.println("The answer of addtion is: "+Calculator.subtract(number1, number2));
        System.out.println("The answer of addtion is: "+Calculator.multiply(number1, number2));
        System.out.println("The answer of addtion is: "+Calculator.divide(number1, number2));
    }
}
