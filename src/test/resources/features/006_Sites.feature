Feature: Sites Tests

Background:Sites Tests
  Given The user goes to the sign-in page
  When The user enters valid logon credentials
  Then The user clicks on the "Sites" category

  @ONB2-198
Scenario:TC: ONB2-198 On the Home Page of the "Sites" category can appear and click and verify.
  Given The user goes to the sign-in page
  When The user enters valid logon credentials
  Then The user clicks on the "Sites" category


  @ONB2-199
  Scenario:TC: ONB2-199 Verify that clicking on the "Sites" category makes the "Sites" page viewable.
       And The user should be seen the Sites page