package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.HomePage;
import com.ourvirtualmarket.pages.SearchPage;
import com.ourvirtualmarket.pages.SearchResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_StepDefs {

    HomePage homePage=new HomePage();
    SearchResultPage searchResultPage = new SearchResultPage();
    @Then("Verify that a search bar and search button become visible on the main page.")
    public void verify_that_a_search_bar_and_search_button_become_visible_on_the_main_page() {
       homePage.verifySearchBarAndSearchButton();
    }
    @Then("Verify that by default ,{string} appears in the search bar.")
    public void verify_that_by_default_appears_in_the_search_bar(String string) {
       homePage.verifySearchBarDefaultValue();
    }
   @When("The user writes a {string} in the search bar and clicks search button.")
    public void the_user_writes_a_in_the_search_bar_and_clicks_search_button(String product) {
       homePage.sendProductToSearchBar(product);
    }
    @Then("Verify that the user is directed to the page where the product related to the given order are found.")
    public void verify_that_the_user_is_directed_to_the_page_where_the_product_related_to_the_given_order_are_found() {
        searchResultPage.verifySearchResultPageName();
    }






}
