@crud
Feature: Users tests wit Admin Role
  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "adminUser" and user "admin_password"
    And The user click on "Users" at the navigation menu

  @ONMYC-841
  Scenario: TC ONMYC-841 New Users should be creatable
    And The user click on the "Create" button top right corner of the page
    And The user fills all required fields in User create form select a "Line Manager" role
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


  @ONMYC-947
  Scenario: TC ONMYC-947 The supplier should be creatable with Admin Role
    And The user click on the "Create" button top right corner of the page
    And The user fills all required fields in User create form select a "Supplier" role
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "User successfully created"


  @ONMYC-948
  Scenario: TC ONMYC-948 Created supplier role should updated with Admin Role
    And The user click on first element of table
    And The user update data to "Enter first name" field
    And The user click on the "Save" button
    Then The user verify that the toast message is "User successfully updated"


  @ONMYC-949
  Scenario: TC ONMYC-949 Created supplier role should be deleted with Admin Role
    And The User click on Delete icon in the first element of table
    And The user click on the "Delete" button
    Then The user verify that the toast message is "User successfully deleted"


