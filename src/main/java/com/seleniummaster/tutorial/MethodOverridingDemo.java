package com.seleniummaster.tutorial;

public class MethodOverridingDemo {
    public static void main(String[] args) {
        //use classA to print information
        ClassA classA=new ClassA();
        classA.printMessage();
        //
        ClassA myClass=new ClassB();
        myClass.printMessage();
    }
}
