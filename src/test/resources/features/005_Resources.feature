@regression
Feature: Resources Tests

  Background:pre-steps
    Given The user goes to staging url
    And The user enters valid login credentials
    And The user clicks on the "Resources" category

  @ONB2-365
  Scenario:TC ONB2-365 On the New Resource page, verify that the "+ Add resource" button should be visible
    And The user click on the "New Resource" button top right corner of the page
    Then The User should seen + Add resource button

  Scenario:TC ONB2-365 On the New Resource page, verify that the "+ Add resource" button should be clickable
    And The user click on the "New Resource" button top right corner of the page
    Then The User verify that "Add resource" button is clickable


#  @ONB2-307
 # Scenario: TC ONB2-307 Verify that the Resources category is visible and clickable on the Home Page.
  #  And The user should be seen the Resources page

  @ONB2-308
  Scenario:TC ONB2-308 The "List of Resources" heading appears on the Resources page.
    Then The user verify that the "List of Resources" title is seen

  @ONB2-309
  Scenario:TC ONB2-309 Company column should be visible in the Resources page
    Then The User should be able to see "Company" column in the page


  Scenario:TC ONB2-309 Category Name column should be visible in the Resources page
    Then The User should be able to see "Category Name" column in the page


  Scenario:TC ONB2-309 Created By column should be visible in the Resources page
    Then The User should be able to see "Created By" column in the page


  Scenario:TC ONB2-309 Created At column should be visible in the Resources page
    Then The User should be able to see "Created At" column in the page


  @ONB2-310
  Scenario:TC ONB2-310 "Search by name" search box is visible
    Then The user verify that the "Search by name..." search box is seen

  Scenario:TC ONB2-310 "Search by name" search box is clickable
    Then The user verify that the "Search by name..." search box is clickable


  @ONB2-314
  Scenario: TC ONB2-314 "New Resource" button is clickable
   Then The User verify that "New Resource" button is clickable

  Scenario: TC ONB2-314 "New Resource" button is visible
    Then The User verifies that "New Resource" button is visible

  @ONB2-315
  Scenario:TC: ONB2-315 the "Resources" breadcrumblink is visible in the New Resources page
    And The user click on the "New Resource" button.
    Then The User should be able to view "Resources" breadcrumb link

  Scenario:TC: ONB2-315 the "Resources" breadcrumblink is visible in the New Resources page
    And The user click on the "New Resource" button.
    Then The User should be able to clickable "Resources" breadcrumb link


  @ONB2-316
  Scenario:TC ONB2-316 "Category Name" title is visible.
    And The user click on the "New Resource" button.
    And The user verify that "Category Name" title is visible

  @ONB2-319
  Scenario:TC ONB2-319 "Selection Type" title is visible
    And The user click on the "New Resource" button.
    And The user verify that "Selection Type" title is visible

  @ONB2-320
  Scenario:TC: ONB2-320 "Single Selection" button is visible 
    And The user click on the "New Resource" button.
    Then The User verifies that "Single Selection" button is visible
   
  Scenario: "Single Selection" switch is clickable
    And The user click on the "New Resource" button.
    Then The User verify that Selection Type Switch is clickable

  @ONB2-321
  Scenario:TC ONB2-321 "Quantity Selection" is visible on the New Resource page.
    And The user click on the "New Resource" button.
    Then The user verify that "Quantity Selection" title is visible

  Scenario:"Quantity Selection" is clickable on the New Resource page.
    And The user click on the "New Resource" button.
    Then The User verify that Quantity Selection Switch is clickable

  @ONB2-324
  Scenario:TC ONB2-324 Verify that "Auto Add to Onboarding" is visible on the New Resource page.
    And The user click on the "New Resource" button.
    And The user verify that "Auto Add to Onboarding" title is visible

  Scenario:"Auto Add to Onboarding" switch is clickable
    And The user click on the "New Resource" button.
    Then The User verify that Auto Add to Onboarding Switch is clickable


  @ONB2-327
  Scenario:TC ONB2-327 "Resources" title is visible
    And The user click on the "New Resource" button.
    And The user should seen "Resources" section

  @ONB2-328
  Scenario:TC ONB2-328 "Resource Name" title is visible.
    And The user click on the "New Resource" button.
    And The user verify that "Resource Name" title is visible

  @ONB2-330
  Scenario:TC ONB2-330 "Contact" title is visible.
    And The user click on the "New Resource" button.
    And The user verify that "Contacts" title is visible in the Resources Section

  @ONB2-331
  Scenario:TC ONB2-331 the "+" button next to the "Contacts" title is clickable.
    And The user click on the "New Resource" button.
    And The User click on plus + button near to "Contacts" title
    Then The User verify that the modal is opened

  @ONB2-336
  Scenario:TC ONB2-336 On the Create Contact page, verify that the "X" button is clickable in the upper-right corner
    And The user click on the "New Resource" button.
    And The user hovers over the + button next to the Contacts title, the Create Contact alert appears
    And The User click on plus + button near to "Contacts" title
    And The user clicks the x button
    Then The user verify that the New Resource page is seen

  @ONB2-366
  Scenario:TC ONB2-366 verify that the "Back" button is clickable
    And The user click on the "New Resource" button.
    Then The User verify that "Back" button is clickable

  @ONB2-333
  Scenario:TC:BUG ONB2-333 The New Resource page, next to the "Contacts" title, click on the "+"
  button Verify that the "Create Contact" page is visible and active.
# Then The user clicks on the "New Resource" button
# Then The user hovers over the + button next to the Contacts title, the Create Contact alert appears
# And The user clicks the + button
# And The user should be seen the "Full Name / Company" title
# Then The user clicks on the "Enter full name or company" button
# Then The user enters the relevant information in the "Enter full name or company" text box
# Then The user clicks on the "Enter email" text box
# Then The user enters the relevant information in the "Enter email" text box
# Then The user clicks the "Ok" button
# And The user enters valid information and sees the confirmation message

  @ONB2-317
  Scenario:TC ONB2-317 "Enter category name" text box is enterable
    And The user click on the "New Resource" button.
    Then user should be able to enter information in the "Enter category name" box

  @ONB2-329
  Scenario:TC ONB2-329 "Enter resource name" text box is enterable
    And The user click on the "New Resource" button.
    Then user should be able to enter information in the "Enter resource name" box


  @ONB2-367
  Scenario:TC ONB2-367 On the New Resource page, verify that the "Create" button is visible
    And The user click on the "New Resource" button.
    Then The User verify that "Create" button is clickable


  Scenario:TC ONB2-367 On the New Resource page, verify that the "Create" button is visible
    And The user click on the "New Resource" button.
    Then The User verifies that "Create" button is visible

    
  @ONB2-380 # E2E test hatali!!!!!!
  Scenario:TC ONB2-380 On the Resources page, verify that the records entered under the "List of Resources" heading are visible.
    And The user click on the "New Resource" button.
    And The user selects a Company from company dropdown "Test Techno Consultant"
    And The user enters a Category Name on the new resource page
    And The user selects Selection Type as "true"
    And The user selects Quantity Selection  as "true"
    And The user selects Auto Add to Onboarding as "true"
    And The user enters a Resource Name on the new resource page
    And The user selects a Contact from contacts dropdown "shae.monahan@yahoo.com - Armand"
    Then The user clicks on the Create button
    And The user should be the entered information in a list
    #vernell.keebler@gmail.com - Tristan Hegmann


  @ONB2-364
  Scenario:TC ONB2-364  Delete icon in the Resources section is visible
    And The user click on the "New Resource" button.
    Then The user verify that delete icon is visible

  Scenario:TC ONB2-364  Delete icon in the Resources section is clickable
    And The user click on the "New Resource" button.
    Then The user verify that delete icon is clickable



  @ONB2-368
  Scenario:TC ONB2-368 The user should not be able to create a resource with incomplete information (Negative Senario)
    And The user click on the "New Resource" button.
    And The User Click on the "Create" button
    Then The user should be able to see a warning message as "Please fill out all required fields correctly."


  @ONB2-369 # bug????
  Scenario:TC ONB2-369 Verify that the "Delete" button is clickable
    And The user click on the delete icon in the Actions section of a first element of onboarding list
    And The user click on the "Delete" button.
    Then The user should be able to see a warning message as "Field option category successfully deleted"

  @ONB2-370
  Scenario:TC ONB2-370 The Cancel button in the modal is clickable
    And The user click on the delete icon in the Actions section of a first element of onboarding list
    Then The User verify that "Cancel" button is clickable
    
  @ONB2-390
  Scenario:TC ONB2-390 E2E-Verify that new entries can be made on the Resources page.
    Then The user click on the "New Resource" button.
    Then  User enters valid information on the "New Resource" page
    Then The user clicks on the Create button
    Then The user should be seen the Ant-Popover should appear.
    And The user click on the delete icon in the Actions section of a first element of resources list
    And The User click on "Delete" button on the ant-popover
    And The user should see the delete messagee resources successfully created.


