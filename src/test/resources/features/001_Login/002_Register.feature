@Regression @yavuz
Feature: Register

  Scenario: TC ONB2-386 The Sign Up Page should be visible
    Given The user goes to staging url
    And The User click on  sign up link bottom of the modal
    Then The user verify that Sign Up button is visible


  Scenario: The email field should be clickable
    Given The user goes to staging url
    And The User click on  sign up link bottom of the modal
    Then The user verify that the E-mail text field should be clickable
