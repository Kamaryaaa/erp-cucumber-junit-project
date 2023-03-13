package com.erp.step_definitions;

import com.erp.pages.SalesExpencesLoginPage;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SalesExpencesLogin_StepDefinition {

    SalesExpencesLoginPage page = new SalesExpencesLoginPage();


    @When("Users login with their {string} and {string}")

    public void usersLoginWithTheirAnd(String email, String password) {
        page.login(email, password);
    }

    @Then("Users see the correct {string}")
    public void usersSeeTheCorrect(String accountName) {
        Assert.assertEquals(accountName,page.accountHolder.getText());

    }

}
