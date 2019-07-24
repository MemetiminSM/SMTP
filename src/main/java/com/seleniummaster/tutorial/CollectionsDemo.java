package com.seleniummaster.tutorial;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
public class CollectionsDemo {
    public static void main(String[] args){

//use collections to find min and max numbers
                  int[] numbers = new int[]{3, 2, 5, 6, 3, 6, 10, 20, 1, 25, 30, 50};
                   Set<Integer> set1 = new TreeSet<Integer>();
                  for (int i = 0; i < numbers.length; i++)
                           set1.add(numbers[i]);
                  System.out.println("Min value is " + Collections.min(set1));
                             System.out.println("Max value is " + Collections.max(set1));

                   //use collections to sort String
                   String[] students=new String[]{"Mike","Jason","Bob","Emily","Adam"};
                   Set<String> set2=new TreeSet<String>();
                   for(int j=0;j<students.length;j++)
                       set2.add(students[j]);
        System.out.println("Min alphabet name is " + Collections.min(set2,String.CASE_INSENSITIVE_ORDER));
                   System.out.println("Max alphabet is " + Collections.max(set2,String.CASE_INSENSITIVE_ORDER));

    }
}
