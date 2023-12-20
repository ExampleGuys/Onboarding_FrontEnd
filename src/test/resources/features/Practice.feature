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
    Then The user verify that the toast message is "Department successfully created"

    Examples:
      | email                                 |
      | company.apartment@yopmail.com         |
      | accommodation.discount@yopmail.com    |
      | accommodation.assistance@yopmail.com  |
      | rent.subsidy@yopmail.com              |
      | temporary.residence@yopmail.com       |
      | company.car@yopmail.com               |
      | car.rentaldiscount@yopmail.com        |
      | fuel.card@yopmail.com                 |
      | shuttle.service@yopmail.com           |
      | public.transitpass@yopmail.com        |
      | mercedes.benz@yopmail.com             |
      | bmw.car@yopmail.com                   |
      | audi.car@yopmail.com                  |
      | toyota.camry@yopmail.com              |
      | honda.accord@yopmail.com              |
      | iphone.15promax@yopmail.com           |
      | iphone.15pro@yopmail.com              |
      | samsung.galaxys21@yopmail.com         |
      | samsung.galaxynote20ultra@yopmail.com |
      | samsung.galaxyzfold@yopmail.com       |
      | mailbox.access@yopmail.com            |
      | high.performance@yopmail.com          |
      | graphics.optimized@yopmail.com        |
      | macbook.pro@yopmail.com               |
      | macbook.air@yopmail.com               |
      | dual.use@yopmail.com                  |
      | sodexo.card@yopmail.com               |
      | multinet.card@yopmail.com             |
      | setcard.card@yopmail.com              |
      | ticket.card@yopmail.com               |

