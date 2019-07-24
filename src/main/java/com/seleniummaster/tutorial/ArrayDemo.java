package com.seleniummaster.tutorial;

public class ArrayDemo {
    //define an array that contains 10 numbers and then
    //find the sum of the numbers
    public static void main(String[] args) {
        //define an array of integer type
        int[] numbers = new int[10];
        //set the value of each element individually
        numbers[0] = 1;
        numbers[1] = 4;
        numbers[2] = 10;
        numbers[3] = 15;
        numbers[4] = 20;
        //set the value together
        numbers = new int[]{1, 4, 10, 15, 20, 30, 56, 78, 90, 95};

        System.out.println("the size of the array is" + numbers.length);

        //print out the content using for each loop
        int sum = 0;
        for (int i : numbers) {
            System.out.print(i);
            sum = sum + i;
            System.out.print(" ");

        }
        System.out.println(String.format("sum is %d", sum));
        //read each element of an array using array index(0 to array length-1)

        int totalNumbers = numbers.length;
        for (int i = 0; i < totalNumbers; i++) {
            System.out.println(numbers[i]);
            System.out.print(" ");
        }
//two dimensional array
        //i hava two rows and two columns of seats for assigning to people
        int rows = 2;
        int columns = 2;
        String[][] seats = new String[rows][columns];
        seats = new String[][]
                {
                        {"Mike", "Bob"}, {"Emily", "Jake"}

                };
        //  System.out.println("Total seats:" +rows*columns);
        // seats[0][0]="Mike";
        //seats[0][1]="Bob";
        //seats[1][0]="Emily";
        // seats[1][1]="Jake";
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (seats[r][c] == null)
                    System.out.println(String.format("seat %d row %d column is unassigned", r, c));
                else
                    System.out.println(String.format("seat is %d row %d column is assigned", r, c));


            }
        }

    }
}