package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefs extends ObjectIndex{

    @When("The User click on  sign up link bottom of the modal")
    public void theUserClickOnSignUpLinkBottomOfTheModal() {
        registerPage.theUserClickOnSignUpLinkBottomOfTheModal();
    }

    @Then("The user verify that Sign Up button is visible")
    public void theUserShouldSeeSignUpButton() {
        registerPage.checkSignUpButton();
    }

    @Then("The user click on the password text field")
    public void theUserClicksOnThePasswordTextField() {
        BrowserUtils.clickElement(registerPage.passwordTextFieldNewUser,20);
            BrowserUtils.waitFor(3);}

    @Then("the user enters a password for the new user")
    public void theUserEntersAPasswordForTheNewUser() {registerPage.passwordTextFieldNewUser.sendKeys("Asdf@1234");}

    @Then("the user enters again a password for the new user")
    public void theUserEntersAgainAPasswordForTheNewUser() {registerPage.passwordAgainTextFieldNewUser.sendKeys("Asdf@1234");
    }

    @Then("the user verifies that the new user is created with the new password")
    public void theUserVerifiesThatTheNewUserIsCreatedWithTheNewPassword() {

        assert (registerPage.toastMessageText().contains("User successfully created"));
    }

    @And("the number of {string} should be visible")
    public void theNumberOfShouldBeVisible(String arg0) {

       assert(registerPage.totalNumberOfUser.getText().contains("Total 116 contacts"));
    }

    @And("the user scroll down the bottom of the page")
    public void theUserScrollDownTheBottomOfThePage() {
        BrowserUtils.scrollToElement(registerPage.paginationTotalText);
    }
}
