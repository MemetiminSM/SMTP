package com.seleniummaster.classtutorial;

public class PolymorphismClassY extends PolymorphismClassX{
     /*
        Polymorphism is the ability of an object to take on many forms.
        Subclasses of a class can define their own unique behaviors and
        yet share some of the same functionality of the parent class.

       static polymorphism is achieved through method overloading. Method overloading means there are several
       methods present in a class having the same name but different types/order/number of parameters.

       Dynamic Polymorphism: Suppose a sub class overrides a particular method of the super class.

        */
    public void methodA()
    {
                System.out.println("This is method A of class Y");
            }
}
