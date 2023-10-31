package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "wishlist-total")
    protected WebElement myWishlistButton;

    @FindBy(className = "style-page")
    protected WebElement televisionButton;

    @FindBy(css = ".fa.fa-shopping-bag")
    public WebElement shoppingBag;

    @FindBy(xpath = "//strong[contains(.,'Home')]")
    protected WebElement homeButton;

}
