package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookPage extends BasePage{

    @FindBy(xpath = "//h2[.='Address Book Entries']")
    private WebElement addressBookEntriesText;

    public void verifyAddressBookPage() {
        BrowserUtils.verifyElementDisplayed(addressBookEntriesText);
    }
}
