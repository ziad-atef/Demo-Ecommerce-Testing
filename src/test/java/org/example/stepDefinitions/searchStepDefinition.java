package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.example.pages.loginPage;
import org.example.pages.productGalleryPage;
import org.example.pages.productPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class searchStepDefinition {

    loginPage login = new loginPage();
    homePage  home  = new homePage();
    productGalleryPage gallery = new productGalleryPage();
    productPage product = new productPage();

    @Given("user has logged in")
    public void login() {
        login.loginLink().click();
        login.login("test@example.com","P@ssw0rd");
    }
    @And("user is at home page")
    public void toHome() {
        home.homeLink().click();
    }
    @When("^user enter product name as \"(.*)\"$")
    public void typeProductName(String item) {
        home.searchTextbox().sendKeys(item);
    }
    @And("user press enter")
    public void pressEnter() {
        home.searchTextbox().sendKeys(Keys.ENTER);
    }
    @Then("^search results should appear and contain \"(.*)\"$")
    public void assertSucess(String item) {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue( Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        List<WebElement> products = gallery.products();
        for (WebElement product : products) {
            soft.assertTrue( gallery.productTitle(product).getText().toLowerCase().trim().contains(item) );
        }
        soft.assertAll();
    }
    @When("^user enter product sku as \"(.*)\"$")
    public void typeProductSKU(String sku) {
        home.searchTextbox().sendKeys(sku);
    }

    @Then("search result should contain {string}")
    public void searchResultShouldContain(String item) {
        List<WebElement> products = gallery.products();
        for (WebElement product : products) {
            product.click();
            System.out.println(this.product.getSKU().getText());
            System.out.println(item);
            Assert.assertTrue( this.product.getSKU().getText().toLowerCase().trim().contains(item.toLowerCase()) );
        }
    }
}
