package com.seleniummaster.tutorial;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class DecisionDemo3 {
    //Input a number from the console; if number>90, print A,
    //if 80=<number<90, print B, else print C

    public static void main(String[] args)
    {
        Scanner inputGrade=new Scanner(System.in);
        System.out.print("Please input a grade number : ");
        int grade=inputGrade.nextInt();
        if(grade>=90)
            System.out.println("Your grade is A");
        else if(grade>=80 && grade<90) //&& symbol is AND
            System.out.println("Your grade is B");
        else if(grade>=70 && grade<80)
            System.out.println("Your grade is C");
        else
            System.out.println("You failed");
    }
}
