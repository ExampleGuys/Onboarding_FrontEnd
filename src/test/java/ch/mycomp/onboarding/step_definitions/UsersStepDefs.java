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



    @Then("The user verify that created user is visible")
    public void theUserVerifyThatCreatedUserIsVisible() {
        companiesPage.theUserVerifyThatCreatedUnitIsVisible();
    }


    @And("The user click on generate password button")
    public void theUserClickOnGeneratePasswordButton() {
        usersPage.clickGeneratePassword();
    }

    @And("The user select a Company from company dropdown {string} in the user page")
    public void theUserSelectACompanyFromCompanyDropdownInTheUserPage(String CompanyName) {
        usersPage.selectCompany(CompanyName);
    }
}








