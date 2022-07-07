Feature: NextBase app Drive feature

 User Story:
  NEXT-786 Drive Feature
  As a user, I should be able to display 'My Drive' and 'All Documents' under Drive module

  Accounts are: hr user, helpdesk user, marketing user

  @drive
  Scenario: Drive feature displaying 'My Drive' and 'All Documents'
    Given "<User>" is on Home page
    When user clicks My Drive
    Then verify that user displays My Drive
    When user clicks All Documents
    Then verify that user displays All Documents



