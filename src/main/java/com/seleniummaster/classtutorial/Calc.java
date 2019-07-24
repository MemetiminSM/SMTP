package com.seleniummaster.classtutorial;

public class Calc {
    public static void main(String[] args){

       MethodOverloadingDemo calcDemo=new MethodOverloadingDemo();
       int[] myArray=new int[]{10,12,11,20,40};
       //print the sum of multiple numbersi in an array
        System.out.println(calcDemo.addNumbers(myArray));
        System.out.println(calcDemo.addNumbers(10,30));
        System.out.println(calcDemo.addNumbers(2.5,3.5));
        System.out.println(calcDemo.addNumbers(10000000000L,200000000L));
    }
}
