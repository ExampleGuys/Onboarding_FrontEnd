Feature: Resources

  Scenario:TC: ONB2-365 On the New Resource page, verify that the "+ Add resource" button is visible and clickable.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    Then The user clicks on the "Add resource" button
    And The user should be seen the new recources item opened

  Scenario:TC: ONB2-314 On the Resources page, verify that the "New Resorces" button is visible and clickable.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    And The user should be seen the "New Resource" page

  Scenario:TC: ONB2-315 On the New Resources page, verify that the "Resources" button is visible and clickable.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    Then The user clicks on the "Resources" link
    And The user should be seen the "Resources" page

  Scenario:TC: ONB2-316 On the New Resource page, verify that the "Category Name" title is visible.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    And The user should be seen the "category name" title

  Scenario:TC: ONB2-319 Verify that the "Selection Type" title is visible on the New Resource page.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    And The user should be seen the selection type title

  Scenario:TC: ONB2-320 On the New Resource page, verify that the "Single Selection" button is visible and clickable.
    Given The user goes to the sign-in page
    When The user enters valid logon credentials
    Then The user clicks on the "Resources" category
    Then The user clicks on the "New Resource" button
    And The user should be seen the selection type title
    And The user should be seen the Single Selection title
    And The user clicks on the "Single Selection" button
    And The user should be seen the Multiple Selection title



