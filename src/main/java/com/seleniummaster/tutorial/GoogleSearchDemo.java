package com.seleniummaster.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class GoogleSearchDemo {
    public static void main(String[] args) throws InterruptedException {

        //set up selenium chrome driver in the systems

        System.setProperty("webdriver.chrome.driver", "/Users/reziyemusulaiman/webdriver/chromedriver");

        ArrayList<String> GoogleSearchWords = new ArrayList<>();
        GoogleSearchWords.add("Java");
        GoogleSearchWords.add("Java Tutorial");
        GoogleSearchWords.add("Selenium Master");
        GoogleSearchWords.add("Selenium Test Automation Engineer");

        for (String eachSearch : GoogleSearchWords) {
//define a chrome. driver instance
            WebDriver driver = new ChromeDriver();
            //maximize browser window
            driver.manage().window().maximize();
            // nevigate to the testing page

            driver.get("https://www.google.ca");

            driver.findElement(By.name("q")).sendKeys("Java Tutorial" + Keys.ENTER);

            Thread.sleep(3000);

            String siteTitle = driver.getTitle();

            System.out.println(siteTitle.contains("Java Tutorial"));

            String result = driver.findElement(By.id("resultStats")).getText();

            // get only numbers from reserch result
            String totalSearchresult = result.substring(0, result.indexOf('r'));
            totalSearchresult = totalSearchresult.replace("About", "").replace("About", "").trim();
            long totalCount = Long.parseLong(totalSearchresult);
            System.out.println(totalCount);
            System.out.println("AT lest one result is returned? ");
            System.out.println(totalCount > 1);
            //close driver
            driver.close();
            driver.quit();

        }
    }
}