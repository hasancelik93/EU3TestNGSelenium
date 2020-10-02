package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement blueRadioBtn= driver.findElement(By.id("blue"));

        blueRadioBtn.getAttribute("value");
        // get the value of type attribute
        System.out.println(blueRadioBtn.getAttribute("type"));
        // get the value of name attribute
        System.out.println(blueRadioBtn.getAttribute("name"));
        // get the value of checked attribute --> returns boolean it is a way to understand the button is checked or not
        System.out.println(blueRadioBtn.getAttribute("checked"));
        // trying to get value of an attribute that doesnt exist
        System.out.println(blueRadioBtn.getAttribute("href"));

        System.out.println(blueRadioBtn.getAttribute("outerHTML"));

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button2 = driver.findElement(By.name("button2"));
        System.out.println(button2.getAttribute("outerHTML"));
        String outerHTML=button2.getAttribute("outerHTML");


        System.out.println(button2.getAttribute("innerHTML"));




        driver.quit();
    }
}
