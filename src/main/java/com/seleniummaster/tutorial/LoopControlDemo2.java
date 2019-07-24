package com.seleniummaster.tutorial;

public class LoopControlDemo2 {
    public static void main(String[] args) {
//do while loop example 1
        //you want to execute the body of a loop at least once and perform the loop test after the body execution
        double balance = 1000;
        double targetBalance = 2000;
        int years = 0;
        int rate = 5;
        do {
            years++;
            double interest = balance * rate / 100;
            balance = balance + interest;
            System.out.println("years: " + years + "  interest " + interest + "           balance: " + balance);
        }
        while (balance < targetBalance);
        System.out.println("Final balance: " + balance);
        System.out.println("Total years: " + years);

        //do while loop example 2
        System.out.println("This is the 2nd example for the do while loop");
        int i = 100;
        int n = 0;
        int j;
        do {
            n++;
            i = i / 2;
            j = i;
            System.out.println("j=" + j);
        }
        while (j > 1);
        System.out.println(String.format("Divide number 100 by %d times until the number is greater than 1", n));

    }
}
