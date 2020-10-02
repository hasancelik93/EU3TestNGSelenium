package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @BeforeMethod
    public void setUp(){
        System.out.println("open browser");
    }
    @Test
    public void test1(){

        Assert.assertEquals("title","title");
        System.out.println("First Assertion");
        Assert.assertEquals("url","url");
        System.out.println("Second Assertion");
    }
    // when program finds error stops there and dont compiles other methods but AfterMethod runs even if  your test case fails
    //how to  close
    @Test
    public void test2(){
        Assert.assertEquals("test2","test2");
    }
    @Test
    public void test3(){
        String expectedTitle="Cyb";
        String actualTitle= "Cybertek";

        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"Verify title starts with Cyb");

    }

    @Test
    public void test4(){
        //Verify email contains @ sign
        String email= "mike@smith.com";
        Assert.assertTrue(email.contains("@"),"verify email contains @");
    }
    @Test
    public void test5(){
        Assert.assertFalse(0>1,"verify that 0 is not grater than 1");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("quit browser");
    }



}
