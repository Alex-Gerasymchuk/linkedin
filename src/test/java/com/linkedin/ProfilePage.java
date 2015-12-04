package com.linkedin;


import org.openqa.selenium.WebDriver;

public class ProfilePage extends AbstractPage {
    protected WebDriver driver;

    public ProfilePage(WebDriver driver){
        super(driver);
    }
    public void close() {
        driver.quit();
    }

}

