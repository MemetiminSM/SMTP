package com.seleniummaster.tutorial;

public class StringDemo2 {
    public static void main(String[] args){

String Address="Main Street";
String City="Columbia";
String State="MD";
int ZipCode=20146;
String FullAddress=String.format("My full Address is:%s,%s,%s,%d ", Address,City,State,ZipCode);
        System.out.println( FullAddress+".");

    }
}
