package ch.mycomp.onboarding.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DepartmentsStepDefs extends ObjectIndex{
    @And("The user select a Company from company dropdown {string}")
    public void theUserSelectACompanyFromCompanyDropdown(String companyName) {
        departmentsPage.theUserSelectACompanyFromCompanyDropdown(companyName);

    }

    @Then("The user verify that created department is visible")
    public void theUserVerifyThatCreatedDepartmentIsVisible() {
       companiesPage.theUserVerifyThatCreatedUnitIsVisible();
    }


}
