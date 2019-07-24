package com.seleniummaster.classtutorial;
/*import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.util.Date;*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAutoClinicWise2 {
    public static void main(String[] args) throws InterruptedException {

//set up selenium chrome driver in the systems

        System.setProperty("webdriver.chrome.driver", "/Users/reziyemusulaiman/webdriver/chromedriver");

//define a test data
        JavaAutoClinicWise1 testuser;
        testuser = new JavaAutoClinicWise1();
        testuser.setUserName("admin");
        testuser.setUserPassword("test");
        testuser.setFirstname("Ali");
        testuser.setLastname("Riza");
        testuser.setMale(true);
        testuser.setBirthDate("01/06/2015");
        testuser.setMedicareNumber(123);
        testuser.setHealthFund("Medibank Private");
        testuser.setPhone(61293601111L);
        testuser.setEmail("elemin991@gmail.com");
        testuser.setAddress("Melbourne");
        testuser.setSuburb("Little Lonsdale St");
        testuser.setPostCode(3000);
        testuser.setReferralSource("Dr.Steve Apple");
        testuser.setOccupation("Engineer");
        testuser.setNotes("Everything is ganna be ok.");

        Thread.sleep(1000);
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
        //adding a new client
        driver.findElement(By.name("commit")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("nav_clients")).click();

        driver.findElement(By.id("menu_new_client_link")).click();

        driver.findElement(By.id("client_first_name")).sendKeys(testuser.getFirstname());
        driver.findElement(By.id("client_last_name")).sendKeys(testuser.getLastname());
        driver.findElement(By.id("client_gender_male")).click();
        driver.findElement(By.id("client_is_vip")).click();
        driver.findElement(By.id("client_birth_date")).sendKeys((CharSequence) testuser.getBirthDate());
        driver.findElement(By.id("client_medicare_number")).sendKeys("123");
        driver.findElement(By.id("client_private_health_fund_id")).sendKeys(testuser.getHealthFund());
        driver.findElement(By.id("client_mobile")).sendKeys("0061293601111");
        driver.findElement(By.id("client_email")).sendKeys(testuser.getEmail());
        driver.findElement(By.id("client_address_line_1")).sendKeys(testuser.getAddress());
        driver.findElement(By.id("client_suburb")).sendKeys(testuser.getSuburb());
        driver.findElement(By.id("client_post_code")).sendKeys("3000");
        driver.findElement(By.name("client[referral_id]")).sendKeys(testuser.getReferralSource());
        driver.findElement(By.id("client_occupation")).sendKeys(testuser.getOccupation());
        driver.findElement(By.id("client_notes")).sendKeys(testuser.getNotes());
        Thread.sleep(3000);
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.className("user-info")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("sign_out_link")).click();
    }
}
