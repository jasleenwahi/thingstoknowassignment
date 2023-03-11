package com.knoldus.Question12;
import com.knoldus.Question12.InstanceVariable;

import java.util.Scanner;

public class GetSetInstance
{
    public static void main(String args[])
    {
        Scanner takeInput = new Scanner(System.in);
        InstanceVariable instance1 = new InstanceVariable();
        String name;
        System.out.println("Enter the name");
        name = takeInput.nextLine();
        instance1.setName(name);
        System.out.println("The name is: "+instance1.getName());
    }
}
