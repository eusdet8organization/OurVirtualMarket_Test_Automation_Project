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

    @When("The user clicks Register button")
    public void theUserClicksRegisterButton() {
        homePage.clickRegisterButton();
    }

    @Then("Verify Newsletter pop-up")
    public void verify_newsletter_pop_up() {
        homePage.verifyNewsletterPopUp();
    }

    @When("The user scrolls down to bottom")
    public void the_user_scrolls_down_to_bottom() {
        homePage.scrollToBottom();
    }

    @Then("Verify that Newsletter subscription option is at the bottom")
    public void verify_that_newsletter_subscription_option_is_at_the_bottom() {
        homePage.verifyNewsletterPopUpAtBottom();
    }

    @When("The user enters valid email on the subscribe")
    public void the_user_enters_valid_email_on_the_subscribe() {
        homePage.enterEmailToSubscribe();
    }

    @Then("Verify Subscription was successful success message")
    public void verify_subscription_was_successful_success_message() {
        homePage.verifySubscriptionSuccess();
    }

    @Then("Verify Email has already exist Error message")
    public void verify_email_has_already_exist_error_message() {
        homePage.verifySubscriptionError();

    }

    @When("The user clicks Logout button")
    public void the_user_clicks_logout_button() {
        homePage.logout();
    }

    @Then("Verify the user logged out")
    public void verify_the_user_logged_out() {
        homePage.verifyLogout();
    }

    @Then("Verify that Newsletter is not visible")
    public void verify_that_newsletter_is_not_visible() {
        homePage.verifyNewsletterPopUpNotVisible();
    }

    @When("The user enters invalid email on the subscribe")
    public void theUserEntersInvalidEmailOnTheSubscribe() {
        homePage.enterInvalidEmailToSubscribe();
    }

    @Then("Verify Email is required alert message")
    public void verifyEmailIsRequiredAlertMessage() {
        homePage.verifyEmailRequired();
    }


}
