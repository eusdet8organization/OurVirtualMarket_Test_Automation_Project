package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.HomePage;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePage_StepDefs {

    HomePage homePage = new HomePage();

    @Given("The user is on the homepage")
    public void the_user_is_on_the_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user closes Newsletter pop-up")
    public void the_user_closes_newsletter_pop_up() {
        homePage.closeNewsletterPopUp();
    }

    @Then("Verify that the user is on the homepage")
    public void verify_that_the_user_is_on_the_homepage() {
        homePage.verifyHomePage();
    }

    @When("The user clicks Login button")
    public void the_user_clicks_login_button() {
        homePage.clickLoginButton();
    }

    @Then("Verify that the user has successfully logged in and is on the My Account page")
    public void verify_that_the_user_has_successfully_logged_in_and_is_on_the_my_account_page() {
        homePage.verifyLogin();
    }
}
