package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesPage extends BasePage {


@FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

@FindBy(xpath = "//div[@class='note-editable panel-body']")
    public WebElement textArea;


    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//small[.='now']")
    public WebElement confirmationMsg;










}
