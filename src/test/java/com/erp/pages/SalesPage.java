package com.erp.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SalesPage extends BasePage {

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement firstCheckbox;


    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> checkboxes;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[4]//li")
    public List<WebElement> actionDropdownMenu;





}
