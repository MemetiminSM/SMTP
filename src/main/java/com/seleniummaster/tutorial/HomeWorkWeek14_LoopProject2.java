package com.seleniummaster.tutorial;

public class HomeWorkWeek14_LoopProject2 {
    public static void main(String[] args) {
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 500; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 500; i++) {
            if (i % 5 == 0) System.out.print(i + ", ");
        }

        System.out.println("\n\nDivided by 15: ");
        for (int i = 1; i < 500; i++) {
            if (i % 15 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("\n\nDivided by 3&&5 &&15");
        for (int i = 1; i < 500; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0)
                System.out.print(i + ",");
        }
    }
}
