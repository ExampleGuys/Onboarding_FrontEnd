@crud
Feature: Resources Test with Super Admin Role
  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "superAdminUser" and user "superAdmin_password"
    And The user click on "Resources" at the navigation menu

  @ONMYC-907
  Scenario: TC ONMYC-907 New Resource should be creatable
    And The user click on the "Create" button top right corner of the page
    And The user fills all required field in Resources create form for a SuperAdmin role
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "Resource successfully created"

   @ONMYC-908
  Scenario: TC ONMYC-908 Created Resource should be visible
    Then The user verify that created resource is visible

  @ONMYC-909
  Scenario: TC ONMYC-909 Created Resource should be update
    And The user click on first element of table
    And The user update data to "Enter category name" field
    And The user click on the "Save" button
    Then The user verify that the toast message is "Resource successfully updated"

  @ONMYC-910
  Scenario: TC ONMYC-910 Created Resource should be deleted
    And The User click on Delete icon in the first element of table
    And The user click on the "Delete" button
    Then The user verify that the toast message is "Resource successfully deleted"