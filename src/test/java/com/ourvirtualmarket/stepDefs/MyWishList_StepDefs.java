package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.MyWishListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyWishList_StepDefs {

    MyWishListPage myWishListPage = new MyWishListPage();

    @Then("Verify that the user is on the My Wish List page")
    public void verify_that_the_user_is_on_the_my_wish_list_page() {
        myWishListPage.verifyMyWishListPage();
    }

    @Then("Verify that there are {string} products in the My Wish List")
    public void verify_that_there_are_products_in_the_my_wish_list(String productsNumber) {
        myWishListPage.verifyProductsNumber(productsNumber);
    }

    @When("The user clicks remove button for {string} product")
    public void the_user_clicks_remove_button_for_product(String product) {
        myWishListPage.removeProduct(product);
    }

    @Then("Verify Success Message on the My Wish List page")
    public void verify_success_message_on_the_my_wish_list_page() {
        myWishListPage.verifySuccessMessage();
    }

    @When("The user clicks add to cart button for {string} product")
    public void the_user_clicks_add_to_cart_button_for_product(String product) {
        myWishListPage.addToCart(product);
    }

    @Then("Verify {string} text")
    public void verify_text(String addedToCartMessage) {
        myWishListPage.verifyAddedToCartMessage(addedToCartMessage);
    }

    @When("The user should click on View Cart button.")
    public void the_user_should_click_on_view_cart_button() {
        myWishListPage.clickViewCartButton();
    }

    @When("The user should click on Continue Shopping button.")
    public void theUserShouldClickOnContinueShoppingButton() {
        myWishListPage.clickContinueShopping();
    }
}
