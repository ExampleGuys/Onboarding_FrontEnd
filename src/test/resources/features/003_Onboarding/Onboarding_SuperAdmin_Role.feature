@regression @crud
Feature: Onboarding Create Tests with Super Admin Role

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "superAdminUser" and user "superAdmin_password"
    And The User click on the "Onboardings" section in the Navigation Menu

  @ONMYC-828
  Scenario: TC ONMYC-828 New Onboarding should be creatable
    And The user click on the "Create" button top right corner of the page
    And The user selects a Company from company dropdown "Automation_Test" for create onboarding
    And The user enter "firstName" in to "Enter first name" field
    And The user enter "middleName" in to "Enter middle name" field
    And The user enter "lastName" in to "Enter last name" field
    And The user enter "privateEmail" in to "Enter private email" field
    And The user select Person Title
    And The user select Birth Date
    And The user select First Working Day
    And The user select site as a "Amsterdam"
    And The user select department as a "Sales"
    And The user click on "Add resource" button
    And The user select Resource as a "Phone"
    And The user select Resource Item as a "Samsung"
    And The User select a Completion Date at The Latest
    And The user click on the "Save & Start Process" button
    And The user click on "Confirm" button
    Then The user verify that the toast message is "Onboarding successfully created"

  @ONMYC-829
  Scenario: TC ONMYC-829 Created Onboarding should be visible
    Then The user verify that created onboarding is visible

  @ONMYC-832
  Scenario: TC ONMYC-832 New Onboarding in DRAFT status should be creatable
    And The user click on the "Create" button top right corner of the page
    And The user selects a Company from company dropdown "Automation_Test" for create onboarding
    And The user enter "firstName" in to "Enter first name" field
    And The user enter "middleName" in to "Enter middle name" field
    And The user enter "lastName" in to "Enter last name" field
    And The user enter "privateEmail" in to "Enter private email" field
    And The user select Person Title
    And The user select Birth Date
    And The user select First Working Day
    And The user select site as a "Amsterdam"
    And The user select department as a "Sales"
    And The user click on "Add resource" button
    And The user select Resource as a "Phone"
    And The user select Resource Item as a "Samsung"
    And The User select a Completion Date at The Latest
    And The user click on the "Save" button
    Then The user verify that the toast message is "Onboarding successfully created"

  @ONMYC-831
  Scenario: TC ONMYC-831 Drafted Onboarding should be updated
    And The user click on "Draft" button
    And The user click on first element of table
    And The user update data to "Enter first name" field
    And The user click on the "Save" button
    Then The user verify that the toast message is "Onboarding successfully updated"

  @ONMYC-830
  Scenario: TC ONMYC-830 Created onboarding should be deleted
    And The User click on Delete icon in the first element of table
    And The user click on the "Delete" button
    Then The user verify that the toast message is "Onboarding successfully deleted"
