package com.seleniummaster.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

//Create a new array list
        ArrayList<String> names = new ArrayList<String>();
        //Add items
        names.add("Bob");
        names.add("Smith");
        names.add("Mike");
        names.add("Jordan");
        //Set 2nd item
        names.set(1, "Emily");
        //get total size
        System.out.println("Total items: " + names.size());
        //Loop through items and print
        for (String name : names) {
            System.out.println(name);
        }
        //remove first item and print
        System.out.println("---- removed 1st element ---- ");
        names.remove(0);
        for (String name : names) {
            System.out.println(name);
        }
        //get specific element
        System.out.println("The second person is " + names.get(1));
        //Convert Array to ArrayList
        System.out.println("--- print number ---");
        Integer[] evenNumbers = new Integer[]{2, 4, 6, 8, 10};
        List<Integer> numberArrayList = new ArrayList<Integer>();
        numberArrayList = Arrays.asList(evenNumbers);
        for (int number : numberArrayList) {
            System.out.println(number);
        }

    }
}
