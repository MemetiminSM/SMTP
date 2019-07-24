package com.seleniummaster.classtutorial;

public class Student {
    private  String firstname;
    private String  lastname;
    private  String classname;
    private  String  major;
    private  String  gender;

    public Student(int i, String ahmed, String mohamed, String m, int i1) {
    }

    public Student() {

    }
    //generate get and set methods

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
