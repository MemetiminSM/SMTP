package com.seleniummaster.classtutorial;

public class StudentPrintDemo {

    public static void main(String[] args) {

        //define an instance of the object
        StudentClass studentClass = new StudentClass();
        studentClass.firstName = "kadir";
        studentClass.lastNmae = "kasim";
        studentClass.gender = "male";
        studentClass.grade = 95.50;
        System.out.println(String.format("First Name: %s", studentClass.firstName));
        System.out.println(String.format("Last Name:  %s", studentClass.lastNmae));
        System.out.println(String.format("Gender:     %s", studentClass.gender));
        System.out.println(String.format("Grade:      %.2f", studentClass.grade));


    }

}
