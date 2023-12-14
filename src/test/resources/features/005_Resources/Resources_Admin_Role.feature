Feature: Resources Test with Admin Role

  Background: pre-steps
    Given The user goes to staging url
    And The user enters with user "adminUser" and user "admin_password"
    And The user click on "Resources" at the navigation menu

  @ONMYC-897
   Scenario: TC ONMYC-897 New Resource should be creatable
    And The user click on the "Create" button top right corner of the page
    And The user fills all required field in Resources create form for a Admin role
    And The user click on the "Create" button on the modal
    Then The user verify that the toast message is "Resource successfully created"

  @ONMYC-898
    Scenario: TC ONMYC-898 Created Resource should be visible
    Then The user verify that created resource is visible