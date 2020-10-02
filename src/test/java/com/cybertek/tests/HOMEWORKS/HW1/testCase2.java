package com.cybertek.tests.HOMEWORKS.HW1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase2 {

    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");
        WebElement searchBar= driver.findElement(By.cssSelector("#gh-ac"));
        searchBar.sendKeys("Selenium");
        driver.findElement(By.cssSelector("#gh-btn")).click();

        String title= driver.getTitle();

        Assert.assertTrue(title.contains("Selenium"),"verify that title contains Selenium");

        driver.quit();



    }
}
