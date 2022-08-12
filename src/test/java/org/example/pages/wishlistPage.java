package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class wishlistPage {
    public List<WebElement> getProducts() {
        return Hooks.driver.findElements(By.cssSelector(" table[class=\"cart\"] > tbody > tr"));
    }
    public WebElement getProductQuantity(WebElement product){
        return product.findElement(By.className("qty-input"));
    }
}
