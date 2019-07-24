package com.seleniummaster.classtutorial;

public class PolymorphismDemoTest {
    public static void main(String[] args)
    {
        //create an instance of PolymorphismClassX
                PolymorphismClassX classX=new PolymorphismClassX();
                //create an instance of PolymorphismClassY
                PolymorphismClassY classY=new PolymorphismClassY();

                classX.methodA();
                classY.methodA();
            }
   }
