package com.nextBase.step_definitions;

import com.nextBase.pages.NextBasePage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;

public class SearchRelatedItem_StepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();

    @When("user click search button")
    public void user_click_search_button() {
        nextBasePage.searchBtn.click();
    }
    @When("user search for {string} and clicks enter")
    public void user_search_for_and_clicks_enter(String string) {
        nextBasePage.searchBtn.sendKeys(string + Keys.ENTER);
        BrowserUtils.waitForVisibility(By.xpath("//*[@id=\"pagetitle\"]"), Duration.ofSeconds(3));
        System.out.println(Driver.getDriver().getCurrentUrl());
    }
    @Then("verify that  {string} related  can be seen")
    public void verify_that_related_can_be_seen(String string) {
        // Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

        // Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id=\"pagetitle\"]")).isDisplayed());

        System.out.println(Driver.getDriver().findElement(By.xpath("//*[@id=\"pagetitle\"]")));


    }

}
