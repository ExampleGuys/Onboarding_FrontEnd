@regression
Feature: Sites Tests

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "superAdminUser" and user "superAdmin_password"
    And The User click on the "Sites" section in the Navigation Menu


  @ONB2-198
  Scenario:TC ONB2-198 "Sites" category can appear and in the Navigation Menu
    Then The User verify that "Sites" button is clickable

  @ONB2-199
  Scenario:TC ONB2-199 Clicking on the "Sites" category sould be redirect to Sites Page
    Then The user verify that the page redirect to "Sites | Mycomp" Page

  @ONB2-200
  Scenario:TC ONB2-200 "Sites" breadcrumblink is visible in the Sites page
    Then The User should be able to view "Sites" breadcrumb link

  @ONB2-201
  Scenario:TC ONB2-201  The "List of Sites" heading appears on the Sites page.
    Then The user verify that the "List of Sites" title is seen

  @ONB2-202
  Scenario:TC ONB2-202 sites column should be visible in the Sites page
    Then The User should be able to see "sites" column in the page


  @ONB2-203
  Scenario:TC ONB2-203 Created By column should be visible in the Sites page
    Then The User should be able to see "Created By" column in the page

  @ONB2-204
  Scenario:TC ONB2-204 Created At column should be visible in the Sites page
    Then The User should be able to see "Created At" column in the page

  @ONB2-207
  Scenario:TC ONB2-207 Verify that the "Delete" button is clickable
    And The user click on the delete icon in the Actions section of a first element of onboarding list
    And The user click on the "Delete" button.
    Then The user should be able to see a warning message as "sites successfully deleted"


  @ONB2-208
  Scenario:TC ONB2-208  "Delete" button in the modal is visible
    And The user click on the delete icon in the Actions section of a first element of onboarding list
    Then The User verifies that "Delete" button is visible

  @ONB2-209
  Scenario:TC ONB2-209 "Delete" button in the modal is clickable
    And The user click on the delete icon in the Actions section of a first element of onboarding list
    Then The User verify that "Delete" button is clickable

  @ONB2-211
  Scenario:TC ONB2-211 Cancel button in the modal is clickable
    And The user click on the delete icon in the Actions section of a first element of onboarding list
    Then The User verify that "Cancel" button is clickable

  @ONB2-236
  Scenario:TC ONB2-236 "New Site" button is clickable.
    Then The User verify that "New Site" button is clickable

  Scenario:"New Site" button is visible
    Then The User verifies that "New Site" button is visible


  @ONB2-263
  Scenario:TC ONB2-263 Verify that the number of characters entered in the "For Directions" item is visible on the New Site page.
    And The user click on the "New Site" button.
    Then The user should be able to type up to fivehundred characters in the Description field


  @ONB2-266
  Scenario:TC: ONB2-266 The user should not be able to create a site with incomplete information (Negative Senario)
    And The user click on the "New Site" button.
    And User enters invalid information on the page
    And The user click on the "Create" button.
    Then The user should be able to see a warning message as "Something went wrong"

  @ONB2-268  #>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
  Scenario:TC: ONB2-268 Verify that the "Edit" button is visible and active on the "Sites" page.
    And The user click on the "Edit" button.

  @ONB2-205
  Scenario:TC: Bug ONB2-205 Verify that the "Search by Site" search box is visible and active on the "Sites" page. //Search box Test
    And The user should be able to click on the "Search by Site" search box
    And The user must be able to search in the "Search by Site" search box

  @ONB2-206
  Scenario:TC: ONB2-206 On the "Sites" page, the "Search by Site" searchbox appears and verify that it is active.
    And The user should be able to click on the Search by Site search box
    And The user must be able to search in the Search by Site search box

  @ONB2-210
  Scenario:TC: ONB2-210 Verify that clicking the "Delete" button on the "Sites" page has confirmed that the deletion occurred.
    Then The user clicks on the Delete button
    Then The user should be seen the Ant-Popover should appear
    Then The user clicks on the Sites Sites Delete button
    And The user should see the delete messagee Site successfully deleted

  @ONB2-239
  Scenario:TC: ONB2-239 Verify that the "Site" heading is visible on the New Site page.
    Then The user clicks on the "New Site" button
    And The user should be seen the New Site Site title

  @ONB2-242
  Scenario:TC: ONB2-242 Verify that the "Zip Code" title is visible on the New Site page.
    Then The user clicks on the "New Site" button
    And The user should be seen the New Site, Zip Code title

  @ONB2-240
  Scenario:TC: ONB2-240 On the New Site page, verify that the "Address Site" item is visible and active
    And The user clicks on the "New Site" button
    And The user clicks on the Adress Site button
    And User enters valid information on the "Adress Site" item

  @ONB2-245
  Scenario:TC: ONB2-245 On the New Site page, verify that the counter buttons in the "Zip Code" item are visible and active.
    Then The user clicks on the "New Site" button
    Then The user clicks on the Zip Code button
    And The user enters the information on the Zip Code item
    And The user clicks on the counter on the "Zip Code" item

  @ONB2-252
  Scenario:TC: ONB2-252 On the New Site page, verify that the title  "Country" is visible.
    Then The user clicks on the "New Site" button
    And The user should be seen the New Site, Country title

  @ONB2-253
  Scenario: BUG TC: ONB2-253 On the New Site page, verify that the item "Country" is visible and active.
    Then The user clicks on the "New Site" button
    And The user clicks on the Country item
    And  The user enters the information on the Country item

  @ONB2-254
  Scenario:TC: ONB2-254 Verify that the "State / City" title is visible on the New Site page.
    Then The user clicks on the "New Site" button
    And The user should be seen the New Site, City title

  @ONB2-255
  Scenario:TC: ONB2-255 On the New Site page, verify that the item "State / City" is visible and active.
    Then The user clicks on the "New Site" button
    Then The user clicks on the City item
    Then The user enters the information on the City item

  @ONB2-257
  Scenario:TC: ONB2-257 On the New Site page, verify that the "State/County" title is visible.
    Then The user clicks on the "New Site" button
    And The user should be seen the New Site, District title

  @ONB2-258
  Scenario:TC: ONB2-258 On the New Site page, verify that the item "District" is visible and active.
    Then The user clicks on the "New Site" button
    Then The user clicks on the District item
    And The user enters the information on the District item

  @ONB2-259
  Scenario:TC: ONB2-259 Verify that the "Street" title is visible on the New Site page.
    Then The user clicks on the "New Site" button
    And The user should be seen the New Site, Street title

  @ONB2-260
  Scenario:TC: ONB2-260 Verify that the "Street" item is visible and active on the New Site page.
    Then The user clicks on the "New Site" button
    Then The user clicks on the Street item
    And The user enters the information on the Street item

  @ONB2-248
  Scenario:TC: Manual Test => ONB2-248 On the New Site page, verify that you cannot enter the wrong characters in the "Postal Code" item.
    Then The user clicks on the "New Site" button
    Then The user clicks on the Zip Code button
    And The user enters the information on the Zip Code item
    And The user clicks on the counter on the "Zip Code" item
    And User "Zip Code" must have entered incorrect character

  @ONB2-261
  Scenario:TC: ONB2-261 Verify that the "For Directions" heading appears on the New Site page.
    Then The user clicks on the "New Site" button
    And The user clicks on the "For Directions" item

  @ONB2-262
  Scenario:TC: Manual Test ==> ONB2-262 Verify that you cannot enter more than 500 characters in the "For Directions" item on the New Site page.
    Then The user clicks on the "New Site" button
    And The user clicks on the "For Directions" item
    Then The user should be able to type up to fivehundred characters in the Description field
    And The user cannot enter more than 500 characters in the "For Directions" item on the "New Site" page

  @ONB2-264
  Scenario:TC: ONB2-264 On the New Site page, the "For Directions" item appears next to the scroll bar, and Verify that it is active.
    Then The user clicks on the "New Site" button
    And The user clicks on the "For Directions" item
    Then The user should be able to type up to fivehundred characters in the Description field
    And  The user clicks on the scroll bar on the "For Directions" item
    # locate alinmiyor

  @ONB2-265
  Scenario:TC: ONB2-265 Verify that the "Create" button is visible and clickable on the New Site page.
    Then The user clicks on the "New Site" button
    Then User enters invalid information on the "New Site" page
    Then The user clicks on the Create button

  @ONB2-267
  Scenario:TC: ONB2-267 On the New Site page, verify that the "Back" button is visible and clickable.
    Then The user clicks on the "New Site" button
    Then The user clicks on the "Back" button
    And The user should be seen the Sites page

  @ONB2-269
  Scenario:TC: ONB2-269 Verify that clicking the "Edit" button on the "Sites" page shows that the "Edit Site" page is visible.
    Then The user clicks on the Edit button
    And  The user should be seen the "Edit Site" page

  @ONB2-270
  Scenario:TC: ONB2-270 Confirm that changes are made to the "Edit Site" page when the "Edit" button is clicked on the "Sites" page.
    Then The user clicks on the Edit button
    Then The user makes changes to the desired category
    And The user sees the confirmation message

  @ONB2-274
  Scenario:TC: ONB2-274 On the "New Sites" page, verify that "New Sites" is visible and clickable.
    Then The user should be seen the Sites page
    Then The user clicks on the "New Site" button

  @ONB2-389
  Scenario:TC: ONB2-389 E2E-Verify that new entries can be made on the site page.
    Then The user clicks on the "New Site" button
    Then User enters valid information on the New Site page
    And The user clicks on the Create button
    Then The user clicks on the Edit button
    And User enters valid information on the "Adress Site" item
    Then The user clicks on the Save button
