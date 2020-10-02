package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class classNameTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");


        WebElement homeLink = driver.findElement(By.className("nav-link"));

        homeLink.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //lazy way of print multiple buttons header
        System.out.println(driver.findElement(By.className("h3")).getText());
        System.out.println(driver.findElement(By.tagName("h3")).getText());

        // if there is a space in a class name you can not use it
        // we are going to use class name to locate multiple elements ? we are going to learn later

        driver.quit();
    }
}