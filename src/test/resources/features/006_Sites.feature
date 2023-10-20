Feature: Sites Tests

Background: Sites Tests
  Given The user goes to the sign-in page
  When The user enters valid logon credentials
  Then The user clicks on the "Sites" category

  @ONB2-198
Scenario:TC: ONB2-198 On the Home Page of the "Sites" category can appear and click and verify.
  Then The user clicks on the "Sites" category


  @ONB2-199
  Scenario:TC: ONB2-199 Verify that clicking on the "Sites" category makes the "Sites" page viewable.
       And The user should be seen the Sites page

  @ONB2-200
  Scenario:TC: ONB2-200 Verify that the "Sites" link is visible and clickable on the "Sites" page.
        And The user must be able to click on the Sites link

  @ONB2-201
  Scenario:TC: ONB2-201 Verify that the "List of Sites" title is visible on the "Sites" page.
    And The user should be seen the List of Sites title

  @ONB2-202
  Scenario:TC: ONB2-202 Verify that the "Site" title is visible on the "Sites" page.
        And The user should be seen the Site title

  @ONB2-203
  Scenario:TC: ONB2-203 Verify that the "Created By" title is visible on the "Sites" page.
    And The user should be seen the Created By title

  @ONB2-204
  Scenario:TC: ONB2-204 Verify that the "Created At" title is visible on the "Sites" page.
    And The user should be seen the Created At title

  @ONB2-207
  Scenario:TC: ONB2-207 Verify that the "Delete" button is visible and active on the "Sites" page.
    And The user clicks on the Delete button

  @ONB2-208
  Scenario:TC: ONB2-208 Verify that clicking the "Delete" button on the "Sites" page will show that the Ant-Popover is visible.
    And The user clicks on the Delete button
    And The user should be seen the Ant-Popover should appear

  @ONB2-209
  Scenario:TC: ONB2-209 Verify that the "Delete" button is active when clicking the "Delete" button on the "Sites" page.
    And The user clicks on the Delete button
    And The user should be seen the Ant-Popover should appear
    And The user clicks on the Delete button

  @ONB2-211
  Scenario:TC: ONB2-211 Verify that the "Cancel" button is active when clicking the "Delete" button on the "Sites" page.
    And The user clicks on the Delete button
    And The user should be seen the Ant-Popover should appear
    And The user clicks on the "Cancel" button

  @ONB2-236
  Scenario:TC: ONB2-236 On the "Sites" page, verify that the "New Site" button is visible and clickable.
    And The user clicks on the "New Site" button

  @ONB2-263
  Scenario:TC: ONB2-263 Verify that the number of characters entered in the "For Directions" item is visible on the New Site page.
    Then The user clicks on the "New Site" button
    Then The user clicks on the "For Directions" item
    Then The user should be able to type up to fivehundred characters in the Description field
    And The user should see the number of characters they entered at the bottom right

  @ONB2-266
  Scenario:TC: ONB2-266 When invalid / incomplete information is entered on the New Site page, click the "Create" button Verify that the error message is visible.
    Then The user clicks on the "New Site" button
    Then User enters invalid information on the "New Site" page
    Then The user sees the error message

  @ONB2-268
  Scenario:TC: ONB2-268 Verify that the "Edit" button is visible and active on the "Sites" page.
    And The user clicks on the Edit button

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
    And The user performs the function of the counter on the "Zip Code" item

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