@Regression  @Smoke

Feature: Login Screen Test


  @ONB2-237
  Scenario: TC ONB2-237 The login screen should be visible after clicking on a login button.
    Given The user goes to myCompSignin
    Then the user verifies that the login screen visible after clicking on the login button.

  @ONB2-241
  Scenario: TC ONB2-241 All login-related elements should be present on the login page.
    Given The user goes to myCompSignin
    Then the user verifies that all-login elements visible on the login box

  @ONB2-244
  Scenario: TC OBN2-244 E-mail text field should be clickable on the Sign In page
    Given The user goes to myCompSignin
    Then The user should click on the E-mail text field

  @ONB2-247
  Scenario: TC ONB2-247 Password text field should be clickable on the Sign In page
    Given The user goes to myCompSignin
    Then The user should click on Password text field

  @ONB2-251
  Scenario: TC ONB2-251 The user should log in with the correct credentials.
    Given The user goes to myCompSignin
    Then The user enters with user email and user password
    And the user should sign in successfully

  @ONB2-332
  Scenario: TC ONB2-332 The forget password link should be clickable on Sign In page
    Given The user goes to myCompSignin
    And the user verifies that the forget password link should be clickable on the login screen

  @ONB2-311
  Scenario: TC ONB2-311 There should be a forgot password link on the login screen
    Given The user goes to myCompSignin
    And the forget password link should be present on the login screen

  @ONB2-293
  Scenario: TC-ONB2-293 The password entered should be in encrypted form at the login page
    Given The user goes to myCompSignin
    Then the user should write their password in encrypted form

  @ONB2-294
  Scenario: TC ONB2-294 The eye icon should be added to the password text field
    Given The user goes to myCompSignin
    Then the eye icon should be visible on the password text field

  @ONB2-295
  Scenario: TC ONB2-295 The user should be able to view the password by clicking on the eye icon.
    Given The user goes to myCompSignin
    Then the user writes the password
    And the user clicks on the eye icon the password text field
    And the user should view the the password


  @ONB@-337
  Scenario: TC ONB2-337 The email field should be visible on the forget password page to recover the password.

    Given The user goes to myCompSignin
    Then the user clicks on forgot password on the  Sign In Page
    And the user verifies that the Forget Password page is open

    ##

## @ONB2-371
 ## Scenario Outline: TC ONB2-276,278,279,280,282,371,373,374,376,The user should not be able to log in with mismatched credentials "<email>" "<password>"

 ##  Given The user goes to myCompSignin
 ##  Then the user writes an email "<email>"
 ##  Then the user writes a password "<password>"
  ## Then the user clicks sign in button
 ##  And the user should verify "<toastMessage>"

 ##  Examples:
  ##   |email                        | password        | toastMessage                                 |
   ##  |ahmet.bicakci@testtechno.com | 123456678       |Credentials did not match                     |
    ## |ahmet.bicakcitesttechno.com  | Nail&nail.23    |Email must be a valid email                   |
   ##  |                             | Nail&nail.23    |Please fill out all required fields correctly |
  ##   |ahmet.bicakcitesttechno.com  | 12345678        |Email must be a valid email                   |
 ##    |ahmet.bicakci@testtechno.com |                 |Please fill out all required fields correctly |
   ##  |                             |                 |Please fill out all

##
##



