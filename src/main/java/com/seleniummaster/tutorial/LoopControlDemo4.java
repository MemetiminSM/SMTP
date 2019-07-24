package com.seleniummaster.tutorial;

public class LoopControlDemo4 {
    public static void main(String[] args) {


//nested for loop example 1
        System.out.println("Nested for loop example 1");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //nested for loop example 2
        System.out.println();
        System.out.println("Nested for loop example 2");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //nested for loop example 3
        System.out.println("Nested for loop example 3");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
