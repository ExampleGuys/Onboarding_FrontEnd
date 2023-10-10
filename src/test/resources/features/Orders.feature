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