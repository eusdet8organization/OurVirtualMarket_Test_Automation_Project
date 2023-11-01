package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    @FindBy(tagName = "h1")
    public WebElement searchResult;
    @FindBy(partialLinkText = "ourvirtualmarket")
    public WebElement pageName;

    public void verifySearchPageOpened(){
        searchResult.getText();
    }

}
