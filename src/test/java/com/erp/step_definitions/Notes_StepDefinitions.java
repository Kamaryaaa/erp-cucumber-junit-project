package com.erp.step_definitions;

import com.erp.pages.MainPage;
import com.erp.pages.NotesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Notes_StepDefinitions {

    NotesPage notesPage=new NotesPage();
    MainPage mainPage=new MainPage();


    @When("user clicks notes")
    public void user_clicks_notes() {
       mainPage.notesModule.click();
    }
    @When("user clicks create button")
    public void user_clicks_create_button() {
        notesPage.createButton.click();
    }
    @When("user write {string} in text area")
    public void user_write_in_text_area(String text) {
        notesPage.textArea.sendKeys(text);

    }
    @When("user clicks save button")
    public void user_clicks_save_button() {
        notesPage.saveButton.click();
    }
    @Then("user should see note created message")
    public void user_should_see_note_created_message() {
        Assert.assertTrue(notesPage.confirmationMsg.isDisplayed());
    }
}
