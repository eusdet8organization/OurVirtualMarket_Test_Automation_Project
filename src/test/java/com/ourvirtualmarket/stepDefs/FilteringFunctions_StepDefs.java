package com.ourvirtualmarket.stepDefs;

import com.ourvirtualmarket.pages.FilteringFunctionsPage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class FilteringFunctions_StepDefs {
    FilteringFunctionsPage functionsPage =new FilteringFunctionsPage();
    @And("Verify Filtering Functions")
    public void verifyFilteringFunctions() {
        functionsPage.verifyFilteringFunction();
    }
}
