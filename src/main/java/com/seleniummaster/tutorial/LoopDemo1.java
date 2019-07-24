package com.seleniummaster.tutorial;

public class LoopDemo1 {
    //write a java code to calculate your investment return
    //your initial investment is 10,000;
    //your annual return is 5%
    //your target balance is 30,000;
    //after how many years, would you reach your target?

    public static void main(String[] args) {


        double balance = 10000;
        double targetBalance = 30000;
        int rate = 5;
        int year = 0;
        while (balance <= targetBalance)
        {
            year++;
            double investment = balance * rate / 100;
            balance = balance + investment;
            System.out.println(String.format("Year %d Investment %f", year, investment));

        }

        System.out.println(String.format("Final balance %f", balance));
        System.out.println(String.format("Total years: %d" ,year));


    }
}
