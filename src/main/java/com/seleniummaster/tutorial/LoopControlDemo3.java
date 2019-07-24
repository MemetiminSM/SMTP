package com.seleniummaster.tutorial;

public class LoopControlDemo3 {
    public static void main(String[] args) {

//for loop
        //example 1 (find the sum of the number from 1 to 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Total sum: " + sum);

        //example 2 (find final balance)
        int rate = 5;
        double balance = 1000;
        int year = 10;
        for (int i = 1; i <= year; i++) {
            double interest = balance * rate / 100;
            balance = balance + interest;
            System.out.println(String.format("%d Year Balance %f", i, balance));
        }
        System.out.println("Final balance is " + balance);


    }
}
