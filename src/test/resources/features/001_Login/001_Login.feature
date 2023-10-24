@Regression  @Smoke

Feature: Login Screen Test

  Background:
    Given The user goes to myCompSignin

  @ONB2-237
  Scenario: TC ONB2-237 The login screen should be visible after clicking on a login button.
    Then the user verifies that the login screen visible after clicking on the login button.

  @ONB2-241
  Scenario: TC ONB2-241 All login-related elements should be present on the login page.
    Then the user verifies that all-login elements visible on the login box

  @ONB2-244
  Scenario: TC OBN2-244 E-mail text field should be clickable on the Sign In page
    Then The user should click on the E-mail text field

  @ONB2-247
  Scenario: TC ONB2-247 Password text field should be clickable on the Sign In page
    Then The user should click on Password text field

  @ONB2-251
  Scenario Outline: TC ONB2-251 The user should log in with the correct credentials.
    Then The user enters with user "<email>" and user "<password>"
    And the user should sign in successfully

    Examples:
      | email          | password            |
      | superAdminUser | superAdmin_password |
      | adminUser      | admin_password      |
      | requesterUser  | requester_password  |
      | approverUser   | approver_password   |

  @ONB2-332
  Scenario: TC ONB2-332 The forget password link should be clickable on Sign In page
    And the user verifies that the forget password link should be clickable on the login screen

  @ONB2-311
  Scenario: TC ONB2-311 There should be a forgot password link on the login screen
    And the forget password link should be present on the login screen

  @ONB2-293
  Scenario: TC-ONB2-293 The password entered should be in encrypted form at the login page
    Then the user should write their password in encrypted form

  @ONB2-294
  Scenario: TC ONB2-294 The eye icon should be added to the password text field
    Then the eye icon should be visible on the password text field

  @ONB2-295
  Scenario: TC ONB2-295 The user should be able to view the password by clicking on the eye icon.
    Then the user writes the password
    And the user clicks on the eye icon the password text field
    And the user should view the the password


  @ONB@-337
  Scenario: TC ONB2-337 The email field should be visible on the forget password page to recover the password.
    Then the user clicks on forgot password link in the sign in page
    And the user verifies that the Forget Password page is open

  @ONB-398
  Scenario Outline: TC ONB2-398 The User should NOT log in unmatched credentials, invalid email and wrong password
    Then the user enters with user "<Email>", user "<Password>", and "<warningMessage>"

    Examples:

      | Email          | Password            | warningMessage                |
      | superAdminUser | wrongPassword       | wrongPasswordMessage          |
      | superAdminUser | emptyPassword       | emptyPasswordTextFieldMessage |
      | inValidEmail   | superAdmin_password | invalidEmailMessage           |
      | inValidEmail   | wrongPassword       | invalidEmailMessage           |
      | incorrectEmail | superAdmin_password | incorrectEmailMessage         |
      | emptyEmail     | emptyPassword       | emptyEmailTextFieldMessage    |


  @ONB-339
  Scenario: TC ONB2-339 Reset Password" button should be clickable at the Forgot Password page
    Then the user clicks on forgot password link in the sign in page
    And the user enters a valid email on the Forgot Password page
    And the user should click on the Reset Password link







