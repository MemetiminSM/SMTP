package com.seleniummaster.tutorial;

import java.util.Scanner;

public class DecisionDemo4 {
    //Input a number from the console; if number>90, print A,
    //if 80=<number<90, print B, else print C

    public static void main(String[] args)
    {
        Scanner inputGrade=new Scanner(System.in);
        System.out.print("Please input a grade number : ");
        int grade=inputGrade.nextInt();
        if(grade<=60)
            System.out.println("You failed");
        else if(grade>=60 ) //&& symbol is AND
            System.out.println("Your grade is C");
        else if(grade>=70 )
            System.out.println("Your grade is B");
        else  if(grade>=80)
            System.out.println("your grade is A");
        else
            System.out.println("Your grade is D");
    }
}
