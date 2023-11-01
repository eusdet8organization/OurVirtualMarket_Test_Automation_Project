package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@class='popup-close']")
    private WebElement popUpCloseButton;
    @FindBy(css = ".link-lg")
    private WebElement loginButton;
    @FindBy(css = ".link-lg")
    private WebElement logoutButton;
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

    @FindBy(className = "popup-title")
    public WebElement newsletterPopUpTitle;

    @FindBy(name = "submit")
    public WebElement newsletterSubmitButton;

    @FindBy(id = "txtemail")
    public WebElement newsletterSubmitTextArea;

    @FindBy(xpath = "//div[@role='alert'][contains(.,'Subcription was successfull')]")
    public WebElement subcriptionSuccessfullText;

    @FindBy(xpath = "//div[@role='alert'][contains(.,'Email has already exist')]")
    public WebElement subcriptionErrorText;

    @FindBy(xpath = "//h1[.='Account Logout']")
    public WebElement accountLogoutText;

    @FindBy(css = ".title-category ")
    public WebElement categoryTitle;

    @FindBy(id = "content")
    public WebElement logoutParagraph;

    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continueButton;


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

    public void verifyNewsletterPopUp() {
        BrowserUtils.verifyElementDisplayed(newsletterPopUpTitle);
    }

    public void scrollToBottom() {
        BrowserUtils.scrollToElement(newsletterSubmitButton);
    }

    public void verifyNewsletterPopUpAtBottom() {
        BrowserUtils.verifyElementDisplayed(newsletterSubmitButton);
    }

    public void enterEmailToSubscribe() {
        newsletterSubmitTextArea.sendKeys("testmail5@testmail.com");
        newsletterSubmitButton.click();
    }

    public void verifySubscriptionSuccess() {
        BrowserUtils.verifyElementDisplayed(subcriptionSuccessfullText);
    }

    public void verifySubscriptionError() {
        BrowserUtils.verifyElementDisplayed(subcriptionErrorText);
    }

    public void logout() {
        logoutButton.click();
    }

    public void verifyLogout() {
        BrowserUtils.verifyElementDisplayed(accountLogoutText);
    }

    public void verifyNewsletterPopUpNotVisible() {
        BrowserUtils.verifyElementNotDisplayed(By.className("popup-title"));
    }

    public void enterInvalidEmailToSubscribe() {
        newsletterSubmitTextArea.sendKeys("");
        newsletterSubmitButton.click();
    }

    public void verifyEmailRequired() {
        Alert alert = Driver.get().switchTo().alert();
        Assert.assertEquals(alert.getText(), "Email is required");
    }

    public void selectCategory(String category) {
        BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//div[@class='nav-secondary']/descendant::a[text()='" + category + "']")));
    }

    public void verifyLogoutWithExtraInfo() {
        BrowserUtils.verifyElementDisplayed(accountLogoutText);
        Assert.assertTrue(logoutParagraph.getText().contains("You have been logged off your account. It is now safe to leave the computer."));
        Assert.assertTrue(logoutParagraph.getText().contains("Your shopping cart has been saved, the items inside it will be restored whenever you log back into your account."));
        BrowserUtils.verifyElementDisplayed(continueButton);
    }

    public void navigateBack() {
        Driver.get().navigate().back();
    }
}