package com.seleniummaster.classtutorial;

import java.util.ArrayList;

public class ProductInformation {
    public static void main(String[] args){


//Product productinfo=new Product();

        ArrayList<Product> productsinfo=new ArrayList<>();

productsinfo.add(new Product("Dell","Precision",5000));
productsinfo.add(new Product("Window","PC",599.99));


    for (Product eachproduct:productsinfo)  {

        System.out.println(String.format("%s,%s,%.2f",eachproduct.getName(),eachproduct.getCategory(),eachproduct.getPrice()));

        }
        //reduce their price 50 dollars
for (Product eachproduct:productsinfo){
eachproduct.reduceprice(50);
    System.out.println("reduced price: $50");
}

    }
}
