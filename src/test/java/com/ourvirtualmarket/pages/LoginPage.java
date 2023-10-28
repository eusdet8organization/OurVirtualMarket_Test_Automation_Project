package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    @FindBy(id = "email")
    private WebElement emailAddressBar;

    @FindBy(id = "pass")
    private WebElement passwordBar;

    @FindBy(xpath = "//label[.='Login with your social account']")
    private WebElement loginWithYourSocialAccountText;

    @FindBy(className = "btn-social-icon")
    private List<WebElement> socialMediaElements;

    @FindBy(id = "send2")
    private WebElement loginButton;

    @FindBy(className = "btn-reg-popup")
    private WebElement createAnAccountText;

    @FindBy(className = "close-login")
    private WebElement loginCloseButton;

    public void verifyLoginPageStructure() {
        BrowserUtils.waitForVisibility(emailAddressBar,4);

        BrowserUtils.verifyElementDisplayed(emailAddressBar);
        BrowserUtils.verifyElementDisplayed(passwordBar);
        BrowserUtils.verifyElementDisplayed(loginWithYourSocialAccountText);
        Assert.assertEquals(4,socialMediaElements.size());
        BrowserUtils.verifyElementDisplayed(loginButton);
        BrowserUtils.verifyElementDisplayed(createAnAccountText);
        BrowserUtils.verifyElementDisplayed(loginCloseButton);
    }

    public void login(String email, String password) {
        emailAddressBar.sendKeys(email);
        passwordBar.sendKeys(password);
        loginButton.click();
    }
}
