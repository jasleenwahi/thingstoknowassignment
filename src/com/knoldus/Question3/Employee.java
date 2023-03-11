package com.knoldus.Question3;

public class Employee
{
    static int nextId=1;
    int id;
    Employee()
    {
        id = nextId;    //value of id getting assigned to each employee
        nextId++;      //value of id gets incremented for the next employee
    }
    public int getId()
    {
        return id;
    }
    public static void main(String args[])
    {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        System.out.println("The id of employee 1: "+employee1.getId());
        System.out.println("The id of employee 2: "+employee2.getId());
    }
}
