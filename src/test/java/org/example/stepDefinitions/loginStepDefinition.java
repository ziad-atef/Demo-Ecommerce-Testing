package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.homePage;
import org.example.pages.loginPage;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class loginStepDefinition {
    loginPage login = new loginPage();
    homePage home = new homePage();
    @Given("user go to login page")
    public void goLoginPage() {
        login.loginLink().click();
    }
    @When("user login with {string} and {string}")
    public void typeLoginData(String email, String password) {
        login.emailTestbox().sendKeys(email);
        login.passwordTextbox().sendKeys(password);
    }
    @And("user press on login button")
    public void login() {
        login.loginButton().click();
    }
    @Then("user login to the system successfully")
    public void assertSuccessfulLogin() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue( Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/") );
        soft.assertTrue( home.accountTab().isDisplayed() );
        soft.assertAll();
    }
    @Then("user could not login to the system")
    public void assertFailedLogin() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue( login.errorMessage().getText().contains("Login was unsuccessful.") );
        soft.assertEquals( Color.fromString(login.errorMessage().getCssValue("color")).asHex(), "#e4434b");
        soft.assertAll();
    }
}
