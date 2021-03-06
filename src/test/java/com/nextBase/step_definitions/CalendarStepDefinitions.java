package com.nextBase.step_definitions;

import com.nextBase.pages.CalendarPage;
import com.nextBase.pages.NextBasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalendarStepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();
    CalendarPage calendarPage = new CalendarPage();

    @When("Click the Calendar")
    public void click_the_calendar() {
        nextBasePage.calendar.click();

    }

    @Then("Verify that User can see all the events belong to this Company.")
    public void verify_that_user_can_see_all_the_events_belong_to_this_company() {


    }

    @Then("Verify that User can see the my calendar on the page.")
    public void verify_that_user_can_see_the_my_calendar_on_the_page() {
    }


    @Given("Click the Add event")
    public void click_the_add_event() {
        calendarPage.add.click();


    }

    @Given("Click SAVE\\(CTRL + ENTER)")
    public void click_save_ctrl_enter() {
        calendarPage.calendarSliderSaveButton.click();
    }

    @Then("Verify that User can see your new event on the calendar.")
    public void verify_that_user_can_see_your_new_event_on_the_calendar() {

    }

    @And("Select the event date and fill out th event name")
    public void selectTheEventDateAndFillOutThEventName() {
        calendarPage.eventNameInput.clear();
        calendarPage.eventNameInput.sendKeys("akif");
        calendarPage.dateFromInput.sendKeys("07/11/2022");
        calendarPage.dateToInput.sendKeys("07/11/2022");


    }

    @When("Click the MyCalendar")
    public void clickTheMyCalendar() {
        calendarPage.myCalendar.click();

    }

    @And("Click the Company Calendar")
    public void clickTheCompanyCalendar() {
        calendarPage.companyCalendar.click();
    }
}
