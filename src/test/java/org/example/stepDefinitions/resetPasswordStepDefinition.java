package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.loginPage;
import org.example.pages.resetPasswordPage;
import org.testng.asserts.SoftAssert;

public class resetPasswordStepDefinition {

    loginPage login = new loginPage();
    resetPasswordPage reset = new resetPasswordPage();

    @When("select forgot password")
    public void toForgotPassword() {
        login.forgotPassword().click();
    }
    @And("types registered email")
    public void typeEmail() {
        reset.emailTextbox().sendKeys("test@example.com");
    }
    @And("press on recover button")
    public void recover() {
        reset.recoverButton().click();
    }
    @And("confirmation message is displayed")
    public void assertSucess() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(login.confirmationMessage().isDisplayed());
        soft.assertTrue(login.confirmationMessage().getText().contains("Email with instructions has been sent to you."));
    }
}
