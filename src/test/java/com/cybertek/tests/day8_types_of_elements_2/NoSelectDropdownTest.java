package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdownTest {

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
        // select class is not available now

        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("dropdownMenuLink"));

        //click the dropdown to see available options
        dropdownElement.click();
        //get the options with find elements method and finding common locator between them
        List<WebElement> dropdownOptions = driver.findElements(By.className("dropdown-item"));
        //printing the size of the list
        System.out.println("dropdownOptions.size() = " + dropdownOptions.size());

        //printing them one by one
        for (WebElement dropdownOption : dropdownOptions) {
            System.out.println(dropdownOption.getText());
        }

        //clicking yahoo by index number

        dropdownOptions.get(2).click();






    }






}
