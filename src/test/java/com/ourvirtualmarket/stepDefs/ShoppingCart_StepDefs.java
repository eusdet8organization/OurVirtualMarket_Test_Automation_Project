package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.ShoppingCartPage;
import io.cucumber.java.en.Then;

public class ShoppingCart_StepDefs {

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Then("Verify that the user is on the Shopping Cart page")
    public void verify_that_the_user_is_on_the_shopping_cart_page() {
        shoppingCartPage.verifyShoppingCartPage();
    }

    @Then("Verify that {string} product is in shopping cart")
    public void verify_that_product_is_in_shopping_cart(String product) {
        shoppingCartPage.verifyProductInShoppingCart(product);
    }

}
