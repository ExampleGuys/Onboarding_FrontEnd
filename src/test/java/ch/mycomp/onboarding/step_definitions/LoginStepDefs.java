package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs extends ObjectIndex {

    @Given("The user goes to myCompSignin")
    public void theUserGoesToMyCompSignin() {
        Driver.get().get(ConfigurationReader.get("myCompStagingSignin"));

    }
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

    @Then("the user verifies that the login screen visible after clicking on the login button.")
    public void theUserVerifiesThatTheLoginScreenVisibleAfterClickingOnTheLoginButton() {
       BrowserUtils.waitForVisibility(loginPage.signInFieldText,30);
       loginPage.signInFieldText.isEnabled();
    }

    @Then("the user verifies that all-login elements visible on the login box")
    public void theUserVerifiesThatAllLoginElementsVisibleOnTheLoginBox() {
        loginPage.signInFieldText.isDisplayed();

    }

    @Then("The user should click on the E-mail text field")
    public void theUserShouldClickOnTheEMailTextField() {
        loginPage.email.isEnabled();
    }

    @Then("The user should click on Password text field")
    public void theUserShouldClickOnPasswordTextField() {
        loginPage.passwordInput.isEnabled();
    }


    @Then("The user enters with user email and user password")
    public void theUserEntersWithUserEmailAndUserPassword() {
        loginPage.login();

    }
    @Then("The user enters with user {string} and user {string}")
    public void theUserEntersWithUserAndUser(String email, String password) {
        loginPage.login(email,password);
    }

    @And("the user should sign in successfully")
    public void theUserShouldSignInSuccessfully() {

        loginPage.checkLoginSuccessToastMessage();
    }


    @And("the user verifies that the forget password link should be clickable on the login screen")
    public void theUserVerifiesThatTheForgetPasswordLinkShouldBeClickableOnTheLoginScreen() {
        assert(loginPage.forgotLink.isEnabled());

    }

    @And("the forget password link should be present on the login screen")
    public void theForgetPasswordLinkShouldBePresentOnTheLoginScreen() {
        assert(loginPage.forgotLink.isDisplayed());


    }

    @Then("the eye icon should be visible on the password text field")
    public void theEyeIconShouldBeVisibleOnThePasswordTextField() {

        assert (loginPage.eyeIconforPassword.isDisplayed());

        }



    @Then("the user writes the password")
    public void theUserWritesThePassword() {
        loginPage.passwordInput.sendKeys("Nail&nail.23");
    }

    @And("the user clicks on the eye icon the password text field")
    public void theUserClicksOnTheEyeIconThePasswordTextField() {
        loginPage.eyeIconforPassword.click();
    }

    @And("the user should view the the password")
    public void theUserShouldViewTheThePassword() {
        assert (loginPage.eyeIconforPassword.isEnabled());
        BrowserUtils.waitFor(3);

    }


    @Then("the user should write their password in encrypted form")
    public void theUserShouldWriteTheirPasswordInEncryptedForm() {
        assert (loginPage.passwordInEncrypted.getText().contains("Nail&nail.23"));
        BrowserUtils.waitFor(3);

    }



    @Then("the user should click on the Reset Password link")
    public void theUserShouldClickOnTheResetPasswordLink() {
        loginPage.resetPasswordButton.click();
        BrowserUtils.waitFor(3);
    }

    @And("the user verifies that the Forget Password page is open")
    public void theUserVerifiesThatTheForgetPasswordPageIsOpen() {
        assert (loginPage.emailInput.isDisplayed());

    }


    @Then("the user enters with user {string}, user {string}, and {string}")
    public void theUserEntersWithUserUserAnd(String email , String password, String warningMessage ) {

    //    loginPage.negativeLoginsCheck( email,  password, warningMessage);


    }

    @And("the user enters a valid email on the Forgot Password page")
    public void theUserEntersAValidEmailOnTheForgotPasswordPage() {
    }

    @Then("the user clicks on forgot password link in the sign in page")
    public void theUserClicksOnForgotPasswordLinkInTheSignInPage() {

        BrowserUtils.clickWithJS(loginPage.forgotPasswordLink);
    }


}
