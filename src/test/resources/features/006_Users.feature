

Feature: Users Listing Test



  @ONB2-14
  Scenario: TC ONB2-14 "List of Users" should be displayed properly on clicking "Users" on the navigation menu
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    And the user clicks on "Users" at the navigation menu
    And the user should see the title of "List of User" on the users page

  @ONB2-51
  Scenario: TCOBN@-51 Verification of the Access to the Users page
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    And the user clicks on "Users" at the navigation menu
    And the user clicks on "Users" at the navigation menu
    Then the user should see the Users page

  @ONB2-136
  Scenario: TC ONB2-136 The user should control the number of users from the page selection button
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    And the user clicks on "Users" at the navigation menu
    Then the user scrolls down until the end of the page
    Then the user click on the arrow of the users page
  #  And the user chooses "10 users" per page
    Then the user should observe "10 users" on each page of User List

   @ONB2-135
   Scenario: TC ONB2 The user should observe the number of total users correctly
     Given The user goes to the sign-in page
     When The user enters valid logon credentials
     And the user clicks on "Users" at the navigation menu
     Then the user scrolls down until the end of the page
     Then the user should see the number of the total users
