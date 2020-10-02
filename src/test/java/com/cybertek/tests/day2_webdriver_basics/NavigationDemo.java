package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //navigate to another website with different selenium method
        driver.navigate().to("https://www.facebook.com");

        driver.navigate().to("https://www.9gag.com");

        //you can give break between execution (it is a java method not selenium)
        // wait 3 seconds here than move on
        Thread.sleep(3000);

        //goes back to previus page
        driver.navigate().back();


        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        driver.navigate().refresh();



    }
}
