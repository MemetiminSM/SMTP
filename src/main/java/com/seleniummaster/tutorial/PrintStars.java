package com.seleniummaster.tutorial;

import java.util.Scanner;

public class PrintStars {

    public static void main(String[] args) {
        System.out.println("Please inter the number of rows you want to print: ");
        Scanner row=new Scanner(System.in);
        int totalRows=row.nextInt();

        for (int x = 1; x < totalRows+1; x++){
            for (int y = 0; y<Math.pow(2,x); y++){
                System.out.print("[]");
            }
            System.out.println("\n");
        }
    }
}
