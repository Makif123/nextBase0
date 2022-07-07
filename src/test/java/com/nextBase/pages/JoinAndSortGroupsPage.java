package com.nextBase.pages;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JoinAndSortGroupsPage {

    //xpath-method
    @FindBy(xpath = "//span[normalize-space(text()) = 'Workgroups']")
    public WebElement workgroupsBtn;   //<-element

    //locate
    @FindBy(xpath = "//span[@class='sonet-groups-group-title'][.//*[@id='bx-sonet-groups-favorites-6']]//a")
    public WebElement newProductDevelopmentGroupBtn;

    @FindBy(xpath = "//*[@id='bx-sonet-groups-request-6']")
    public WebElement joinButton;

    @FindBy(xpath = "//*[@id='bx-sonet-groups-request-sent-6']")
    public WebElement requestMessageMSG;

    @FindBy(xpath = "//button[contains(@class, 'ui-btn-md')]")
    public WebElement revokeWorkgroupBtn;

}







