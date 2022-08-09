package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class registerPage {
    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

}
