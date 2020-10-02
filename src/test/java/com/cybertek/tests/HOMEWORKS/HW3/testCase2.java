package com.cybertek.tests.HOMEWORKS.HW3;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testCase2 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


    @Test
    public void test1(){

        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        String expectedCheck = "Check All";

        String actualCheck = driver.findElement(By.cssSelector("input[value='Check All']")).getAttribute("value");

        Assert.assertEquals(expectedCheck,actualCheck,"verify button text is Check All");
        //clicking the check all button
        driver.findElement(By.cssSelector("input[value='Check All']")).click();

        WebElement btn1 = driver.findElement(By.xpath("(//div//label//input)[2]"));
        WebElement btn2 = driver.findElement(By.xpath("(//div//label//input)[3]"));
        WebElement btn3 = driver.findElement(By.xpath("(//div//label//input)[4]"));
        WebElement btn4 = driver.findElement(By.xpath("(//div//label//input)[5]"));

        Assert.assertTrue(btn1.isSelected());
        Assert.assertTrue(btn2.isSelected());
        Assert.assertTrue(btn3.isSelected());
        Assert.assertTrue(btn4.isSelected());

        String actualNewCheckBtn = driver.findElement(By.id("check1")).getAttribute("value");
        String expectedNewCheckBtn = "Uncheck All";

        Assert.assertEquals(actualNewCheckBtn,expectedNewCheckBtn,"verify button text changed to Uncheck All");







    }

}
