package com.knoldus.Question4;

import java.util.Scanner;

public class BankAccount
{
    static double interestRate=3.4; //assuming rate of interest to be 3.4
    double balance;
    public BankAccount(double balance)
    {
        this.balance = balance;
    }
    public double calculateInterest()
    {
        double interest = balance * (interestRate/100);
        return interest;
    }
    public static void main(String args[])
    {
        Scanner takeInput = new Scanner(System.in);
        double balance;
        System.out.println("Enter your balance: ");
        balance = takeInput.nextDouble();
        BankAccount backAccount1 = new BankAccount(balance);
        System.out.println("The interest on amount is: "+backAccount1.calculateInterest());
    }
}
