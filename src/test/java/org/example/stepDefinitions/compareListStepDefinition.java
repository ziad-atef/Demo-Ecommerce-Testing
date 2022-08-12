package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.Random;

public class compareListStepDefinition {
    String firstProduct;
    String secondProduct;

    homePage home = new homePage();
    @When("user adds a product to compare list")
    public void addFirstProduct() {
        WebElement product = home.productCard().get( new Random().nextInt(4));
        home.addToCompareListButton(product).click();
        firstProduct = home.productTitle(product).getText();
    }

    @Then("item should be added to compare list")
    public void itemShouldBeAddedToCompareList() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue( home.compareListSuccessMessage().getText().contains("The product has been added ") );
        WebElement parent = (WebElement) ((JavascriptExecutor) Hooks.driver).executeScript(
                "return arguments[0].parentNode;", home.compareListSuccessMessage());
        soft.assertEquals( parent.getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        soft.assertAll();
    }

    @And("user adds another product to compare list")
    public void userAddsAnotherProductToCompareList() {
        WebElement product = null;
        do {
            product = home.productCard().get( new Random().nextInt(4));
            secondProduct = home.productTitle(product).getText();
        }while (secondProduct.equals(firstProduct));
        home.addToCompareListButton(product).click();
    }

    @And("user navigates to compare list")
    public void userNavigatesToCompareList() {
        home.compareListLink().click();
    }

    @Then("chosen products should appear in the compare list")
    public void chosenProductsShouldAppearInTheCompareList() {

    }
}
