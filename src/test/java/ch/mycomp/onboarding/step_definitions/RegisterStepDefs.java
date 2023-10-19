package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefs extends ObjectIndex{

    @When("Dont have an account sign up link")
    public void dontHaveAnAccountSignUpLink() {
        BrowserUtils.clickElement(registerPage.signUpLinkLocator,20);
    }

    @Then("the user should see Sign Up button")
    public void theUserShouldSeeSignUpButton() {
        registerPage.checkSignUpButton();
    }
}
