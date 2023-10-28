package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Then("Verify that Login page have the necessary structure")
    public void verify_that_login_page_have_the_necessary_structure() {
        loginPage.verifyLoginPageStructure();
    }

    @When("The user logins with credentials {string} and {string}")
    public void the_user_logins_with_credentials_and(String email, String password) {
        loginPage.login(email, password);
    }
}
