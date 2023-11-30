package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs extends ObjectIndex {



    @When("the user enters valid requester {string} and {string}")
    public void theUserEntersValidRequesterAnd(String email, String password) {
        email = ConfigurationReader.get("requesterUser");
        password = ConfigurationReader.get("requester_password");
        loginPage.emailInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);

    }

    @And("the user clicks the sign in button")
    public void theUserClicksTheSignInButton() {
       BrowserUtils.clickWithJS(loginPage.signInButton);

    }

    @Then("The user verify that the Sign In modal is visible")
    public void theUserVerifyThatTheSignInModalIsVisible() {
      loginPage.theUserVerifyThatTheSignInModalIsVisible();
    }

    @Then("The user verify that the E-mail text field should be clickable")
    public void theUserVerifyThatTheEmailTextFieldShouldBeClicakble(){
        loginPage.theUserVerifyThatTheEmailTextFieldShouldBeClicakble();
    }

    @Then("The user verify that the Password text field should be clickable")
    public void TheUserVerifyThatThePasswordTextFieldShouldBeClickable() {
        loginPage.TheUserVerifyThatThePasswordTextFieldShouldBeClickable();
    }



    @Then("The user enters with user {string} and user {string}")
    public void theUserEntersWithUserAndUser(String email, String password) {
        loginPage.login(email,password);
    }

    @And("The user verify that sign in successfully")
    public void TheUserVerifyThatSignInSuccessfully() {

        loginPage.checkLoginSuccessToastMessage();
    }


    @And("The user verify that the forget password link should be clickable")
    public void TheUserVerifyThatTheForgetPasswordLinkShouldBeClickable() {
        loginPage.TheUserVerifyThatTheForgetPasswordLinkShouldBeClickable();

    }

    @And("The user verify that the forget password link should be visible")
    public void TheForgetPasswordLinkShouldBeVisible() {
       loginPage.TheForgetPasswordLinkShouldBeVisible();


    }

    @Then("The user verify that the eye icon should be visible on the password text field")
    public void theUserVerifyThatTheEyeIconShouldBeVisibleOnThePasswordTextField() {
        loginPage.theUserVerifyThatTheEyeIconShouldBeVisibleOnThePasswordTextField();

        }



    @Then("the user writes the password")
    public void theUserWritesThePassword() {
        loginPage.passwordInput.sendKeys("Nail&nail.23");
    }

    @And("The user click on the eye icon in the password text field")
    public void theUserClickOnTheEyeIconInThePasswordTextField() {
       loginPage.theUserClickOnTheEyeIconThePasswordTextField();
    }

    @And("the user should view the the password")
    public void theUserShouldViewTheThePassword() {
        assert (loginPage.eyeIconforPassword.isEnabled());
        BrowserUtils.waitFor(3);

    }


    @Then("The user verify that the password is written in the encrypted form")
    public void TheUserVerifyThatThePasswordIsWrittenInTheEncryptedForm() {
      loginPage.TheUserVerifyThatThePasswordIsWrittenInTheEncryptedForm();

    }



    @Then("the user should click on the Reset Password link")
    public void theUserShouldClickOnTheResetPasswordLink() {
        loginPage.resetPasswordButton.click();
        BrowserUtils.waitFor(3);
    }

    @And("The user verify that the Forgot Password page is open")
    public void theUserVerifyThatTheForgotPasswordPageIsOpen() {
       loginPage.theUserVerifyThatTheForgotPasswordPageIsOpen();

    }


    @Then("The user enters with user {string}, user {string}, and {string} and verify that con not login")
    public void theUserEntersWithUserUserAnd(String email , String password, String warningMessage ) {

    loginPage.connotLogin(email,password,warningMessage);


    }

    @And("the user enters a valid email on the Forgot Password page")
    public void theUserEntersAValidEmailOnTheForgotPasswordPage() {

    }

    @Then("The user click on forgot password link in the sign in page")
    public void theUserClickOnForgotPasswordLinkInTheSignInPage() {

       loginPage.theUserClickOnForgotPasswordLinkInTheSignInPage();
    }


    @Then("The user enter password in Password area")
    public void theUserEnterPasswordInPasswordArea() {
        loginPage.theUserEnterPasswordInPasswordArea();
    }

    @Then("The user verify that the password is visible")
    public void theUserVerifyThatThePasswordIsVisible() {
        loginPage.theUserVerifyThatThePasswordIsVisible();
    }

    @Then("The user verify that cannot login")
    public void theUserVerifyThatCannotLogin() {
    }

    @Then("The user verify that Reset Password button should be clickable")
    public void theUserVerifyThatResetPasswordButtonShouldBeClickable() {
        loginPage.theUserVerifyThatResetPasswordButtonShouldBeClickable();
    }
}
