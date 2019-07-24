package com.seleniummaster.tutorial;

public class JavaLoopDemo5 {
    public static void main(String[] args) {

        int milesToRun =0;
        int timepermile =15;
        int totalMinutes =0;
        int timeTorest = 5;
        int TargetMiles =25;

        while (milesToRun < TargetMiles) {
            milesToRun++;
            totalMinutes = totalMinutes + timepermile;
            if (milesToRun < TargetMiles)
                totalMinutes = totalMinutes + timeTorest;
            System.out.println(String.format("Miles %d Minutes %d", milesToRun, totalMinutes));
        }

    }
}
