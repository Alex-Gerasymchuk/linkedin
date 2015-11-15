package com.linkedin;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {
        private LoginRegistrationPage loginRegistrationPage;
        private HomePage homePage;
        private ProfilePage profilePage;

        @Test
        public void userLoginTest() {
            String useEmail = "testautomation.acc@gmail.com";
            String usePassword = "Testautomation123";
            loginRegistrationPage = PageFactory.initElements(new FirefoxDriver(), LoginRegistrationPage.class);
            loginRegistrationPage.open();
            homePage = loginRegistrationPage.loginUser(useEmail, usePassword);
            Assert.assertTrue(homePage.isPageLoaded());

            profilePage = homePage.openProfilePage();

            //loginRegistrationPage.close();

        }

}
