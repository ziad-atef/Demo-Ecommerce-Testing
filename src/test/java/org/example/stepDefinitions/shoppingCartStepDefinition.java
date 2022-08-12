package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.cartPage;
import org.example.pages.homePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class shoppingCartStepDefinition {

    homePage home = new homePage();
    cartPage cart = new cartPage();
    @When("user click add to Shopping cart button")
    public void addToShoppingCart() {
        home.addToCart().click();
    }
    @Then("item should be added to Shopping cart")
    public void assertSuccessMessage() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue( home.shoppingCartSuccessMessage().getText().contains("The product has been added ") );
        WebElement parent = (WebElement) ((JavascriptExecutor) Hooks.driver).executeScript(
                "return arguments[0].parentNode;", home.shoppingCartSuccessMessage());
        soft.assertEquals( parent.getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        soft.assertAll();
    }
    @And("user wait until Shopping cart success message disappears")
    public void waitForMessage() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(home.shoppingCartSuccessMessageSelector()));
    }
    @And("user clicks Shopping cart tab")
    public void openWishlist() {
        home.shoppingCart().click();
    }
    @Then("item quantity in Shopping cart should be > 0")
    public void assertItemAdded() {
        List<WebElement> products = cart.getProducts();
        Assert.assertTrue( Integer.parseInt(cart.getProductQuantity(products.get(0)).getAttribute("value")) > 0);
    }
}
