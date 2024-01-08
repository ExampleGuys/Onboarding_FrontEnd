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


  @ONMYC-955
  Scenario Outline: TC ONMYC-955 Create all Resources and Resources Items with automation
    Given The user goes to staging url
    And The user enters with user "adminUser" and user "admin_password"
    And The user click on "Resource Templates" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user enter "<Resource>" in in the "Enter category name" field
    And The user click on "Add resource" button
    And The user enter "<Resource Item Name>" in in the "Enter resource name" field
    And The user select "<Supplier Mail>" and "<Supplier>" in the supplier dropdown
    And The user enter "<Price>" in in the "Enter price" field
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "Resource successfully created"

    Examples:
      | Resource              | Resource Item Name           | Supplier Mail                      | Supplier      | Price |
      | Accommodation Service | Company Apartment            | auto_company.apartment@yopmail.com | Supplier Test | 500   |
      | Vehicle               | Company Car                  | auto_company.car@yopmail.com       | Supplier Test | 1000  |
      | Car                   | Mercedes-Benz E-Class        | auto_mercedes.benz@yopmail.com     | Supplier Test | 1000  |
      | Phone                 | iPhone 15 Pro Max            | auto_iphone.15promax@yopmail.com   | Supplier Test | 1000  |
      | Mailbox Access        | info@testtechno.com          | auto_mailbox.access@yopmail.com    | Supplier Test | 1000  |
      | Computer              | High-Performance Workstation | auto_high.performance@yopmail.com  | Supplier Test | 1000  |
      | Meal Card             | Sodexo                       | auto_sodexo.card@yopmail.com       | Supplier Test | 1000  |


  @ONMYC-955/2
  Scenario Outline: TC ONMYC-955 Create sub Resources and Resources Items with automation
    Given The user goes to staging url
    And The user enters with user "adminUser" and user "admin_password"
    And The user click on "Resources" at the navigation menu
    And The user enter "<Resource>" in in the "Search" field
    And The user click on first element of table
    And The user click on "Add resource" button
    And The user add resource "<Resource Item Name>" in the "Enter resource name" field
    And The user add supplier "<Supplier Mail>" and "<Supplier>" in the supplier dropdown
    And The user enter "<Price>" in in the "Enter price" field
    And The user click on the "Save" button on the modal
    Then The user verify that the toast message is "Resource successfully created"
    Examples:
      | Resource              | Resource Item Name       | Supplier Mail                             | Supplier      | Price |
      | Accommodation Service | Accommodation Discount   | auto_accommodation.discount@yopmail.com   | Supplier Test | 500   |
      | Accommodation Service | Accommodation Assistance | auto_accommodation.assistance@yopmail.com | Supplier Test | 1500   |
      | Accommodation Service | Rent Subsidy             | auto_rent.subsidy@yopmail.com             | Supplier Test | 1200   |
      | Accommodation Service | Temporary Residence      | auto_temporary.residence@yopmail.com      | Supplier Test | 5000   |



  @ONMYC-990
  Scenario: TC ONMYC-990 User actions test from scratch in automation
    Given The user goes to staging url
    And The user enters with user "superAdminUser" and user "superAdmin_password"
    And The user click on "Companies" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user enter company name "New Company" to "Enter name" field
    And The user enter company code in to "Enter code" field
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "Company successfully created"
    And The user click on "Sites" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user select a Company from company dropdown "New Company" for create site
    And The user enter site name "Zurih" in the "Enter name" field
    And The user enter country name in the "Enter country" field
    And The user enter city name in the "Enter city" field
    And The user enter zip code in the "Enter zip code" field
    And The user enter street name in the "Enter street" field
    And The user enter street number in the "Enter street number" field
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "Site successfully created"
    And The user click on "Departments" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user select a Company from company dropdown "New Company"
    And The user enter department name "IT" to "Enter department name" field
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "Department successfully created"
    And The user click on "Users" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user select a Company from company dropdown "New Company" in the create user page
    And The user enter "Supplier" in in the "Enter first name" field
    And The user enter "Test" in in the "Enter last name" field
    And The user enter "testEmail@yopmail.com" in in the "Enter private email" field
    And The user select role as a "Supplier"
    And The user select site as a "Zurih" in the create user page
    And The user enter password
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "User successfully created"
    And The user click on "Resource Templates" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user select a Company from company dropdown "New Company" in the create resource page
    And The user enter "TestResource" in in the "Enter category name" field
    And The user click on the "Add resource" button
    And The user enter "Test Resource Item" in in the "Enter resource name" field
    And The user select a Supplier as a "testemail@yopmail.com | Supplier Test" in the create resource page
    And The user enter "1000" in in the "Enter price" field
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "Resource successfully created"
    And The user click on "Onboardings" at the navigation menu
    And The user click on the "Create" button top right corner of the page
    And The user select a Company from company dropdown "New Company" in the create onboarding page
    And The user enter "firstName" in to "Enter first name" field
    And The user enter "middleName" in to "Enter middle name" field
    And The user enter "lastName" in to "Enter last name" field
    And The user enter "privateEmail" in to "Enter private email" field
    And The user select Person Title
    And The user select Birth Date
    And The user select First Working Day
    And The user select site as a "Zurih"
    And The user select department as a "IT"
    And The user click on "Add resource" button
    And The user select Resource as a "TestResource"
    And The user select Resource Item as a "Test Resource Item"
    And The User select a Completion Date at The Latest
    And The user click on the "Save & Start Process" button
    And The user click on the "Confirm" button
    Then The user verify that the toast message is "Onboarding successfully created"
    And The user click on first element of table
    And The user click on the "Approve" button
    And The user click on the "Save" button
    And The user set onboarding status to completed
    And The user click on "Users" at the navigation menu
    And The user click on first element of table
    And The user upgrade the "Employee" role to "Admin"
    And The user click on the "Save" button
    Then The user verify that last created users role is "Admin"




