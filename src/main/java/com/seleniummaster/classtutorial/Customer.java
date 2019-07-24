package com.seleniummaster.classtutorial;

public class Customer {
    public String customerName;
    public String customerAddress;
    public int customerAccount;
    public String customerType;

    public Customer() {
    }

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public Customer(String customerName, String customerAddress) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Customer(String customerName, String customerAddress, int customerAccount, String customerType) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerAccount = customerAccount;
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public int getCustomerAccount() {
        return customerAccount;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void displayCustomer(String customerName) {

        System.out.println(customerName);
    }

    public void displayCustomer(String customerName, String customerAddress) {

        System.out.println(customerName + " " + customerAddress);
    }

    public void displayCustomer(String customerName, String customerAddress, int customerAccount, String customerType) {

        System.out.println(customerName + " " + customerAddress + " " + customerAccount + " " + customerType);
    }
}

