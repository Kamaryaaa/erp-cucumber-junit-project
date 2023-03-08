package com.erp.step_definitions;

import com.erp.pages.BasePage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    BasePage basePage =new BasePage();



    @Given("user is on the ERP login page")
    public void user_is_on_the_erp_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginURL"));

    }
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        basePage.login();




    }
    @Then("user is on the main Odoo page")
    public void user_is_on_the_main_odoo_page() {
        BrowserUtils.waitForTitleContains("#Inbox - Odoo");
        BrowserUtils.verifyTitleContains("#Inbox - Odoo");

    }

    @When("user enters invalid username")
    public void user_enters_invalid_username() {
        basePage.username.sendKeys("234562");
    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        basePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        basePage.loginButton.click();
    }
    @Then("user should see wrong username password warning")
    public void user_should_see_wrong_username_password_warning() {
        basePage.warning.isDisplayed();
    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
       basePage.username.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("user enters invalid password")
    public void user_enters_invalid_password() {
        basePage.password.sendKeys("djfhkjd");
        basePage.loginButton.click();
    }
    /*

    @When("user clicks the login button without entering credentials")
    public void user_clicks_the_login_button_without_entering_credentials() {
       loginPage.loginButton.click();
    }
    @Then("user see the warning message")
    public void user_see_the_warning_message() {
        String expectedErrorMessage="Please fill out this field.";
        String actualErrorMassage=loginPage.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMassage);
    }

     */






}
