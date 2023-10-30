package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage {

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

    @FindBy(xpath = "//div[.=' Warning: No match for E-Mail Address and/or Password.']")
    private WebElement warningMessageText;

    public void verifyLoginPageStructure() {
        BrowserUtils.waitForVisibility(emailAddressBar, 4);

        BrowserUtils.verifyElementDisplayed(emailAddressBar);
        BrowserUtils.verifyElementDisplayed(passwordBar);
        BrowserUtils.verifyElementDisplayed(loginWithYourSocialAccountText);
        Assert.assertEquals(4, socialMediaElements.size());
        BrowserUtils.verifyElementDisplayed(loginButton);
        BrowserUtils.verifyElementDisplayed(createAnAccountText);
        BrowserUtils.verifyElementDisplayed(loginCloseButton);
    }

    public void login(String email, String password) {
        emailAddressBar.sendKeys(email);
        BrowserUtils.waitForVisibility(passwordBar, 5);
        passwordBar.sendKeys(password);
        loginButton.click();
    }


    public void login() {
        emailAddressBar.sendKeys(ConfigurationReader.get("userEmail"));
        passwordBar.sendKeys(ConfigurationReader.get("userPassword"));
        loginButton.click();
    }


    public void verifyInvalidLogin() {
        BrowserUtils.verifyElementDisplayed(warningMessageText);
    }
}
