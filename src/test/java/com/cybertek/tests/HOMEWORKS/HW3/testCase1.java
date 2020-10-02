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

public class testCase1 {

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

        WebElement message = driver.findElement(By.xpath("//div[@id='txtAge']"));

        Assert.assertFalse(message.isDisplayed(),"verify message is not displayed");

        WebElement box = driver.findElement(By.xpath("//*[@id='isAgeSelected']"));

        box.click();

        Assert.assertTrue(message.isDisplayed(),"verify message is displayed");

    }

}
