package com.knoldus.Question1;

public class Car
{
    static int numOfCars=0;
    public Car()
    {
        numOfCars++; //whenever we create a new car the value gets incremented as it is a static variable.
                    //thats how we are keeping track of number of cars.
    }
    public int getNumOfCars()
    {
        return numOfCars;
    }
    public static void main(String args[])
    {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        int numOfCars = car3.getNumOfCars();    //we have created three cars
        System.out.println("The total number of cars are: "+ numOfCars);
    }
}
