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

    @And("The user should be seen the New Rwsources Page {string} page")
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

    @And("The user should be seen the Single Selection title")
    public void theUserShouldBeSeenTheSingleSelectionTitle() {
        Assert.assertTrue(resourcesPage.singleSelectionType.isDisplayed());

    }

    @And("The user should be seen the Multiple Selection title")
    public void theUserShouldBeSeenTheMultipleSelectionTitle() {
        Assert.assertTrue(resourcesPage.multipleSelectionTitle.isDisplayed());

    }

    @And("The user clicks on the Single Selection button")
    public void theUserClicksOnTheSingleSelectionButton() {
        resourcesPage.selectionTypeSwitch.click();
    }

    @And("The user should be seen the Resources Page {string} page")
    public void theUserShouldBeSeenTheResourcesPage(String arg0) {
        Assert.assertTrue(resourcesPage.listOfResourcesTitleText.isDisplayed());

    }

    @And("The user should be the {string} title on the {string} page")
    public void theUserShouldBeTheTitleOnThePage(String arg0, String arg1) {
      //  Assert.assertTrue(commonPage.listOf_Title.isDisplayed());
    }


    @And("The user should be the {string} {string} {string} {string} title")
    public void theUserShouldBeTheTitle(String arg0, String arg1, String arg2, String arg3) {

  //        Assert.assertTrue(commonPage.listOf_Title.isDisplayed());
  //        Assert.assertTrue(commonPage.createdAtTitle.isDisplayed());
  //        Assert.assertTrue(commonPage.createdByTitle.isDisplayed());
  //        Assert.assertTrue(resourcesPage.categoryNameTitle.isDisplayed());
       // BrowserUtils.waitForVisibility(commonPage.listOf_Title,20);

     //   String actualResultlistOf_Title = commonPage.listOf_Title.getText();
        String expectedResult = arg0;
      //  Assert.assertEquals(expectedResult,actualResultlistOf_Title);
    }
    @Then("The user clicks on the Search by name search box")
    public void theUserClicksOnTheSearchByNameSearchBox() {
      //  commonPage.searchBoxButton.click();
    }
    @And("User searches in the search box")
    public void userSearchesInTheSearchBox() {
       // commonPage.searchBoxButton.getText();
        Assert.assertTrue(resourcesPage.searchBoxFirstLine.isDisplayed());
    }
}
