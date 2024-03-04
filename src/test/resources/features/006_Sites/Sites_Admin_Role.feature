@crud
Feature: Sites tests with Admin Role
  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "adminUser" and user "admin_password"
    And The user click on "Sites" at the navigation menu

  @ONMYC-982
  Scenario: User should be able to create sites as Admin role
    And The user click on the "Create Site" button top right corner of the page
    And The user enter site name in in the "Enter site name" field
    And The user select site group as a "Abroad" in the site group ddm
    And The user select country as a "Switzerland"
    And The user enter city name in the "Enter city" field
    And The user enter zip code in the "Enter zip code" field
    And The user enter street name in the "Enter street" field
    And The user enter street number in the "Enter street number" field
    And The user click on the "Create" button on the modal
    And The user verify that the toast message is "Site successfully created"

  Scenario: Created site should be visible
    Then The user verify that created site is visible

  Scenario: Created site should be updated
    And The user click on first element of table
    And The user update data to "Enter site name" field
    And The user click on the "Save" button
    Then The user verify that the toast message is "Site successfully updated"

  Scenario: Created site should be deleted
    And The User click on Delete icon in the first element of table
    And The user click on the "Delete" button
    Then The user verify that the toast message is "Site successfully deleted"