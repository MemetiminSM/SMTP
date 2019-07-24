package com.seleniummaster.tutorial;

import java.util.Arrays;
import java.util.List;

public class StringToArrayList {
    public static void main(String[] args) {
        String name="[Danny, Hetal, Dolkun, Venus, Wali]";
        name=name.replace("[",""); //remove open [
        name=name.replace("]",""); //remove close ]
        System.out.println(name);
        String[] names=name.split(","); //convert String to array
        List<String> nameList= Arrays.asList(name); //Convert Array to ArrayList
        System.out.println(nameList);
    }
}
