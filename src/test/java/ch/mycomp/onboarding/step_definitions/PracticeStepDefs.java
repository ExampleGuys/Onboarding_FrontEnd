package ch.mycomp.onboarding.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PracticeStepDefs extends ObjectIndex{
    @And("The User click on Delete icon repetitive")
    public void theUserClickOnDeleteIconRepetitive() {
        practicePage.deleteAllElements();
    }

    @Then("The user verify that all cerated elements is deleted")
    public void theUserVerifyThatAllCeratedElementsIsDeleted() {
        practicePage.verifyAllElementsDeleted();
    }
}
