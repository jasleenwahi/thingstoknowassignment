package com.knoldus.Question15.DefaultAccess;
import com.knoldus.Question15.Default.DefaultInstance;
public class DefaultInstanceAccess
{
    public static void main(String args[])
    {
        DefaultInstance defaultInstance = new DefaultInstance();
        //cant access the default instance variable from a different package
        System.out.println(defaultInstance.number);
    }
}
