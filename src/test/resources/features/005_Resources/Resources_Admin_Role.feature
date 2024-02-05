@crud
Feature: Resources Test with Admin Role

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "adminUser" and user "admin_password"
    And The user click on "Resource Templates" at the navigation menu

  @ONMYC-897
   Scenario: TC ONMYC-897 New Resource should be creatable
    And The user click on the "Create Resource Template" button top right corner of the page
    And The user enter resource name in the "Enter category name" field
    And The user click on the "Add resource" button
    And The user enter resource item name in the "Enter resource name" field
    And The user select a Supplier as a "supplier_test@yopmail.com | Supplier Test" in the create resource page
    And The user enter "1000" in in the "Enter price" field
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "Resource template successfully created"

  @ONMYC-898
    Scenario: TC ONMYC-898 Created Resource should be visible
    Then The user verify that created resource is visible

  @ONMYC-899
    Scenario: TC ONMYC-899 Created Resource should be update
    And The user click on first element of table
    And The user update data to "Enter category name" field
    And The user click on the "Save" button
    Then The user verify that the toast message is "Resource template successfully updated"

  @ONMYC-900
  Scenario: TC ONMYC-900 Created Resource should be deleted
    And The User click on Delete icon in the first element of table
    And The user click on the "Delete" button
    Then The user verify that the toast message is "Resource successfully deleted"


