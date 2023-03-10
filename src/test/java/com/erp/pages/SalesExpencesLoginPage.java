package com.erp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesExpencesLoginPage extends  BasePage {


    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement accountHolder;


}
