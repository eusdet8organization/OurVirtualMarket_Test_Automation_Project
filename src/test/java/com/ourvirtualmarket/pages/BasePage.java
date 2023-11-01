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

    @FindBy(id = "cart")
    public WebElement shoppingBag;
    @FindBy(xpath = "//input[@name='search']")
    protected WebElement searchBar;
    @FindBy(xpath = "//button[@name='submit_search']")
    protected WebElement searchButton;






    @FindBy(xpath = "//strong[contains(.,'Home')]")
    protected WebElement homeButton;

}
