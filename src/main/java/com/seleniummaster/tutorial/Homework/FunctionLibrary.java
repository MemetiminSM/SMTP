package com.seleniummaster.tutorial.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionLibrary {
    WebDriver driver;

    public void openTestWebsite(String url)
    {
        //setup system environment for using Chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/memetiminabliz/webdriver");
        //create a webdriver instance for Chrome browser
        driver = new ChromeDriver();
        //open browser and maximize browser window
        driver.manage().window().maximize();
        //open the website
        driver.get(url);
    }
    public void login(String username,String password)
    {
        driver.findElement(By.id("username")).sendKeys(username);
        //enter the password
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("signin_button")).click();
        //wait until the dashboard usermenu display
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("span.label.label_role_account_admin")));
        boolean isAdminDisplay = driver.findElement(By.cssSelector("span.label.label_role_account_admin")).isDisplayed();
        System.out.println("Login as Admin Pass? " + isAdminDisplay);
    }

    public void addNewClient(Client client)
    {
        driver.findElement(By.id("nav_clients")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("menu_new_client_link")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("span.input-group-addon")));
        //define a new client element
        //enter new client information
        driver.findElement(By.id("client_first_name")).sendKeys(client.getFirstName());
        driver.findElement(By.id("client_last_name")).sendKeys(client.getLastName());
        driver.findElement(By.id("client_gender_male")).click();
        driver.findElement(By.id("client_is_vip")).click();
        String isChecked= driver.findElement(By.id("client_is_vip")).getAttribute("checked");
        System.out.println(isChecked);
        driver.findElement(By.id("client_birth_date")).sendKeys(client.getBirthDate());
        driver.findElement(By.id("client_medicare_number")).sendKeys(client.getMedicareNumber());
        driver.findElement(By.id("client_mobile")).sendKeys(client.getPhone());
        driver.findElement(By.id("client_email")).sendKeys(client.getEmail());
        driver.findElement(By.id("client_address_line_1")).sendKeys(client.getAddress());
        driver.findElement(By.id("client_suburb")).sendKeys(client.getSuburb());
        driver.findElement(By.id("client_post_code")).sendKeys(client.getPostCode());
        driver.findElement(By.id("client_occupation")).sendKeys(client.getOccupation());
        driver.findElement(By.id("client_notes")).sendKeys(client.getNotes());
        driver.findElement(By.id("create_client_btn")).click();

    }

    public boolean verifyClient()
    {
        //wait until the new client display
        WebDriverWait wait2 = new WebDriverWait(driver, 30);
        wait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div.profile-info-name")));
        boolean isNewClientDisplay = driver.findElement(By.cssSelector("div.profile-info-name")).isDisplayed();
        System.out.println("Add a New Client Pass? " + isNewClientDisplay);
        return isNewClientDisplay;
    }

    public boolean logout()
    {
        driver.findElement(By.id("user_nav_link")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("sign_out_link")).click();
        boolean isSignInDisplay = driver.findElement(By.id("signin_button")).isDisplayed();
        System.out.println("Logout Test Pass? " + isSignInDisplay);
        return isSignInDisplay;
    }

    public void closeBrowser()
    {
        //close browser
        driver.close();
        driver.quit();
    }
}
