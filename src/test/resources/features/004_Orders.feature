Feature: Orders Tests

  @ONB2-161
  Scenario:TC ONB2-161 New Order" button should be clickable.
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    Then the user should be redirected to the new order creation page

  @ONB2-162
  Scenario: When the user misses one or more than one required field, then s/he can not create a new order on the "new Order" page.
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    Then the user should be redirected to the new order creation page
    And The user should be able to add data to "Enter order title" with "Table"
    And The user should be able to add data to "Enter description" with "New Employee"
    And The user click on the "Create" button.
    And The user should be able to see a warning message as "Please fill out all required fields correctly."


  @ONB2-175
  Scenario: ONB2 - 175 User should be able to view new orders information under the "list of the orders" section
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    And The user select the company from ddm
    And The user should be able to add data to "Enter order title" with "Table"
    And The user should be able to add data to "Enter description" with "Hello world "
    And The user select the shipping adress from ddm
    And The user select the date from datapicker
    And The user select the priority from the ddm
    And The user should be able to add data to "Enter reason for request" with "Required for the new employee"
    And The user select the approver from the ddm
    And The user select the contact from the ddm
    And The user click on the "Create" button.
    And The user should be able to see a warning message as "Order successfully created"


  @ONB2-180
  Scenario: ONB2-180 The user should be able to create the new Company on "New Order" page.
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    And The user clicks the "Company" icon.
    And The user should be able to add data to "Enter Company Name"
    And The user click on the "OK" button.
    And The user should be able to see a warning message as "Company successfully created"


  @ONB2-183
  Scenario: User should not be able to create a contact
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    And The user select the company from ddm
    #And The user select an option to "Select the company" from ddm as "Test Techno".
    And The user clicks the "Contact" icon.
    And The user should be able to add data to "Enter full name or company"
    And The user should be able to add Email adress to "Enter email"
    And The user click on the "OK" button.
    And The user should be able to see a warning message as "Contact successfully created"

  @ONB2-196
  Scenario: Then the user should be able write a comment in the comment box.
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    And The user should be able to add data to "Enter a comment"

  @ONB2-186
  Scenario: ONB2 -186 The back button on the "New orders" page should work properly
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    And The user click on the "Back" button.
    Then the user should be able to redirect back to the List of Orders page again.


  @ONB2-213
  Scenario: User should be able to enter Maximum 500 characters  in the Description field.
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    Then The user should be able to type up to fivehundred characters in the Description field.


  @ONB2-217
  Scenario: User should be able to create a new (approver) user type
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    And The user select the company from ddm
    And The user clicks the "Approver" icon.
    And user fills in all required fields properly
    And The user click on the "OK" button.
    And The user should be able to see a warning message as "User successfully created"

  @ONB2-224
  Scenario: The user should be able to choose a date from the "Preferred Delivery Date" field.
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    And The user select the date from datapicker

  @ONB2-226
  Scenario: The user should be able to chooses an option from Priority drop down menü.
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    Then The user select the priority from the ddm

  @ONB2-226
  Scenario: The user should be able to create the new Site in "New Order" page.
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    And The user select the company from ddm
    And The user clicks the "Shipping Address" icon.
    #And user fill in all required fields
    #Then user should be able to create the new Site in "New Order" page.

  @ONB2-354
  Scenario: New Order section in the new order page should be visible
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    Then The user should seen New Order Information section

  @ONB2-355
Scenario: Resource section in the new order page should be visible
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    Then The user should be able to see "Resources" section

  @ONB2-356
  Scenario: Delivery Information section in the new order page should be visible
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    Then The user should be able to see "Delivery Information" section

  @ONB2-357
  Scenario: Process section in the new order page should be visible
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    Then The user should be able to see "Process" section

  @ONB2-358
  Scenario: Service Provider section in the new order page should be visible
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    Then The user should be able to see "Service Provider" section

  @ONB2-359
  Scenario: Comment section in the new order page should be visible
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    Then The user should be able to see "Comments" section

  @ONB2-360
  Scenario: Delete Comment icon in the new onbording page should be clickable
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the "New Order" button.
    #And user scroll to the bottom of the page.
    And The user should be able to add data to "Enter a comment"
    And The user click on the "Add comment" button.
   Then Then user should be able to click on the Delete Comment icon

  @ONB2-86
  Scenario: Created orders should be deleted
    Given The user goes to the sign-in page
    When user logs in with the valid credentials
    And Click on the "Orders" section in the Navigation Menu
    And The user click on the delete icon in the Actions section of a first element of orders list
    And The User Click on "Delete" button on the ant-popover
    Then The user verify that created order is deleted
















