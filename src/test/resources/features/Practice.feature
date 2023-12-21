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
      | SUPPLIER   | TEST      | AUTO_company.apartment@yopmail.com         |
      | SUPPLIER   | TEST      | AUTO_accommodation.discount@yopmail.com    |
      | SUPPLIER   | TEST      | AUTO_accommodation.assistance@yopmail.com  |
      | SUPPLIER   | TEST      | AUTO_rent.subsidy@yopmail.com              |
      | SUPPLIER   | TEST      | AUTO_temporary.residence@yopmail.com       |
      | SUPPLIER   | TEST      | AUTO_company.car@yopmail.com               |
      | SUPPLIER   | TEST      | AUTO_car.rentaldiscount@yopmail.com        |
      | SUPPLIER   | TEST      | AUTO_fuel.card@yopmail.com                 |
      | SUPPLIER   | TEST      | AUTO_shuttle.service@yopmail.com           |
      | SUPPLIER   | TEST      | AUTO_public.transitpass@yopmail.com        |
      | SUPPLIER   | TEST      | AUTO_mercedes.benz@yopmail.com             |
      | SUPPLIER   | TEST      | AUTO_bmw.car@yopmail.com                   |
      | SUPPLIER   | TEST      | AUTO_audi.car@yopmail.com                  |
      | SUPPLIER   | TEST      | AUTO_toyota.camry@yopmail.com              |
      | SUPPLIER   | TEST      | AUTO_honda.accord@yopmail.com              |
      | SUPPLIER   | TEST      | AUTO_iphone.15promax@yopmail.com           |
      | SUPPLIER   | TEST      | AUTO_iphone.15pro@yopmail.com              |
      | SUPPLIER   | TEST      | AUTO_samsung.galaxys21@yopmail.com         |
      | SUPPLIER   | TEST      | AUTO_samsung.galaxynote20ultra@yopmail.com |
      | SUPPLIER   | TEST      | AUTO_samsung.galaxyzfold@yopmail.com       |
      | SUPPLIER   | TEST      | AUTO_mailbox.access@yopmail.com            |
      | SUPPLIER   | TEST      | AUTO_high.performance@yopmail.com          |
      | SUPPLIER   | TEST      | AUTO_graphics.optimized@yopmail.com        |
      | SUPPLIER   | TEST      | AUTO_macbook.pro@yopmail.com               |
      | SUPPLIER   | TEST      | AUTO_macbook.air@yopmail.com               |
      | SUPPLIER   | TEST      | AUTO_dual.use@yopmail.com                  |
      | SUPPLIER   | TEST      | AUTO_sodexo.card@yopmail.com               |
      | SUPPLIER   | TEST      | AUTO_multinet.card@yopmail.com             |
      | SUPPLIER   | TEST      | AUTO_setcard.card@yopmail.com              |
      | SUPPLIER   | TEST      | AUTO_ticket.card@yopmail.com               |

