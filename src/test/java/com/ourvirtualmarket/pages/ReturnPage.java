package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReturnPage extends BasePage{

    @FindBy(xpath = "//input[@value='bilal']")
     public WebElement firstNameBox;
    @FindBy(xpath = "//input[@value='saglam']")
    public WebElement lastNameBox;
    @FindBy(xpath = "//input[@value='bilal@gmail.com']")
    public WebElement emailBox;
    @FindBy(xpath = "//input[@value='123345']")
    public WebElement telephoneBox;
    @FindBy(id = "input-order-id")
    public WebElement IdBox;
    @FindBy(id= "input-product")
    public WebElement productNameBox;

    @FindBy(id= "input-model")
    public WebElement productCodeBox;
    @FindBy(xpath = "(//*[@value='1'])[2]")
    public WebElement reasonForReturnClick;
    @FindBy(xpath = "//*[@value='Submit']")
    public WebElement submitBox;
    @FindBy(xpath = "//*[@id='content']")
    public WebElement productReturnsMessage;
    @FindBy(xpath = "//*[@id='content']//p")
    public WebElement returnWarningMessage;


    public void verifyReturnList(){
        BrowserUtils.verifyElementDisplayed(firstNameBox);
        BrowserUtils.verifyElementDisplayed(lastNameBox);
        BrowserUtils.verifyElementDisplayed(emailBox);
        BrowserUtils.verifyElementDisplayed(telephoneBox);
    }

    public void returnFormList(){
        IdBox.sendKeys("23");
        productNameBox.sendKeys("Nicky Clarke NHD146 Hair Therapy Touch Control Hair Dryer");
        productCodeBox.sendKeys("5");
        reasonForReturnClick.click();
        submitBox.click();
    }
    public void productReturnSsuccessMessage(){
        BrowserUtils.verifyElementDisplayed(productReturnsMessage);
    }

    public void lackOfForm(String OrderID, String ProductName, String ProductCode, String ReasonforReturn){
        BrowserUtils.waitFor(1);
        IdBox.sendKeys(OrderID);
        productNameBox.sendKeys(ProductName);
        productCodeBox.sendKeys(ProductCode);
        reasonForReturnClick.sendKeys(ReasonforReturn);
        submitBox.click();
        BrowserUtils.verifyElementDisplayed(returnWarningMessage);
    }
}
