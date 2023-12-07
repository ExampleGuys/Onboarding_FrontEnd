@crud
Feature: Order Tests with Admin Role

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "adminUser" and user "admin_password"
    And The user click on "Orders" at the navigation menu

  @ONMYC-835
  Scenario: ONMYC-835 New Order should be creatable
    And The user determine the Employee which user to order for
    And The user click on "Orders" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user fills all required fields in order create form
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "Order successfully created"

  @ONMYC-836
  Scenario: ONMYC-836 Created Order should be visible
    Then The user verify that created order is visible

  @ONMYC-837
  Scenario: ONMYC-837 New Order in In Progress status should be able updated
    And The user click on "In Progress" button
    And The user click on first element of table
    And The user update data to "Enter name" field
    And The user click on the "Save" button
    Then The user verify that the toast message is "Order successfully updated"

  @ONMYC-838
  Scenario: ONMYC-838 Created Order should be deleted
    And The User click on Delete icon in the first element of table
    And The user click on the "Delete" button
    Then The user verify that the toast message is "Order successfully deleted"
