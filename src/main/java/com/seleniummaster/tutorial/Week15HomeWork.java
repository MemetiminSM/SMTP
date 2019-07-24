package com.seleniummaster.tutorial;


import java.util.Arrays;

import java.util.Random;
import java.util.stream.*;
import static java.util.Arrays.*;
public class Week15HomeWork {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ints = random.ints(30, 0, 100).sorted().toArray();
        int[] even = IntStream.of(ints).filter(x -> x % 2 == 0).toArray();
        int[] odd = IntStream.of(ints).filter(x -> x % 2 == 1).toArray();
        System.out.print("\nEVEN : ");
        System.out.println(Arrays.toString(even));
        System.out.print("\ntotal: ");
        System.out.println(even.length);
        System.out.print("\nOdd: ");
        System.out.println(Arrays.toString(odd));
        System.out.print("\ntotal: ");
        System.out.println(odd.length);
        //Count all the numbers that are divided by three and print the total count;
        int[] a = IntStream.of(ints).filter(x -> x % 3 == 0).toArray();
        System.out.print("\nThe Number of Three's Folder : ");
        System.out.println(Arrays.toString(a));
        //
        //print out the content using for each loop
        int sum = 0;
        for (int i : ints) {
            System.out.print(i);
            sum = sum + i;
            System.out.print(" ,");

        }
        System.out.println("\n");
        System.out.println(String.format("Total Sum is %d", sum));
//average
        System.out.println(String.format("Average is %d", sum / ints.length));
        // sorting array by ascending order
        System.out.println("Int Array Elements in Ascending Order:");
        sort(ints);
        System.out.println(Arrays.toString(ints));
        //descending order
        System.out.print("Descending Order:");
        // take input as 10 to print descending order

        for (int c = 0; c < ints.length; c++)    // condition for print descending order
        {
            for (int j = c + 1; j < ints.length; j++) {
                if (ints[c] < ints[j]) {
                    int temp = ints[c];
                    ints[c] = ints[j];
                    ints[j] = temp;
                }
            }

            System.out.print("," + ints[c]);

        }
    }
}