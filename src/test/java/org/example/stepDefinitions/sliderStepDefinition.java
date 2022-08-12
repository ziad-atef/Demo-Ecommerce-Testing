package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.testng.Assert;

public class sliderStepDefinition {

    homePage home = new homePage();

    @When("user click on first slider")
    public void clickFirstSlider() {
        home.firstSliderController().click();
        home.firstSlider().click();
    }
    @When("user click on second slider")
    public void clickSecondSlider() {
        home.secondSliderController().click();
        home.secondSlider().click();
    }
    @Then("user should be directed to {string}")
    public void assertURL(String url) {
        Assert.assertTrue( Hooks.driver.getCurrentUrl().contains(url) );
    }
}
