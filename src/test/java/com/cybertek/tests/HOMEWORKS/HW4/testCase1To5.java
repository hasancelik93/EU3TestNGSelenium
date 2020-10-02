package com.cybertek.tests.HOMEWORKS.HW4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testCase1To5 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


    @Test
    public void testCase1(){

        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.linkText("Registration Form")).click();

        WebElement birthdayInput = driver.findElement(By.cssSelector("*[name='birthday']"));

        birthdayInput.sendKeys("wrong_dob");

        WebElement validator = driver.findElement(By.cssSelector("*[data-bv-validator='date']"));

        Assert.assertTrue(validator.isDisplayed(),"verify that validator is displayed");

    }

    @Test
    public void testCase2(){

        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.linkText("Registration Form")).click();

        WebElement btn1 = driver.findElement(By.xpath("(//*[@class='form-check-label'])[1]"));
        WebElement btn2 = driver.findElement(By.xpath("(//*[@class='form-check-label'])[2]"));
        WebElement btn3 = driver.findElement(By.xpath("(//*[@class='form-check-label'])[3]"));

        Assert.assertTrue(btn1.isDisplayed());
        Assert.assertTrue(btn2.isDisplayed());
        Assert.assertTrue(btn3.isDisplayed());


    }

    @Test
    public void testCase3() throws InterruptedException {

        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.linkText("Registration Form")).click();

        WebElement nameInput = driver.findElement(By.xpath("//*[@name='firstname']"));

        nameInput.sendKeys("a");

        Thread.sleep(2000);

        WebElement msg = driver.findElement(By.xpath("//div//small[@data-bv-for='firstname'][2]"));

        Assert.assertTrue(msg.isDisplayed(),"verify msg is displayed");




    }

    @Test
    public void testCase4(){

        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.linkText("Registration Form")).click();

        WebElement lastnameInput = driver.findElement(By.xpath("//*[@name='lastname']"));

        lastnameInput.sendKeys("a");

        WebElement msg= driver.findElement(By.xpath("//*[@data-bv-for='lastname'][2]"));

        Assert.assertTrue(msg.isDisplayed(),"verify that msg is displayed");



    }

    @Test
    public void testCase5(){

        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.linkText("Registration Form")).click();

        WebElement nameInput = driver.findElement(By.xpath("//*[@name='firstname']"));

        nameInput.sendKeys("Mike");

        WebElement lastnameInput = driver.findElement(By.xpath("//*[@name='lastname']"));

        lastnameInput.sendKeys("Smith");

        WebElement usernameInput = driver.findElement(By.xpath("//*[@name='username']"));

        usernameInput.sendKeys("mikesmith");

        WebElement emailInput = driver.findElement(By.xpath("//*[@name='email']"));

        emailInput.sendKeys("mike@smith.com");

        WebElement passwordInput = driver.findElement(By.xpath("//*[@type='password']"));

        passwordInput.sendKeys("MikeSmith123");

        WebElement phoneInput = driver.findElement(By.xpath("//*[@name='phone']"));

        phoneInput.sendKeys("575-555-9898");

        WebElement genderMale = driver.findElement(By.xpath("//*[@value='male']"));

        genderMale.click();

        WebElement birthdayInput = driver.findElement(By.cssSelector("*[name='birthday']"));

        birthdayInput.sendKeys("12/21/1990");

        WebElement department = driver.findElement(By.xpath("//*[@name='department']"));

        Select departmentDropdown = new Select(department);

        departmentDropdown.selectByValue("DE");

        WebElement jobTitle = driver.findElement(By.xpath("//*[@name='job_title']"));

        Select jobDropDown = new Select(jobTitle);

        jobDropDown.selectByIndex(4);

        WebElement programmingJava = driver.findElement(By.xpath("//*[@for='inlineCheckbox2']"));

        programmingJava.click();

        WebElement signupButton = driver.findElement(By.id("wooden_spoon"));

        signupButton.click();

        WebElement welldoneMsg = driver.findElement(By.xpath("//div//p"));

        Assert.assertTrue(welldoneMsg.isDisplayed(),"verify the msg is displayed");



    }


}
