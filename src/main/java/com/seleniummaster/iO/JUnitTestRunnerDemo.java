package com.seleniummaster.iO;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnitTestRunnerDemo {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JUnitDemo.class);
        int i = 1;
        int exitCode = 0;
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
            if (result.getFailureCount() >= i) {
                System.out.println("There is a failure in the test");
                exitCode = 100;
                System.exit(exitCode);
            }
        }
    }
}
