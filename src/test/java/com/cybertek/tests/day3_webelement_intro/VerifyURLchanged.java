package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLchanged {
    public static void main(String[] args) throws InterruptedException {

        /*
        Verify URL changed
        open browser
        go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        enter any email
        click on Retrieve password
        verify that url changed to http://practice.cybertekschool.com/email_sent
        10:02
        verfiyURLchanged*/

        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to url
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //enter any email (if there is no id you can use name as a locator )-->remember case sensitive

        WebElement emailInputBox = driver.findElement(By.name("email"));
        //sendkeys()-->send keyboard action to the webelement
        emailInputBox.sendKeys("mike@cybertek.com");

        //click on retrieve password

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        Thread.sleep(2000);

        //TASK
        //verify that url changed to "http://practice.cybertekschool.com/email_sent"
        //create expected url



        String expectedUrl = "http://practice.cybertekschool.com/email_sent";

        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualUrl = " + actualUrl);
        }

        // close browser
        driver.quit();
    }
}
