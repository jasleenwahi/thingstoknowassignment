package com.knoldus.Question8;

import java.util.Scanner;

public class MathUtils
{
    public static double E = 2.71828;

    public static double calculateExponential(double x) {
        double result = Math.pow(x, E);
        return result;
    }
    public static void main(String[] args){
        double x;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter the number you want to calculate exponent of: ");
        x = takeInput.nextDouble();
        double exponential = MathUtils.calculateExponential(x);
        System.out.println("The exponential of " + x + " is " + exponential);

    }
}
