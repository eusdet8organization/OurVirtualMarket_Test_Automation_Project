package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.TelevisionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Television_StepDefs {

    TelevisionPage televisionPage = new TelevisionPage();

    @Then("Verify that the user is on the Television page")
    public void verify_that_the_user_is_on_the_television_page() {
        televisionPage.verifyTelevisionPage();
    }

    @When("The user adds the product {string} in the My Wish List")
    public void theUserAddsTheProductLEDBacklitLCDTVInTheMyWishList(String product) {
        televisionPage.addProduct(product);
    }

    @Then("Verify Success Message on the Television page")
    public void verify_success_message_on_the_television_page() {
        televisionPage.verifyAddedMyWishListSuccessMessage();
    }

    @When("The user clicks My Wish List button")
    public void the_user_clicks_my_wish_list_button() {
        televisionPage.clickMyWishButton();
    }

}
