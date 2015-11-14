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
        driver.findElement(By.id("login-email")).sendKeys("testautomation.acc@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Testautomation123");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(5000);
        WebElement errorMassage = driver.findElement(By.xpath("//*[@id='control_gen_2']/p/strong"));
        //There were one or more errors in your submission. Please correct the marked fields below.
        Assert.assertTrue(errorMassage.isDisplayed(),"Element is not Displayed");
    }
}
