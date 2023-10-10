Feature: Contacts test

  @ONB2-151
  Scenario: TC: ONB2-151 New Contact button should be visible

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    Then user should be able to view "New Contact" button