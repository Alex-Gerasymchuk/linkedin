package com.linkedin;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegistrationTest {
    private RegistrationPage registrationPage;
    @Test
    public void securityVerification(){
        registrationPage = PageFactory.initElements(new FirefoxDriver(), RegistrationPage.class);
        registrationPage.open();
        registrationPage.submitRegistrationForm("First", "Last", "Linked.Alex@malinator.com", "P@ssw0rd");
        //registrationPage.close();
    }

}
