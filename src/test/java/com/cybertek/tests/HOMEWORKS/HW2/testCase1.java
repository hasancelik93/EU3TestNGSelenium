package com.cybertek.tests.HOMEWORKS.HW2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testCase1 {

    @Test
    public void test1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeBtn = driver.findElement(By.xpath("//*[@class='nav-link']"));
        System.out.println("homeBtn.getText() = " + homeBtn.getText());
        WebElement forgotPass= driver.findElement(By.xpath("//*[.='Forgot Password']"));
        System.out.println("forgotPass.getText() = " + forgotPass.getText());
        WebElement email= driver.findElement(By.xpath("//*[@for='email']"));
        System.out.println("email.getText() = " + email.getText());
        WebElement emailBar = driver.findElement(By.xpath("//*[@name='email']"));
        emailBar.sendKeys("mike@smith.com");
        System.out.println("emailBar.getText() = " + emailBar.getText());
        WebElement retrieveBtn = driver.findElement(By.xpath("//button//i"));
        System.out.println("retrieveBtn.getText() = " + retrieveBtn.getText());
        
        driver.quit();

    }
}
