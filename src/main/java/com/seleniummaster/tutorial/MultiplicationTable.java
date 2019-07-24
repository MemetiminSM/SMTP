package com.seleniummaster.tutorial;

public class MultiplicationTable {
    public static void main(String[] args) {

        //Write a java code to print multiplication table
        //define row

        for (int i = 1; i<= 9; i=i++)

        {

            //define column
            for (int j= 1; j<= 1; j++)

            {

                System.out.println(String.format("%d*%d=%d  ", i, j, i * j));


            }

            System.out.println("");

        }
    }

}



