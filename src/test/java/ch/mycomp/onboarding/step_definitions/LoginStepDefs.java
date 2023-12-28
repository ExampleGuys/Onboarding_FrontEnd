package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs extends ObjectIndex {

    @Then("The user enters with user {string} and user {string}")
    public void theUserEntersWithUserAndUser(String email, String password) {
        loginPage.login(email,password);
    }

    @And("The user verify that sign in successfully")
    public void TheUserVerifyThatSignInSuccessfully() {

        loginPage.checkLoginSuccessToastMessage();
    }



    @Then("The user enters with user {string}, user {string}, and {string} and verify that con not login")
    public void theUserEntersWithUserUserAnd(String email , String password, String warningMessage ) {

    loginPage.connotLogin(email,password,warningMessage);


    }


}
