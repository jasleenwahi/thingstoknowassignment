package com.knoldus.Question10.shapesUtilization;
import com.knoldus.Question10.shapes.*;


import java.util.Scanner;

public class UsingShapeMethods
{
    public static void main(String args[])
    {
        Scanner takeInput = new Scanner(System.in);
        int radius;
        System.out.println("Enter the radius of the circle: ");
        radius = takeInput.nextInt();
        Circle circle1 = new Circle();
        //some calculations using the class of shapes package
        System.out.println("The area of cicle is: "+circle1.calculateArea(radius));
    }
}
