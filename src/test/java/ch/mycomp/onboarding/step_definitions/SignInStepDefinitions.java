package ch.mycomp.onboarding.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SignInStepDefinitions {

    @When("the user enters valid requester {string} and {string}")
    public void theUserEntersValidRequesterAnd(String email, String password) {
    }

    @And("the user clicks the sign in button")
    public void theUserClicksTheSignInButton() {
    }
}
