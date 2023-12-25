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
    And The user enter "<First Name>" in in the "Enter first name" field
    And The user enter "<Last Name>" in in the "Enter last name" field
    And The user select role as a "Supplier"
    And The user select a site as a "Amsterdam"
    And The user enter password
    And The user enter "<email>" to "Enter private email" field for Admin Role to create a supplier
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "User successfully created"

    Examples:
      | First Name | Last Name | email                                      |
      | Supplier   | Test      | AUTO_company.apartment@yopmail.com         |
      | Supplier   | Test      | AUTO_accommodation.discount@yopmail.com    |
      | Supplier   | Test      | AUTO_accommodation.assistance@yopmail.com  |
      | Supplier   | Test      | AUTO_rent.subsidy@yopmail.com              |
      | Supplier   | Test      | AUTO_temporary.residence@yopmail.com       |
      | Supplier   | Test      | AUTO_company.car@yopmail.com               |
      | Supplier   | Test      | AUTO_car.rentaldiscount@yopmail.com        |
      | Supplier   | Test      | AUTO_fuel.card@yopmail.com                 |
      | Supplier   | Test      | AUTO_shuttle.service@yopmail.com           |
      | Supplier   | Test      | AUTO_public.transitpass@yopmail.com        |
      | Supplier   | Test      | AUTO_mercedes.benz@yopmail.com             |
      | Supplier   | Test      | AUTO_bmw.car@yopmail.com                   |
      | Supplier   | Test      | AUTO_audi.car@yopmail.com                  |
      | Supplier   | Test      | AUTO_toyota.camry@yopmail.com              |
      | Supplier   | Test      | AUTO_honda.accord@yopmail.com              |
      | Supplier   | Test      | AUTO_iphone.15promax@yopmail.com           |
      | Supplier   | Test      | AUTO_iphone.15pro@yopmail.com              |
      | Supplier   | Test      | AUTO_samsung.galaxys21@yopmail.com         |
      | Supplier   | Test      | AUTO_samsung.galaxynote20ultra@yopmail.com |
      | Supplier   | Test      | AUTO_samsung.galaxyzfold@yopmail.com       |
      | Supplier   | Test      | AUTO_mailbox.access@yopmail.com            |
      | Supplier   | Test      | AUTO_high.performance@yopmail.com          |
      | Supplier   | Test      | AUTO_graphics.optimized@yopmail.com        |
      | Supplier   | Test      | AUTO_macbook.pro@yopmail.com               |
      | Supplier   | Test      | AUTO_macbook.air@yopmail.com               |
      | Supplier   | Test      | AUTO_dual.use@yopmail.com                  |
      | Supplier   | Test      | AUTO_sodexo.card@yopmail.com               |
      | Supplier   | Test      | AUTO_multinet.card@yopmail.com             |
      | Supplier   | Test      | AUTO_setcard.card@yopmail.com              |
      | Supplier   | Test      | AUTO_ticket.card@yopmail.com               |

