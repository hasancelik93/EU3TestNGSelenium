package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //maximize the window
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        // there is no id(dynamic id) or name(duplicate name) than you go for tagName
        //selenium reads the source code top to bottom  if it finds one selenium stops there
        // you can use tagName if 1.only one or 2.if its the first one(if you want to use that one)
        // to find only one open inspect and control f and write your tag if there is only one you can use it
        WebElement fullNameInput = driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("mike smith with tag name");

        // by using tagName we can not reach second tag "input"
        WebElement emailInput = driver.findElement(By.name("email"));

        emailInput.sendKeys("mike@smith.com");
        //lazy way to click button
        driver.findElement(By.tagName("button")).click();
        // wait 3 seconds
        Thread.sleep(3000);
        //close browser
        driver.quit();













    }
}
