package com.cybertek.tests.HOMEWORKS.HW1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase1 {
    public static void main(String[] args) {
        WebDriver driver =new WebDriverFactory().getDriver("chrome");
        driver.get("https://www.ebay.com/");
        WebElement searchBar= driver.findElement(By.cssSelector("#gh-ac"));
        searchBar.sendKeys("search");

        driver.findElement(By.cssSelector("#gh-btn")).click();

        String results=driver.findElement(By.cssSelector("h1>span")).getText();
        System.out.println("results = " + results);
        driver.quit();

    }
}
