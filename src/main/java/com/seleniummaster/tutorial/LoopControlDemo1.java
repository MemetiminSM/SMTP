package com.seleniummaster.tutorial;

public class LoopControlDemo1 {
    public static void main(String[] args) {

//while loop example 1
        //keep executing the statement while the condition is true
        double balance = 1000;
        double targetBalance = 3000;
        int years = 0;
        int rate = 5;
        while (balance < targetBalance) {
            years++;
            double interest = balance * rate / 100;
            balance = balance + interest;
            System.out.println("year " + years + " balance: " + balance);
        }
        System.out.println("Final balance: " + balance);
        System.out.println("Total years: " + years);

        //while loop example 2
        int i = 0;
        int sum = 0;
        while (i < 10) {
            i++;
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
        }
        System.out.println(String.format("Sum of number 0 to %d is %d", i, sum));

    }
}
