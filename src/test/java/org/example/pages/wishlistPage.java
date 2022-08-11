package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class wishlistPage {
    public WebElement itemQuantity() {
        return Hooks.driver.findElement(By.className("quantity"));
    }
}
