package com.erp.pages;

import com.erp.utilities.ConfigurationReader;
import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(id="login")
    public WebElement username;

    @FindBy(id="password")
    public WebElement password;


    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;


    @FindBy(tagName="p" )
    public WebElement warning;

    @FindBy(xpath = "//a[.='Best solution for startups']")
    public WebElement linkForBestSolution;


@FindBy(xpath = "//input[@id='login']//following-sibling::div[@class='fv-help-block']")
public WebElement errorMessage;

    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

    public void login(String user, String pass){
        this.username.sendKeys(user);
        this.password.sendKeys(pass);
        this.loginButton.click();
    }







}
