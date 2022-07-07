@NEXT-992
Feature: User should be able to join groups

  Background:
    Given "Helpdesk" is on Home page

  @workGroups
  Scenario: Verify that HR, Helpdesk and Marketing user should be able to join groups

    When User goes to the workgroups
    And user join workgroup
    Then Verify that "Request has been sent" message is seen

