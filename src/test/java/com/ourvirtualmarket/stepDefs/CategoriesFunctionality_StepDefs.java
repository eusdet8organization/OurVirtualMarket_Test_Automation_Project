package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.HomePage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CategoriesFunctionality_StepDefs {
    HomePage homePage = new HomePage();


    @When("The user clicks on the Categorie button")
    public void the_user_clicks_on_the_categorie_button() {
        homePage.categoriesButton.click();
        BrowserUtils.waitFor(1);
    }

    @When("The user clicks X button")
    public void the_user_clicks_x_button() {
        homePage.popupClose.click();
    }

    @Then("The user should be able to see following category names")
    public void theUserShouldBeAbleToSeeFollowingCategoryNames(List<String> expectedCategoryList) {
        List<String> actualCategoryList = BrowserUtils.getElementsText(homePage.categories);
        Assert.assertEquals(expectedCategoryList, actualCategoryList);
    }

    @When("The user clicks on the {string} category")
    public void theUserClicksOnTheCategory(String category) {
        homePage.selectCategory(category);
    }

    @Then("Verify that the {string} category is selected")
    public void verifyThatTheCategoryIsSelected(String categoryTitle) {
        Assert.assertEquals(homePage.categoryTitle.getText(), categoryTitle);
    }
}
