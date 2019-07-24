package com.seleniummaster.tutorial;

public class DecisionDemo8 {

    //boolean expression
    public static void main(String[] args) {
        int x = 15;
        int y = 20;
        int z;
        z = x > y ? x : y; //boolean expression
        System.out.println(z);
        if(x>y)
            System.out.println("z="+x);
        else
            System.out.println("z="+y);

    }

}
