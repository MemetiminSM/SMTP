package com.seleniummaster.tutorial;

public class PrintDemo {

    public static void main(String[] args)
    {
        System.out.print("line1"); //print is on the same line output
        System.out.print(" line 2");
        System.out.print(" line 22\n"); // represents next line

        System.out.println("line 3"); //println will be print then move next line
        System.out.println(String.format("%s","line4")); //%s is a place holder
    }
}
