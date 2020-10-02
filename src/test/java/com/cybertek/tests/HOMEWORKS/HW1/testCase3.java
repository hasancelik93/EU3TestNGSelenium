package com.cybertek.tests.HOMEWORKS.HW1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase3 {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        WebElement searchBar= driver.findElement(By.cssSelector("#searchInput"));

        searchBar.sendKeys("selenium webdriver");

        driver.findElement(By.cssSelector("#searchButton")).click();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("a[data-serp-pos='0']")).click();

        String actualUrl = "https://en.wikipedia.org/wiki/Selenium_(software)";

        Assert.assertTrue(actualUrl.endsWith("Selenium_(software)"),"verify that url is ending with Selenium_(software)");

        driver.quit();

    }
}
