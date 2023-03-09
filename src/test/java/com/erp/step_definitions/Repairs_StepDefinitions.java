package com.erp.step_definitions;

import com.erp.pages.MainPage;
import com.erp.pages.RepairsPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.util.ArrayListWrapper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Repairs_StepDefinitions {

    MainPage mainPage=new MainPage();
    RepairsPage repairsPage = new RepairsPage();

    @When("user clicks repairs module")
    public void user_clicks_repairs_module() {
        mainPage.repairsModule.click();

    }
    @When("user clicks first checkbox")
    public void user_clicks_first_checkbox() {
     repairsPage.firstCheckbox.click();
    }
    @Then("all the check box checked")
    public void all_the_check_box_checked() {
        for (WebElement each: repairsPage.checkboxes){
            Assert.assertTrue(each.isEnabled());
        }
    }
    @Then("user see the action dropdown manu")
    public void user_see_the_action_dropdown_manu(List<String> expectedDropdown) {
       for(WebElement eachElement: repairsPage.actionDropdownMenu){
           eachElement.isDisplayed();
       }








    }






}
