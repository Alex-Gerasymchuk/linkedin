package com.linkedin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
    @FindBy(id="first-name")
    private WebElement firstNameInput;

    @FindBy(id="last-name")
    private WebElement lastNameInput;

    @FindBy(id="join-email")
    private WebElement emailInput;

    @FindBy (id="join-password")
    private WebElement passwordInput;

    @FindBy (className="btn btn-primary join-btn")
    private WebElement joinButton;
}
