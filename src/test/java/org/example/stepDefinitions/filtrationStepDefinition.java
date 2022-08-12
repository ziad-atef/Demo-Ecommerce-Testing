package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.example.pages.productGalleryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class filtrationStepDefinition {

    String colorName;
    homePage home = new homePage();
    productGalleryPage gallery = new productGalleryPage();

    @When("user hovers over apparel")
    public void chooseApparel() {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(home.categories().get(8)).perform();
    }
    @And("user clicks shoes sub-category")
    public void chooseShoes() {
        Actions action = new Actions(Hooks.driver);
        WebElement shoes = home.subCategories( home.categories().get(8) ).get(0);
        action.moveToElement(shoes).perform();
        shoes.click();
    }
    @And("user chooses a color filter")
    public void pickColor() {
        WebElement color = gallery.colors().get( new Random().nextInt(3) );
        color.click();
        this.colorName =  gallery.colorName(color);
    }
    @Then("products having chosen color")
    public void assertSuccess() throws InterruptedException {

    }

}
