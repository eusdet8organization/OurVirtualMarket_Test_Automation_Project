package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage{
    @FindBy(xpath = "//*[@id='wrapper']/div[4]/ul/li[2]/a")
    protected WebElement pageName;
    @FindBy(id="product-image-7465747")
    protected WebElement relevantProduct;
    @FindBy(xpath = "//h1[@itemprop='name']")
    protected WebElement relevantProductName;
    @FindBy(xpath = "//span[@itemprop='price']")
    protected WebElement productPrice;
    @FindBy(xpath = "//div[@class='stock']")
    protected WebElement availabilityStatus;
    @FindBy(xpath = "//div[@class='inner-box-viewed ']")
    protected WebElement productViewed;




    public void verifySearchResultPageName(){
        Assert.assertEquals(pageName.getText(),"Search");
    }

    public void theUserChooseAOnTheSearchPageAndClicksIt(){
        BrowserUtils.scrollToElement(relevantProduct);
        relevantProduct.click();
    }
    public void verifyRelevantProductPage(){
        Assert.assertTrue(relevantProductName.getText().contains("Samsung"));
    }


    public void verifyProductInformations() {
        BrowserUtils.verifyElementDisplayed(relevantProductName);
        BrowserUtils.verifyElementDisplayed(productPrice);
        BrowserUtils.verifyElementDisplayed(availabilityStatus);
        BrowserUtils.verifyElementDisplayed(productViewed);

    }


}
