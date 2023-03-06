package com.erp.step_definitions;

import com.erp.pages.LoginPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage=new LoginPage();



    @Given("user is on the ERP login page")
    public void user_is_on_the_erp_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginURL"));

    }
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        loginPage.login();




    }
    @Then("user is on the main Odoo page")
    public void user_is_on_the_main_odoo_page() {
        BrowserUtils.waitForTitleContains("#Inbox - Odoo");
        BrowserUtils.verifyTitleContains("#Inbox - Odoo");

    }

    @When("user enters invalid username")
    public void user_enters_invalid_username() {
        loginPage.username.sendKeys("234562");
    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();
    }
    @Then("user should see wrong username password warning")
    public void user_should_see_wrong_username_password_warning() {
        loginPage.warning.isDisplayed();
    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
       loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("user enters invalid password")
    public void user_enters_invalid_password() {
        loginPage.password.sendKeys("djfhkjd");
        loginPage.loginButton.click();
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
