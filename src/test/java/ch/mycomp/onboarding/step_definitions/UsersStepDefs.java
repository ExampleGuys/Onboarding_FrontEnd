package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.BasePage;
import ch.mycomp.onboarding.pages.LoginPage;
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
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;

public class UsersStepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();

    static Actions actions = new Actions(Driver.get());

    JavascriptExecutor jse = (JavascriptExecutor) Driver.driver;

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


    @Then("the user scrolls down until the end of the page")
    public void theUserScrollsDownUntilTheEndOfThePage() {
    usersPage.scrolldownPage();


    }

    @Then("the user click on the arrow of the users page")
    public void theUserClickOnTheArrowOfTheUsersPage() {

        usersPage.userArrow.click();
    }



    @And("the user chooses {string} per page")
    public void theUserChoosesPerPage(String arg0) {





    }

    @Then("the user should observe {string} on each page of User List")
    public void theUserShouldObserveOnEachPageOfUserList(String arg0) {

        assert(usersPage.listOfTenUsers.isDisplayed());
    }


    @Then("the user should see the number of the total users")
    public void theUserShouldSeeTheNumberOfTheTotalUsers() {

        assert(usersPage.theNumberofTotalUsers.isDisplayed());


    }
}



