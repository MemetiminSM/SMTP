package com.seleniummaster.tutorial;

import java.util.Scanner;

public class DataTypeDemo {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println(" Please enter the number ");
        int num1 = name.nextInt();
        System.out.println(" Please enter the second number");
        int num2 = name.nextInt();
        int ans=num1+num2;

            System.out.print(String.format("%d+%d=%d",num1,num2,ans));



    }
    }
