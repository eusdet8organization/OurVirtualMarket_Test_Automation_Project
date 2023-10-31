package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_StepDefs {
    RegisterPage registerPage=new RegisterPage();

    @And("The user Register with credentials {string},{string},{string},{string},{string} and {string}")
    public void theUserRegisterWithCredentialsAnd(String FirstName, String LastName, String Email, String Telephone, String Password, String PasswordConfirm) {

        registerPage.register(FirstName,LastName,Email,Telephone,Password,PasswordConfirm);
    }

    @When("The user clicks Privacy Policy")
    public void theUserClicksPrivacyPolicy() {

        registerPage.privacyPolicyChekBox();
    }

    @And("The user clicks Continue")
    public void theUserClicksContinue() {
        registerPage.continueSabmit();
    }

    @Then("Verify Success Message on the register page")
    public void verifySuccessMessageOnTheRegisterPage() {
        registerPage.verifySuccessRegister();
    }

    @Then("Verify Warning Message with register")
    public void verifyWarningMessageWithRegister() {
        registerPage.warningMessage();
    }

    @Then("Verify Warning Message with Privacy Policy")
    public void verifyWarningMessageWithPrivacyPolicy() {

        registerPage.warningMessagePrivacyPolicy();
    }
}
