package com.seleniummaster.tutorial;
import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args)
    {
        System.out.println("Please input a radius of a circle");
        Scanner inputNumber=new Scanner(System.in);
        //define a radius of the circle
        int r=inputNumber.nextInt();
        double circleArea=Math.PI*r*r;

        System.out.println(String.format("The area of a circle with radius %d is %.2f",r,circleArea));
    }
}
