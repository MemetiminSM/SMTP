package com.seleniummaster.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo2 {
    //array and array list conversion
    //remove intem from an array list
    public static void main(String[] args){

       Integer[] evenNumber=new Integer[]{2,4,6,8,10,12};
        List<Integer> numberList;
        numberList= Arrays.asList(evenNumber);
        //
        ArrayList<Integer> allnumber=new ArrayList<>();
        allnumber.addAll(numberList);
        allnumber.add(14);
        allnumber.add(16);

      //  numberList.add(14);numberList.add(16);
        for (int i:allnumber)
        {

            System.out.println(i);

        }

//remove first two items from the list
        allnumber.remove(0);
        allnumber.remove(0);
        for (int i: allnumber)
        {
            System.out.print(i);
            System.out.print("  ");
        }

    }
}
