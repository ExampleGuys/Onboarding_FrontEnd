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
import static org.junit.Assert.assertTrue;

public class UsersStepDefs extends ObjectIndex {


    public void scrolDown()
    {
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

    @Then("the user should observe {string} on each page of User List")
    public void theUserShouldObserveOnEachPageOfUserList(String arg0) {
    assert (usersPage.listOfTenUsers.isEnabled());

    }

    @Then("the user clicks on {string} button")
    public void theUserClicksOnButton(String arg0) {
        usersPage.newUsersButton.click();

    }

    @Then("the user clicks on the {string} icon of the Site button")
    public void theUserClicksOnTheIconOfTheSiteButton(String arg0) {


        usersPage.newUsersSiteArrow.click();
    }

    @Then("the user verifies that only numbers can be typed in the {string} text field")
    public void theUserVerifiesThatOnlyNumbersCanBeTypedInTheTextField(String arg0) {

      usersPage.zipCodeTextField.sendKeys("12345678");






    }

    @Then("the user writes a name in the First Name box")
    public void theUserWritesANameInTheFirstNameBox() {




    }

    @Then("the user clicks on {string} text field")
    public void theUserClicksOnTextField(String arg0) {

        BrowserUtils.clickWithJS(usersPage.newUserPasswordField);
        BrowserUtils.waitFor(3);




    }

    @Then("the user writes no correct  {string} text field")
    public void theUserWritesNoCorrectTextField(String arg0) {

   usersPage.newUserEmailField.sendKeys("ahmetgmail.com");


    }

    @Then("the should see the message {string}")
    public void theShouldSeeTheMessage(String arg0) {

        BrowserUtils.toastMessage();
    }

    @And("the user writes inappropriately a password in {string} text field")
    public void theUserWritesInappropriatelyAPasswordInTextField(String arg0) {

       usersPage.newUserPasswordField.sendKeys("1234abc");


    }

    @Then("the user should see the relevant warning messages")
    public void theUserShouldSeeTheRelevantWarningMessages() {

        assert (usersPage.newUserPasswordWarningMessage.getText().
                contains("Password must be between 8 and 20 characters"));

    }
}


