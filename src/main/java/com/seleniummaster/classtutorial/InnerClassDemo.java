package com.seleniummaster.classtutorial;

public class InnerClassDemo {
    private String variable1="TestAutomation";
public static void main(String[] args) {


//call method2
    InnerClassB.method2();

    //call method1

    InnerClassDemo innerClassDemo=new InnerClassDemo();


}
    //non static inner class

    class InnerClassA{
        public void method1(){
            System.out.println("This is method1 of inner classA");

        }


    }
    //static inner class
    static class InnerClassB{

        public static void method2()
        {

            System.out.println("This is method2 of iiner classB");

        }
    }
}
