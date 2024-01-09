@crud
Feature: Users tests wit Line Menager Role
  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "lineMenagerUser" and user "lineMenagerPassword"
    And The user click on "Users" at the navigation menu

  @ONMYC-842
  Scenario: TC ONMYC-842 Created Users should be visible
    Then The user verify that created user is visible

  @ONMYC-844
  Scenario: TC ONMYC-844 Created Users should be deleted
    And The User click on Delete icon in the first element of table
    And The user click on the "Delete" button
    Then The user verify that the toast message is "User successfully deleted"
