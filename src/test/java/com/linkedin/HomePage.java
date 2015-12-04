package com.linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class HomePage extends AbstractPage {
    protected WebDriver driver;

    public HomePage (WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Profile')]")
    private WebElement profileMenuLink;

    public ProfilePage openProfilePage(){
        profileMenuLink.click();
        return PageFactory.initElements(driver, ProfilePage.class);
    }


    public void close() {
        driver.quit();
    }

}
