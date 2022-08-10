package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class resetPasswordPage {
    public WebElement emailTextbox()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement recoverButton()
    {
        return Hooks.driver.findElement(By.name("send-email"));
    }
}
