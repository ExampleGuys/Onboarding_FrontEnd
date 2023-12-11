package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
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
        offboardingPage.clickButton("Completed");
        companiesPage.theUserClickOnFirstElementOfCompaniesTable();
        offboardingPage.determineOnboardingEmployee();
    }

    @And("The user wait for data synchronizing")
    public void theUserWaitForDataSynchronizing() {
        BrowserUtils.waitForVisibility(offboardingPage.message,20);
    }

    @And("The user set onboarding status to completed")
    public void theUserSetOnboardingStatusToCompleted() {
        offboardingPage.setOnboardingStatusToCompleted();
    }

    @And("The user selects a Company from company dropdown {string} for create offboarding")
    public void theUserSelectsACompanyFromCompanyDropdownForCreateOffboarding(String comanyName) {
        offboardingPage.selectCompany(comanyName);
    }
}
