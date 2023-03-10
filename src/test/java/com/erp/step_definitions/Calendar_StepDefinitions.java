package com.erp.step_definitions;

import com.erp.pages.CalendarPage;
import com.erp.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Calendar_StepDefinitions {

    MainPage mainPage=new MainPage();
    CalendarPage calendarPage=new CalendarPage();




    @When("user clicks calendar page")
    public void user_clicks_calendar_page() {
        mainPage.calendarModule.click();
    }
    @Then("user see calendar time list starting from {string} till {string} and is increased by one hour")
    public void user_see_calendar_time_list_starting_from_till_and_is_increased_by_one_hour(String string, String string2, List<String> time) {
        List<String> textList = new ArrayList<>();

        for(WebElement element : calendarPage.tables){
            textList.add(element.getText());
        }

        Assert.assertEquals(string,(textList.get(0)));
        Assert.assertEquals(string2,(textList.get(textList.size()-1)));
        Assert.assertEquals(time,textList);

    }



}
