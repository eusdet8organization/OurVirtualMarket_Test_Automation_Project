package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckoutPage extends BasePage {

    @FindBy(id = "input-payment-firstname")
    public WebElement firstnameLabel;

    @FindBy(id = "input-payment-lastname")
    public WebElement lastnameLabel;

    @FindBy(id = "input-payment-company")
    public WebElement companyLabel;

    @FindBy(id = "input-payment-address-1")
    public WebElement address1Label;

    @FindBy(id = "input-payment-address-2")
    public WebElement address2Label;

    @FindBy(id = "input-payment-city")
    public WebElement cityLabel;

    @FindBy(id = "input-payment-postcode")
    public WebElement postcodeLabel;

    @FindBy(id = "input-payment-country")
    public WebElement countryLabel;

    @FindBy(id = "input-payment-zone")
    public WebElement zoneLabel;

    @FindBy(id = "button-payment-address")
    public WebElement billingContinueButton;


    @FindBy(css = "input[value='existing']")
    public WebElement existingAddressRadioButton;

    @FindBy(id = "button-shipping-address")
    public WebElement deliveryDetailsContinueButton;

    @FindBy(css = "input[name='shipping_method']")
    public WebElement inDeliveryMethodShippingRadioButton;

    @FindBy(id = "button-shipping-method")
    public WebElement deliveryMethodContinueButton;

    @FindBy(css = "input[name='payment_method']")
    public WebElement cashOnDeliveryRadioButton;

    @FindBy(css = "input[name='agree']")
    public WebElement conditionsButton;

    @FindBy(id = "button-payment-method")
    public WebElement continueButtonInPaymentMethod;

    @FindBy(xpath = "//div[@class='table-responsive']//thead//td")
    public List<WebElement> paymentColumnHeader;

    @FindBy(id = "button-confirm")
    public WebElement confirmOrderButton;

    @FindBy(xpath = "//div[@id='content']/p[1]")
    public WebElement successOrderMessage;

    @FindBy(css = "input[value='existing']")
    public WebElement existingAddressInBillingMenu;

    @FindBy(xpath = "//div[@id='collapse-shipping-method']//textarea")
    public WebElement commmentInDeliveryMethod;

    @FindBy(xpath = "//div[@id='collapse-payment-method']//textarea")
    public WebElement commmentInPaymentMethod;


    public void fillingBillingDetailsForm(String firstname, String lastname, String company, String address1, String address2, String city, String postcode) {
        Actions actions = new Actions(Driver.get());
        Select selectCountry = new Select(countryLabel);
        Select selectRegion = new Select(zoneLabel);
        actions.click(firstnameLabel)
                .sendKeys(firstname + Keys.TAB)
                .sendKeys(lastname + Keys.TAB)
                .sendKeys(company + Keys.TAB)
                .sendKeys(address1 + Keys.TAB)
                .sendKeys(address2 + Keys.TAB)
                .sendKeys(city + Keys.TAB)
                .sendKeys(postcode + Keys.TAB).perform();

        selectCountry.selectByIndex(4);
        selectRegion.selectByIndex(1);


    }


}
