Feature: Offboarding Tests

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "employeeTester" and user "employeePassword"
    And The User click on the "Offboardings" section in the Navigation Menu

  @ONMYC-560
  Scenario: The user should be able to create a new onboarding record by filling in all the required information
    And The user click on the "New Offboarding" button top right corner of the page