@crud
Feature: Onboarding Tests with Admin Role

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "adminUser" and user "admin_password"
    And The user click on "Onboardings" at the navigation menu

  @ONMYC-828
  Scenario: TC ONMYC-828 New Onboarding should be creatable
    And The user click on the "Create" button top right corner of the page
    And The user fills all required fields in onboarding create form
    And The user click on the "Save & Start Process" button
    And The user click on "Confirm" button
    Then The user verify that the toast message is "Onboarding successfully created"

  @ONMYC-829
  Scenario: TC ONMYC-829 Created Onboarding should be visible
    Then The user verify that created onboarding is visible

  @ONMYC-832
  Scenario: TC ONMYC-832 New Onboarding in DRAFT status should be creatable
    And The user click on the "Create" button top right corner of the page
    And The user fills all required fields in onboarding create form
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

