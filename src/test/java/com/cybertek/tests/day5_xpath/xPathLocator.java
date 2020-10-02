package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xPathLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement bttn2 = driver.findElement(By.xpath("//button[@*='button2()']"));

        bttn2.click();

        Thread.sleep(3000);

        driver.quit();


    }
}
