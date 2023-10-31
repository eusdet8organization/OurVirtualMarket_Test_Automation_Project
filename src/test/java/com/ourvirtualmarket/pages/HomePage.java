package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@class='popup-close']")
    private WebElement popUpCloseButton;
    @FindBy(css = ".link-lg")
    private WebElement loginButton;
    @FindBy(xpath = "(//a[text()='Register'])[2]")
    private WebElement registerButton;

    @FindBy(xpath = "//span[text()='Trending items']")
    public WebElement trendingItemsLabel;

    @FindBy(css = ".left-block a[title*='NHD146 Hair']")
    public WebElement hairProduct;

    @FindBy(css = "button[onclick*='7487326 ']")
    public WebElement addToCartButtonSmall;

    @FindBy(css = ".alert.alert-success")
    public WebElement succesMessageAddToCart;

    @FindBy(linkText = "Checkout")
    public WebElement checkoutButton;
    @FindBy(css = ".popup-close")
    public WebElement popupClose;
    @FindBy(css = ".sticky-categories")
    public WebElement categoriesButton;

    @FindBy(css = "div[class='nav-secondary'] a")  //div[@class='nav-secondary']//a
    public List<WebElement> categories;



    public void verifyHomePage() {
        Assert.assertEquals(ConfigurationReader.get("url"), Driver.get().getCurrentUrl());
    }

    public void closeNewsletterPopUp() {
        popUpCloseButton.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }
    public void clickRegisterButton() {
        registerButton.click();
    }
}
