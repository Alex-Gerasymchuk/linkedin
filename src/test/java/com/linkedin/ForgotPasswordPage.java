package com.linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage {
    protected WebDriver driver;

    public ForgotPasswordPage (WebDriver driver){
        this.driver = driver;
    }

    @FindBy (id = "email-requestPasswordReset")
    private WebElement InputEmailForgotPage;

    @FindBy (xpath="//*[@type='submit']")
    private WebElement ButtonContinueForgotPassword;

    @FindBy (xpath="//a[@target='_blank']")
    private WebElement ButtonCheckEmail;


    public void changePasswordForm (String userEmailForgotPassword ){
        InputEmailForgotPage.sendKeys("testautomation.acc@gmail.com");
        ButtonContinueForgotPassword.click();
        ButtonCheckEmail.click();
    }


}

