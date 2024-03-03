package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.*;

public class OnboardingStepDefs extends ObjectIndex{


    @Given("The user goes to staging url")
    public void theUserGoesToStagingUrl() {
        onboardingPage.theUserGoesToStagingUrl();
    }

    @And("The User click on the {string} section in the Navigation Menu")
    public void theUserClickOnTheSectionInTheNavigationMenu(String navigationName) {
        onboardingPage.clickButton(navigationName);
    }

    @And("The user click on the {string} button top right corner of the page")
    public void theUserClickOnTheButton(String buttonName) {
       onboardingPage.clickButton(buttonName);
    }
    @And("The User select a Completion Date at The Latest")
    public void theUserSelectACompletionDateAtTheLatest() {
        onboardingPage.selectCompletionDateAtLatest();
    }


    @Then("The user verify that created onboarding is visible")
    public void theUserVerifyThatCreatedOnboardingIsVisible() {
       companiesPage.theUserVerifyThatCreatedUnitIsVisible();
    }

    @And("The user selects a Company from company dropdown {string} for create onboarding")
    public void theUserSelectsACompanyFromCompanyDropdownForCreateOnboarding(String companyName) {
        onboardingPage.selectCompany(companyName);
    }

    @And("The user click on {string} at the navigation menu")
    public void theUserClickOnAtTheNavigationMenu(String buttonName) {
        onboardingPage.clickButton(buttonName);
    }

    @And("The user click on {string} button")
    public void theUserClickOnButton(String buttonName) {
        onboardingPage.clickButton(buttonName);
    }

    @And("The user enter {string} in to {string} field")
    public void theUserEnterInToField(String fieldName, String boxName) {
        onboardingPage.theUserEnterInToField(fieldName,boxName);
    }

    @And("The user select Person Title")
    public void theUserSelectPersonTitle() {
        onboardingPage.selectPersonalTitle();
    }

    @And("The user select Birth Date")
    public void theUserSelectBirthDate() {
        onboardingPage.selectBirthDate();
    }

    @And("The user select First Working Day")
    public void theUserSelectFirstWorkingDay() {
        onboardingPage.selectFirstWorkingDay();
    }

    @And("The user select department as a {string}")
    public void theUserSelectDepartmentAsA(String departmentName) {
        onboardingPage.selectDepartment(departmentName);
    }

    @And("The user select Resource as a {string}")
    public void theUserSelectResorceAsA(String resourceName) {
        onboardingPage.selectResource(resourceName);
    }


    @And("The user select Resource Item as a {string}")
    public void theUserSelectResourceItemAsA(String resourceItem) {
        onboardingPage.selectResourceItem(resourceItem);
    }


    @And("The user select site as a {string}")
    public void theUserSelectSiteAsA(String siteName) {
        onboardingPage.selectSite(siteName);
    }

    @And("The user select a Supplier as a {string} in the create onboarding modal")
    public void theUserSelectASupplierAsAInTheCreateOnboardingModal(String supplierName) {
        onboardingPage.selectSupplier(supplierName);
    }

    @And("The user select no company email account")
    public void theUserSelectNoCompanyEmailAccount() {
        onboardingPage.selectNoCompanyEmailAccount();
    }

    @And("The user click on {string} button in New Resource")
    public void theUserClickOnButtonInNewResource(String buttonName) {
        onboardingPage.clickAddResourceButton(buttonName);
    }

    @And("The user select job function as a {string}")
    public void theUserSelectJobFunctionAsA(String jobFunction) {
        onboardingPage.theUserSelectJobFunctionAsA(jobFunction);
    }
}
