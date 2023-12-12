package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static ch.mycomp.onboarding.utilities.Driver.driver;

public class UsersStepDefs extends ObjectIndex {

    @And("The user fills all required fields in User create form for Admin Role")
    public void theUserFillsAllRequiredFieldsInUserCreateFormForAdminRole() {
        usersPage.enterFirstMiddleLastName();
        usersPage.selectRole("Line Manager");
        usersPage.selectDepartment();
        usersPage.selectSite();
        usersPage.enterPrivateEmail();
        usersPage.enterPassword();
    }

    @Then("The user verify that created user is visible")
    public void theUserVerifyThatCreatedUserIsVisible() {
        companiesPage.theUserVerifyThatCreatedUnitIsVisible();
    }

    @And("The user fills all required fields in User create form for Line Menager Role")
    public void theUserFillsAllRequiredFieldsInUserCreateFormForLineMenagerRole() {
        usersPage.enterFirstMiddleLastName();
        usersPage.selectRole("Employee");
        usersPage.selectSite();
        usersPage.enterPrivateEmail();
        usersPage.enterPassword();
    }

    @And("The user fills all required fields in User create form for SuperAdmin Role")
    public void theUserFillsAllRequiredFieldsInUserCreateFormForSuperAdminRole() {
        usersPage.selectCompany();
        usersPage.enterFirstMiddleLastName();
        usersPage.selectRole("Admin");
        usersPage.selectSite();
        usersPage.enterPrivateEmail();
        usersPage.enterPassword();
    }
}








