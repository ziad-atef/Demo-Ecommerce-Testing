package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import org.example.pages.registerPage;

public class registerStepDefinition {

    registerPage register = new registerPage();
    @Given("user go to register page")
    public void goRegisterPage()
    {
        register.registerlink().click();
    }

}
