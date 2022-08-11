package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class shoppingCartStepDefinition {

    homePage home = new homePage();
    @When("user click add to Shopping cart button")
    public void addToShoppingCart() {
        home.addToCart().click();
    }
    @Then("item should be added to Shopping cart")
    public void assertSuccessMessage() {

    }
    @And("user wait until Shopping cart success message disappears")
    public void waitForMessage() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(home.shoppingCartSucessMessageSelector()));
    }
    @And("user clicks Shopping cart tab")
    public void openWishlist() {
        home.shoppingCart().click();
    }
    @Then("item quantity in Shopping cart should be > 0")
    public void assertItemAdded() {

    }
}
