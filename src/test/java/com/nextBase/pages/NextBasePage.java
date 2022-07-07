package com.nextBase.pages;

import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class NextBasePage {

    public HTMLInputElement searhTextBox;

    public NextBasePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(name= "USER_PASSWORD")
    public WebElement passWord;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[@class='sitemap-menu-lines']")
    public WebElement menuBtn;

    @FindBy(xpath = "//*[@id=\"sitemap-content\"]/div[1]/div/a[5]")
    public WebElement ConversationBtn;


    @FindBy(id = "pagetitle")
    public WebElement ConversationTitle;


    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBtn;


//  @FindBy(xpath = "//span[@class='header-search-icon header-search-icon-title']")
//  public WebElement searchSymbol;
//
//
//  @FindBy(id = "pagetitle")
//  public WebElement calendarPage;
//
//
//  @FindBy(xpath = "//span[@id='pagetitle']")
//  public WebElement drivePage;
//
//
//
//  @FindBy(xpath = "//span[@id='pagetitle']")
//  public WebElement mailPage;


    @FindBy(xpath = "//*[@id=\"feed-empty-wrap\"]/div")
    public WebElement nothingFoundTitle;

//    public void loginHelpdesk(){
//        userName.sendKeys(ConfigurationReader.getProperty("helpdesk.username"));
//        passWord.sendKeys(ConfigurationReader.getProperty("nextBase.password"));
//        loginBtn.click();
//    }
//
//    public void loginHR(){
//        userName.sendKeys(ConfigurationReader.getProperty("h1.username"));
//        passWord.sendKeys(ConfigurationReader.getProperty("nextBase.password"));
//        loginBtn.click();
//    }
//
//
//    public void loginMarketing(){
//        userName.sendKeys(ConfigurationReader.getProperty("marketing.username"));
//        passWord.sendKeys(ConfigurationReader.getProperty("nextBase.password"));
//        loginBtn.click();
//    }
}
