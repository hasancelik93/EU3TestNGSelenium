package com.cybertek.tests.HOMEWORKS.HW4;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testCase6 {

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
    public void testCase1() throws InterruptedException {


        driver.get("https://www.tempmailaddress.com/");

        driver.manage().window().maximize();

        String email =driver.findElement(By.xpath("//div//span[@id='email']")).getText();

        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.linkText("Sign Up For Mailing List")).click();

        driver.findElement(By.name("full_name")).sendKeys("Mike Smith");

        driver.findElement(By.name("email")).sendKeys(email);

        driver.findElement(By.name("wooden_spoon")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//*[@name='signup_message']")).isDisplayed(),"verify that message is displayed");

        driver.get("https://www.fakemail.net/");


        Thread.sleep(1000);



        Assert.assertEquals(driver.findElement(By.xpath("//table//tbody//tr[1]//td[1]")).getText()," do-not-reply@practice.cybertekschool.com","verify that email is there");

        driver.findElement(By.xpath("//table/tbody/tr[1]")).click();

        Thread.sleep(1000);

        Assert.assertEquals(driver.findElement(By.cssSelector("#odesilatel")).getText(),"do-not-reply@practice.cybertekschool.com");

        Assert.assertEquals(driver.findElement(By.id("predmet")).getText(),"Thanks for subscribing to practice.cybertekschool.com!");


    }


}
