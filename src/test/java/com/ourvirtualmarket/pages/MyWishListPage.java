package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyWishListPage extends BasePage {

    @FindBy(xpath = "//h2[.='My Wish List']")
    private WebElement myWishListText;

    @FindBy(xpath = "//tbody//tr")
    private List<WebElement> productsList;

    @FindBy(xpath = " //div[@id='account-wishlist']//div[contains(.,'Success: You have modified your wish list!')]")
    private WebElement successMessageText;

    @FindBy(xpath = "(//a[.=' View Cart'])[2]")
    private WebElement viewCartButton;

    @FindBy(xpath = "//a[.='Continue shopping']")
    private WebElement continueShoppingButton;


    public void verifyMyWishListPage() {
        BrowserUtils.verifyElementDisplayed(myWishListText);
    }

    public void verifyProductsNumber(String productsNumber) {
        Assert.assertEquals(Integer.parseInt(productsNumber), productsList.size());
    }

    public void removeProduct(String product) {
        Driver.get().findElement(By.xpath("//a[contains(.,'" + product + "')]/../..//a[@data-original-title='Remove']")).click();
    }

    public void verifySuccessMessage() {
        BrowserUtils.verifyElementDisplayed(successMessageText);
    }

    public void addToCart(String product) {
        Driver.get().findElement(By.xpath("//a[contains(.,'" + product + "')]/../..//button[@data-original-title='Add to Cart']")).click();
    }

    public void verifyAddedToCartMessage(String addedToCartMessage) {
        BrowserUtils.waitForVisibility(Driver.get().findElement(By.xpath("//h4[.='" + addedToCartMessage + "']")), 4);
        BrowserUtils.verifyElementDisplayed(Driver.get().findElement(By.xpath("//h4[.='" + addedToCartMessage + "']")));
    }

    public void clickViewCartButton() {
        viewCartButton.click();
    }

    public void clickContinueShopping() {
        continueShoppingButton.click();
    }
}
