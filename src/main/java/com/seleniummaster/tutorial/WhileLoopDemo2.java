package com.seleniummaster.tutorial;

public class WhileLoopDemo2 {
    //A user has a loan amount 400000;
    //the user makes payment of 2000 each month
    //how many months the user can payoff the loan amount?
    public static void main(String[] args) {

        double loanAmount = 400000;
        double monthlyPayment = 2000;
        double myPayment = 0;
        int month = 0;
        do {
            month++;
            myPayment = monthlyPayment * month;
            System.out.println("Month=" + month + "    Payment=" + myPayment);
        } while (myPayment <= loanAmount);


        System.out.println("Total month to payoff: " + month);
    }
}
