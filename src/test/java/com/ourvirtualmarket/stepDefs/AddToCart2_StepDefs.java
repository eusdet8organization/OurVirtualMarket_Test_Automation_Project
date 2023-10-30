package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.HomePage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddToCart2_StepDefs {

    HomePage homePage = new HomePage();

    @When("The user scrolls up to the Trending Items section on the home page")
    public void the_user_scrolls_up_to_the_section_on_the_home_page() {
        BrowserUtils.scrollToElement(homePage.trendingItemsLabel);
    }

    @When("The user adds any product to the cart")
    public void the_user_adds_any_product_to_the_cart() {
        BrowserUtils.hover(homePage.hairProduct);
        BrowserUtils.waitFor(1);
        homePage.addToCartButtonSmall.click();
        BrowserUtils.waitFor(2);

    }

    @Then("It is verified that success message displayed")
    public void it_is_verified_that_success_message_displayed() {
        BrowserUtils.scrollToElement(homePage.succesMessageAddToCart);
        String message = homePage.succesMessageAddToCart.getText();
        Assert.assertTrue(message.contains("Succes"));

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
