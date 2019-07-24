package com.seleniummaster.tutorial;
import org.metawidget.util.simple.StringUtils;
import java.util.Locale;
public class StringDemo {
    public static void main(String[] args)
    {
        //define a string; convert string to uppercase, lowercase, camelcase
        //concatenate (join)  two or more strings; add string; get substring; search a string
        //convert numbers to string;
        String greeting;
        greeting="Hello, Selenium Master; this is a java string";
        System.out.println(greeting.toUpperCase());
        System.out.println(StringUtils.camelCase(greeting));
        System.out.println(greeting.toLowerCase());
        String string1="Hello"; String string2="Students";
        //join strings
        System.out.println(string1.concat(string2));
        System.out.println(string1+" "+string2+" This is java course\n"+ " are you ready? ");
        //use symbols to format output
        System.out.println("I\t"+"am\t"+"learning\t"+"java");
        System.out.println("I\n"+"am\n"+"learning\n"+"java");
        System.out.println(greeting.substring(7,15));
        System.out.println(greeting.contains("Selenium")); //returns true if found, or else false

    }
}
