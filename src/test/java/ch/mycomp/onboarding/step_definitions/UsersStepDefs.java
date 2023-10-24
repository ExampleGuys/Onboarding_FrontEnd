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


    public void scrolDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;

    }


    @And("the user clicks on {string} at the navigation menu")
    public void theUserClicksOnAtTheNavigationMenu(String navigationName) {

        WebElement sidebar = Driver.get().findElement(By.xpath("//span[text()='" + navigationName + "']"));
        BrowserUtils.clickWithJS(sidebar);

    }

    @And("the user should see the title of {string} on the Users page")
    public void theUserShouldSeeTheTitleOfOnTheUsersPage() {

        Assert.assertTrue(usersPage.listofUsers.isDisplayed());
    }


    @And("the user should see the title of {string} on the users page")
    public void theUserShouldSeeTheTitleOfOnTheUsersPage(String arg0) {
        usersPage.assertionForlistofUsersIsVisible();

    }


    @Then("the user should see the Users page")
    public void theUserShouldSeeTheUsersPage() {

        assert (usersPage.titleofUsers.getText().contains("Users"));
    }

    @Then("the user scrolls down until the end of the page")
    public void theUserScrollsDownUntilTheEndOfThePage() {

        BrowserUtils.scrollToElement(usersPage.endOfUsersPage);

    }

    @Then("the user click on the arrow of the users page")
    public void theUserClickOnTheArrowOfTheUsersPage() {
        usersPage.usersPageArrow.isEnabled();
    }

    @Then("the user should see the number of the total users")
    public void theUserShouldSeeTheNumberOfTheTotalUsers() {
        assert (usersPage.totalNumberOfUsers.isDisplayed());
    }

    @Then("the user should observe 10 users on each page of User List")
    public void theUserShouldObserve10UsersOnEachPageOfUserList() {
        assert (usersPage.listOfTenUsers.isEnabled());
    }

    @Then("the user clicks on {string} button")
    public void theUserClicksOnButton(String arg0) {
        usersPage.newUsersButton.click();
    }

    @Then("the user clicks on the {string} icon of the Site button")
    public void theUserClicksOnTheIconOfTheSiteButton(String arg0) {
        BrowserUtils.clickElement(usersPage.newUsersSiteArrow, 20);
    }

    @Then("the user verifies that only numbers can be typed in the {string} text field")
    public void theUserVerifiesThatOnlyNumbersCanBeTypedInTheTextField(String arg0) {
        BrowserUtils.sendKeysMethod(usersPage.zipCodeTextField, "12345678", 20);
    }


    @Then("the user clicks on {string} text field")
    public void theUserClicksOnTextField(String arg0) {
        BrowserUtils.clickElement(usersPage.newUserPasswordField,20);
    }

    @Then("the user writes no correct  {string} text field")
    public void theUserWritesNoCorrectTextField(String arg0) {
        BrowserUtils.sendKeysMethod(usersPage.newUserEmailField,"ahmetgmail.com",20);
    }

    @Then("the should see the message {string}")
    public void theShouldSeeTheMessage(String arg0) {
        BrowserUtils.toastMessage();
    }

    @Then("the user verifies that only numbers can be typed in the Zip Code text field")
    public void theUserVerifiesThatOnlyNumbersCanBeTypedInTheZipCodeTextField() {
        BrowserUtils.sendKeysMethod(usersPage.newUserPasswordField,"1234abc",20);
    }


    @Then("the user should see the relevant warning messages")
    public void theUserShouldSeeTheRelevantWarningMessages() {

        assert (usersPage.newUserPasswordWarningMessage.getText().
                contains("Password must be between 8 and 20 characters"));

    }

    @And("the user writes the  name in the First Name box")
    public void theUserWritesTheNameInTheFirstNameBox() {
        usersPage.newUserFirstNameField.sendKeys(faker.name().firstName());
    }

    @And("the user writes the last name in the Last Name box")
    public void theUserWritesTheLastNameInTheLastNameBox() {
        usersPage.newUserLastNameField.sendKeys(faker.name().lastName());

    }

    @And("the user writes the personal email  in the Personal Email box")
    public void theUserWritesThePersonalEmailInThePersonalEmailBox() {
        usersPage.newUserEmailField.sendKeys(faker.internet().emailAddress());
    }

    @And("the user selects a role in the Role box {string}")
    public void theUserSelectsARoleInTheRoleBox(String targetListElement) {
        usersPage.theUserSelectsARoleFromTheRoleDropdown(targetListElement);
    }

    @And("the user selects a company in the Company box {string}")
    public void theUserSelectsWritesACompanyInTheCompanyBox(String targetElement) {
        usersPage.theUserSelectsACompanyInTheCompanyBox(targetElement);
    }

    @And("the user creates a password in the Password box")
    public void theUserCreatesAPasswordInThePasswordBox() {
        BrowserUtils.clickWithJS(usersPage.newUserGeneratePasswordButton);
    }


    @And("The user should see the confirmation message")
    public void theUserShouldSeeTheConfirmationMessage() {

        assert (usersPage.message.isDisplayed());

    }

    @And("the user selects a site in the Site box {string}")
    public void theUserSelectsASiteInTheSiteBox(String targetSite) {
        usersPage.theUserSelectsASiteInTheSiteBox(targetSite);

    }

    @And("the user writes inappropriately a password in Password text field")
    public void theUserWritesInappropriatelyAPasswordInPasswordTextField() {
    }
}








