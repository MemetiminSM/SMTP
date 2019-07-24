package com.seleniummaster.tutorial;
import java.util.Scanner;

public class DecisionDemo5 {

    //if I enter "selenium22", what is the output of the code below?

    public static void main(String[] args)
    {
       String a="selenium22";
       String b="selenium2";
       Scanner input=new Scanner(System.in);
       String myString=input.nextLine();
       if(myString.contains(a))
           System.out.println("You entered selenium22");
       else if(myString.contains(b))
           System.out.println("You entered selenium2");
       else
           System.out.println("You entered something else");
    }
}
