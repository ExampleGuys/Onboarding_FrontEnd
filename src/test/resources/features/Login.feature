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
Scenario: TC Password text field should be clickable on the Sign In page
  Given The user goes to myCompSignin
  Then The user should click on Password text field







