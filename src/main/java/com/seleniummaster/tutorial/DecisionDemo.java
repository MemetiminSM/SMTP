package com.seleniummaster.tutorial;
import java.util.Scanner;
public class DecisionDemo {

    public static void main(String[] args)
    {
        //ATM transaction ,
        // input amount on the console, if amount<balance,
        //withdraw money, else system prints message
        int accountBalance=2000;
        Scanner inputAmount=new Scanner(System.in);
        System.out.print("Please enter the amount to withdraw: ");
        int withdrawAmount=inputAmount.nextInt();
        if(withdrawAmount<accountBalance)
        {
            accountBalance=accountBalance-withdrawAmount;
            System.out.println("Your balance is "+accountBalance);
        }
                else
        {
            System.out.println("You do not have sufficient fund in your account");
            System.out.println("Your balance is "+accountBalance);
        }

    }
}
