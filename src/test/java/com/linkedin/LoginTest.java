package com.linkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public static void errorOnLoginWithInvalidCredentials() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.linkedin.com/");
        driver.findElement(By.id("login-email")).sendKeys("Alex@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("1234222789");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(5000);
        WebElement errorMassage = driver.findElement(By.xpath("//*[text()='There were one or more errors in your submission. Please correct the marked fields below.']"));
        //There were one or more errors in your submission. Please correct the marked fields below.
        Assert.assertTrue(errorMassage.isDisplayed(),"Element is not Displayed");
    }
}
