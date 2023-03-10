package com.erp.step_definitions;

import com.erp.pages.MainPage;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Documentation_StepDefinitions {
    MainPage mainPage = new MainPage();


    @When("user clicks profile name as pos manager")
    public void user_clicks_profile_name_as_posManager() {
        mainPage.profileName.click();


    }
    @When("user clicks {string} option")
    public void user_clicks_option(String DocumentationLink) {
        mainPage.documentationLink.click();
    }
    @Then("user navigated to documentation page")
    public void user_navigated_to_documentation_page() {
        String windowHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(windowHandle);
    }


}
