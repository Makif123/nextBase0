package com.nextBase.pages;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JoinAndSortGroupsPage {

    //xpath-method
    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[4]")
    public static WebElement workgroupsBtn;   //<-element

    //locate
    @FindBy(xpath = "//span[@id='bx-sonet-groups-request-6']")
    public WebElement newProductDevelopmentGroupBtn;

    @FindBy(id = "bx-sonet-groups-request-6")
    public static WebElement joinButton;

    @FindBy(id = "bx-sonet-groups-request-sent-6")
    public static WebElement requestMessageMSG;

    @FindBy(xpath = "//button[contains(@class, 'ui-btn-md')]")
    public WebElement revokeWorkgroupBtn;

}







