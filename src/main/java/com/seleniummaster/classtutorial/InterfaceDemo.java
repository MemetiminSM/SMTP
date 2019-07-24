package com.seleniummaster.classtutorial;

public interface InterfaceDemo {
    //objects define their interaction with the outside world through the methods that they expose.
    // Methods form the object's interface with the outside world;
    //A Java interface is a bit like a class, except a Java interface can only contain method signatures and fields.
    // An Java interface cannot contain an implementation of the methods,
    // only the signature (name, parameters and exceptions) of the method.
    double addTwoNumbers(double a, double b);
    double multiplyTwoNumbers(double a, double b);
    float divideTwoNumbers(double a, double b);
    double subtracTwoNumbers(double a, double b);
}
