Feature: Sites Tests

Background:Sites Tests
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