package com.linkedin;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginRegistrationPage open () {
        driver.get("https://www.Linkedin.com/");
        return new LoginRegistrationPage(driver);
    }

    public boolean isPageLoaded(String pageTitle) {
        if (driver.getTitle().contentEquals(pageTitle)) {
            return true;
        }
        return false;
    }
}
