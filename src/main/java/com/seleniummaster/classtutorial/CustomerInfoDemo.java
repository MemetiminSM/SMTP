package com.seleniummaster.classtutorial;

import java.util.ArrayList;

public class CustomerInfoDemo {
    public static void main(String[] args){

      // Customer  customer1=new Customer();
        ArrayList<Customer> customer1=new ArrayList<>();

        customer1.add(new Customer("keith","Maryland",30000000,"regular"));
        customer1.add(new Customer("KADIR","Maryland",4000000,"rare"));
        customer1.add(new Customer("Jay","Maryland",5000000,"regular"));
        customer1.add(new Customer("Halnur","Maryland",4000000,"regular"));

        for (Customer eachcustomer:customer1){

            // System.out.println(String.format("%s,%s,%d,%s",eachcustomer.customerName,eachcustomer.customerAddress,eachcustomer.customerAccount,eachcustomer.customerType));
            //print name and address
            eachcustomer.displayCustomer(eachcustomer.getCustomerName(),eachcustomer.getCustomerAddress());
        }
        //print name, address,account,type
        for (Customer eachcustomer:customer1){
           eachcustomer.displayCustomer(eachcustomer.getCustomerName(),eachcustomer.getCustomerAddress(),eachcustomer.customerAccount,eachcustomer.getCustomerType());

        }
    }
}
