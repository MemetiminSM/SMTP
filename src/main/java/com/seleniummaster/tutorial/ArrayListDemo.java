package com.seleniummaster.tutorial;

import java.util.ArrayList;

public class ArrayListDemo {

//create an array list to hold new students
    //print each student name on a separate list
    public static void main(String[] args)
    {
      //define an array list for holding student name
        ArrayList<String> students=new ArrayList<>();
        students.add("kadir");
        students.add("irfan");
        students.add("feichen");
        //print total size (total elements in the array list)
        System.out.println(students.size());
        //set end element name as emily
        students.set(1,"emily");
        System.out.println("Total size after adding emily"+students.size());
        students.add(1,"Mike");
        System.out.println("Total size after adding Mike"+students.size());
        System.out.println(students);
        //to access each element on array list, we can use for each loop
        for (String name: students)
        {
            System.out.println(name);
        }
//to access each element on array list, we can use index
        //verify that emily is on the list
        for (int i=0;i<students.size();i++){
            if (students.get(i).equalsIgnoreCase("emily"))
            System.out.println(students.get(i));


        }
    }


}