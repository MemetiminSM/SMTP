package com.seleniummaster.tutorial;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo4 {
    public static void main(String[] args){
        List<String> names=new ArrayList<>();
        names.add("Danny");names.add("venus");
        names.add("halnur"); names.add("hetal");
        // add a name to a specific  position
        names.add(0,"emily");
        System.out.println(names.get(0));
        int i=names.indexOf("venus");
        names.set(i,"Information");
        System.out.println(names);
        for (String name:names){
            if (name.equalsIgnoreCase("venus"))
                System.out.println("Name  "+name+" Found");
            else
                System.out.println("Name "+ name+" not Found");
        }

        for (int j=0;j<names.size();j++)
        {

            System.out.println(String.format("Index %d Name %s ", j, names.get(j)));
        }

    }
}
