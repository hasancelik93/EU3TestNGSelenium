package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {

   @Test
    public  void test1(){
       WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.get("http://practice.cybertekschool.com/radio_buttons");

       WebElement greenRadioBtn = driver.findElement(By.id("green"));

       //how to check web any web element enabled or not ?
       System.out.println("greenRadioBtn.isEnabled() = " + greenRadioBtn.isEnabled());
       Assert.assertFalse(greenRadioBtn.isEnabled(),"verify that green radio button is not enabled");

       greenRadioBtn.click();
       driver.quit();

   }

   @Test
    public void test2(){
       WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.get("http://practice.cybertekschool.com/dynamic_controls");

       WebElement inputBox= driver.findElement(By.xpath("//input[@type='text']"));
       inputBox.sendKeys("some message");

   }


}
