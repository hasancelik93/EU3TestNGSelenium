package com.cybertek.tests.day13_pom;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

public class RepeatOptionsTests extends TestBase {

    /*VERIFY RADIO BUTTONS
   Open Chrome browser
   Login as driver
   Go to Activities->Calendar Events
   Click on create calendar events
   Click on repeat
   Verify that repeat every days is checked
   verify that repeat weekday is not checked
   * */

    @Test
    public void test1(){

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsDriver();

        DashboardPage dashboardPage = new DashboardPage();

        dashboardPage.navigateToModule("Activities","Calendar Events");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        calendarEventsPage.waitUntilLoaderScreenDisappear();

        BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEvent,5);

        calendarEventsPage.createCalendarEvent.click();

        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();

        WebElement repeatBtn = createCalendarEventsPage.repeat;

        repeatBtn.click();

        Assert.assertTrue(createCalendarEventsPage.days.isSelected(),"verify that is selected");

        Assert.assertFalse(createCalendarEventsPage.weekday.isSelected(),"verify is no selected");








    }



      /*
     VERIFY REPEAT OPTIONS
        Open Chrome browser
        Login as driver
        Go to Activities->Calendar Events
        Click on create calendar events button
        Click on repeat checkbox
        Verify that repeat options are Daily, Weekly, Monthly,Yearly(in this order)
     */


    @Test
    public void test2(){


        LoginPage loginPage = new LoginPage();

        loginPage.loginAsDriver();

        DashboardPage dashboardPage = new DashboardPage();

        dashboardPage.navigateToModule("Activities","Calendar Events");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        calendarEventsPage.waitUntilLoaderScreenDisappear();

        BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEvent,5);

        calendarEventsPage.createCalendarEvent.click();

        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();

        WebElement repeatBtn = createCalendarEventsPage.repeat;

        repeatBtn.click();

        Select repeatsDropdown = createCalendarEventsPage.repeatOptionsList();

        //Verify that repeat options are Daily, Weekly, Monthly,Yearly(in this order)

        List<String> expectedList = Arrays.asList("Daily","Weekly","Monthly","Yearly");

        List<WebElement> actualOptions = repeatsDropdown.getOptions();

        List<String> actualList = new ArrayList<>();

        for (WebElement options : actualOptions) {

            actualList.add(options.getText());

        }

        Assert.assertEquals(actualList,expectedList,"verify that lists are same");





    }


}
