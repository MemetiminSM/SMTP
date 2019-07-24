package com.seleniummaster.tutorial;

public class TestMortgage {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Mortgage mortgage = new Mortgage(300000, 60000, true,
                    240000, 5, 30,
                    "Nov", 2018, 2400, 0.5,
                    1000, 0, "Buy");
            MortageFunctions mortageFunctions = new MortageFunctions();
            mortageFunctions.openMortageSite("https://www.mortgagecalculator.org/");
            mortageFunctions.calculateMortage(mortgage);
            System.out.println("Mortage Verified " +
                    mortageFunctions.verifyMortageAmount("$1,571.71"));
            mortageFunctions.closeBrowser();
        }
    }
}
