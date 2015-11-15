package com.linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginRegistrationPage {
    protected WebDriver driver;

    public LoginRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    //RegistrationElements:
    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "join-email")
    private WebElement emailInput;

    @FindBy(id = "join-password")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement joinButton;

    //Login elements:
    @FindBy(id = "login-email")
    private WebElement loginEmailInput;

    @FindBy(id = "login-password")
    private WebElement loginPasswordInput;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement loginSubmitButton;

    public HomePage loginUser (String useEmail, String usePassword){
        loginEmailInput.sendKeys(useEmail);
        loginPasswordInput.sendKeys(usePassword);
        loginSubmitButton.click();
        return PageFactory.initElements(driver, HomePage.class);

    }

    public void submitRegistrationForm(String firstName, String lastName, String email, String password) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        joinButton.click();
    }

    public void open() {
        driver.get("https://www.Linkedin.com/");
    }

    public void close() {
        driver.quit();
    }
}

