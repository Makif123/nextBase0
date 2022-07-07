@NEXT-985
Feature: User should be able to sort groups

  Background:
    Given user is on the next base login page

  @workGroups
  Scenario Outline: Verify that HR, Helpdesk and Marketing user should be able to sort groups

		        #Scenario: HR user Marketing user and Helpdesk user, sort groups
    Given <User> is on home page
    When User should click on the workgroups top left and select multiple groups from a list.
    Then Verify that chosen groups can tagged on from the Workgroups and projects text box.

		        #Scenario: Negative
    When User should click on the workgroups top left and select multiple groups from a list.
    Then Verify that user can not leave the groups that user has not joint

    Examples:
      |User       |
      |HR         |
      |Helpdesk   |
      |Marketing  |