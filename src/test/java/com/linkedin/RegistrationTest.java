package com.linkedin;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegistrationTest {
    private LoginRegistrationPage registrationPage;
    @Test
    public void securityVerification(){
        registrationPage = PageFactory.initElements(new FirefoxDriver(), LoginRegistrationPage.class);
        registrationPage.open();
        registrationPage.submitRegistrationForm("First", "Last", "Linked.Alex@malinator.com", "P@ssw0rd");
        //registrationPage.close();
    }

}
