@regression

Feature: Login Screen Test

  Background:
    Given The user goes to staging url

  @ONB2-237
  Scenario: TC ONB2-237 The Sign In modal should be visible
    Then The user verify that the Sign In modal is visible

  @ONB2-244
  Scenario: TC OBN2-244 E-mail text field should be clickable on the Sign In page
    Then The user verify that the E-mail text field should be clickable

  @ONB2-247
  Scenario: TC ONB2-247 Password text field should be clickable on the Sign In page
    Then The user verify that the Password text field should be clickable

  @ONB2-251
  Scenario Outline: TC ONB2-251 The user should log in with the correct credentials.
    And The user enters with user "<email>" and user "<password>"
    Then The user verify that sign in successfully

    Examples:
      | email          | password            |
      | superAdminUser | superAdmin_password |
      | adminUser      | admin_password      |
      | requesterUser  | requester_password  |
      | approverUser   | approver_password   |

  @ONB2-332
  Scenario: TC ONB2-332 The forget password link should be clickable on Sign In page
   Then The user verify that the forget password link should be clickable

  @ONB2-311
  Scenario: TC ONB2-311 There should be a forgot password link on the login screen
   Then The user verify that the forget password link should be visible

  @ONB2-293
  Scenario: TC-ONB2-293 The password entered should be in encrypted form at the login page
    And The user enter password in Password area
    Then The user verify that the password is written in the encrypted form

  @ONB2-294
  Scenario: TC ONB2-294 The eye icon should be visible the password text field
    Then The user verify that the eye icon should be visible on the password text field

  @ONB2-295
  Scenario: TC ONB2-295 The user should be able to view the password by clicking on the eye icon.
    And The user enter password in Password area
    And The user click on the eye icon in the password text field
    Then The user verify that the password is visible


  @ONB@-337
  Scenario: TC ONB2-337 The email field should be visible on the forget password page to recover the password.
    And The user click on forgot password link in the sign in page
    Then The user verify that the Forgot Password page is open

  @ONB-398
  Scenario Outline: TC ONB2-398 The User should NOT log in unmatched credentials, invalid email and wrong password
    Then The user enters with user "<Email>", user "<Password>", and "<warningMessage>" and verify that con not login

    Examples:

      | Email          | Password            | warningMessage                                |
      | superAdminUser | wrongPassword       | Credentials did not match                     |
      | superAdminUser | emptyPassword       | Please fill out all required fields correctly.|
      | inValidEmail   | superAdmin_password | Email must be a valid email                   |
      | inValidEmail   | wrongPassword       | Email must be a valid email                   |
      | incorrectEmail | superAdmin_password | Credentials did not match                     |
      | emptyEmail     | emptyPassword       | Please fill out all required fields correctly.|


  @ONB-339
  Scenario: TC ONB2-339 Reset Password button should be clickable at the Forgot Password page
    And The user click on forgot password link in the sign in page
    Then The user verify that Reset Password button should be clickable







