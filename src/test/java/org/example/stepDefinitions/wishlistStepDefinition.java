package org.example.stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class wishlistStepDefinition {

    homePage home = new homePage();
    @When("user click add to wishlist button")
    public void addToWishlist() {
        home.wishlistButton().click();
    }

    @Then("item should be added to wishlist")
    public void assertSuccess(){

    }

    @And("user wait until success message disappears")
    public void waitForMessage() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(home.wishlistSucessMessageSelector()));
    }
    @And("user clicks wishlist tab")
    public void openWishlist() {
        home.wishlist().click();
    }
    @Then("item quantity in wishlist should be > 0")
    public void assertItemAdded() {

    }
}
