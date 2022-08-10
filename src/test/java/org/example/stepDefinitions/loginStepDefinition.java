package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.loginPage;
import org.testng.annotations.Test;

public class loginStepDefinition {
    loginPage login = new loginPage();

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
    public void assertSucessfulLogin() {

    }
    @Then("user could not login to the system")
    public void assertFailedLogin() {

    }
}
