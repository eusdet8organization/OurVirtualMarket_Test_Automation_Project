package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    @FindBy(xpath = "//*[@id='input-firstname']")
    private WebElement firstNameBox;
    @FindBy(xpath = "//*[@id='input-lastname']")
    private WebElement lastNameBox;
    @FindBy(xpath = "//*[@id='input-email']")
    private WebElement emailBox;
    @FindBy(xpath = "//*[@id='input-telephone']")
    private WebElement telephoneBox;
    @FindBy(xpath = "//*[@id='input-password']")
    private WebElement passwordBox;
    @FindBy(xpath = "//*[@id='input-confirm']")
    private WebElement confirmBox;
    @FindBy(xpath = "//*[@name='agree']")
    private WebElement  PrivacyPolicyChekBox;
    @FindBy(xpath = "//*[@value='Continue']")
    private WebElement continueSubmit;
    @FindBy(xpath = "//a[text()='Success']")
    private WebElement success;
    @FindBy(xpath = "//div[@class='text-danger']")
    private WebElement warningMessage;
    @FindBy(xpath = "//div[contains(text(),'Warning: You must')]")
    private WebElement warningPrivacyPolicy;

    public void register(String FirstName, String LastName, String Email, String Telephone, String Password, String PasswordConfirm){

        firstNameBox.sendKeys(FirstName);
        lastNameBox.sendKeys(LastName);
        emailBox.sendKeys(Email);
        telephoneBox.sendKeys(Telephone);
        passwordBox.sendKeys(Password);
        confirmBox.sendKeys(PasswordConfirm);
    }
    public void  privacyPolicyChekBox(){
        PrivacyPolicyChekBox.click();
    }
    public void continueSabmit(){
        continueSubmit.click();
    }
    public void verifySuccessRegister(){
        BrowserUtils.verifyElementDisplayed(success);
    }
    public void warningMessage(){
        BrowserUtils.verifyElementDisplayed(warningMessage);
    }
    public void warningMessagePrivacyPolicy(){
        BrowserUtils.verifyElementDisplayed(warningPrivacyPolicy);
    }
}



