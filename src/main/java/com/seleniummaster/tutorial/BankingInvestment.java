package com.seleniummaster.tutorial;

import java.util.Scanner;

public class BankingInvestment {

    public static void main(String[] args)
    {
        System.out.println("Enter Principal amount: ");
        Scanner principal=new Scanner(System.in);
        System.out.println("Enter Interest: ");
        Scanner interest=new Scanner(System.in);
        System.out.println("Enter Year: ");
        Scanner year=new Scanner(System.in);
        int P=principal.nextInt(); // investment
        int n=1;    //number of times for the interest
        float r=interest.nextFloat(); //interest rate
        int t=year.nextInt();       //number of years
        double A=P*Math.pow((1+r/n),n*t);  //compound interest calculation
        System.out.println(String.format("%.2f",A)); //two decimal digits
    }
}
