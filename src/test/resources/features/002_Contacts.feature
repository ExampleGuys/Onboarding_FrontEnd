@regression
Feature: Contacts test

  Background:pre-steps
    Given The user goes to staging url
    And The user enters with user "requesterUser" and user "requester_password"
    And The User click on the "Contacts" section in the Navigation Menu

  @ONB2-151
  Scenario: TC: ONB2-151 New Contact button should be visible
    Then The User should seen "New Contact" button

  @ONB2-152
  Scenario: TC: ONB2-152 New Contact button should be clickable
    Then The User verifies that "New Contact" button is clickable

  @ONB2-163
  Scenario: TC: ONB2-163 Full Name / Company section should be visible in the New Contact page
    And The user click on the "New Contact" button.
    Then The User should be able to see "Full Name / Company" section in the New Contact page

  @ONB2-164
  Scenario: TC: ONB2-164 Email section should be visible in the New Contact page
    And The user click on the "New Contact" button.
    Then The User should be able to see "Email" section in the New Contact page

  @ONB2-165
  Scenario: TC: ONB2-165 Full Name / Company column should be visible in the Contacts page
    Then The User should be able to see "Full Name / companies" column in the Contacts page

  @ONB2-166
  Scenario: TC: ONB2-166 Email column should be visible in the Contacts page
    Then The User should be able to see "Email" column in the Contacts page

  @ONB2-167
  Scenario: TC: ONB2-167 Last Change column should be visible in the Contacts page
    Then The User should be able to see "Last Change" column in the Contacts page

  @ONB2-168
  Scenario: TC: ONB2-168 Created By column should be visible in the Contacts page
    Then The User should be able to see "Created By" column in the Contacts page

  @ONB2-292
  Scenario: TC: ONB2-292 Verify that the warning message should be seen when creating a contact without a data
    And The user click on the "New Contact" button.
    And The user click on the "Create" button.
    Then The User verify that "Please fill out all required fields correctly." message should be seen

  @ONB2-118
  Scenario: TC: ONB2-118 New contact information should view under the list of the contacts section
    And The user click on the "New Contact" button.
    And The user writes a contact name in "Enter full name or company" text area
    And The user writes Email address in "Enter email" text area
    And The user click on the "Create" button.
    Then The User should be able to verify that new contact is in the contacts' list

  @ONB2-119
  Scenario: TC: @ONB2-119 Create a contact without filling the email text field
    And The user click on the "New Contact" button.
    And The user writes a contact name in "Enter full name or company" text area
    And The user click on the "Create" button.
    Then The User should be able to verify that user should not be able create a contact

  @ONB2-153
  Scenario: TC: ONB2-153 Create a contact without filling the company name text field
    And The user click on the "New Contact" button.
    And The user writes Email address in "Enter email" text area
    And The user click on the "Create" button.
    Then The User should be able to verify that user should not be able create a contact

  @ONB2-154
  Scenario: TC: ONB2-154 Observe that new contact created message appears
    And The user click on the "New Contact" button.
    And The user writes a contact name in "Enter full name or company" text area
    And The user writes Email address in "Enter email" text area
    And The user clicks on the "Create" button
    Then The User should be able to see "contacts successfully created" message

  @ONB2-176
  Scenario: TC: ONB2-176 Contacts text should be visible at the top left of the Contacts page
    Then The user should be able to view "Contacts" text at the top left of the page

  @ONB2-34
  Scenario: TC: ONB2-34 Contacts information should be displayed as a table
    Then The User should be able to see contacts information as a table

  @ONB2-148
  Scenario: TC: ONB2-148 Create a company name by using numbers
    And The user click on the "New Contact" button.
    And The user writes a contact name in "Enter full name or company" text area with numbers
    And The user writes Email address in "Enter email" text area
    And The user clicks on the "Create" button
    Then The User should be able to verify that writes a company name by using numbers

  @ONB2-291
  Scenario: TC: ONB2-291 Contacts breadcrumb link should be visible and clickable on the New Contacts page
    And The user click on the "New Contact" button.
    Then The User should be able to view "Contacts" breadcrumb link
    Then The User should be able to clickable "Contacts" breadcrumb link

  @ONB2-231
  Scenario: TC: ONB2-231 Verify that the back button works
    And The user click on the "New Contact" button.
    And The user click on the "Back" button.
    Then The User should be able to verify that goes back to the "Contacts | Mycomp" page

  @ONB2-97
  Scenario: TC: ONB2-97 Observe the number of total contacts correctly
    And The User scrolls until end of the page
    Then The User should be able to observe the number of total contacts correctly

  @ONB2-96
  Scenario: TC: ONB2-96 Change and observe number of contacts from the page selection button
    And The User scrolls until end of the page
    And The user clicks page selection button
    And The user chooses "10 / page"
    Then The User should be able to observe "10" contacts on one page

  @ONB2-227
  Scenario: TC: ONB2-227 Pagination-next-item should be clickable for the next page in the Contacts page
    And The User scrolls until end of the page
    Then The User should be able to click pagination-next-item button

  @ONB2-178
  Scenario: TC: ONB2-178 Created contact should be deleted
    And The User click on the delete icon in the Actions section of a first element of contacts list
    And The User clicks on "Delete" button on the ant-popover
    Then The User should be able to verify that created contact is deleted

  @ONB2-171
  Scenario: TC: ONB2-171 Delete icon should be visible in the Contacts page
    Then The User should be able to view Delete icon in the Contacts page

  @ONB2-169
  Scenario: TC: ONB2-169 Edit icon should be visible in the Contacts page
    Then The User should be able to view Edit icon in the Contacts page

  @ONB2-173
  Scenario: TC: ONB2-173 Edit icon should be clickable in the Contacts page
    Then The User should be able to click Edit icon in the Contacts page

  @ONB2-174
  Scenario: TC: ONB2-174 Delete icon should be clickable in the Contacts page
    Then The User should be able to click Delete icon in the Contacts page

  @ONB2-179
  Scenario: TC: ONB2-179 Cancel button should be clickable on the ant-popover in the Contacts page
    And The User click on Delete icon
    Then The User should be able to click "Cancel" button

  @ONB2-229
  Scenario: TC: ONB2-229 Move forward and backward in the Contacts page
    And The User scrolls until end of the page
    And The User click on pagination-next-item to move next page
    Then The User should be able to verify that goes to the next page
    And The User clicks pagination-prev-item to move previous page
    Then The User should be able to verify that goes back to the previous page

  @ONB2-95
  Scenario: TC: ONB2-95 Observe latest created contact is at the top of the list of contacts
    And The user click on the "New Contact" button.
    And The user writes a contact name in "Enter full name or company" text area
    And The user writes Email address in "Enter email" text area
    And The user click on the "Create" button.
    Then The User should be able to observe latest created contact is at the top of the list

  @ONB2-289
  Scenario: TC: ONB2-289 View contacts information under "List of Contacts" header
    Then The User should be able to view contacts' information under "List of Contacts" header

  @ONB2-182
  Scenario: TC: ONB2-182 Update contact name and save
    And The User click on Edit icon in first Element of List of Contacts in the Contacts page
    And The User writes updated in the "Enter full name or company" text area
    Then The User should be able to save the updated company name

  @ONB2-184
  Scenario: TC: ONB2-184 Contact successfully updated message should be seen
    And The User click on Edit icon in first Element of List of Contacts in the Contacts page
    And The User writes updated in the "Enter full name or company" text area
    And The user click on the "Save" button.
    Then The User should be able to see "contacts successfully updated" message

  @ONB2-147
  Scenario: TC: ONB2-147 Verify that enters the contacts page
    Then The User should be able to verify that enters the "Contacts | Mycomp" page

  @ONB2-288
  Scenario: TC: ONB2-288 Verify that the back button works in the Edit Contact | Mycomp page
    And The User click on Edit icon in first Element of List of Contacts in the Contacts page
    And The user click on the "Back" button.
    Then The User should be able to verify that goes back to the "Contacts | Mycomp" page