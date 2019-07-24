package com.seleniummaster.tutorial;

public class NumericDemo {
    //define byte,short,int,long,double,float,boolean
    //we learn how to convert numbers to each other
    public static void main(String[] args) {
        //byte and byte operations
        byte a = 111;  byte b = 110;
        byte c = (byte)(a & b); //& symbol is for AND operation
        byte d=(byte) (a|b); //| symbol is for OR operation
        System.out.println(c); //and operation output
        System.out.println(d);  //or operation output
        //short operation
        short s1=3500; short s2=6000;
        short s3=(short)(s1+s2); //type casting
        System.out.println(String.format("%d+%d=%d",s1,s2,s3));
        System.out.println(String.format("%d   +    %d   =  %d",s1,s2,s3));
        //int operation
        int i1=10000000; int i2=20000000;
        System.out.println(String.format("%d - %d = %d",i1,i2,i1-i2));
        //long operation
        long l1=12345678901234567L;   long l2=9876543211234567L;
        long l3=l1+l2;
        System.out.println(l3);
        //float operation
        float f1=3.56666f;float f2=2.547788676f;
        System.out.println(String.format("%.2f+%.3f=%f",f1,f2,f1+f2));
        //double
        double d1=100.09;  double d2=2000.10;
        double d3=d1+d2;
        System.out.println(String.format("%.2f+%.2f=%.2f",d1,d2,d3));
        //boolean
        boolean b1=true;
        boolean b2=true; boolean b3=false;
        System.out.println(b1&&b2);
        System.out.println(b1&&b2&&b3); //&& represents logical AND
        System.out.println(b2||b3);     // || represents logic OR


    }

}
