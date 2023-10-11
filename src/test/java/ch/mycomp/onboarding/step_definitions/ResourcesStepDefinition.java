package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.BasePage;
import ch.mycomp.onboarding.pages.LoginPage;
import ch.mycomp.onboarding.pages.ResourcesPage;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ResourcesStepDefinition extends BasePage {
    LoginPage loginPage = new LoginPage();

    static Actions actions = new Actions(Driver.get());
    static Faker faker = new Faker();
    ResourcesPage resourcesPage=new ResourcesPage();
    @Given("The user goes to the sign-in page")
    public void theUserGoesToTheSignInPage() {
        Driver.get().get(ConfigurationReader.get("myCompSignin"));
    }

    @When("The user enters valid logon credentials")
    public void theUserEntersValidLogonCredentials() {
        loginPage.login();
    }


    @Then("The user clicks on the {string} category")
    public void theUserClicksOnTheCategory(String navigationName) {
        WebElement sidebar = Driver.get().findElement(By.xpath("//span[text()='" + navigationName + "']"));
        BrowserUtils.clickWithJS(sidebar);
    }

    @Then("The user clicks on the {string} button")
    public void theUserClicksOnTheButton(String buttonName) {
        BrowserUtils.waitFor(2);
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        BrowserUtils.clickWithJS(button);
    }

    @And("The user should be seen the new recources item opened")
    public void theUserShouldBeSeenTheNewRecourcesItemOpened() {
        Assert.assertTrue(resourcesPage.addResourcesFirstLine.isDisplayed());
    }

    @And("The user should be seen the {string} page")
    public void theUserShouldBeSeenThePage(String arg0) {
        Assert.assertTrue(resourcesPage.newResourcesPage.isDisplayed());
    }

    @Then("The user clicks on the {string} link")
    public void theUserClicksOnTheLink(String arg0) {
        resourcesPage.resourcesLink.click();
    }

    @And("The user should be seen the {string} title")
    public void theUserShouldBeSeenTheTitle(String arg0) {
        Assert.assertTrue(resourcesPage.categoryNameTitleNewResourcesSeit.isDisplayed());

    }

    @And("The user should be seen the selection type title")
    public void theUserShouldBeSeenTheSelectionTypeTitle() {
        Assert.assertTrue(resourcesPage.selectionTypeTitle.isDisplayed());
    }
}
