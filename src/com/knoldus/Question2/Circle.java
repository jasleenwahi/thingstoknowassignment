package com.knoldus.Question2;

import java.util.Scanner;

public class Circle
{
    static double PI = 3.14;
    public double getCircumference(double radius)
    {
        double circumference = 2*PI*radius;
        return circumference;
    }
    public static void main(String args[])
    {
        double radius;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = takeInput.nextDouble();
        Circle circle1 = new Circle();
        double circumference = circle1.getCircumference(radius);
        System.out.println("The circumference of circle is: "+circumference);
    }
}
