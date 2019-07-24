package com.seleniummaster.iO;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class JUnitWebDriverDemo {
    WebDriver webDriver;
    public static int timeout = 30;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/reziyemusulaiman/webdriver/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get("http://sandbox.clinicwise.net/reset");
        webDriver.navigate().to("http://sandbox.clinicwise.net");
        System.out.println("Current testing site is " + webDriver.getCurrentUrl());
    }

    @Test
    public void loginTest() {
        waitForElementVisible(By.id("username"), timeout); //wait until username element is visible within 30 seconds
        WebElement usernameElement = webDriver.findElement(By.id("username"));
        usernameElement.sendKeys("admin");
        waitForElementVisible(By.id("password"), timeout);
        WebElement passwordElement = webDriver.findElement(By.id("password"));
        passwordElement.sendKeys("test");
        waitForElementVisible(By.xpath("//div/input[@id=\"signin_button\"]"), timeout);
        WebElement loginButton = webDriver.findElement(By.xpath("//div/input[@id=\"signin_button\"]"));
        loginButton.click();
        waitForElementVisible(By.id("user_nav_link"), timeout);
        WebElement usernavigationLink = webDriver.findElement(By.id("user_nav_link"));
        Assert.assertTrue(usernavigationLink.isDisplayed());

    }

    @After
    public void tearDown() {
        waitForElementVisible(By.id("user_nav_link"), timeout);
        webDriver.findElement(By.id("user_nav_link")).click();
        waitForElementVisible(By.id("sign_out_link"), timeout);
        webDriver.findElement(By.id("sign_out_link")).click();
        waitForElementVisible(By.id("username"), timeout);
        webDriver.close();
        webDriver.quit();

    }

    public void waitForElementVisible(By by, int timeoutSeconds) {
        try {
            WebDriverWait webDriverWait = new WebDriverWait(webDriver, timeoutSeconds);
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated((by)));
        } catch (Exception e) {
            System.out.println("Element " + by.toString() + "  is not found within " + timeoutSeconds + " seconds");
        }

    }
}
