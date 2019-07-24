package com.seleniummaster.classtutorial;

public class BankInformation {
    //assign value to a bank object and print the information

    public static void main(String[] args){
       //define an instance of bank object
       Bank citiBank=new Bank();
       //assigne value to instance reference
        citiBank.name="Selenium Master LLC";
        citiBank.accountNumber=1111111111;
        citiBank.balance=2000000;

        System.out.println(String.format("%s %s %s",citiBank.name,citiBank.accountNumber,citiBank.balance));
    }
}
