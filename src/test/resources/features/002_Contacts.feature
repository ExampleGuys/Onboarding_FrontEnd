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

  @ONB2-167
  Scenario: TC: ONB2-167 Last Change column should be visible in the Contacts page

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    Then user should be able to see "Last Change" column in the Contacts page

  @ONB2-168
  Scenario: TC: ONB2-168 Created By column should be visible in the Contacts page

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    Then user should be able to see "Created By" column in the Contacts page

  @ONB2-292
  Scenario: TC: ONB2-292 Verify that the warning message should be seen when creating a contact without a data

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    And The user click on the "New Contact" button.
    And The user click on the "Create" button.
    Then user should be able to see "Please fill out all required fields correctly." message

  @ONB2-118
  Scenario: TC: ONB2-118 New contact information should view under the list of the contacts section

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    And The user click on the "New Contact" button.
    And the user writes a contact name in "Enter full name or company" text area
    And the user writes Email address in "Enter email" text area
    And The user click on the "Create" button.
    Then user should be able to verify that new contact is in the contacts' list

  @ONB2-119
  Scenario: TC: @ONB2-119 Create a contact without filling the email text field

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    And The user click on the "New Contact" button.
    And the user writes a contact name in "Enter full name or company" text area
    And The user click on the "Create" button.
    Then user should be able to verify that user should not be able create a contact


  @ONB2-153
  Scenario: TC: ONB2-153 Create a contact without filling the company name text field

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    And The user click on the "New Contact" button.
    And the user writes email address in "Enter email" text area
    And The user click on the "Create" button.
    Then user should be able to verify that user should not be able create a contact

  @ONB2-154
  Scenario: TC: ONB2-154 Observe that new contact created message appears

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    And The user click on the "New Contact" button.
    And the user writes a contact name in "Enter full name or company" text area
    And the user writes email address in "Enter email" text area
    And the user clicks on the "Create" button
    Then user should be able to see "Contact successfully created" message

  @ONB2-176
  Scenario: TC: ONB2-176 Contacts text should be visible at the top left of the Contacts page

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    Then user should be able to view "Contacts" text at the top left of the page

  @ONB2-34
  Scenario: TC: ONB2-34 Contacts information should be displayed as a table

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    Then user should be able to see contacts information as a table

  @ONB2-148
  Scenario: TC: ONB2-148 Create a company name by using numbers

    Given The user goes to myCompSignin
    When the user enters valid requester "email" and "password"
    And the user clicks the sign in button
    And Click on the "Contacts" section in the Navigation Menu
    And The user click on the "New Contact" button.
    And the user writes a contact name in "Enter full name or company" text area with numbers
    And the user writes email address in "Enter email" text area
    And the user clicks on the "Create" button
    Then user should be able to verify that writes a company name by using numbers


