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
    @And("The user enter {string} in in the {string} field")
    public void theUserEnterInInTheField(String value, String boxName) {
        practicePage.enterValueInTheField(value,boxName);
    }

    @And("The user select role as a {string}")
    public void theUserSelectRoleAsASupplier(String roleName) {
        usersPage.selectRole(roleName);
    }

    @And("The user select a site as a {string}")
    public void theUserSelectASiteAsA(String siteName) {
        usersPage.selectSite(siteName);
    }

    @And("The user enter password")
    public void theUserEnterPassword() {
        usersPage.enterPassword();
    }

      @And("The user select {string} and {string} in the supplier dropdown")
    public void theUserSelectAndInTheSupplierDropdown(String supplierEmail, String supplierName) {
        practicePage.selectSupplierInfo(supplierEmail,supplierName);
    }


    @And("The user add resource {string} in the {string} field")
    public void theUserAddResourceInTheField(String value, String boxname) {
        practicePage.addResourceInTheField(value,boxname);
    }

    @And("The user add supplier {string} and {string} in the supplier dropdown")
    public void theUserAddSupplierAndInTheSupplierDropdown(String supplierEmail, String supplierName) {
        practicePage.addSupplierInTheField(supplierEmail,supplierName);
    }

    @And("The user enter company name {string} to {string} field")
    public void theUserEnterToField(String companyName, String boxName) {
        practicePage.addNewField(companyName,boxName);
    }

    @And("The user enter company code {string} to {string} field")
    public void theUserEnterCompanyCodeToField(String companyCode, String boxName) {
        practicePage.addNewField(companyCode,boxName);
    }

    @And("The user enter site name {string} in the {string} field")
    public void theUserEnterSiteNameInTheField(String siteName, String boxName) {
        practicePage.addNewField(siteName,boxName);
    }

    @And("The user enter department name {string} to {string} field")
    public void theUserEnterDepartmentNameToField(String departmentName, String boxName) {
        practicePage.addNewField(departmentName,boxName);
    }
}
