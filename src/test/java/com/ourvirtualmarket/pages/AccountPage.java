package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(id = "content")
    protected WebElement myAccountText;

    @FindBy(linkText = "My Account")
    protected WebElement myAccountButton;

    @FindBy(linkText = "Address Book")
    protected WebElement addressBookButton;

    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continueButton;

    public void verifyLogin() {
        Assert.assertEquals("https://ourvirtualmarket.com/index.php?route=account/account", Driver.get().getCurrentUrl());
    }

    public void clickTelevisionMenu() {
        televisionButton.click();
    }

    public void clickHomeMenu() {
        homeButton.click();
    }

    public void verifyAccountPage() {
        BrowserUtils.verifyElementDisplayed(myAccountText);
    }

    public void clickMyAccountButton() {
        myAccountButton.click();
    }

    public void clickAddressBookButton() {
        addressBookButton.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
