package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class productGalleryPage {

    public WebElement pageTitle() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"] > h1"));
    }
    public List<WebElement> products() {
        return Hooks.driver.findElements(By.className("product-item"));
    }

    public WebElement productTitle(WebElement product) {
        return product.findElement(By.cssSelector("h2[class=\"product-title\"] > a"));
    }
}
