package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPage {
    public WebElement loginLink()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement emailTestbox()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement passwordTextbox()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement loginButton()
    {
        return Hooks.driver.findElement(By.className("login-button"));
    }
    public WebElement forgotPassword()
    {
        return Hooks.driver.findElement(By.linkText("Forgot password?"));
    }
    public WebElement errorMessage() { return  Hooks.driver.findElement(By.className("message-error")); }
    public WebElement confirmationMessage() {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\""));
    }
    public void login(String email, String password) {
        emailTestbox().sendKeys(email);
        passwordTextbox().sendKeys(password);
        loginButton().click();
    }
}

