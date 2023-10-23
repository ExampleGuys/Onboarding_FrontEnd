
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
    And the user writes the  name in the First Name box
    And the user writes the last name in the Last Name box
    And the user writes the personal email  in the Personal Email box
    And the user selects a role in the Role box "Admin"
    And the user selects a company in the Company box "Ankasale"
    And the user selects a site in the Site box "umraniye"
    And the user creates a password in the Password box
    And The user clicks on the Create button
    And The user should see the confirmation message

  @ONB2-51
  Scenario: TCOBN@-51 Verification of the Access to the Users page
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
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

  @ONB2-123
  Scenario: TC ONB2- 123 "Zip Code" text field at the Create Site (under the New User Page) should only accept numbers.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    And the user clicks on "Users" at the navigation menu
    Then the user clicks on "New User" button
    Then the user clicks on the "+" icon of the Site button
    Then the user verifies that only numbers can be typed in the "Zip Code" text field

  @ONB2-157
    Scenario: TC ONB2-157 An alert message should appear if the email is not filled in correctly.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    And the user clicks on "Users" at the navigation menu
    Then the user clicks on "New User" button
    Then the user clicks on "Personal Email" text field
    Then the user writes no correct  "Personal Email" text field
    Then the should see the message "Please enter a valid email"

   @ONB2-130
   Scenario: TC ONB2-130 When the password is not typed according to the specified rules in the new user page, the relevant warning messages should appear
     Given The user goes to the sign-in page
     When The user enters valid logon credentials
     And the user clicks on "Users" at the navigation menu
     Then the user clicks on "New User" button
     And the user clicks on "Password" text field
     And the user writes inappropriately a password in "Password" text field
     Then the user should see the relevant warning messages
