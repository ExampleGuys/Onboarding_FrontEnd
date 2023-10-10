Feature: Resources
Scenario:TC: ONB2-365 On the New Resource page, verify that the "+ Add resource" button is visible and clickable.

  Given The user goes to the sign-in page
  When The user enters valid logon credentials
  Then The user clicks on the "Resources" category
  Then The user clicks on the "New Resource" button
  Then The user clicks on the "Add resource" button
  And The user should be seen the new recources item opened



