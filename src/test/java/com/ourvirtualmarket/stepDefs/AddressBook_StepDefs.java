package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.AddressBookPage;
import io.cucumber.java.en.Then;

public class AddressBook_StepDefs {

    AddressBookPage addressBookPage = new AddressBookPage();

    @Then("Verify that the user is on the Address Book page")
    public void verify_that_the_user_is_on_the_address_book_page() {
        addressBookPage.verifyAddressBookPage();
    }
}
