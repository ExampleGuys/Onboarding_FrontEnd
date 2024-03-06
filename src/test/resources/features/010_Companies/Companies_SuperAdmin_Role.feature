@crud
Feature: Companies Tests with SuperAdmin Role

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "superAdminUser" and user "superAdmin_password"
    And The user click on "Companies" at the navigation menu

   @ONMYC-796
   Scenario: TC ONMYC-796 New Company should be creatable
     And The user click on the "Create Company" button top right corner of the page
     And The user enter data to "Enter name" field
     And The user enter company code in to "Enter code" field
     And The user click on the "Create" button on the modal
     Then The user verify that the toast message is "Company successfully created"

   @ONMYC-798
   Scenario: TC ONMYC-798 Created companies should be visible
     Then The user verify that created company is visible

   @ONMYC-799
   Scenario: TC ONMYC-799 Created company should be updated
     And The user click on first element of table
     And The user update data to "Enter name" field
     And The user click on the "Save" button
     Then The user verify that the toast message is "Company successfully updated"

   @ONMYC-797
   Scenario: TC ONMYC-797 Created company should be deleted
     And The User click on Delete icon in the first element of table
     And The user click on the "Delete" button
     Then The user verify that the toast message is "Company successfully deleted"