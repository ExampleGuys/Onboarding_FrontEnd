package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CompaniesStepDefs extends ObjectIndex{


    @And("The user enter data to {string} field")
    public void theUserEnterDataToField(String boxName) {
        companiesPage.theUserEnterDataToField(boxName);
    }


    @Then("The user verify that the toast message is {string}")
    public void theUserVerifyThatNewCompanyCreated(String message) {
        companiesPage.theUserVerifyThatNewCompanyCreated(message);
    }

    @And("The user click on the {string} button on the modal")
    public void theUserClickOnTheButtonOnTheModal(String buttonName) {
        BrowserUtils.waitFor(2);
        companiesPage.clickButtonOnModal(buttonName);
    }

    @Then("The user verify that created company is visible")
    public void theUserVerifyThatCreatedCompanyIsVisible() {
        companiesPage.theUserVerifyThatCreatedUnitIsVisible();
    }

    @And("The user click on first element of table")
    public void theUserClickOnFirstElementOfCompaniesTable() {
        companiesPage.theUserClickOnFirstElementOfCompaniesTable();
    }

    @And("The user update data to {string} field")
    public void theUserUpdateDataToField(String boxName) {
        companiesPage.theUserUpdateDataToField(boxName);
    }

    @And("The User click on Delete icon in the first element of table")
    public void theUserClickOnDeleteIconInTheFirstElementOfTable() {
        companiesPage.theUserClickOnDeleteIconInTheFirstElementOfTable();
    }
}
