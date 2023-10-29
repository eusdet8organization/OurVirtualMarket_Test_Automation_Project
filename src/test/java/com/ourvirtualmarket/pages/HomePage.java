package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@class='popup-close']")
    private WebElement popUpCloseButton;

    @FindBy(css = ".link-lg")
    private WebElement loginButton;

    public void verifyHomePage() {
        Assert.assertEquals(ConfigurationReader.get("url"), Driver.get().getCurrentUrl());
    }

    public void closeNewsletterPopUp() {
        popUpCloseButton.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
