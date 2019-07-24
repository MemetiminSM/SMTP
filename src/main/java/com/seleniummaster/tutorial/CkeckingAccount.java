package com.seleniummaster.tutorial;

public class CkeckingAccount extends BankAccount {
    public CkeckingAccount(double balance)
    {
        super.accountBalance=balance;
    }

    public CkeckingAccount() {

    }

    public double withdraw(double amount)
    {
        double fee=0.01;
        super.accountBalance=super.accountBalance-amount-amount*fee;
        System.out.println("Balance "+String.valueOf(super.accountBalance));
        return super.accountBalance;
    }
}
