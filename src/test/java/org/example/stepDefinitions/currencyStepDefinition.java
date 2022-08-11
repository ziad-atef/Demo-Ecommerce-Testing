package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.openqa.selenium.Keys;

public class currencyStepDefinition {
    homePage home = new homePage();

    @Given("user go to home page")
    public void goHome() {
        home.homeLink().click();
    }
    @When("select Euro currency from the dropdown")
    public void changeCurrency() {
        home.currencyMenu().sendKeys("Euro");
        home.currencyMenu().sendKeys(Keys.ENTER);
    }
    @Then("Euro Symbol is shown on the 4 products displayed in Home page")
    public void assertCurrencyChange() {

    }
}
