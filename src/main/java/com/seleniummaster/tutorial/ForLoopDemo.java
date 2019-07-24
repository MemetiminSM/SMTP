package com.seleniummaster.tutorial;

public class ForLoopDemo {
    //write a java code to calculate the sum of numbers from 1 to 100
//exit if the sum is greater than 3000;
    public static void main(String[] args) {

       int sum=0;
       for (int i=1;i<=100;i++)
        {

          sum=sum+i;

            System.out.println(String.format("Number: %d sum: %d",i,sum));

if (sum>=3000)
    break;

        }
        System.out.println(String.format("the total sum is " +sum));


    }
}
