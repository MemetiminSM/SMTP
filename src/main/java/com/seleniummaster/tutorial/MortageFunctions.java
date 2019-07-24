package com.seleniummaster.tutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MortageFunctions {
    WebDriver driver;

    public void openMortageSite(String url)
    {
        //setup system environment for using Chrome driver
        System.setProperty("webdriver.chrome.driver","/Users/reziyemusulaiman/webdriver/chromedriver");
        //create a webdriver instance for Chrome browser
        driver=new ChromeDriver();
        //open browser and maximize browser window
        driver.manage().window().maximize();
        //Open the website
        driver.get(url);
    }
    public  void calculateMortage(Mortgage mortgage)
    {
        driver.findElement(By.id("homeval")).sendKeys(String.valueOf(mortgage.getHomeValue()));
        sleep(2);
        driver.findElement(By.id("downpayment")).sendKeys(String.valueOf(mortgage.getDownPayment()));
        sleep(2);
        driver.findElement(By.name("param[downpayment_type]")).click();
        sleep(2);
        driver.findElement(By.id("loanamt")).clear();
        driver.findElement(By.id("loanamt")).sendKeys(String.valueOf(mortgage.getLoanAmount()));
        sleep(2);
        driver.findElement(By.id("intrstsrate")).sendKeys(String.valueOf(mortgage.getInterestRate()));
        sleep(2);
        driver.findElement(By.id("loanterm")).sendKeys(String.valueOf(mortgage.getLoanTerm()));
        sleep(2);
        Select  monthSelect=new Select(driver.findElement(By.name("param[start_month]")));
        monthSelect.selectByVisibleText(mortgage.getStartMonth());
        driver.findElement(By.id("start_year")).sendKeys(String.valueOf(mortgage.getStartYear()));
        driver.findElement(By.id("pptytax")).sendKeys(String.valueOf(mortgage.getPropertyTax()));
        driver.findElement(By.id("pmi")).sendKeys(String.valueOf(mortgage.getPmi()));
        driver.findElement(By.id("hoi")).sendKeys(String.valueOf(mortgage.getHomeIns()));
        driver.findElement(By.id("hoa")).sendKeys(String.valueOf(mortgage.getHoa()));
        Select  loanTypeSelect=new Select(driver.findElement(By.name("param[refiorbuy]")));
        loanTypeSelect.selectByVisibleText(mortgage.getLoanType());
        driver.findElement(By.name("cal")).click(); //click on the calculate button
    }
    public boolean verifyMortageAmount(String expectedAmount)
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        WebElement monthlyPaymentElement= wait.until
                (ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='repayment-block']/div/div/h3")));
        String displayedAmount= monthlyPaymentElement.getText();
        if(displayedAmount.equals(expectedAmount))
            return true;
        else
            return false;
    }

    public void closeBrowser()
    {
        driver.close();
        driver.quit();
    }

    public void sleep(int seconds)
    {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

