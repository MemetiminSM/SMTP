package com.seleniummaster.tutorial;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {
    //Array list can grow and shrink as needed
      public static void main(String[] args)
       {
                   //find sum and average of an ArrayList
                   Integer[] evenNumbers=new Integer[]{2,4,6,8,8,2,8,10};
                   ArrayList<Integer> numberArrayList=new ArrayList<Integer>();
                   Collections.addAll(numberArrayList, evenNumbers);
                   double totalSum=0;
                   for(int number: numberArrayList)
                       {
                           totalSum=number+totalSum;
                       }
                 System.out.println("Total sum is "+totalSum);
                   System.out.println("Total item numbers are: "+numberArrayList.size());
                   System.out.println("Average number is "+totalSum/numberArrayList.size());

                   //find match
                   System.out.println("-- find match example ---");
                   int i=8;
                   int totalMatch=0;
                   for(int number: numberArrayList)
                       {
                           if(number==i)
                                   totalMatch=totalMatch+1;
                     }
                 System.out.println("Total match is "+totalMatch);
                   if(totalMatch==0)
                       {
                           System.out.println("No item is found with the value "+i);
                       }

                   //find max and min number
                   System.out.println("--- Print max number ---");
                   int maxNumber=numberArrayList.get(0);
                   for(int j=1;j<numberArrayList.size();j++)
                       {
                           int nextNumber=numberArrayList.get(j);
                           if(nextNumber>maxNumber)
                                   maxNumber=nextNumber;
                     }
                 System.out.println("Max number is "+maxNumber);
                   //print array list
                   System.out.println(numberArrayList.toString());
               }
}
