package com.seleniummaster.classtutorial;

import com.seleniummaster.iO.FileUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {
    public static void main(String[] args) {

//set up selenium chrome driver in the systems

        System.setProperty("webdriver.chrome.driver", "/Users/reziyemusulaiman/webdriver/chromedriver");

//define a test data
        User testuser = new User("admin", "test");


        //define a chrome driver instance
        WebDriver driver = new ChromeDriver();
        //maximize browser window
        driver.manage().window().maximize();

        // nevigate to the testing page
        driver.get("http://sandbox.clinicwise.net/");
        //input username
        driver.findElement(By.id("username")).sendKeys(testuser.getUserName());
        //input password
        driver.findElement(By.id("password")).sendKeys(testuser.getUserPassword());
        //click on the sign in button
        driver.findElement(By.name("commit")).click();
        FileUtility fileUtility=new FileUtility();
        fileUtility.writeToFile("doc","loginTest",".html","login Test end");
    }
}
