package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarPage extends BasePage {


    @FindBy(xpath = "//div[@class='fc-slats']//tbody//tr//span")
    public List<WebElement> tables;


}
