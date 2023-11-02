package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.SearchResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart_StepDefs {

    SearchResultPage searchResultPage=new SearchResultPage();

    @When("The user choose a {string} on the search page and clicks it.")
    public void theUserChooseAOnTheSearchPageAndClicksIt(String product) {
        searchResultPage.theUserChooseAOnTheSearchPageAndClicksIt();
    }
    @Then("Verify that the user can go to the page where the relevant product is.")
    public void verify_that_the_user_can_go_to_the_page_where_the_relevant_product_is() {
        searchResultPage.verifyRelevantProductPage();

    }
    @Then("Verify that the relevant product displayes info.")
    public void verify_that_the_relevant_product_displayes_info() {
        searchResultPage.verifyProductInformations();
    }



}
