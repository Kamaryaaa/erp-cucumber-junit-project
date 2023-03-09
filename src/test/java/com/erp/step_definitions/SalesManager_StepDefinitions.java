package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.pages.SalesManagerPage;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SalesManager_StepDefinitions extends BasePage {

    SalesManagerPage salesManagerPageKah=new SalesManagerPage();

    @Given("user logged as a sales manager")
    public void user_logged_as_a_sales_manager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginURL"));
        login("salesmanager52@info.com","salesmanager");
    }


    @Then("user access the {int} module of the page with the {string}")
    public void userAccessTheModuleOfThePageWithThe(int expectedModuleNumber, String expectedProfileName) {
        int actualModuleNumber = salesManagerPageKah.modules.size();
        Assert.assertTrue(expectedProfileName.equals(salesManagerPageKah.profileName.getText()));
        Assert.assertEquals(expectedModuleNumber,actualModuleNumber);
    }
}
