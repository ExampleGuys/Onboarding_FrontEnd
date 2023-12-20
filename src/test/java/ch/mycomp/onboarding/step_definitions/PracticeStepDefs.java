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

       @And("The user enter {string} to {string} field for Admin Role to create a supplier")
    public void theUserEnterToFieldForAdminRoleToCreateASupplier(String email, String boxName) {
        practicePage.enterEmailforSupplier(email,boxName);
    }

    @And("The user fills all required fields in User create form select a {string} role create all suppliers")
    public void theUserFillsAllRequiredFieldsInUserCreateFormSelectARoleCreateAllSuppliers(String roleName) {
        usersPage.enterFirstMiddleLastName();
        usersPage.selectRole(roleName);
        usersPage.selectSite();
        usersPage.enterPassword();
    }
}
