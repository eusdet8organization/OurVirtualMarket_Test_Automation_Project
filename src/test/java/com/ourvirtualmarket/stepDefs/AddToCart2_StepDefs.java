package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.HomePage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class AddToCart2_StepDefs {

    HomePage homePage = new HomePage();

    @When("The user scrolls up to the Trending Items section on the home page")
    public void the_user_scrolls_up_to_the_section_on_the_home_page() {
        BrowserUtils.scrollToElement(homePage.trendingItemsLabel);
    }

    @And("The user adds the product {string} in the Add to Cart")
    public void theUserAddsTheProductInTheAddToCart(String product) {
        homePage.addAnyProduct(product);
    }

    @Then("It is verified that success message displayed")
    public void it_is_verified_that_success_message_displayed() {
        homePage.succesMessageAddedToCart();
    }

    @When("The user clicks on Shopping Cart")
    public void the_user_clicks_on() {
        homePage.shoppingBag.click();
        BrowserUtils.waitFor(2);
    }

    @Then("It is verified that the added product is in the cart")
    public void it_is_verified_that_the_added_product_is_in_the_cart() {
        Assert.assertTrue(homePage.checkoutButton.isDisplayed());
    }


}
