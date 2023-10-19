@Regression
Feature: Register

  Scenario: TC ONB2-386 The Sign Up Page should be visible after clicking on Sign Up
    Given The user goes to staging url
    When Dont have an account sign up link
    Then the user should see Sign Up button

  @ONB2-388
  Scenario: TC ONB2-388 The user should create a new password If the password is forgotten


