package com.ourvirtualmarket.pages;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//a[.='Shopping Cart']")
    private WebElement shoppingCartText;

    public void verifyShoppingCartPage() {
        BrowserUtils.verifyElementDisplayed(shoppingCartText);
    }

    public void verifyProductInShoppingCart(String product) {
        BrowserUtils.verifyElementDisplayed(Driver.get().findElement(By.xpath("(//tbody//tr//td[contains(.,'" + product + "')])[2]")));
    }
}
