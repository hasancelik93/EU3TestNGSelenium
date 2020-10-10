package com.cybertek.tests.day15_review;

import com.cybertek.pages.ContactInfoPage;
import com.cybertek.pages.ContactsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyContactInfoTest extends TestBase {

        @Test
        public void contactDetailsTest() throws InterruptedException {

            extentLogger = report.createTest("Contact info verification");


            LoginPage loginPage = new LoginPage();

            String username = ConfigurationReader.get("salesmanager_username");
            String password = ConfigurationReader.get("salesmanager_password");

            extentLogger.info("username "+ username);
            extentLogger.info("password" + password);
            extentLogger.info("Login as a salesmanager");

            loginPage.login(username,password);


            extentLogger.info("Navigete to --> Costumers > Contacts");

            // short way to navigate
            new DashboardPage().navigateToModule("Customers","Contacts");

            // mbrackstone9@example.com our email parameter

            ContactsPage contactsPage = new ContactsPage();

            extentLogger.info("Click on mbrackstone9@example.com");

            contactsPage.waitUntilLoaderScreenDisappear();
            contactsPage.getContactEmail("mbrackstone9@example.com").click();

            ContactInfoPage contactInfoPage = new ContactInfoPage();

            String expectedFullName= "Mariam Brackstone";
            String actualFullName= contactInfoPage.fullName.getText();

            extentLogger.info("Verify full name is "+ expectedFullName);
            Assert.assertEquals(actualFullName,expectedFullName,"verify fullname");

            extentLogger.info("verify email is mbrackstone9@example.com");
            Assert.assertEquals(contactInfoPage.email.getText(),"mbrackstone9@example.com","Verify email");

            extentLogger.info("verify phone number is +18982323434");
            Assert.assertEquals(contactInfoPage.phone.getText(),"+18982323434","verify phone number");

            extentLogger.pass("PASSED");


        }




}
