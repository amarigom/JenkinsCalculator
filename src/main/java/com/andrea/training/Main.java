package com.andrea.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        Calculadora calc= new Calculadora();
        System.out.println(calc.addCalc(2,3));
        //System.setProperty("Webdriver.chrome.driver","C:\\Program Files\\ChromeDriver\\chromedriver-win64");
        //WebDriver driver= new ChromeDriver();
        //driver.get("https://www.google.com");
        //driver.quit();



    }
}