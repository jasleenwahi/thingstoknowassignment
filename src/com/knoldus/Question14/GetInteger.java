package com.knoldus.Question14;

public class GetInteger
{
    public void printInteger()
    {
        //can access public method of PublicMethod class in different method of same package
        PublicMethod public1 = new PublicMethod();
        System.out.println(public1.returnInteger());
    }
}
