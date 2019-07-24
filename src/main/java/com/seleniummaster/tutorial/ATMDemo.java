package com.seleniummaster.tutorial;

public class ATMDemo {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.accountNumber=123456779;
        bankAccount.acountBalance=500000;
        bankAccount.withdraw(10000);
        //let's use checking account
        BankAccount checkingAccount=new CkeckingAccount();
        checkingAccount.withdraw(1000);
    }
}
