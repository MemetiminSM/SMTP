package com.seleniummaster.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class GoogleSearch3 {
    public static void main(String[] args) throws InterruptedException {
        //setup system environment for using Chrome driver
        System.setProperty("webdriver.chrome.driver","/Users/reziyemusulaiman/webdriver/chromedriver");
        //create a webdriver instance for Chrome browser
        WebDriver driver=new ChromeDriver();
        //open browser and maximize browser window
        driver.manage().window().maximize();
        //Open the website
        driver.get("https://www.google.ca");
        List<String> words=new ArrayList<String>();
        words.add("Selenium"); words.add("Java Tutorial");
        words.add("Python"); words.add("Washington DC");
        for(int i=1;i<=5;i++) {
            System.out.println(driver.getTitle());
            WebElement searchBox = driver.findElement(By.name("q"));
            //type the search string in the text box and press Enter key
            searchBox.sendKeys("selenium" + Keys.ENTER);
            WebElement searchResult = driver.findElement(By.id("resultStats"));
            String result = searchResult.getText();
            if (result.contains("results"))
                System.out.println("Test Passed");
            else
            { System.out.println("Test Failed");}
            //go back
            Thread.sleep(3000); //delay 5 seconds;
            driver.navigate().back();
        }
        //close browser
        driver.close();
        driver.quit();
    }
}
