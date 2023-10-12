Feature: Resources

  @ONB2-365
  Scenario:TC: ONB2-365 On the New Resource page, verify that the "+ Add resource" button is visible and clickable.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    Then The user clicks on the "Add resource" button
    And The user should be seen the new recources item opened

  @ONB2-307
  Scenario:TC: ONB2-307 Verify that the Resources category is visible and clickable on the Home Page.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    And The user should be seen the Resources page

  @ONB2-308
  Scenario:TC: ONB2-308 Verify that the "List of Resources" heading appears on the Resources page.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    And The user should be the "List of Resources" title on the "Resources" page

  @ONB2-314
  Scenario:TC: ONB2-314 On the Resources page, verify that the "New Resorces" button is visible and clickable.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    And The user should be seen the New Resource page

  @ONB2-315
  Scenario:TC: ONB2-315 On the New Resources page, verify that the "Resources" button is visible and clickable.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    Then The user clicks on the "Resources" link
    And The user should be seen the Resources page

  @ONB2-316
  Scenario:TC: ONB2-316 On the New Resource page, verify that the "Category Name" title is visible.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    And The user should be seen the "Category Name" title

  @ONB2-319
  Scenario:TC: ONB2-319 Verify that the "Selection Type" title is visible on the New Resource page.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    And The user should be seen the selection type title

  @ONB2-320
  Scenario:TC: ONB2-320 On the New Resource page, verify that the "Single Selection" button is visible and clickable.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    And The user should be seen the Single Selection title
    And The user clicks on the Single Selection button
    And The user should be seen the Multiple Selection title

  @ONB2-321
  Scenario:TC: ONB2-321 Verify that "Quantity Selection" is visible on the New Resource page.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    Then The user should be seen the New Resource page
    And The user should be seen the Quantity Selection title

  @ONB2-323
  Scenario:TC: ONB2-323 On the New Resource page, verify that the "No Selection" button is visible and clickable.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    Then The user should be seen the Selection title
    And The user clicks on the Selection button
    And User should be seen No Selection title

  @ONB2-324
  Scenario:TC: ONB2-324 Verify that "Auto Add to Onboarding" is visible on the New Resource page.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    And The user should be seen the "Auto Add to Onboarding" title

  @ONB2-325
  Scenario:TC: ONB2-325 On the New Resource page, verify that the "Manual" button is visible and clickable.Given The user goes to the sign-in page
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    Then The user should be seen the Manual title
    And The user clicks on the Manual button
    And The user should be seen the Auto-add title

  @ONB2-327
  Scenario:TC: ONB2-327 On the New Resource page, verify that the "Resources" title is visible
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    And The user should be seen the Resources title

  @ONB2-328
  Scenario:TC: ONB2-328 On the New Resource page, verify that the "Resource Name" title is visible.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    And The user should be the seen Recources Name title

  @ONB2-330
  Scenario:TC: ONB2-330 On the New Resource page, verify that the "Contact + " title is visible.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    And The user should be seen the Contacts + title

  @ONB2-331
  Scenario:TC: ONB2-331 On the New Resource page, the "+" button appears next to the "Contacts" title  and verify that it is clickable.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    And The user should be seen the Contacts + title
    Then The user hovers over the + button next to the Contacts title, the Create Contact alert appears
    And The user clicks the + button
    And The user should be seen the Create Contact page

  @ONB2-334
  Scenario:TC: ONB2-334 On the New Resource page, next to the "Contacts" heading, click on the "+" button Verify that
               the error message appears and is active when incorrect information is entered on the "Create Contact" page.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    And The user should be seen the Contacts + title
    Then The user hovers over the + button next to the Contacts title, the Create Contact alert appears
    And The user clicks the + button
    And The user clicks on the "Cancel" button
    And The user should be seen the New Resource page
