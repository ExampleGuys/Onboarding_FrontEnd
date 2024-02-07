@crud
Feature: Sites tests with Line Menager Role
  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "lineManagerUser" and user "lineManagerPassword"
    And The user click on "Sites" at the navigation menu

  @ONMYC-982
  Scenario: User should be able to create sites as Line Manager
    And The user click on the "Create Site" button top right corner of the page
    And The user enter site name in in the "Enter name" field
    And The user select country as a "Switzerland"
    And The user enter city name in the "Enter city" field
    And The user enter zip code in the "Enter zip code" field
    And The user enter street name in the "Enter street" field
    And The user enter street number in the "Enter street number" field
    And The user click on the "Create" button on the modal
    And The user verify that the toast message is "Site successfully created"