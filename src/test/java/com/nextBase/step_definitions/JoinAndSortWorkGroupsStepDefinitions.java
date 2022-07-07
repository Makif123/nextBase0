package com.nextBase.step_definitions;

import com.nextBase.pages.BasePage;
import com.nextBase.pages.JoinAndSortGroupsPage;
import com.nextBase.pages.NextBasePage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.UnreachableBrowserException;

import java.time.Duration;

public class JoinAndSortWorkGroupsStepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();
    BasePage basePage = new BasePage();

    @When("User goes to the workgroups")
    public void userGoesToTheWorkgroups() {
        Driver.getDriver().findElement(By.xpath("(//span[@class='menu-item-link-text'])[4]")).click();
        //JoinAndSortGroupsPage.workgroupsBtn.click();
    }

    @And("user join workgroup")
    public void userJoinWorkgroup() {

        try{
            Driver.getDriver().findElement(By.cssSelector("#bx-sonet-groups-request-6")).click();
        }catch (NoSuchElementException e){
            System.out.println("Skipping Test since already has the request");
        }
        //JoinAndSortGroupsPage.joinButton.click();

    }

    @Then("Verify that {string} message is seen")
    public void verifyThatMessageIsSeen(String expectedMsg) {

        String msg;
        BrowserUtils.waitForVisibility(By.cssSelector("#bx-sonet-groups-request-sent-6"),Duration.ofSeconds(10));
        msg = Driver.getDriver().findElement(By.cssSelector("#bx-sonet-groups-request-sent-6")).getText();
        System.out.println(msg);
        Assert.assertEquals(msg, expectedMsg);


    }
}

