Feature: Contacts test

  @ONB2-151
  Scenario: TC: ONB2-151 New Contact button should be visible

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    Then user should be able to view "New Contact" button

    @ONB2-152
    Scenario: TC: ONB2-152 New Contact button should be clickable
      Given The user goes to myCompSignin
      When the user enters valid requester "email" and "password"
      And the user clicks the sign in button
      And Click on the "Contacts" section in the Navigation Menu
      Then user verifies that "New Contact" button is clickable

  @ONB2-163
  Scenario: TC: ONB2-163 Full Name / Company section should be visible in the New Contact page

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    And The user click on the "New Contact" button.
    Then user should be able to see "Full Name / Company" section in the New Contact page

  @ONB2-164
  Scenario: TC: ONB2-164 Email section should be visible in the New Contact page

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    And The user click on the "New Contact" button.
    Then user should be able to see "Email" section in the New Contact page

  @ONB2-165
  Scenario: TC: ONB2-165 Full Name / Company column should be visible in the Contacts page

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    Then user should be able to see "Full Name / Company" column in the Contacts page

  @ONB2-166
  Scenario: TC: ONB2-166 Email column should be visible in the Contacts page

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    Then user should be able to see "Email" column in the Contacts page

  @ONB2-166
  Scenario: TC: ONB2-167 Last Change column should be visible in the Contacts page

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    Then user should be able to see "Last Change" column in the Contacts page


