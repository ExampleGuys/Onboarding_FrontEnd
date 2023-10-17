package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.BasePage;
import ch.mycomp.onboarding.pages.LoginPage;
import ch.mycomp.onboarding.pages.OrderPage;
import ch.mycomp.onboarding.pages.UsersPage;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static ch.mycomp.onboarding.utilities.Driver.driver;
import static ch.mycomp.onboarding.step_definitions.ResourcesStepDefs.actions;
import static ch.mycomp.onboarding.step_definitions.ResourcesStepDefs.faker;
import static ch.mycomp.onboarding.utilities.BrowserUtils.fakeName;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UsersStepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();

    OrderPage orderPage = new OrderPage();

    String fakeContactName = faker.name().fullName();
    String fakeEmail = faker.internet().emailAddress();


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

    @Then("the user clicks on {string} text field")
    public void theUserClicksOnTextField(String arg0) {
        usersPage.newUserRole.click();
        BrowserUtils.waitFor(2);
    }


    @And("the user choose a role from ddm")
    public void theUserChooseARoleFromDdm(String roleNewUserddm) {

        usersPage.roleNewUserddm(roleNewUserddm).sendKeys("Admin");
    }

    @Then("the user writes a name in the First Name box")
    public void theUserWritesANameInTheFirstNameBox() {

        WebElement newUserInfo = orderPage.boxName("Enter first name");

        actions.click(newUserInfo).
                sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().nameWithMiddle()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).
                sendKeys(Keys.TAB).click().
                sendKeys("Admin").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).click().
                sendKeys("Ankasale").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("Ankara").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).
                sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();

        BrowserUtils.waitFor(3);
    }

    @Then("the user writes a last name")
    public void theUserWritesALastName() {

        usersPage.newUserLastName.sendKeys(fakeName());
    }

    @And("the user writes a valid email address")
    public void theUserWritesAValidEmailAddress() {

        usersPage.newUserPersonelEmail.sendKeys(fakeEmail);
    }

    @And("the user choose a role")
    public void theUserChooseARole() {
        usersPage.newUserRole.sendKeys("Admin");
    }

    @And("the user clicks on Company text field")
    public void theUserClicksOnCompanyTextField() {
        usersPage.newUserCompany.click();
        BrowserUtils.waitFor(2);
    }

    @And("the user enters a company name")
    public void theUserEntersACompanyName() {
        usersPage.newUserCompany.sendKeys("Samsung");
    }

    @And("The user should be the confirmation message")
    public String theUserShouldBeTheConfirmationMessage() {
        toastMessageText();
        BrowserUtils.waitForVisibility(message, 3);
        return message.getText();
    }

    @And("The user should see the confirmation message")
    public void theUserShouldSeeTheConfirmationMessage() {
        assert (loginPage.toastMessageText().equals("User sucessfully created"));
    }

    @Then("the user clicks on {string} button")
    public void theUserClicksOnButton(String arg0) {
        BrowserUtils.clickElement(usersPage.newUserButton, 20);
    }

    @Then("the user should observe {string} on each page of User List")
    public void theUserShouldObserveOnEachPageOfUserList(String arg0) {
        assert (usersPage.theNumberofUsers.isEnabled());
    }
}


