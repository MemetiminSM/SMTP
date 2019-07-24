package com.seleniummaster.tutorial;
import java.util.Random;
public class SumAndAver5random {
    public static void main(String[] args) {
        Random r = new Random();
        double sum = 0; //
        int amount = 5;
        int Bound = 50;
        for (int i = 0; i < amount; i++) {
            int next = r.nextInt(Bound) + 1;
            System.out.println(next);
            sum += next; // accumulate sum of all random numbers
        }
        System.out.println("your sum of five random numbers is :" + sum);
        System.out.println("Your average is: " + (sum / amount));
        }
}
