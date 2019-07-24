package com.seleniummaster.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebDriverExample {
    public static void main(String[] args) throws InterruptedException {
        //set up selenium chrome driver in the systems

        System.setProperty("webdriver.chrome.driver", "/Users/memetiminabliz/webdriver/chromedriver");
//define a chrome driver instance
        WebDriver driver = new ChromeDriver();
        //maximize browser window
       // driver.manage().window().maximize();

        //Login
        driver.navigate().to("http://newtours.demoaut.com/");
        driver.findElement(By.name("userName")).sendKeys("Mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
        //Book a Ticket
        //Choose the number of passenger
        Select Passangers = new Select(driver.findElement(By.cssSelector("select[name='passCount']")));
        Passangers.selectByVisibleText("1");
        //select departure city
        Select Departingfrom = new Select(driver.findElement(By.cssSelector("select[name='fromPort']")));
        Departingfrom.selectByVisibleText("Frankfurt");
        //select departure month
        Select FromMonth = new Select(driver.findElement(By.cssSelector("select[name='fromMonth']")));
        FromMonth.selectByVisibleText("November");
        //select departure day
        Select FromDay = new Select(driver.findElement(By.cssSelector("select[name='fromDay']")));
        FromDay.selectByIndex(11);
        //select arrival city
        Select ArrivingIn = new Select(driver.findElement(By.cssSelector("select[name='toPort']")));
        ArrivingIn.selectByVisibleText("New York");
        //select arrival month
        Select ToMonth = new Select(driver.findElement(By.cssSelector("select[name='toMonth']")));
        ToMonth.selectByVisibleText("November");
        //select arrival day
        Select ToDay = new Select(driver.findElement(By.cssSelector("select[name='toDay']")));
        ToDay.selectByIndex(12);
        //find flight
        driver.findElement(By.name("findFlights")).click();
        //reserve flight
        driver.findElement(By.name("reserveFlights")).click();
        //enter passenger information
        driver.findElement(By.name("passFirst0")).sendKeys("Selenium");
        driver.findElement(By.name("passLast0")).sendKeys("Master");
        driver.findElement(By.name("creditnumber")).sendKeys("12345678");
        //buy flight
        driver.findElement(By.name("buyFlights")).click();
        //verify confirmation
        String pageSource = driver.getPageSource();
        if (pageSource.contains("Flight Confirmation")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        //Logout
        driver.findElement(By.linkText("SIGN-OFF")).click();
        //Close Browser
        driver.close();
        driver.quit();

    }
}
