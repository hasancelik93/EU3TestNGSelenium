package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) {

    //open chrome and navigate to http://practice.cybertekschool.com

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        //getting title with selenium(we will use it to verification)

        System.out.println(driver.getTitle());
        //driver.getTitle();// hold option or alt and press enter to create local variable

        String title = driver.getTitle();
        // soutv+ enter is a shortcut to next line (to print variable name and value)
        System.out.println("title = " + title);


        //getCurrentUrl--> get the url from browser
        String currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        //getPageSource --> gets the source of the page
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);














    }
}
