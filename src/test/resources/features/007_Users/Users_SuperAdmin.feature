@regression
Feature: Users

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "superAdminUser" and user "superAdmin_password"
    And The user click on "Users" at the navigation menu

  @ONB2-14
  Scenario: TC ONB2-14 "List of Users" should be displayed properly on clicking "Users" on the navigation menu
    Then The User should see the title of "List of User" on the users page

  @ONB2-120
  Scenario: TC ONB2-120  The user should be able to create a new user by filling in the required information
    And The user click on "New User" button
    And The user writes the  name in the First Name box
    And The user writes the last name in the Last Name box
    And The user writes the personal email  in the Personal Email box
    And The user selects a role in the Role box "Admin"
    And The user selects a company in the Company box "Ankasale"
    And The user selects a site in the Site box "umraniye"
    And The user creates a password in the Password box
    And The user click on the "Create" button.
    Then The user verify that the confirmation message is displayed

  @ONB2-51
  Scenario: TC ONB2-51 Verification of the Access to the Users page
   Then The user should see the Users page



  @ONB2-136
  Scenario: TC ONB2-136 The user should control the number of users from the page selection button
    And The User scrolls until end of the page
    And The user clicks page selection button
    And The user chooses "10 / page"
    Then The User should be able to observe "10" contacts on one page

   @ONB2-135
   Scenario: TC ONB2 The user should observe the number of total users correctly
     And The User scrolls until end of the page
     Then The user should see the number of the total users

  @ONB2-123 #?????????????????
  Scenario: TC ONB2- 123 "Zip Code" text field at the Create Site (under the New User Page) should only accept numbers.
    And The user click on "New User" button
    And The user clicks on the "+" icon of the Site button
    Then The user verifies that only numbers can be typed in the Zip Code text field

  @ONB2-157 #?????????????????
    Scenario: TC ONB2-157 An alert message should appear if the email is not filled in correctly.
    And The user click on "New User" button
    Then the user clicks on "Personal Email" text field
    Then the user writes no correct  "Personal Email" text field
    Then the should see the message "Please enter a valid email"

   @ONB2-130
   Scenario: TC ONB2-130 When the password is not typed according to the specified rules in the new user page, the relevant warning messages should appear

     And The user click on "New User" button
     And the user clicks on "Password" text field
     And the user writes inappropriately a password in Password text field
     Then the user should see the relevant warning messages
