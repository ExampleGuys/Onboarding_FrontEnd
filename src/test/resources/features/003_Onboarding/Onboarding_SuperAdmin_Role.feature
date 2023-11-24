@regression @yavuz
Feature: Onboarding Create Tests with SuperAdmin Role

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "superAdminUser" and user "superAdmin_password"
    And The User click on the "Onboardings" section in the Navigation Menu

  @ONB2-299
  Scenario: TC ONB2-299 The user should be able to create a new resource category in the "Resources" section when making a new onboarding
    And The user click on the "New Onboarding" button top right corner of the page
    And The User "Add resource" button in the Resources Section
    And The User click on plus + button near to "Category" in the Company Registration section
    Then The User verify that the modal is opened

  @ONB2-300
  Scenario: TC ONB2-300 The user should be able to create a new resource in the "Resources" section when making a new onboarding
    And The user click on the "New Onboarding" button top right corner of the page
    And The User "Add resource" button in the Resources Section
    And The User click on plus + button near to "Resource" in the Company Registration section
    Then The User verify that the modal is opened

  @ONB2-322
  Scenario: TC ONB2-322 The search box in the onboarding listing page should filter properly
    And The user click on the "Search" button top right corner of the page
    And The user enter an email in the Filter Modal and click on "OK" button
    Then The user verify that results according to the email address entered are filtered