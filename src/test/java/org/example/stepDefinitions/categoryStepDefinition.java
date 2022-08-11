package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class categoryStepDefinition {

    WebElement randomItem = null;
    homePage home = new homePage();

    @When("user hovers over any random category")
    public void chooseRandomCategory() {

        Actions action = new Actions(Hooks.driver);

        do {
            randomItem = home.categories().get( new Random().nextInt(home.categories().size()) );
            System.out.println(randomItem.getText());
        }while(randomItem.getText() == "");
        action.moveToElement(randomItem).perform();
    }
    @And("user clicks sub-category if found")
    public void chooseRandomSubCategory() {

        Actions action = new Actions(Hooks.driver);

        if(randomItem.findElements(By.tagName("li")).size() > 0){
            randomItem = randomItem.findElements(By.tagName("li")).get( new Random().nextInt(3) );
            action.moveToElement(randomItem).perform();
            randomItem.click();
        }else{
            randomItem.click();
        }
    }
    @Then("page title should contain category or sub-category name")
    public void assertSucess() {

    }
}
