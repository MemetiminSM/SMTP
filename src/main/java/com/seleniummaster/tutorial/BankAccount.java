package com.seleniummaster.tutorial;

public class BankAccount {
    public int accountNumber;
    public double acountBalance;
    public double accountBalance;

    public double withdraw(double amount){
        acountBalance=acountBalance-amount;

        System.out.println("Balance"+String.valueOf(acountBalance));
        acountBalance=acountBalance-amount;
        return acountBalance;
    }

}
