package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class homePage {
    public WebElement homeLink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/\"]"));
    }
    public WebElement registerLink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement loginLink()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement currencyMenu() { return Hooks.driver.findElement(By.id("customerCurrency")); }
    public WebElement dollarCurrency() { return Hooks.driver.findElement(By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2Fregister%3FreturnUrl%3D%2F\"]")); }
    public WebElement euroCurrency() { return Hooks.driver.findElement(By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2Fregister%3FreturnUrl%3D%2F\"]")); }
    public WebElement searchTextbox() { return Hooks.driver.findElement(By.id("small-searchterms")); }

}
