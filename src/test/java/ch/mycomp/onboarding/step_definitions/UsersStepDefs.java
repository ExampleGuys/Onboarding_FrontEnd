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
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class UsersStepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();





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




}



