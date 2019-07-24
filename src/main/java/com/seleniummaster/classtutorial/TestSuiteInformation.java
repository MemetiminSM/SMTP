package com.seleniummaster.classtutorial;

public class TestSuiteInformation {
    public static void main(String[] args){

        TestSuite test=new TestSuite();
        //assigne value to instance reference
        test.TestSuiteID="Selenium";
        test.TestSuiteName="login";
        test.TestSuiteIDescript="appeared on the screen";
        test.TestSuiteStatus="successfully";


        System.out.println(String.format("%s\n %s\n %s\n %s\n",test.TestSuiteID,test.TestSuiteName,test.TestSuiteIDescript,test.TestSuiteStatus));
    }

}
