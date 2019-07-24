package com.seleniummaster.classtutorial;

public class ExceptionDemo {
    public static void main(String[] args)  {

      int a=10;
      int b=0;
      try {


          float c = a / b;

          System.out.println("Division value is " + c);
      }
      catch (ArithmeticException e){

          e.printStackTrace();
      }
      finally {
          System.out.println("you can not divide any number by 0");
          System.out.println("continue");
      }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("this is example of try catch finally statement");

    }
}
