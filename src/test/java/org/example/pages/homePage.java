package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

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
    public List<WebElement> categories() { return Hooks.driver.findElement(By.className("top-menu")).findElements(By.tagName("li")); }
    public WebElement wishlistButton() { return Hooks.driver.findElement(By.cssSelector("div[data-productid=\"18\"]")).findElement(By.className("add-to-wishlist-button")); }
    public By wishlistSucessMessageSelector() { return By.cssSelector("p[class=\"content\"]"); }
    public WebElement wishlistSucessMessage() { return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]")); }
    public WebElement wishlist() { return Hooks.driver.findElement(By.className("ico-wishlist")); }
    public WebElement addToCart() { return Hooks.driver.findElement(By.cssSelector("div[data-productid=\"18\"]")).findElement(By.className("product-box-add-to-cart-button")); }
    public By shoppingCartSucessMessageSelector() { return By.cssSelector("p[class=\"content\"]"); }
    public WebElement shoppingCart() { return Hooks.driver.findElement(By.className("ico-cart")); }
    public WebElement firstSliderController() { return Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]")); }
    public WebElement firstSlider() { return Hooks.driver.findElement(By.id("nivo-slider")); }
    public WebElement secondSliderController() { return Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]")); }
    public WebElement secondSlider() { return Hooks.driver.findElement(By.id("nivo-slider")); }
    public WebElement facebookIcon() { return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]")); }
    public WebElement twitterIcon() { return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]")); }
    public WebElement rssIcon() { return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]")); }
    public WebElement youtubeIcon() { return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]")); }

}
