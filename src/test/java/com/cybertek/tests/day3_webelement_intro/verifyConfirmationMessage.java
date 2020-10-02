package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    public static void main(String[] args) {
        /*verifyConfirmationMessage
10:44
    Verify confirmation message
    open browser
    go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
    enter any email
    verify that email is displayed in the input box
    click on Retrieve password
    verify that confirmation message says ‘Your e-mail’s been sent!’*/

        //open the browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));

        String expectedEmail = "mikesmith@gmail.com";

        emailInputBox.sendKeys(expectedEmail);

     //verify that email is displayed in the input box

     //somehow we should get text from the web element
     // there is 2 ways

     //1.getText()--> it will work 99 of time

     //2.getAttiribute("value")--> second vay of getting text especially input boxes


     String actualEmail = emailInputBox.getAttribute("value");
     System.out.println("actualEmail = " + actualEmail);


     if (expectedEmail.equals(actualEmail)){
         System.out.println("PASS");
     }else{
         System.out.println("FAIL");
     }


     WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
     retrievePasswordButton.click();

     //verify that confirmation message says ‘Your e-mail’s been sent!

        WebElement actualConfirmationMessage = driver.findElement(By.name("confirmation_message"));

        System.out.println(actualConfirmationMessage.getText());


        //save expected message
        String expectedMessage = "Your e-mail's been sent!";


        // save actual message to variable
        String actualMessage = actualConfirmationMessage.getText();

        if (expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }


        driver.quit();


    }
}
