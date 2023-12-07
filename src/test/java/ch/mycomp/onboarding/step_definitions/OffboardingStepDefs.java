package ch.mycomp.onboarding.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class OffboardingStepDefs extends ObjectIndex {
    @And("The user fills all required fields in offboarding create form")
    public void theUserFillsAllRequiredFieldsInOffboardingCreateForm() {
        offboardingPage.selectEmployee();
        offboardingPage.selectLastWorkingDay();


    }

    @Then("The user verify that created offboarding is visible")
    public void theUserVerifyThatCreatedOffboardingIsVisible() {
        companiesPage.theUserVerifyThatCreatedUnitIsVisible();
    }


    @And("The user determine the Employee which is offboarding")
    public void theUserDetermineTheEmployeeWhichIsOffboarding() {
        companiesPage.theUserClickOnFirstElementOfCompaniesTable();
        offboardingPage.determineOnboardingEmployee();
    }
}
