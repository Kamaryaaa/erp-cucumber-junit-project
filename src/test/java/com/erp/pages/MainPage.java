package com.erp.pages;

import com.erp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy (xpath = "//span[.='POSManager21']")
   public WebElement profileName;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logoutLink;

    @FindBy (xpath = "(//span[@title='Add'])[1]")
    public  WebElement addSign;

    @FindBy(xpath = "//input[@placeholder='Add a channel']")
    public WebElement creatingChannelTextBox;


    @FindBy(xpath = "(//ul[@id='ui-id-2'])//li[2]")
    public WebElement createChannelNameOption;

    @FindBy(xpath ="//a[.='#myChannel']" )
    public WebElement channelCreatedMessage;

    @FindBy(xpath = "//div[@title='myChannel']")
    public WebElement channelName;


   @FindBy(xpath = "//textarea[@style='height: 29px;']")
    public WebElement textArea;

   @FindBy(xpath = "(//button[.='Send'])[1]")
    public WebElement sendButton;

   @FindBy(xpath = "//p[.='How are you?']")
    public WebElement message;

















}