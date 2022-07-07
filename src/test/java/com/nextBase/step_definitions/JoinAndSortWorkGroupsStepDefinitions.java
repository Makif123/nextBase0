package com.nextBase.step_definitions;
import com.nextBase.pages.BasePage;
import com.nextBase.pages.JoinAndSortGroupsPage;
import com.nextBase.pages.NextBasePage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class JoinAndSortWorkGroupsStepDefinitions {

    JoinAndSortGroupsPage joinAndSortGroupsPage = new JoinAndSortGroupsPage();
    NextBasePage nextBasePage = new NextBasePage();
    BasePage basePage = new BasePage();

    @When("User should click on the workgroups top left and select multiple groups from a list.")
    public void user_should_click_on_the_workgroups_top_left_and_select_multiple_groups_from_a_list() {
        Driver.getDriver().get(ConfigurationReader.getProperty("workGroups.https://qa.nextbasecrm.com/workgroups/")); //static classname & MethodName only
        BrowserUtils.sleep(50);
    }

    @Then("Verify that chosen groups can tagged on from the Workgroups and projects text box.")
    public void verify_that_chosen_groups_can_tagged_on_from_the_workgroups_and_projects_text_box() {
        joinAndSortGroupsPage.textBox.clear();
        joinAndSortGroupsPage.textBox.sendKeys("this.workGroups");

    }
    @Then("Verify that user can not leave the groups that user has not joint")
    public void verify_that_user_can_not_leave_the_groups_that_user_has_not_joint() {
        // Write code here that turns the phrase above into concrete actions
         basePage.loginAsHR();
         joinAndSortGroupsPage.textBox.click();



    }

}

