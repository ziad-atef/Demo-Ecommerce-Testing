package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.example.pages.loginPage;
import org.openqa.selenium.Keys;

public class searchStepDefinition {

    loginPage login = new loginPage();
    homePage  home  = new homePage();

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

    }
    @When("^user enter product sku as \"(.*)\"$")
    public void typeProductSKU(String sku) {
        home.searchTextbox().sendKeys(sku);
    }
}
