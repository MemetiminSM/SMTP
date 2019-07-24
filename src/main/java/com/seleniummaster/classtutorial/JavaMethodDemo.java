package com.seleniummaster.classtutorial;

public class JavaMethodDemo {

    //define a method to calucla area of a rectangle
    //define a method to sum numbers from 1 to 100
    //define a method to print one line rgument
    //run all methods in your main method

    public static void main(String[] args){

        JavaMethodDemo myDemo=new JavaMethodDemo();
        myDemo.rectangleArea(10,5);
        myDemo.rectangleArea(5,6);

        //call the static method
        JavaMethodDemo.numbersSum();

    }
    private void rectangleArea(int width,int lenght) {


        int area = width * lenght;
        System.out.println(String.format("area of a rectangle %d by %d is %d", width, lenght, area));
    }
      private static void numbersSum(){
        int sum=0;
        for (int i=1;i<=100;i++){

         sum=sum+i;

        }
          System.out.println("sum of the numbers from 1 to 100 is"+sum);

      }

      private void printstatement(String statementTOprint)
      {

          System.out.println(statementTOprint);
      }

    }

