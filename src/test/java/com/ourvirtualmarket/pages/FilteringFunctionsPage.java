package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FilteringFunctionsPage extends BasePage {

    @FindBy(xpath = "(//div//i[@ class='fa fa-chevron-down'])[1]")
    public WebElement searchArrow;

    @FindBy(xpath = "(//div//i[@ class='fa fa-chevron-down'])[1]")
    public WebElement manufacturerArrow;

    @FindBy(xpath = "(//div//i[@ class='fa fa-chevron-down'])[1]")
    public WebElement priceArrow;

    @FindBy(xpath = "(//div//i[@ class='fa fa-chevron-right'])[1]")
    public WebElement searchArrow2;

    @FindBy(xpath = "(//div//i[@ class='fa fa-chevron-right'])[2]")
    public WebElement manufacturerArrow2;

    @FindBy(xpath = "(//div//i[@ class='fa fa-chevron-right'])[3]")
    public WebElement priceArrow2;
    @FindBy(xpath = "//a[@ id='btn_resetAll']")
    public WebElement resetAll;

    @FindBy(xpath = "//input[@ id='text_search']")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@value='103']")
    public WebElement priceBox1;

    @FindBy(xpath = "//input[@value='500']")
    public WebElement priceBox2;

    @FindBy(xpath = "//div[text()='Not product']")
    public WebElement notProduct;
    @FindBy(xpath = "//a[contains(text(),'Samsung')]")
    public WebElement productAvailable;

    @FindBy(xpath = "//span[@class='price-new']")
    public WebElement priceRange;
    
    public void verifyFilteringFunction() {
        searchArrow.click();
        manufacturerArrow.click();
        priceArrow.click();

        BrowserUtils.verifyElementDisplayed(priceArrow2);
        BrowserUtils.verifyElementDisplayed(manufacturerArrow2);
        BrowserUtils.verifyElementDisplayed(searchArrow2);

        priceArrow2.click();
        manufacturerArrow2.click();
        searchArrow2.click();

        BrowserUtils.verifyElementDisplayed(searchArrow);
        BrowserUtils.verifyElementDisplayed(manufacturerArrow);
        BrowserUtils.verifyElementDisplayed(priceArrow);

        BrowserUtils.clearAndSendKeys(searchBox, "samsung");
        BrowserUtils.verifyElementDisplayed(productAvailable);


        BrowserUtils.doubleClick(priceBox1);
        priceBox1.sendKeys("250");

        BrowserUtils.doubleClick(priceBox2);
        priceBox2.sendKeys("350");
        priceBox2.sendKeys(Keys.ENTER);

        BrowserUtils.waitForVisibility(priceRange,2);
        BrowserUtils.verifyElementDisplayed(priceRange);

        resetAll.click();

        BrowserUtils.clearAndSendKeys(searchBox,"xyz");
        searchBox.click();
        BrowserUtils.verifyElementDisplayed(notProduct);
    }

}
