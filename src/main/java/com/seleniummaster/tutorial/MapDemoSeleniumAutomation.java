package com.seleniummaster.tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemoSeleniumAutomation {
    public static void main(String[] args)throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "/Users/reziyemusulaiman/webdriver/chromedriver");
//define a chrome driver instance
        WebDriver driver = new ChromeDriver();
        //maximize browser window
        driver.manage().window().maximize();
        //Store a website name and address
        Map<String, String> sites = new HashMap<>();
        //use put method to add data to object
        sites.put("yahoo", "wwww.yahoo.com");
        sites.put("google", "www.google.com");
        sites.put("youtube", "www.youtube.com");
        sites.put("cnn","www.cnn.com");
        System.out.println("Total sites in the map" + sites.size());
        sites.put("Selenium","htpp://www.selenium.com");
        //print out each key and value in the map object
        Set<String>siteKeys=sites.keySet();
        System.out.println("Total keys:" +siteKeys.size());
        for (String site:siteKeys)
        {
            String url=sites.get(site);
            System.out.println(String.format("site url: %s", url));
            driver.get(url);
            System.out.println(driver.getTitle());
            Thread.sleep(5000);
        }


    }
}
