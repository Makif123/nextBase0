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

public class JoinAndSortWorkGroupsStepDefinitions {

    JoinAndSortGroupsPage joinAndSortGroupsPage = new JoinAndSortGroupsPage();
    NextBasePage nextBasePage = new NextBasePage();
    BasePage basePage = new BasePage();

    @When("User goes to the workgroups.")
    public void userGoesToTheWorkgroups() {
       // BrowserUtils.clickWithJS(joinAndSortGroupsPage.workgroupsBtn);
        BrowserUtils.waitForClickablility(joinAndSortGroupsPage.workgroupsBtn,10);
        joinAndSortGroupsPage.workgroupsBtn.click();
    }

    @And("user join workgroup")
    public void userJoinWorkgroup() {
        joinAndSortGroupsPage.joinButton.click();

    }

    @Then("Verify that {string} message is seen")
    public void verifyThatMessageIsSeen(String expectedMsg) {
        String msg;
       msg = joinAndSortGroupsPage.requestMessageMSG.getText();
       Assert.assertTrue(msg.equals(expectedMsg));


    }
}

