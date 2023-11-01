package com.ourvirtualmarket.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage{
    @FindBy(xpath = "//*[@id='wrapper']/div[4]/ul/li[2]/a")
    protected WebElement pageName;

    public void verifySearchResultPageName(){
        Assert.assertEquals(pageName.getText(),"Search");
    }

}
