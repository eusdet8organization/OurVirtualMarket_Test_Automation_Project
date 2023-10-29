package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelevisionPage extends BasePage {

    @FindBy(linkText = "Televisions")
    private WebElement televisionsText;


    public void verifyTelevisionPage() {
        BrowserUtils.verifyElementDisplayed(televisionsText);
    }

    public void addProduct(String product) {
        BrowserUtils.hover(Driver.get().findElement(By.xpath("//div[@class='product-image-container']//img[@title[contains(.,'" + product + "')]]")));
        BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("(//a[contains(.,'" + product + "')]/../../..//button[@title='Add to Wish List'])[1]")));
    }

    public void verifyAddedMyWishListSuccessMessage() {
        BrowserUtils.waitForVisibility(Driver.get().findElement(By.className("fa-check-circle")), 6);
        BrowserUtils.verifyElementDisplayed(Driver.get().findElement(By.className("fa-check-circle")));
    }

    public void clickMyWishButton() {
        BrowserUtils.clickWithJS(myWishlistButton);
    }
}
