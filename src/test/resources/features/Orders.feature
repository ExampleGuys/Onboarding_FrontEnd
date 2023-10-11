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



