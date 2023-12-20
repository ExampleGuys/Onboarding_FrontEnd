Feature: Practice test cases

  Scenario: All Onboardings delete
    Given The user goes to staging url
    And The user enters with user "practiceUser" and user "admin_password"
    And The user click on the "Onboardings" button
    And The User click on Delete icon repetitive
    Then The user verify that all cerated elements is deleted

  Scenario: All Offboardings delete
    Given The user goes to staging url
    And The user enters with user "practiceUser" and user "admin_password"
    And The user click on the "Offboardings" button
    And The User click on Delete icon repetitive
    Then The user verify that all cerated elements is deleted


  Scenario: All Order delete
    Given The user goes to staging url
    And The user enters with user "practiceUser" and user "admin_password"
    And The user click on the "Orders" button
    And The User click on Delete icon repetitive
    Then The user verify that all cerated elements is deleted

  Scenario: All Users delete
    Given The user goes to staging url
    And The user enters with user "practiceUser" and user "admin_password"
    And The user click on the "Users" button
    And The User click on Delete icon repetitive
    Then The user verify that all cerated elements is deleted

  Scenario Outline: The user create all departments
    Given The user goes to staging url
    And The user enters with user "adminUser" and user "admin_password"
    And The user click on "Departments" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user enter "<Department Name>" to "Enter department name" field for Admin Role
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "Department successfully created"

    Examples:
      | Department Name          |
      | Sales                    |
      | Marketing                |
      | Human Resources          |
      | Finance                  |
      | Customer Support         |
      | IT                       |
      | Research and Development |
      | Operations               |
      | Legal                    |
      | Procurement              |


  @ONMYC-950
  Scenario Outline: The user create all suppliers with automation
    Given The user goes to staging url
    And The user enters with user "adminUser" and user "admin_password"
    And The user click on "Users" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user fills all required fields in User create form select a "Supplier" role create all suppliers
    And The user enter "<email>" to "Enter private email" field for Admin Role to create a supplier
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "User successfully created"

    Examples:
      | email                                      |
      | AUTO_company.apartment@yopmail.com         |
      | AUTO_accommodation.discount@yopmail.com    |
      | AUTO_accommodation.assistance@yopmail.com  |
      | AUTO_rent.subsidy@yopmail.com              |
      | AUTO_temporary.residence@yopmail.com       |
      | AUTO_company.car@yopmail.com               |
      | AUTO_car.rentaldiscount@yopmail.com        |
      | AUTO_fuel.card@yopmail.com                 |
      | AUTO_shuttle.service@yopmail.com           |
      | AUTO_public.transitpass@yopmail.com        |
      | AUTO_mercedes.benz@yopmail.com             |
      | AUTO_bmw.car@yopmail.com                   |
      | AUTO_audi.car@yopmail.com                  |
      | AUTO_toyota.camry@yopmail.com              |
      | AUTO_honda.accord@yopmail.com              |
      | AUTO_iphone.15promax@yopmail.com           |
      | AUTO_iphone.15pro@yopmail.com              |
      | AUTO_samsung.galaxys21@yopmail.com         |
      | AUTO_samsung.galaxynote20ultra@yopmail.com |
      | AUTO_samsung.galaxyzfold@yopmail.com       |
      | AUTO_mailbox.access@yopmail.com            |
      | AUTO_high.performance@yopmail.com          |
      | AUTO_graphics.optimized@yopmail.com        |
      | AUTO_macbook.pro@yopmail.com               |
      | AUTO_macbook.air@yopmail.com               |
      | AUTO_dual.use@yopmail.com                  |
      | AUTO_sodexo.card@yopmail.com               |
      | AUTO_multinet.card@yopmail.com             |
      | AUTO_setcard.card@yopmail.com              |
      | AUTO_ticket.card@yopmail.com               |

