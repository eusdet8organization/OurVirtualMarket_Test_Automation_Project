package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;

public class AccountPage extends BasePage {

    public void verifyLogin() {
        Assert.assertEquals("https://ourvirtualmarket.com/index.php?route=account/account", Driver.get().getCurrentUrl());
    }

    public void clickTelevisionMenu() {
        televisionButton.click();
    }

}
