@Regression
Feature: Register

  Scenario: TC ONB2-386 The Sign Up Page should be visible after clicking on Sign Up
    Given The user goes to staging url
    When Dont have an account sign up link
    Then the user should see Sign Up button

  Scenario: TC ONB2-129 The new user should enter their own password
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    And the user clicks on "Users" at the navigation menu
    Then the user clicks on "New User" button
    Then the user clicks on the password text field
    Then the user enters a password for the new user
    Then the user enters again a password for the new user
    Then the user clicks on "Create" button
    Then the user verifies that the new user is created with the new password

  Scenario:  TC 130 When the password is not typed according to the specified rules in the new user page,
  the relevant warning messages should appear
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    And the user clicks on "Users" at the navigation menu
    Then the user clicks on "New User" button
    Then the user clicks on the password text field
    And the user writes inappropriately a password in "Password" text field
    Then the user should see the relevant warning messages

 Scenario: TC 234 The number of "Total Users" should be visible at the bottom of the List of User page
   Given The user goes to the sign-in page
   When The user enters valid logon credentials
   And the user clicks on "Users" at the navigation menu
  And the user scroll down the bottom of the page
   And the number of "Total Users" should be visible