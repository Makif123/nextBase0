package com.nextBase.pages;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JoinAndSortGroupsPage {

    @FindBy(xpath = "//button/span[.='New']")
    public WebElement newName;

    @FindBy(id = "pagetitle")
    public WebElement WorkgroupsAndProjects;

    @FindBy(xpath = "//button[@workGroups='btn']")
    public WebElement allGroups;

    @FindBy(xpath = "//td[.='No matching records found']")
    public WebElement errorMessage;

    public WebElement getNewWorkGroups(String allGroups){
        return Driver.getDriver().findElement(By.xpath("//input[@name='workgroups']"));
    }
 @FindBy(xpath = "//*[@id=\"bx-sonet-groups-request-8\"]")
    public WebElement textBox;

}





