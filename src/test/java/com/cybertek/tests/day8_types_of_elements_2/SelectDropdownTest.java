package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdownTest {
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
    public void test1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dropdown");
        //CHECK DROPDOWN HAVE SELECT ATTRIBUTE OR NOT
        //1.locate your dropdown web element with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));
        //2. Create select object by passing that element as a parameter
        // we have constructor that requires parameter(web element)
        Select stateDropdown = new Select(dropdownElement);


        //verify that first selection is Select a state
        String expectedOption = "Select a State";
        String actualOption = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOption,expectedOption,"verify fist selection");

        //getOptions--> returns all the available options from the dropdown
        List<WebElement> options = stateDropdown.getOptions();



        //print size of the options
        System.out.println("options.size() = " + options.size());
        //print options one by one
        for (WebElement option : options) {
            System.out.println(option.getText());
        }


        //HOW TO SELECT OPTIONS FROM DROPDOWN
        //1.select using visible text
        stateDropdown.selectByVisibleText("Virginia");

        expectedOption= "Virginia";
        actualOption= stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOption,expectedOption,"verify first selection");

        //2.Select using index number
        Thread.sleep(2000);
        stateDropdown.selectByIndex(51);

        expectedOption= "Wyoming";
        actualOption= stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOption,expectedOption,"verify first selection");

        //3. Select by value

        Thread.sleep(2000);

        stateDropdown.selectByValue("TX");



    }



}
