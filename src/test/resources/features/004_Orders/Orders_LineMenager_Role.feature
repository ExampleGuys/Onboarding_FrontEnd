@crud
Feature: Order Tests with Line Menager Role

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "lineManagerUser" and user "lineManagerPassword"
    And The user click on "Orders" at the navigation menu

  @ONMYC-835
  Scenario: ONMYC-835 New Order should be creatable
    And The user click on the "Create" button top right corner of the page
    And The user enter "orderName" in to "Enter name" field
    And The user select employee as a "employee_test@yopmail.com | Employee Test" from ddm
    And The user click on "Add resource" button
    And The user select Resource as a "Phone" in the order modal
    And The user select Resource Item as a "Samsung" in the order modal
    And The user select the priority
    And The user select Preffered Delivery Date
    And The user enter a Reason for Request
    And The user select a Supplier as a "supplier_test@yopmail.com | Supplier Test"
    And The user click on the "Save & Start Process" button
    And The user click on "Confirm" button
    Then The user verify that the toast message is "Order successfully created"

  @ONMYC-836
  Scenario: ONMYC-836 Created Order should be visible
    Then The user verify that created order is visible

  @ONMYC-837
  Scenario: ONMYC-837 New Order in Draft status should be able updated
    And The user click on the "Create" button top right corner of the page
    And The user enter "orderName" in to "Enter name" field
    And The user select employee as a "employee_test@yopmail.com | Employee Test" from ddm
    And The user click on "Add resource" button
    And The user select Resource as a "Phone" in the order modal
    And The user select Resource Item as a "Samsung" in the order modal
    And The user select the priority
    And The user select Preffered Delivery Date
    And The user enter a Reason for Request
    And The user select a Supplier as a "supplier_test@yopmail.com | Supplier Test"
    And The user click on the "Save" button
    And The user click on "Draft" button
    And The user click on first element of table
    And The user update data to "Enter name" field
    And The user click on the "Save" button
    Then The user verify that the toast message is "Order successfully updated"

  @ONMYC-838
  Scenario: ONMYC-838 Created Order should be deleted
    And The User click on Delete icon in the first element of table
    And The user click on the "Delete" button
    Then The user verify that the toast message is "Order successfully deleted"