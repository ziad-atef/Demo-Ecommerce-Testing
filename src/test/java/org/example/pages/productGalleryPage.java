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
    public WebElement productImage(WebElement product) {
        return product.findElement(By.cssSelector("div[class=\"picture\"] > a"));
    }
    public List<WebElement> colors() {
        return Hooks.driver.findElements(By.cssSelector("li[class=\"item color-item\"]"));
    }

    public String colorName(WebElement color){
        return color.findElement(By.tagName("label")).getText();
    }

}
