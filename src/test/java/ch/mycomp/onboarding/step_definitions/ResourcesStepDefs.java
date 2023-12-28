package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class ResourcesStepDefs extends ObjectIndex {

    @And("The user fills all required field in Resources create form for a Admin role")
    public void theUserFillsAllRequiredFieldInResourcesCreateFormForAAdminRole() {

        resourcesPage.clickButton("Add resource");

        resourcesPage.selectSupplier();
        resourcesPage.enterResourcePrice();

    }

    @Then("The user verify that created resource is visible")
    public void theUserVerifyThatCreatedResourceIsVisible() {
        companiesPage.theUserVerifyThatCreatedUnitIsVisible();
    }

    @And("The user fills all required field in Resources create form for a SuperAdmin role")
    public void theUserFillsAllRequiredFieldInResourcesCreateFormForASuperAdminRole() {
        resourcesPage.selectCompany("Automation_Test");

        resourcesPage.clickButton("Add resource");

        resourcesPage.selectSupplier();
        resourcesPage.enterResourcePrice();
    }

    @And("The user enter resource name in the {string} field")
    public void theUserEnterInTheField( String boxname) {
        resourcesPage.enterCategoryName(boxname);

    }

    @And("The user enter resource item name in the {string} field")
    public void theUserEnterResourceItemNameInTheField(String boxName) {
        resourcesPage.enterResourceName(boxName);
    }
}

