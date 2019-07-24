package com.seleniummaster.tutorial;

import com.seleniummaster.tutorial.Homework.Client;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionLibrary {
    private WebDriver driver;

    public void openBrowser(String url) {

        //
        System.setProperty("webdriver.chrome.driver", "/Users/reziyemusulaiman/webdriver/chromedriver");
//define a chrome driver instance
        WebDriver driver = new ChromeDriver();
        //maximize browser window
        driver.manage().window().maximize();
        // nevigate to the testing page
        driver.get(url);
    }

    public List<SearchWord> searchWords(String[] words)
    {
        List<SearchWord> wordList=new ArrayList<>();
        for(String word: words)
        {
            wordList.add(new SearchWord(word));
        }
        return wordList;
    }
    public void doSearch(String wordToSearch)
    {
        WebElement searchTextField=driver.findElement(By.name("q")) ;
        searchTextField.sendKeys(wordToSearch+ Keys.ENTER);
        }
    public boolean verifySearchResult()
    {
        WebElement resultDiv=driver.findElement(By.id("resultStats"));
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(resultDiv));
        String resultText=resultDiv.getText();
        if(resultText.contains("results"))
            return true;
        else
            return false;
    }
    public void closeBrowser(){

       driver.close();
       driver.quit();
    }
    public void goBackToSearchPage(){

      driver.navigate().back();
      //wait until the search filed display
        WebDriverWait  wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));

    }

    public void openTestWebsite(String s) {
    }

    public void login(String username, String password) {
    }

    public void addNewClient(Client client) {
    }

    public void verifyClient() {
    }

    public void logout() {
    }
}
