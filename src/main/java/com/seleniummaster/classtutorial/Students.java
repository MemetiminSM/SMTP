package com.seleniummaster.classtutorial;

import java.util.ArrayList;

public class Students extends Person {
    private String grade;
    private String major;
    private String schoolName;
    private String schoolLocation;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation;
    }

    public static void main(String[] args) {
        // adding of first Student
        Students student1 = new Students();
        student1.setFirstName("Alim");
        student1.setLastName("ibrahim");
        student1.setSchoolName("King's college");
        student1.setGrade("second");
        student1.setMajor("Biology");
        student1.setCity("Toronto");
        student1.setSchoolLocation("DownTown");
        student1.setStreetAddress("101 college street");
        student1.setCountry("Canada");
        student1.setState("Ontario");
        //adding of second student

        Students student2 = new Students();
        student2.setFirstName("Ali");
        student2.setLastName("Riza");
        student2.setSchoolName("University of Toronto");
        student2.setGrade("Third");
        student2.setMajor("Information Technology");
        student2.setCity("Toronto");
        student2.setSchoolLocation("Suburb");
        student2.setStreetAddress("790 don mills street");
        student2.setCountry("Canada");
        student2.setState("Ontario");

        ArrayList<Students> Allstudents = new ArrayList<>();

        Allstudents.add(student1);
        Allstudents.add(student2);
        for (Students eachgraduateStudent : Allstudents) {

            System.out.println(eachgraduateStudent.getFirstName() + " " + eachgraduateStudent.getLastName() + " " + eachgraduateStudent.getSchoolName() + " ");
            System.out.println(eachgraduateStudent.getMajor());
            System.out.println(eachgraduateStudent.getSchoolLocation());
            System.out.println(eachgraduateStudent.getGrade());
            System.out.println(eachgraduateStudent.getStreetAddress());
            System.out.println(eachgraduateStudent.getCity());
            System.out.println(eachgraduateStudent.getState());
            System.out.println(eachgraduateStudent.getCountry());

        }
    }
}