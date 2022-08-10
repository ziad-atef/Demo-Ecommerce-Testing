package org.example.stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.registerPage;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

import java.util.Random;

public class registerStepDefinition {

    registerPage register = new registerPage();
    Faker faker = new Faker();
    @Given("user go to register page")
    public void goRegisterPage()
    {
        register.registerLink().click();
    }
    @When("user select gender type")
    public void selectGender(){
        Random random = new Random();
        char gender = (random.nextFloat() >= 0.5)?'m':'f';
        if(gender == 'm')
            register.maleRadiobutton().click();
        else
            register.femaleRadiobutton().click();
    }
    @And("user enter first name {string} and last name {string}")
    public void typeName(String firstName, String lastName){
        register.firstNameTextbox().sendKeys(firstName);
        register.lastNameTextbox().sendKeys(lastName);
    }
    @And("user enter date of birth")
    public void enterBirthday(){

        register.daySelectMenu().click();
        register.daySelectMenu().sendKeys("5");
        register.daySelectMenu().sendKeys(Keys.ENTER);

        register.monthSelectMenu().click();
        register.monthSelectMenu().sendKeys("10");
        register.monthSelectMenu().sendKeys(Keys.ENTER);

        register.yearSelectMenu().click();
        register.yearSelectMenu().sendKeys("2020");
        register.yearSelectMenu().sendKeys(Keys.ENTER);

    }
    @And("user enter register email {string} field")
    public void typeEmail(String email){
        register.emailTextbox().sendKeys(email);
    }
    @And("user fills Password fields {string} {string}")
    public void typeAndConfirmPassword(String password, String confirmPassword){
        register.passwordTextbox().sendKeys(password);
        register.confirmpasswordTextbox().sendKeys(confirmPassword);
    }
    @And("user clicks on register button")
    public void register() {
        register.registerButton().click();
    }
    @Then("success message is displayed")
    public void assertSucessfulRegistration(){
        String expectedResult = "Your registration completed";
        SoftAssert soft = new SoftAssert();

        soft.assertTrue( register.confirmationMessage().getText().contains("Your registration completed") );
        soft.assertTrue( register.confirmationMessage().getCssValue("color").contains("rgba(76, 177, 124, 1)"));

        soft.assertAll();
    }
}
