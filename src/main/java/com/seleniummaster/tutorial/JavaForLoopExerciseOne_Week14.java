package com.seleniummaster.tutorial;

import java.util.Scanner;

public class JavaForLoopExerciseOne_Week14 {
    public static void main(String[] args) {

        //define limit
        int limit = 20;
        System.out.println("Printing Square of Even numbers between 1 and " + limit);
        for (int i = 1; i <= limit; i++) {
            // if the number is divisible by 2 then it is even
            if (i % 2 == 0) {
                System.out.println(+i * i);
            }
        }
    }
}
