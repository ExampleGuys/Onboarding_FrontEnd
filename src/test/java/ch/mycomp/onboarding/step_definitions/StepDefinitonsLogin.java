package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.LoginPage;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class StepDefinitonsLogin extends BrowserUtils {

    LoginPage loginPage = new LoginPage();

    @Given("The user goes to myCompSignin")
    public void theUserGoesToMyCompSignin() {
        Driver.get().get(ConfigurationReader.get("myCompSignin"));

    }
    @When("the user enters valid requester {string} and {string}")
    public void theUserEntersValidRequesterAnd(String email, String password) {
        email = ConfigurationReader.get("requester_email");
        password = ConfigurationReader.get("requester_password");
        loginPage.emailInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);

    }

    @And("the user clicks the sign in button")
    public void theUserClicksTheSignInButton() {
        loginPage.signInButton.click();

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


    @And("the user should sign in successfully")
    public void theUserShouldSignInSuccessfully() {
        assert (loginPage.toastMessages.getText().equalsIgnoreCase("You've successfully signed in"));
        BrowserUtils.waitFor(3);


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


    @Then("the user clicks on {string} link")
    public void theUserClicksOnLink(String arg0) {

        loginPage.ForgotPageEmail.isEnabled();
    }

    @Then("the user clicks on forgot password on the  Sign In Page")
    public void theUserClicksOnForgotPasswordOnTheSignInPage() {

        loginPage.forgotLink.isEnabled();

    }
}
