Feature: Resources Tests

  Background:Resourcces Tests
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category

  @ONB2-365
  Scenario:TC: ONB2-365 On the New Resource page, verify that the "+ Add resource" button is visible and clickable.
    Then The user clicks on the "New Resource" button
    Then The user clicks on the "Add resource" button
    And The user should be seen the new recources item opened

  @ONB2-307
  Scenario: TC : ONB2-307 Verify that the Resources category is visible and clickable on the Home Page.
    And The user should be seen the Resources page

  @ONB2-308
  Scenario:TC: ONB2-308 Verify that the "List of Resources" heading appears on the Resources page.
    And The user should be the "List of Resources" title on the "Resources" page

  @ONB2-309
  Scenario:TC: ONB2-309 On the Resources page, verify that the navigation bar appears under the "List of Resources" title.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    And The user should be the String "List of Resources" "Category Name" "Created By" "Created At" title

  @ONB2-310
  Scenario:TC: ONB2-310 On the Resources page, verify that the "Search by name" search box is visible and active.
    Then The user clicks on the Search by name search box
    And User searches in the search box

  @ONB2-314
  Scenario: TC : ONB2-314 On the Resources page, verify that the "New Resorces" button is visible and clickable.
    Then The user clicks on the "New Resource" button
    And The user should be seen the New Resource page

  @ONB2-315
  Scenario:TC: ONB2-315 On the New Resources page, verify that the "Resources" button is visible and clickable.
    Then The user clicks on the "New Resource" button
    Then The user clicks on the "Resources" link
    And The user should be seen the Resources page

  @ONB2-316
  Scenario:TC: ONB2-316 On the New Resource page, verify that the "Category Name" title is visible.
    Then The user clicks on the "New Resource" button
    And The user should be seen the "Category Name" title

  @ONB2-319
  Scenario:TC: ONB2-319 Verify that the "Selection Type" title is visible on the New Resource page.
    Then The user clicks on the "New Resource" button
    And The user should be seen the selection type title

  @ONB2-320
  Scenario:TC: ONB2-320 On the New Resource page, verify that the "Single Selection" button is visible and clickable.
    Then The user clicks on the "New Resource" button
    And The user should be seen the Single Selection title
    And The user clicks on the Single Selection button
    And The user should be seen the Multiple Selection title

  @ONB2-321
  Scenario:TC: ONB2-321 Verify that "Quantity Selection" is visible on the New Resource page.
    Then The user clicks on the "New Resource" button
    Then The user should be seen the New Resource page
    And The user should be seen the Quantity Selection title

  @ONB2-323
  Scenario:TC: ONB2-323 On the New Resource page, verify that the "No Selection" button is visible and clickable.
    Then The user clicks on the "New Resource" button
    Then The user should be seen the Selection title
    And The user clicks on the Selection button
    And User should be seen No Selection title

  @ONB2-324
  Scenario:TC: ONB2-324 Verify that "Auto Add to Onboarding" is visible on the New Resource page.
    Then The user clicks on the "New Resource" button
    And The user should be seen the "Auto Add to Onboarding" title

  @ONB2-325
  Scenario:TC: ONB2-325 On the New Resource page, verify that the "Manual" button is visible and clickable.Given The user goes to the sign-in page
    Then The user clicks on the "New Resource" button
    Then The user should be seen the Manual title
    And The user clicks on the Manual button
    And The user should be seen the Auto-add title

  @ONB2-327
  Scenario:TC: ONB2-327 On the New Resource page, verify that the "Resources" title is visible
    Then The user clicks on the "New Resource" button
    And The user should be seen the Resources title

  @ONB2-328
  Scenario:TC: ONB2-328 On the New Resource page, verify that the "Resource Name" title is visible.
    Then The user clicks on the "New Resource" button
    And The user should be the seen Recources Name title

  @ONB2-330
  Scenario:TC: ONB2-330 On the New Resource page, verify that the "Contact + " title is visible.
    Then The user clicks on the "New Resource" button
    And The user should be seen the Contacts + title

  @ONB2-331
  Scenario:TC: ONB2-331 On the New Resource page, the "+" button appears next to the "Contacts" title  and verify that it is clickable.
    Then The user clicks on the "New Resource" button
    And The user should be seen the Contacts + title
    Then The user hovers over the + button next to the Contacts title, the Create Contact alert appears
    And The user clicks the + button
    And The user should be seen the Create Contact page

  @ONB2-334
  Scenario:TC: ONB2-334 On the New Resource page, next to the "Contacts" heading, click on the "+" button Verify that
  the error message appears and is active when incorrect information is entered on the "Create Contact" page.
    Then The user clicks on the "New Resource" button
    And The user should be seen the Contacts + title
    Then The user hovers over the + button next to the Contacts title, the Create Contact alert appears
    And The user clicks the + button
    And The user clicks on the "Cancel" button
    And The user should be seen the New Resource page

  @ONB2-336
  Scenario:TC: ONB2-336 On the Create Contact page, verify that the "X" button is visible and clickable in the upper-right corner
    Then The user clicks on the "New Resource" button
    And The user should be seen the Contacts + title
    Then The user hovers over the + button next to the Contacts title, the Create Contact alert appears
    And The user clicks the + button
    Then The user clicks the x button
    And The user should be seen the New Resource page

  @ONB2-366
  Scenario:TC: ONB2-366 On the New Resource page, verify that the "Back" button is visible and clickable.
    Then The user clicks on the "New Resource" button
    Then The user clicks the Back button
    And The user should be seen the Resources page

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
  Scenario:TC: ONB2-317 On the New Source page, verify that the "Enter category name" text box is visible and clickable.
    Then The user clicks on the "New Resource" button
    Then The user should be seen the "Category Name" title
    Then The user should be the seen Enter category name text box
    Then The user clicks on the Enter category name item
    And  The user only write in "Enter category" text box
    And The user should see the error message "Please fill out all required fields correctly."

  @ONB2-329
  Scenario:TC: ONB2-329 On the New Resource page, verify that the "Enter resource name" text box appears and is clickable
    Then The user clicks on the "New Resource" button
    Then The user should be seen the "Resource Name" title
    Then The user clicks on the Enter resource name text box
    Then Relevant information into the enter Enter resource name text box

  @ONB2-367
  Scenario:TC: ONB2-367 On the New Resource page, verify that the "Create" button is visible and clickable.
    Then The user clicks on the "New Resource" button
    Then  User enters valid information on the "New Resource" page
    Then The user clicks on the Create button
    Then  The user should see the message "Resource successfully created"

  @ONB2-372
  Scenario:TC: BUG ONB2-372 On the Resources page, verify that the "Created At" heading is visible and active.
    Then The user should be the "Created At" heading on the "Resources" page
    Then The user enters the relevant information on the "New Resources" page
    And Under the "Created At" heading, the user sees what time they logged in

  @ONB2-380
  Scenario:TC: ONB2-380 On the Resources page, verify that the records entered under the "List of Resources" heading are visible.
    And The user clicks on the "New Resource" button
    And The user selects a Company from company dropdown "Test Techno Consultant"
    And The user enters a Category Name on the new resource page
    And The user selects Selection Type as "true"
    And The user selects Quantity Selection  as "true"
    And The user selects Auto Add to Onboarding as "true"
    And The user enters a Resource Name on the new resource page
    And The user selects a Contact from contacts dropdown "millard.mclaughlin@gmail.com - Lisabeth Wiza"
    Then The user clicks on the Create button
    And The user should be the entered information in a list
    #vernell.keebler@gmail.com - Tristan Hegmann

  @ONB2-312
  Scenario:TC: BUG ONB2-312 On the Resources page, verify that the search badge for the "Search by name" searchbox is clickable.
    Then The user should be able to click on the "Search by name" search box
    And The user should be able to click on the icon next to the "Search by name" search box.

  @ONB2-364
  Scenario:TC: ONB2-364 On the New Resource page, verify that the "Delete Resource" button is visible and clickable
    Then The user clicks on the "New Resource" button
    And The user should be seen the Ant-Popover should appear.
    And The user clicks on the New Resources Delete button
    And The user clicks on the New Resources Resource Delete button
    And Verify appear that the Add resource line has been deleted.

  @ONB2-368
  Scenario:TC: ONB2-368 On the New Resource page, verify that the "Create" button is visible and clickable. (Negative Senario)
    Then The user clicks on the "New Resource" button
    Then User enters invalid information on the New Resource page
    Then The user clicks on the Create button
    Then The user should see the messagee "Please fill out all required fields correctly."

  @ONB2-369
  Scenario:TC: ONB2-369 Verify that the "Delete" button is visible and active on the Resources page.
    Then The user should be seen the Ant-Popover should appear.
    Then The user clicks on the Resources Delete button
    Then The user clicks on the Resources Resource Delete button
    And The user should see the delete messagee "Field option category successfully deleted"

  @ONB2-370
  Scenario:TC: ONB2-370 In the dropdown that comes when the "Delete" button is clicked on the New Resource page Verify that the "Cancel" button is visible and clickable.
    Then The user should be seen the Ant-Popover should appear.
    Then The user clicks on the Resources Delete button
    Then The user clicks on the Resources Resource Cancel button
    And The user should be seen the Resources page

  @ONB2-390
  Scenario:TC: ONB2-390 E2E-Verify that new entries can be made on the Resources page.
    Then The user clicks on the "New Resource" button
    Then  User enters valid information on the New Resource page
    Then The user clicks on the Create button
    Then The user should be seen the Ant-Popover should appear.
    Then The user clicks on the Resources Delete button
    And The user should see the delete messagee Please fill out all required fields correctly.


