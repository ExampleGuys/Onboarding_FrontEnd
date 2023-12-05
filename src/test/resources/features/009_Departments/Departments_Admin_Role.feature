@crud
Feature: Departments Create Test with Admin Role

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "adminUser" and user "admin_password"
    And The user click on "Departments" at the navigation menu

  @ONMYC-789
  Scenario: TC ONMYC-789 New Department should be creatable
    And The user click on the "Create" button top right corner of the page
    And The user enter data to "Enter department name" field
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "Department successfully created"

  @ONMYC-792
  Scenario: TC ONMYC-792 Created Departments should be visible
    Then The user verify that created department is visible

  @ONMYC-793
  Scenario: TC ONMYC-793 Created Department should be updated
    And The user click on first element of table
    And The user update data to "Enter department name" field
    And The user click on the "Save" button
    Then The user verify that the toast message is "Department successfully updated"

  @ONMYC-791
  Scenario: TC ONMYC-791 Created Department should be deleted
    And The User click on Delete icon in the first element of table
    And The user click on the "Delete" button
    Then The user verify that the toast message is "Department successfully deleted"


