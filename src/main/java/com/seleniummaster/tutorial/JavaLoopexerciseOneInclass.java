package com.seleniummaster.tutorial;

public class JavaLoopexerciseOneInclass {

    public static void main(String[] args) {

        for (int i = 2; i <= 20; i = i + 2)

        {
            int square = i * i;
            System.out.println(String.format("the square of even numbers:%d sqaure:%d", i, square));
        }

    }

}


