@crud
Feature: Offboarding Tests with Admin Role

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "adminUser" and user "admin_password"
    And The user click on "Offboardings" at the navigation menu



  @ONMYC-801
  Scenario: TC ONMYC-801 New Offboarding should be creatable
    And The user click on "Onboardings" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user fills all required fields in onboarding create form
    And The user click on the "Save & Complete" button
    And The user click on "Confirm" button
    And The user determine the Employee which is offboarding
    And The user click on "Offboardings" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user fills all required fields in offboarding create form
    And The user click on the "Save & Complete" button
    And The user click on "Confirm" button
    Then The user verify that the toast message is "Offboarding successfully created"

  @ONMYC-755
  Scenario: TC ONMYC-755Created Offboarding should be visible
    Then The user verify that created offboarding is visible

  @ONMYC-833
  Scenario: TC ONMYC-833 New Offboarding in DRAFT status should be creatable
    And The user click on "Onboardings" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user fills all required fields in onboarding create form
    And The user click on the "Save & Complete" button
    And The user click on "Confirm" button
    And The user determine the Employee which is offboarding
    And The user click on "Offboardings" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user fills all required fields in offboarding create form
    And The user click on the "Save" button
    Then The user verify that the toast message is "Offboarding successfully created"

  @ONMYC-754
  Scenario: TC ONMYC-754 Drafted Offboarding should be updated
    And The user click on "Drafts" button
    And The user click on first element of table
    And The user update data to "Enter first name" field
    And The user click on the "Save" button
    Then The user verify that the toast message is "Offboarding successfully updated"

  @ONMYC-753
  Scenario: TC ONMYC-753 Created offboarding should be deleted
    And The User click on Delete icon in the first element of table
    And The user click on the "Delete" button
    Then The user verify that the toast message is "Offboarding successfully deleted"


