Feature: Sites Tests

@ONB2-198
Scenario:TC: ONB2-198 On the Home Page of the "Sites" category can appear and click and verify.
  Given The user goes to the sign-in page
  When The user enters valid logon credentials
  Then The user clicks on the "Sites" category
  And The user should be seen the Sites page