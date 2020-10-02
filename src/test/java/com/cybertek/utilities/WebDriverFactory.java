package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    // task:
    //Write a method that takes a string parameter name : browserType
    //based on the value of parameter
    //it wo;; setup the browser and
    //the method will return chromedriver or firefoxDriver object
    //name of the method:getDriver


    public static WebDriver getDriver(String browserType ){

        WebDriver driver = null;

        switch (browserType.toLowerCase()){

            case "chrome" :
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;

        }

        return driver;

    }





}
