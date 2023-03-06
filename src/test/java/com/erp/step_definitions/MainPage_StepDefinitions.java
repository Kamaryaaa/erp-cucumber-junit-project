package com.erp.step_definitions;

import com.erp.pages.LoginPage;
import com.erp.pages.MainPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MainPage_StepDefinitions {

    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();





    @Given("user is already on the main page")
    public void user_is_already_on_the_main_page() {
        Driver.getDriver().get("https://qa.finasystems.net/web/login");
        loginPage.login();
    }

    @When("user clicks profile name")
    public void userClicksProfileName() {
        mainPage.profileName.click();

    }
    @And("user clicks logout button")
    public void user_clicks_logout_button() {
        mainPage.logoutLink.click();

    }
    @Then("user should return to login page")
    public void user_should_return_to_login_page() {
        loginPage.linkForBestSolution.isDisplayed();
    }



    @Given("User press add sign for creating a channel")
    public void user_press_add_sign_for_creating_a_channel() {
       // BrowserUtils.waitForVisibility(mainPage.addSign,5);
        mainPage.addSign.click();
    }
    @When("User write the {string} in an input box")
    public void user_write_the_in_an_input_box(String channelName) {
        //BrowserUtils.waitForVisibility(mainPage.creatingChannelTextBox,3);
        mainPage.creatingChannelTextBox.sendKeys(channelName);

    }

    @And("users select the create #myChannel message")
    public void usersSelectTheCreateMyChannelMessage() {

        mainPage.createChannelNameOption.click();

    }


    @Then("users should able to see the channel created massage")
    public void users_should_able_to_see_the_channel_created_massage() {
      //  BrowserUtils.waitForVisibility(mainPage.channelCreatedMessage,3);
        Assert.assertTrue(mainPage.channelCreatedMessage.isDisplayed());
    }




    @When("user press {string}")
    public void user_press(String channelName) {
    mainPage.channelName.click();
    }
    @When("user write {string} in text box")
    public void user_write_in_text_box(String string) {
        mainPage.textArea.sendKeys(string);
    }
    @When("user clicks send button")
    public void user_clicks_send_button() {
        mainPage.sendButton.click();
    }
    @When("user refresh the page")
    public void user_refresh_the_page() {
       Driver.getDriver().navigate().refresh();
    }
    @Then("user should see the massage on the chat feed")
    public void user_should_see_the_massage_on_the_chat_feed() {
       Assert.assertTrue(mainPage.message.isDisplayed());
    }



}
