package com.linkedin;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ForgotPasswordTest{
    private ForgotPasswordPage forgotPasswordPage;

    @Test
    public void verifySendEmailForgotPassword (){

        forgotPasswordPage = PageFactory.initElements(new FirefoxDriver(), ForgotPasswordPage.class);

        forgotPasswordPage.changePasswordForm("testautomation.acc@gmail.com");

    }
}
