package com.seleniummaster.tutorial;


public class EnumDemo {
    public static void main(String[] args){

        TestType testType=null;
        if (args.length>=0 && Integer.parseInt(args[0])==1)
            testType=TestType.SMOKE_TEST;
        else if (args.length>=0 && Integer.parseInt(args[0])==2)
            testType=TestType.INTEGRATION_TEST;
        else if (args.length>0 && Integer.parseInt(args[0])==3)
            testType=TestType.STRESS_TEST;
        else  testType=TestType.NOTEST;

        switch (testType)
        {
            case SMOKE_TEST:
                System.out.println("Run Smoke Test");
                break;
            case INTEGRATION_TEST:
                System.out.println("Run INTEGRATION_TEST");
                break;
            case STRESS_TEST:
                System.out.println(" Run STRESS_TEST");
                break;
            case REGRESSION_TEST:

                System.out.println("Run REGRESSION_TEST");
                break;

                default:
                    System.out.println("Please enter the right test");
        }
    }
}
