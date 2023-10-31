package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.CheckoutPage;
import com.ourvirtualmarket.pages.HomePage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class SuccessShopping_StepDefs {
    HomePage homePage = new HomePage();
    CheckoutPage checkoutPage = new CheckoutPage();
    @And("The user click the checkout button")
    public void theUserClickTheCheckoutButton() {
        homePage.checkoutButton.click();
        BrowserUtils.waitFor(2);
    }

    @And("The user fills the Billing Details form with: {string}, {string}, {string}, {string}, {string} , {string} and {string}")
    public void theUserFillsTheBillingDetailsFormWithAnd(String firstname, String lastname, String company, String address1, String address2, String city, String postcode) {
        checkoutPage.fillingBillingDetailsForm(firstname, lastname, company, address1, address2, city, postcode);

    }

    @And("The user clicks on the continue button")
    public void theUserClicksOnTheContinueButton() {
        checkoutPage.billingContinueButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify that the existing address is selected in the Delivery Details menu")
    public void verifyThatTheExistingAddressIsSelectedInTheDeliveryDetailsMenu() {
        checkoutPage.existingAddressRadioButton.isSelected();
    }

    @When("The user clicks the continue button in delivery details menu")
    public void theUserClicksTheContinueButtonInDeliveryDetailsMenu() {
        checkoutPage.deliveryDetailsContinueButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify that the flat shipping rate is selected in the delivery method menu")
    public void verifyThatTheFlatShippingRateIsSelectedInTheDeliveryMethodMenu() {
        checkoutPage.inDeliveryMethodShippingRadioButton.isSelected();
    }

    @When("The user clicks the continue button in delivery method menu")
    public void theUserClicksTheContinueButtonInDeliveryMethodMenu() {
        checkoutPage.deliveryMethodContinueButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify that the cash on delivery button is selected in the payment method menu")
    public void verifyThatTheCashOnDeliveryButtonIsSelectedInThePaymentMethodMenu() {
        checkoutPage.cashOnDeliveryRadioButton.isSelected();
    }

    @When("The user check the terms and conditions button")
    public void theUserCheckTheTermsAndConditionsButton() {
        checkoutPage.conditionsButton.click();
        BrowserUtils.waitFor(2);
    }
    @When("The user clicks the continue button in payment method menu")
    public void theUserClicksTheContinueButtonInPaymentMethodMenu() {
        checkoutPage.continueButtonInPaymentMethod.click();
        BrowserUtils.waitFor(2);
    }


    @Then("Verify that the table headers are the following")
    public void verifyThatTheTableHeadersAreTheFollowing(List<String> expectedHeader) {
        List <String> actualColumnHeader = new ArrayList<>();
        checkoutPage.paymentColumnHeader.stream().forEach(e-> actualColumnHeader.add(e.getText()));
        Assert.assertTrue(actualColumnHeader.equals(expectedHeader));
        BrowserUtils.waitFor(2);

    }

    @When("The user clicks the confirm order button")
    public void theUserClicksTheConfirmOrderButton() {
        checkoutPage.confirmOrderButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verifies that the message that the order was successful.")
    public void verifiesThatTheMessageThatTheOrderWasSuccessful() {
        String actualText = checkoutPage.successOrderMessage.getText();
        String expectedText = "Your order has been successfully processed!";
        Assert.assertEquals(expectedText,actualText);
    }

    @Then("Verify that the existing address is selected in billing details menu")
    public void verifyThatTheExistingAddressIsSelectedInBillingDetailsMenu() {
        checkoutPage.existingAddressInBillingMenu.isSelected();
    }

    @When("The user enters a text in comment fields")
    public void theUserEntersATextInCommentFields() {
        checkoutPage.commmentInDeliveryMethod.sendKeys("Delivery Method");
    }

    @When("The user enters text in the comment field in the payment menu")
    public void theUserEntersTextInTheCommentFieldInThePaymentMenu() {
        checkoutPage.commmentInPaymentMethod.sendKeys("Payment Method");
    }
}
