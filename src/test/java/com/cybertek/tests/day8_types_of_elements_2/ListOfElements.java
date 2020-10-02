package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
         driver = WebDriverFactory.getDriver("chrome");

    }



    @AfterMethod
    public void tearDown(){
        driver.quit();

    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // save out web elements inside the list
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println("buttons.size() = " + buttons.size());
        //verify button size
        Assert.assertEquals(buttons.size(),6,"verify buttons size");

        //iter + press enter to get each loop with shortcut
        for (WebElement button : buttons) {
            System.out.println(button.getText());
        }


        for (WebElement button : buttons) {
            System.out.println("button.isDisplayed() = " + button.isDisplayed());
            Assert.assertTrue(button.isDisplayed(),"verify buttons are displayed");
        }

        //click the second button

        buttons.get(1).click();




    }


    @Test
    public void test2(){

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // reguler find element method will thow no such element  if locator does not exist
        //passing locator whick dos not exist it will not throw no such element error  but the list size will be 0
        //because compiler count find the element
        List<WebElement> buttons = driver.findElements(By.tagName("button"));


        System.out.println("buttons.size() = " + buttons.size());

    }






}
