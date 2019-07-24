package com.seleniummaster.tutorial;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsDemo {
    //Set is unordered collections
    //Set models the mathematical set abstraction.
    //A set is Collection that cannot contain duplicate elements.
    //Set has its implementation in various classes like HashSet, TreeSet, LinkedHashSet
    public static void main(String[] args) {
        Set<String> states = new HashSet<String>();
        states.add("Washington");
        states.add("Maryland");
        states.add("Virginia");
        states.add("Ohio");
        states.add("New York");
        states.add("New York");
        //states.add("New York");
        System.out.println("Set size is " + states.size());
        //iterate set
        Iterator<String> iterator = states.iterator();
        while (iterator.hasNext()) {
            String state = iterator.next();
            System.out.println(state);
        }
        //use for loop to print
        System.out.println(" ---- use for loop to print states ---");
        for (String state : states) {
            System.out.println(state);
        }

    }
}
