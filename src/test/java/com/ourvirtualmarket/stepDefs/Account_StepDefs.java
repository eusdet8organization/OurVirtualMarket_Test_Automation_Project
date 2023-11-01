package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.AccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Account_StepDefs {

    AccountPage accountPage = new AccountPage();

    @When("The user clicks Television menu")
    public void the_user_clicks_television_menu() {
        accountPage.clickTelevisionMenu();
    }

    @Then("Verify that the user has successfully logged in and is on the My Account page")
    public void verify_that_the_user_has_successfully_logged_in_and_is_on_the_my_account_page() {
        accountPage.verifyLogin();
    }

    @When("The user clicks on Home button")
    public void the_user_clicks_on_home_button() {
        accountPage.clickHomeMenu();
    }

    @Then("Verify that the user is on Account page")
    public void verify_that_the_user_is_on_account_page() {
        accountPage.verifyAccountPage();
    }

    @When("The user clicks My Account button")
    public void the_user_clicks_my_account_button() {
        accountPage.clickMyAccountButton();
    }

    @When("The user clicks Address Book button")
    public void the_user_clicks_address_book_button() {
        accountPage.clickAddressBookButton();
    }

    @When("The user clicks continue button on Account Page")
    public void theUserClicksContinueButtonOnAccountPage() {
        accountPage.clickContinueButton();
    }
}
