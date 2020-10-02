package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @BeforeClass
    public void setUpClass(){
        System.out.println("--BEFORE CLASS--");
    }

    @Test

    public  void test1(){

        System.out.println("first test case");

    }
    @Ignore
    @Test

    public void test2(){
        System.out.println("Second test case");
    }

    @Test
    public void test3(){
        System.out.println("third test case");
    }

    @BeforeMethod

    public void setup(){
        System.out.println("webdriver,opening browser");
    }

    @AfterMethod

    public void tearDown(){
        System.out.println("closing browser. quit");
    }


    @AfterClass
    public void afterClass(){
        System.out.println("--AFTER CLASS--");
        System.out.println("Some reporting test case here");
    }


}
