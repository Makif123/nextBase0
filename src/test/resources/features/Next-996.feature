

Feature:  User should be able to display My Calendar

  User Story :
  Verify that users can see the calendar

  Accounts are : Hr , Helpdesk, Marketing

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on the next base login page
    And "hr" is on homepage
    And Click the Calendar
    And Click the Add event
    And Select the event date and fill out th event name
    And Click SAVE\CTRL + ENTER

  @NEXT-996
  Scenario: Verify that  user can display My Calender



    Given go to home
    And Click the Calendar
    When Click the MyCalendar
    Then Verify that User can see the my calendar on the page.
