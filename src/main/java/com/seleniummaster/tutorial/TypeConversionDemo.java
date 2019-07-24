package com.seleniummaster.tutorial;
public class TypeConversionDemo {
       public static void main(String[] args)
    {
        //widening casting (implicit conversion)
        //byte->short->int->long->float->double
        //the target is larger than the source
        int x1=100;
        long l1=x1; //no type casting is required
        float f1=l1; //no type casting is required
        System.out.println("Int value: "+x1);
        System.out.println("Long value: "+ l1);
        System.out.println("Float value: "+f1);
        //narrowing casting (Explicit conversion)
        //double->float->long->int->short->byte
        long x2=20961;
        int i2=(int)x2; //type casting is required
        short s2= (short) i2; //type casting is required
        System.out.println("long value: "+x2);
        System.out.println("Int value: "+ i2);
        System.out.println("Short value: "+s2);
        //convert numerical string to number (int, long, float, double)
        String string1="1234er";
        int i=1234;
        long long1=Long.parseLong(string1); //convert numerical string to long data type
        float float1=Float.parseFloat(string1); //convert numerical string to float
        double double1=Double.parseDouble(string1); //convert numerical string to double



       // System.out.println(string1+" "+i);
        System.out.println(Integer.valueOf(string1)+i);
        System.out.println(Integer.parseInt(string1)+i);
        //Keith: 2468
        //Fei chen 2468
        System.out.println(long1+float1+double1); //3*1234=3702
         //Convert number to string
        int mynumber=985;
        float myfloatNumber= (float) 598.123456;
        String numberString=String.valueOf(mynumber); //convert number to String using String object
        String string2=String.valueOf(myfloatNumber); ///convert float to String
        System.out.println("The number is "+numberString);
        System.out.println("Float string is "+string2);


    }
}
