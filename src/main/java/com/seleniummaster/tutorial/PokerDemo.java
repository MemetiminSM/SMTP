package com.seleniummaster.tutorial;
import org.apache.commons.lang.StringUtils;
import java.util.Scanner;
public class PokerDemo {
    public static void main(String[] args) {
        Scanner poker = new Scanner(System.in);
        System.out.print("Please enter a poker symbol: ");
        String symbol = poker.nextLine().toUpperCase();
        //if the string is numeric
        if (StringUtils.isNumeric(symbol)) {
            if(Integer.parseInt(symbol)>=2 && Integer.parseInt(symbol)<=10)
            System.out.println(symbol);
            else
                System.out.println("Please input a poker value from 2 to 10");
        } else {
            switch (symbol) {
                case "A":
                    System.out.println("Ace");
                    break;
                case "J":
                    System.out.println("Jack");
                    break;
                case "D":
                    System.out.println("Dimonds");
                    break;
                case "Q":
                    System.out.println("Queen");
                case "H":
                    System.out.println("Heart");
                    break;
                case "C":
                    System.out.println("Club");
                case "S":
                    System.out.println("Spade");
                default:
                    System.out.println("Please input a valid poker");
            }
        }
    }
}
