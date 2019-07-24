package com.seleniummaster.tutorial;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListDemo5 {
    public static void main(String[] args){
        int[] evenNumbers=new int[]{2,4,6,8,10,12};
        List<Integer> numberList=new ArrayList<>();
        for(int number: evenNumbers)
        {
            numberList.add(number);
        }
        System.out.println(numberList);
        //converting array to array list
        Integer[] evenNumbers2=new Integer[]{10,12,14,16,18,20};

        List<Integer> numberList2= Arrays.asList(evenNumbers2);

        System.out.println(numberList2);
        //remove
        numberList2.remove(0);
        System.out.println(numberList2);

        }
}
