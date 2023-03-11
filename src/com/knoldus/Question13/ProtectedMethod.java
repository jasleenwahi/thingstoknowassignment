package com.knoldus.Question13;

public class ProtectedMethod
{
    protected int returnInteger()
    {
        return 10;
    }
}
class AccessProtectedMethod extends ProtectedMethod
{
    public int getInteger()
    {
        //trying to call the protected method of parent class from sub class and its working fine
        int number = returnInteger();
        return number;
    }
    public static void main(String args[])
    {
        AccessProtectedMethod access = new AccessProtectedMethod();
        System.out.println("Printing a number: "+access.getInteger());
    }
}