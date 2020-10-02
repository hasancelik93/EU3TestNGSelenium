package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {


    @Test
    public void test1() throws InterruptedException {

        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //locating radio buttons

        WebElement blueRadoioBtn= driver.findElement(By.cssSelector("#blue"));
        WebElement redRadioBtm = driver.findElement(By.id("red"));

        System.out.println("blueRadoioBtn.isSelected() ="+blueRadoioBtn.isSelected());
        System.out.println("redRadioBtm.isSelected() ="+redRadioBtm.isSelected());

        // verify blue is selected and red is not selected
        Assert.assertTrue(blueRadoioBtn.isSelected(),"Verify that blue is selected");
        Assert.assertFalse(redRadioBtm.isSelected(),"verify that res is not selected");

        // how to click radio button?
        redRadioBtm.click();
        //blue--> false
        Assert.assertFalse(blueRadoioBtn.isSelected(),"Verify that blue not selected");
        //red-->true
        Assert.assertTrue(redRadioBtm.isSelected(),"verify that res is selected");

        Thread.sleep(3000);
        driver.quit();

    }




}
