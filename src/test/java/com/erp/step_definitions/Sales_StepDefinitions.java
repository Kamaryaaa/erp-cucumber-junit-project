package com.erp.step_definitions;

import com.erp.pages.MainPage;
import com.erp.pages.RepairsPage;
import com.erp.pages.SalesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Sales_StepDefinitions {

    MainPage mainPage=new MainPage();
    SalesPage salesPage = new SalesPage();


    @When("user clicks Sales module")
    public void user_clicks_sales_module() {
        mainPage.salesModule.click();

    }
    @When("user clicks first checkbox in the left")
    public void user_clicks_first_checkbox_in_the_left() {
        salesPage.firstCheckbox.click();
    }
    @When("user see all the check box checked")
    public void user_see_all_the_check_box_checked() {
        for (WebElement each: salesPage.checkboxes){
            Assert.assertTrue(each.isEnabled());
        }
    }

    @Then("user see the {string} option in the manu")
    public void user_see_the_option_in_the_manu(String string, io.cucumber.datatable.DataTable dataTable) {
        for(WebElement eachElement: salesPage.actionDropdownMenu){
            eachElement.isDisplayed();
        }
    }
}
