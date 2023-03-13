package com.erp.step_definitions;

import com.erp.pages.MainPage;
import com.erp.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Module_StepDefinitions {

    MainPage mainPage = new MainPage();

    @Then("user clicks every module")
    public void user_clicks_every_module() {
        for(WebElement eachModule : mainPage.modules){
            BrowserUtils.waitForClickablility(eachModule,5);
            Assert.assertTrue(eachModule.isDisplayed());
        }
    }
}
