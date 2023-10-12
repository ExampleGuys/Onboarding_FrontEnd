Feature: Resources
Scenario:TC: ONB2-365 On the New Resource page, verify that the "+ Add resource" button is visible and clickable.

  Given The user goes to the sign-in page
  When The user enters valid logon credentials
  Then The user clicks on the "Resources" category
  Then The user clicks on the "New Resource" button
  Then The user clicks on the "Add resource" button
  And The user should be seen the new recources item opened

  Scenario:TC: ONB2-307 Verify that the Resources category is visible and clickable on the Home Page.

  Given The user goes to the sign-in page
  When The user enters valid logon credentials
  Then The user clicks on the "Resources" category
  And The user should be seen the "Resources" page

  Scenario:TC: ONB2-308 Verify that the "List of Resources" heading appears on the Resources page.

    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    And The user should be the "List of Resources" title on the "Resources" page

  Scenario:TC: ONB2-309 On the Resources page, verify that the navigation bar appears under the "List of Resources" title.

    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    And The user should be the "List of Resources" "Category Name" "Created By" "Created At" title

  Scenario:TC: ONB2-310 On the Resources page, verify that the "Search by name" search box is visible and active.

    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the Search by name search box
    And User searches in the search box














