package com.seleniummaster.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver browser;
        //define system variable for the chrome driver file location
        System.setProperty("webdriver.chrome.driver", "/Users/reziyemusulaiman/webdriver/chromedriver");
        //assign Chrome browser to the browser object
        browser = new ChromeDriver();
        //open the testing website
        browser.navigate().to("http://sandbox.clinicwise.net");
        //maximize browser window
        browser.manage().window().maximize();
        //define sign in button element
        WebElement signInButton = browser.findElement(By.id("signin_button"));
        System.out.println("Sign in button display? " + signInButton.isDisplayed());
        //define username element
        WebElement userNameInputBox = browser.findElement(By.id("username"));
        userNameInputBox.sendKeys(args[0]);
        //define password element
        WebElement passwordInputBox = browser.findElement(By.id("password"));
        passwordInputBox.sendKeys(args[1]);
        //click on sign in button
        signInButton.click();
        Thread.sleep(5000);
        //define user info
        WebElement userInfoElement = browser.findElement(By.cssSelector("span.user-info"));
        userInfoElement.click();
        //dine logout link
        WebElement logoutLink = browser.findElement(By.id("sign_out_link"));
        logoutLink.click();
        Thread.sleep(5000);
        WebElement userNameInputBoxAfterLogout = browser.findElement(By.id("username"));
        boolean testResult = userNameInputBoxAfterLogout.isDisplayed();
        System.out.println("user name text field display? " + testResult);
        browser.close();
        browser.quit();
    }
}
