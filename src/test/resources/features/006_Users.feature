

Feature: Users Listing Test



  @ONB2-14
  Scenario: TC ONB2-14 "List of Users" should be displayed properly on clicking "Users" on the navigation menu
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    And the user clicks on "Users" at the navigation menu
    And the user should see the title of "List of User" on the users page


