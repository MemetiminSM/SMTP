package com.seleniummaster.tutorial;

        import java.util.Arrays;
        import java.util.Random;
        import java.util.Collections;

public class Week15ArrayExcerciseInclass {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        //Generates 10 Random Numbers in the range 1 -100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100 + 1);

        }
        System.out.println("Numbers Generated: " + Arrays.toString(numbers));
// sorting array by ascending order
        System.out.println("Int Array Elements in Ascending order:");
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        // Displaying elements of int Array
        System.out.println("Int Array Elements in reverse order:");
        for (int a = 0; a < numbers.length; a++)

            System.out.println(numbers[a]);

        //sorting by desceinding order
        System.out.println("Int Array Elements in descending order:");
        for (int a : numbers ) {

            System.out.print(a);
            System.out.print(" ");

        }
    }
}