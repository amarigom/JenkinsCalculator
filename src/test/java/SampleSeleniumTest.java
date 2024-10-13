


import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public  class SampleSeleniumTest {
    WebDriver driver;
    @BeforeClass
    public   void startBrowser(){
        System.setProperty("Webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver-win64");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
         driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void validateGoogleId() throws Exception{
        System.out.println("Opening browser");
        driver.get("http://www.google.com");
        System.out.println("el título es"+ driver.getTitle());
        System.out.println("clicking Gmail Link");
        //driver.findElement(By.name("q")).sendKeys("WebElement"+ Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
        driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
        System.out.println("Signing Link");
        System.out.println("Entering username:");
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("andreamarigomez@.jhara.com");
        System.out.println("Clicking Next button");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        Thread.sleep(5000);
        boolean textFound= driver.getPageSource().contains("¿Has olvidado tu correo electrónico?");
        AssertJUnit.assertTrue(textFound);

    }

    @AfterClass
    public   void closeBrowser(){

            driver.quit();
    }
}
