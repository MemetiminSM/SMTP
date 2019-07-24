package com.seleniummaster.tutorial;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
//calculate the sum of numbers from 1 to 100;
        //1+2+3+4+5+6+......... +100
        //Input the max number from the console
        System.out.print("Please enter your integer limit number? ");
        Scanner inputNumber = new Scanner(System.in);
        int limit = inputNumber.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= limit) {
            sum = sum + i;
            System.out.println("i=" + i + "       sum=" + sum);
            i++;
        }
        System.out.println("total sum is " + sum);

        //ForLoopDemo

        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= row; col++) {
                int multiply = row * col;
                System.out.print(String.format("%d*%d=%d  ", row, col, multiply));
            }
            System.out.println("");
        }
    }
}


