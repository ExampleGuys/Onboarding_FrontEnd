@crud
Feature: Offboarding Tests with Admin Role

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "adminUser" and user "admin_password"

  @ONMYC-801
  Scenario: TC ONMYC-801 New Offboarding should be creatable
    And The user click on "Onboardings" at the navigation menu
    And The user click on the "Create Onboarding" button top right corner of the page
    And The user enter "firstName" in to "Enter first name" field
    And The user enter "middleName" in to "Enter middle name" field
    And The user enter "lastName" in to "Enter last name" field
    And The user enter "privateEmail" in to "Enter private email" field
    And The user select Person Title
    And The user select Birth Date
    And The user select First Working Day
    And The user select site as a "Amsterdam"
    And The user select department as a "IT_Test"
    And The user select no company email account
    And The user click on "New Resources" button
    And The user click on "Add resource" button in New Resource
    And The user select Resource as a "Phone"
    And The user select Resource Item as a "Samsung | €800.00"
    And The User select a Completion Date at The Latest
    And The user select a Supplier as a "supplier_test@yopmail.com | Supplier Test" in the create onboarding modal
    And The user click on the "Save & Start Process" button
    And The user click on "Confirm" button
    Then The user verify that the toast message is "Onboarding successfully created"
    And The user set onboarding status to completed
    And The user determine the Employee which is offboarding
    And The user click on "Offboardings" at the navigation menu
    And The user click on the "Create Offboarding" button top right corner of the page
    And The user fills all required fields in offboarding create form
    And The user click on the "Save & Start Process" button
    And The user click on "Confirm" button
    And The user set offboarding status to completed


  @ONMYC-755
  Scenario: TC ONMYC-755Created Offboarding should be visible
    And The user click on "Offboardings" at the navigation menu
    Then The user verify that created offboarding is visible


  @ONMYC-833
  Scenario: TC ONMYC-833 New Offboarding in DRAFT status should be creatable
    And The user click on "Onboardings" at the navigation menu
    And The user click on the "Create Onboarding" button top right corner of the page
    And The user enter "firstName" in to "Enter first name" field
    And The user enter "middleName" in to "Enter middle name" field
    And The user enter "lastName" in to "Enter last name" field
    And The user enter "privateEmail" in to "Enter private email" field
    And The user select Person Title
    And The user select Birth Date
    And The user select First Working Day
    And The user select site as a "Amsterdam"
    And The user select department as a "IT_Test"
    And The user click on "Add resource" button
    And The user select Resource as a "Phone"
    And The user select Resource Item as a "Samsung"
    And The User select a Completion Date at The Latest
    And The user click on the "Save & Start Process" button
    And The user click on "Confirm" button
    And The user set onboarding status to completed
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

  @ONMYC-753
  Scenario: TC ONMYC-753 Created offboarding should be deleted
    And The user click on "Offboardings" at the navigation menu
    And The User click on Delete icon in the first element of table
    And The user click on the "Delete" button
    Then The user verify that the toast message is "Offboarding successfully deleted"


