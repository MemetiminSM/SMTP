package com.seleniummaster.tutorial;

import java.util.Scanner;

public class DecisionDemo7 {

    //use boolean expression for decision making

    public static void main(String[] args)
    {
        System.out.println("Please enter  an amount ");
        Scanner scanner=new Scanner(System.in);
        int myAmount=scanner.nextInt();
        int accountBalance=1000;

       accountBalance=myAmount<accountBalance?accountBalance-myAmount:accountBalance; //boolean expression
       System.out.println("Account Balance "+accountBalance);
        /*
        if(myAmount<accountBalance)
            System.out.println("My balance is "+String.valueOf(accountBalance-myAmount));
        else
            System.out.println("My balance is "+accountBalance);
*/
    }
}
