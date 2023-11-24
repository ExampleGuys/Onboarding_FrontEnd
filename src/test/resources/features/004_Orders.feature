@regression
Feature: Orders Tests

  Background: pre steps
    Given The user goes to staging url
    And The user enters with user "superAdminUser" and user "superAdmin_password"
    And The User click on the "Orders" section in the Navigation Menu
  @ONB2-161
  Scenario:TC ONB2-161 New Order" button should be clickable.
    And The user click on the "New orders" button.
    Then The User should be redirected to the new order creation page

  @ONB2-162
  Scenario: When the user misses one or more than one required field, then s/he can not create a new order on the "new Order" page.
    And The user click on the "New orders" button.
    And The user should be able to add data to "Enter order title" with "Table"
    And The user should be able to add data to "Enter description" with "New Employee"
    And The user click on the "Create" button.
    Then The user should be able to see a warning message as "Please fill out all required fields correctly."


  @ONB2-175
  Scenario: ONB2 - 175 User should be able to view new orders information under the "list of the orders" section
    And The user click on the "New orders" button.
    And The user select the company from ddm
    And The user select the employee from ddm
    And The user should be able to add data to "Enter order title" with "Table"
    And The user should be able to add data to "Enter description" with "Hello world "
    And The user select the shipping adress from ddm
    And The user select the date from datapicker
    And The user select the priority from the ddm
    And The user should be able to add data to "Enter reason for request" with "Required for the new employee"
    And The user select the approver from the ddm
    And The user select the contact from the ddm
    And The user click on the "Create" button.
    Then The user should be able to see a warning message as "Order successfully created"


  @ONB2-180
  Scenario: ONB2-180 The user should be able to create the new Company on "New Order" page.
    And The user click on the "New orders" button.
    And The user clicks the "Company" icon.
    And The user should be able to add data to "Enter Company Name"
    And The user click on the "OK" button.
    And The user should be able to see a warning message as "Company successfully created"


  @ONB2-183
  Scenario: User should not be able to create a contact
    And The user click on the "New orders" button.
    And The user select the company from ddm
    And The user clicks the "Contact" icon.
    And The user should be able to add data to "Enter full name or company"
    And The user should be able to add Email adress to "Enter email"
    And The user click on the "OK" button.
    And The user should be able to see a warning message as "Contact successfully created"

  @ONB2-196
  Scenario: Then the user should be able write a comment in the comment box.
    And The user click on the "New orders" button.
    And The user should be able to add data to "Enter a comment"

  @ONB2-186
  Scenario: ONB2 -186 The back button on the "New orders" page should work properly
    And The user click on the "New orders" button.
    And The user click on the "Back" button.
    Then the user should be able to redirect back to the List of Orders page again.


  @ONB2-213
  Scenario: ONB2-213 User should be able to enter Maximum 500 characters  in the Description field.
    And The user click on the "New orders" button.
    Then The user should be able to type up to fivehundred characters in the Description field.


  @ONB2-217!!!!!!!!!!
  Scenario: ONB2-217 User should be able to create a new (approver) user type
    And The user click on the "New orders" button.
    And The user select the company from ddm
    And The user clicks the "Approver" icon.
    And user fills in all required fields properly
    And The user click on the "OK" button.
    And The user should be able to see a warning message as "User successfully created"

  @ONB2-224
  Scenario: ONB2-224 The user should be able to choose a date from the "Preferred Delivery Date" field.
    And The user click on the "New orders" button.
    And The user select the date from datapicker

  @ONB2-226
  Scenario: ONB2-226 The user should be able to chooses an option from Priority drop down menü.
    And The user click on the "New orders" button.
    Then The user select the priority from the ddm

  @ONB2-226
  Scenario: The user should be able to create the new Site in "New Order" page.
    And The user click on the "New orders" button.
    And The user select the company from ddm
    And The user clicks the "Shipping Address" icon.

  @ONB2-354
  Scenario: New Order section in the new order page should be visible
    And The user click on the "New orders" button.
    Then The user should seen New Order Information section

  @ONB2-355
  Scenario: Resource section in the new order page should be visible
    And The user click on the "New orders" button.
    Then The user should be able to see "Resources" section

  @ONB2-356
  Scenario: Delivery Information section in the new order page should be visible
    And The user click on the "New orders" button.
    Then The user should be able to see "Delivery Information" section

  @ONB2-357
  Scenario: Process section in the new order page should be visible
    And The user click on the "New orders" button.
    Then The user should be able to see "Process" section

  @ONB2-358
  Scenario: Service Provider section in the new order page should be visible
    And The user click on the "New orders" button.
    Then The user should be able to see "Service Provider" section

  @ONB2-359
  Scenario: Comment section in the new order page should be visible
    And The user click on the "New orders" button.
    Then The user should be able to see "Comments" section

  @ONB2-360
  Scenario: Delete Comment icon in the new onbording page should be clickable
    And The user click on the "New orders" button.
    And The user should be able to add data to "Enter a comment"
    And The user click on the "Add comment" button.
    Then Then user should be able to click on the Delete Comment icon

  @ONB2-86
  Scenario: Created orders should be deleted
    And The user click on the delete icon in the Actions section of a first element of orders list
    And The User click on "Delete" button on the ant-popover
    Then The user verify that created order is deleted

  @ONB2-88
  Scenario: The user should be able to see the edit order page appears
    And The User click on edit icon in the Actions section of first element of list
    Then The User verify that Comments section should be visible

  @ONB2-89
  Scenario: The user should be able to add information in the title box on the edit order page
    And The User click on edit icon in the Actions section of first element of list
    Then user should be able to edit information in the "Enter order title" box

  @ONB2-90
  Scenario: The user should be able to add information in the description box on the edit order page
    And The User click on edit icon in the Actions section of first element of list
    Then user should be able to edit information in the "Enter description" box

  @ONB2-91
  Scenario: The user should be able to choose an option as catagory on the edit order page.
    And The User click on edit icon in the Actions section of first element of list
    Then the user should be able to choose an option as catagory ddm on the edit order page.


  @ONB2-92
  Scenario: The user should be able to choose an option from "Resource" drop dowm menü on the edit order page.
    And The User click on edit icon in the Actions section of first element of list
    Then the user should be able to choose an option as catagory ddm on the edit order page.
    Then the user should be able to choose a quantity under the Resource, on the Edit Order page


  @ONB2-93
  Scenario: The user should be able to choose a quantity under the "Resource", on the Edit Order page
    And The User click on edit icon in the Actions section of first element of list
    Then the user should be able to choose an option as catagory ddm on the edit order page.
    Then the user should be able to choose an option from Resource dropdown menu on the edit order page.



