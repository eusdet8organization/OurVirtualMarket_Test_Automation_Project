package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.ReturnPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Return_StepDefs {

    ReturnPage returnPage=new ReturnPage();
    @When("Verify that the firstname,lastname,telephone and email are written on the form")
    public void verifyThatTheFirstnameLastnameTelephoneAndEmailAreWrittenOnTheForm() {

        returnPage.verifyReturnList();
    }

    @When("The user fills out the form and clicks submit")
    public void theUserFillsOutTheFormAndClicksSubmit() {
        returnPage.returnFormList();
    }

    @Then("Verify Success Message on the Return page")
    public void verifySuccessMessageOnTheReturnPage() {

        returnPage.productReturnSsuccessMessage();
    }


    @Then("Verify that the form is incomplete  {string},{string},{string},{string}")
    public void verifyThatTheFormIsIncomplete(String OrderID, String ProductName, String ProductCode, String ReasonforReturn) {
        returnPage.lackOfForm(OrderID,ProductName,ProductCode,ReasonforReturn);
    }
}
