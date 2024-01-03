Feature: Login Screen Test

  Background:
    Given The user goes to staging url

  @ONB2-251 @crud
  Scenario Outline: TC ONB2-251 The user should log in with the correct credentials.
    And The user enters with user "<email>" and user "<password>"
    Then The user verify that sign in successfully

    Examples:
      | email           | password            |
      | superAdminUser  | superAdmin_password |
      | adminUser       | admin_password      |
      | employeeUser    | employeePassword    |
      | lineMenagerUser | lineMenagerPassword |
      | supplier        | supplier_password   |
      | approverUser    | approver_password   |


  @ONB-398 @crud
  Scenario Outline: TC ONB2-398 The User should NOT log in unmatched credentials, invalid email and wrong password
    Then The user enters with user "<Email>", user "<Password>", and "<warningMessage>" and verify that con not login

    Examples:

      | Email          | Password            | warningMessage                                |
      | superAdminUser | wrongPassword       | Credentials didn't match                      |
      | superAdminUser | emptyPassword       | Please fill out all required fields correctly |
      | inValidEmail   | superAdmin_password | Email must be a valid email                   |
      | inValidEmail   | wrongPassword       | Email must be a valid email                   |
      | incorrectEmail | superAdmin_password | Credentials didn't match                      |
      | emptyEmail     | emptyPassword       | Please fill out all required fields correctly |








