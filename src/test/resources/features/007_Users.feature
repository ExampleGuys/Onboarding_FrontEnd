
Feature: Users



  @ONB2-14
  Scenario: TC ONB2-14 "List of Users" should be displayed properly on clicking "Users" on the navigation menu
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    And the user clicks on "Users" at the navigation menu
    And the user should see the title of "List of User" on the users page

  @ONB2-120
  Scenario: TC ONB2-120  The user should be able to create a new user by filling in the required information
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    And the user clicks on "Users" at the navigation menu
    Then the user clicks on "New User" button
    Then the user writes a name in the First Name box
    And The user should see the confirmation message
