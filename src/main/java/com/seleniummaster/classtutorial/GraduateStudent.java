package com.seleniummaster.classtutorial;

import java.util.ArrayList;

public class GraduateStudent extends Student {
    private String researchField;
    private String advisorName;

    public GraduateStudent(int i, String ahmed, String mohamed, String m, int i1, String researchField, String advisorName) {
        super(i, ahmed, mohamed, m, i1);
        this.researchField = researchField;
        this.advisorName = advisorName;
    }

    public GraduateStudent() {
        super();
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    public static void main(String[] args) {

        GraduateStudent graduateStudent1 = new GraduateStudent();
        graduateStudent1.setFirstname("Mike");
        graduateStudent1.setLastname("Smith");
        graduateStudent1.setMajor("Software Engineer");
        graduateStudent1.setClassname("Engineering 2018");
        graduateStudent1.setResearchField("Information Technology");
        graduateStudent1.setAdvisorName("Chris");
        //add another student
        GraduateStudent graduateStudent2 = new GraduateStudent();
        graduateStudent2.setFirstname("Sam");
        graduateStudent2.setLastname("Steven");
        graduateStudent2.setMajor("Biology");
        graduateStudent2.setResearchField("Genetics");
        graduateStudent2.setClassname("Bio Engineering 2018");
        graduateStudent2.setAdvisorName("Christen");
        graduateStudent2.setGender("Female");
        //print out the information
        ArrayList<GraduateStudent> graduateStudents = new ArrayList<>();
        graduateStudents.add(graduateStudent1);
        graduateStudents.add(graduateStudent2);
        for (GraduateStudent eachgraduateStudent : graduateStudents) {

            System.out.println(eachgraduateStudent.getFirstname() + " " + eachgraduateStudent.getLastname() + " " + eachgraduateStudent.getGender());
            System.out.println(eachgraduateStudent.getMajor());
            System.out.println(eachgraduateStudent.getClassname());
            System.out.println(eachgraduateStudent.getAdvisorName());
            System.out.println(eachgraduateStudent.getResearchField());
        }
    }
}
