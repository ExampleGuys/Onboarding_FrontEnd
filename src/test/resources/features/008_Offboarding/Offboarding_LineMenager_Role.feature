
Feature: Offboarding Tests with Line Menager Role

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "lineMenagerUser" and user "lineMenagerPassword"

   @ONMYC-801 ### ==== > SUPPLIER ONAYI GEREKTIGI ICIN SORUNLU (offboarding olmamis completed onboard olmasi lazim)
  Scenario: TC ONMYC-801 New Offboarding should be creatable
    And The user click on "Onboardings" at the navigation menu
    And The user determine the Employee which is offboarding
    And The user click on "Offboardings" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user fills all required fields in offboarding create form
    And The user click on the "Save & Complete" button
    And The user click on "Confirm" button
    Then The user verify that the toast message is "Offboarding successfully created"

  @ONMYC-753
  Scenario: TC ONMYC-753 Created offboarding should be deleted
    And The user click on "Offboardings" at the navigation menu
    And The User click on Delete icon in the first element of table
    And The user click on the "Delete" button
    Then The user verify that the toast message is "Offboarding successfully deleted"

  @ONMYC-755
  Scenario: TC ONMYC-755Created Offboarding should be visible
    And The user click on "Offboardings" at the navigation menu
    Then The user verify that created offboarding is visible

  @ONMYC-833  ### SORUNLU COMPLETED OLMUS ANCAK OFFBOARDING YAPILMAMIS ONBOARDING KAYIDI GEREKLI
  Scenario: TC ONMYC-833 New Offboarding in DRAFT status should be creatable
    And The user click on "Onboardings" at the navigation menu
    And The user determine the Employee which is offboarding
    And The user click on "Offboardings" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user fills all required fields in offboarding create form
    And The user click on the "Save" button
    Then The user verify that the toast message is "Offboarding successfully created"

  @ONMYC-754
  Scenario: TC ONMYC-754 Drafted Offboarding should be updated
    And The user click on "Offboardings" at the navigation menu
    And The user click on "Draft" button
    And The user click on first element of table
    And The user update data to "Enter first name" field
    And The user click on the "Save" button
    Then The user verify that the toast message is "Offboarding successfully updated"




