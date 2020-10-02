package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframeTest {


    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");
        Thread.sleep(2000);
        // how to switch frames
        //1. by using by name or id attribute of frame
        driver.switchTo().frame("mce_0_ifr");

        //clear before sendkeys method
        driver.findElement(By.cssSelector("#tinymce")).clear();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith");
        //in order to action in big html you need to switch back
        //goes back to first frame(main html)
        driver.switchTo().defaultContent();

        //2.switching with index
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        //clear before sendkeys method
        driver.findElement(By.cssSelector("#tinymce")).clear();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith WITH INDEX");


        //second way to switch parent
        driver.switchTo().parentFrame();

        //3. way using web element

        WebElement iframeElement = driver.findElement(By.tagName("iframe"));

        driver.switchTo().frame(iframeElement);

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith WITH WEBELEMENT ");

    }

    @Test
    public void test2(){

        driver.get("http://practice.cybertekschool.com/nested_frames");
        //switching the frame top
        driver.switchTo().frame("frame-top");
        //top has 3 frame under left middle and right
        //switch to middle
        driver.switchTo().frame("frame-middle");

        System.out.println(driver.findElement(By.id("content")).getText());
        //goes back to top frame
        driver.switchTo().parentFrame();
        //switching right with index
        driver.switchTo().frame(2);
        System.out.println(driver.findElement(By.tagName("body")).getText());

        // i want to get text of bottom
        //go to main html to swtich bottom
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

        //driver.switchTo().frame("frame-bottom");
        System.out.println(driver.findElement(By.tagName("body")).getText());

    }



}
