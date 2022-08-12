package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class productPage {
    public WebElement getSKU() {
        return Hooks.driver.findElement(By.cssSelector(" div[class=\"sku\"] > span[class=\"value\"]"));
    }
}
