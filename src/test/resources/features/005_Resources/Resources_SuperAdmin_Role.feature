Feature: Resources Test with Super Admin Role
  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "superAdminUser" and user "superAdmin_password"
    And The user click on "Resources" at the navigation menu

  @ONMYC-907
  Scenario: TC ONMYC-907 New Resource should be creatable
    And The user click on the "Create" button top right corner of the page
    And The user fills all required field in Resources create form for a SuperAdmin role
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "Resource successfully created"