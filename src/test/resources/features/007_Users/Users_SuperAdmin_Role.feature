@crud
Feature: Users tests wit Super Admin Role
  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "superAdminUser" and user "superAdmin_password"
    And The user click on "Users" at the navigation menu

  @ONMYC-841
  Scenario: TC ONMYC-841 New Users should be creatable
    And The user click on the "Create User" button top right corner of the page
    And The user select a Company from company dropdown "Automation_Test" in the user page
    And The user click on the "Create User" button top right corner of the page
    And The user enter "firstName" in to "Enter first name" field
    And The user enter "middleName" in to "Enter middle name" field
    And The user enter "lastName" in to "Enter last name" field
    And The user enter "privateEmail" in to "Enter private email" field
    And The user select role as a "Supplier"
    And The user select site as a "Amsterdam" in the create user page
    And The user click on generate password button
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "User successfully created"

  @ONMYC-842
  Scenario: TC ONMYC-842 Created Users should be visible
    Then The user verify that created user is visible

  @ONMYC-843
  Scenario: TC ONMYC-843 Created Users should be updated
    And The user click on first element of table
    And The user update data to "Enter first name" field
    And The user click on the "Save" button
    Then The user verify that the toast message is "User successfully updated"

  @ONMYC-844
  Scenario: TC ONMYC-844 Created Users should be deleted
    And The User click on Delete icon in the first element of table
    And The user click on the "Delete" button
    Then The user verify that the toast message is "User successfully deleted"
