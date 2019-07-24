package com.seleniummaster.tutorial;
import java.util.Scanner;
public class NumberExample {
    //Enter a number from the console
    //divide the number by 2, if the remainder is 0, print even number, or odd number
    public static void main(String[] args) {
        //define a scanner object to accept input from the console
        Scanner myNumber = new Scanner(System.in);
        System.out.print("Please input a number: ");
        // % symbol is for getting remainder
        int x = myNumber.nextInt();
        if (x % 2 == 0)
            System.out.println(x + " is an even number");
        else
            System.out.println(x + " is an odd number");
    }
}
