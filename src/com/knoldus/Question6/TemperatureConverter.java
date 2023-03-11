package com.knoldus.Question6;

import java.util.Scanner;

public class TemperatureConverter
{
    static int conversion_factor;
    public double celsiusToFahrenheit(double celsius)
    {
        double fahrenheit = (celsius * conversion_factor) + 32;
        return fahrenheit;
    }
    public static void main(String[] args)
    {
        Scanner takeInput = new Scanner(System.in);
        TemperatureConverter temperature = new TemperatureConverter();
        double celsius;
        System.out.println("Enter the value of temperature in celsius");
        celsius = takeInput.nextDouble();
        double fahrenheit = temperature.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
}
