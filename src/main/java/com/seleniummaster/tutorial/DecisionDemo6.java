package com.seleniummaster.tutorial;

import java.util.Scanner;

public class DecisionDemo6 {
    //input a number from the console
    //if the number>0 && number%2==0 print even number, else print "enter positive number"
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int myNumber = number.nextInt();
        if (myNumber > 0) {
            if (myNumber % 2 == 0)
                System.out.println("This number " + myNumber + " is an even number");
            else
                System.out.println("This number "+ myNumber +" is an odd number");
        } else
            System.out.println("Please enter a positive number");
    }

}
