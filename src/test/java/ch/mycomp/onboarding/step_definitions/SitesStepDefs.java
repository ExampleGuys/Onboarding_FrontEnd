package ch.mycomp.onboarding.step_definitions;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class SitesStepDefs extends ObjectIndex {

       @And("The user must be able to click on the Sites link")
    public void theUserMustBeAbleToClickOnTheSitesLink() {
           sitesPage.theUserMustBeAbleToClickOnTheSitesLink();
    }

    @And("The user should be seen the List of Sites title")
    public void theUserShouldBeSeenTheListOfSitesTitle() {
       resourcesPage.theUserShouldBeSeenTheListOfSitesTitle();

    }
    @And("The user should be seen the Site title")
    public void theUserShouldBeSeenTheSiteTitle() {
        sitesPage.theUserShouldBeSeenTheSiteTitle();
    }

    @And("The user should be seen the Created By title")
    public void theUserShouldBeSeenTheCreatedByTitle() {
       resourcesPage.theUserShouldBeSeenTheCreatedByTitle();
    }

    @And("The user should be seen the Created At title")
    public void theUserShouldBeSeenTheCreatedAtTitle() {
        resourcesPage.theUserShouldBeSeenTheCreatedAtTitle();
    }

    @And("The user clicks on the Delete button")
    public void theUserClicksOnTheDeleteButton() {
        sitesPage.theUserClicksOnTheDeleteButton();
    }

    @And("The user should be seen the Ant-Popover should appear")
    public void theUserShouldBeSeenTheAntPopoverShouldAppear() {
        resourcesPage.theUserShouldBeSeenTheAntPopoverShouldAppear();
    }

    @And("The user clicks on the Edit button")
    public void theUserClicksOnTheEditButton() {
           sitesPage.editButton.click();
        BrowserUtils.waitFor(2);
    }

    @And("The user should be seen the Sites page")
    public void theUserShouldBeSeenTheSitesPage() {
        sitesPage.theUserShouldBeSeenTheSitesPage();
    }

    @Then("The user clicks on the {string} item")
    public void theUserClicksOnTheItem(String arg0) {
           sitesPage.theUserClicksOnTheItem(arg0);
    }

    @Then("The user should be able to type up to fivehundred characters in the Description field")
    public void theUserShouldBeAbleToTypeUpToFivehundredCharactersInTheDescriptionField() {
        sitesPage.theUserShouldBeAbleToTypeUpToFivehundredCharactersInTheDescriptionField();

    }

    @And("The user should see the number of characters they entered at the bottom right")
    public void theUserShouldSeeTheNumberOfCharactersTheyEnteredAtTheBottomRight() {
           sitesPage.theUserShouldSeeTheNumberOfCharactersTheyEnteredAtTheBottomRight();
    }

    @Then("User enters invalid information on the page")
    public void userEntersInvalidInformationOnThePage() {
           sitesPage.userEntersInvalidInformationOnThePage();

    }

    @Then("The user sees the error message")
    public void theUserSeesTheErrorMessage() {
         theUserSeesTheErrorMessage();
    }

    @And("The user should be able to click on the Search by Site search box")
    public void theUserShouldBeAbleToClickOnTheSearchBySiteSearchBox() {
           resourcesPage.theUserShouldBeAbleToClickOnTheSearchBySiteSearchBox();
    }

    @And("The user must be able to search in the Search by Site search box")
    public void theUserMustBeAbleToSearchInTheSearchBySiteSearchBox() {
        resourcesPage.theUserMustBeAbleToSearchInTheSearchBySiteSearchBox();
    }

    @Then("The user clicks on the Sites Sites Delete button")
    public void theUserClicksOnTheSitesSitesDeleteButton() {
           resourcesPage.theUserClicksOnTheSitesSitesDeleteButton();
    }

    @And("The user should see the delete messagee Site successfully deleted")
    public void theUserShouldSeeTheDeleteMessageeSiteSuccessfullyDeleted() {
       resourcesPage.theUserClicksOnTheSitesSitesDeleteButton();
    }

    @And("The user should be seen the New Site Site title")
    public void theUserShouldBeSeenTheNewSiteSiteTitle() {
          sitesPage.theUserShouldBeSeenTheNewSiteSiteTitle();
    }

    @And("The user should be seen the New Site, Zip Code title")
    public void theUserShouldBeSeenTheNewSiteZipCodeTitle() {
           sitesPage.theUserShouldBeSeenTheNewSiteZipCodeTitle();
    }

    @And("The user clicks on the Adress Site button")
    public void theUserClicksOnTheAdressSiteButton() {
           sitesPage.theUserClicksOnTheAdressSiteButton();
    }

    @And("User enters valid information on the {string} item")
    public void userEntersValidInformationOnTheItem(String arg0) {
           sitesPage.userEntersValidInformationOnTheItem(arg0);
        BrowserUtils.waitFor(2);
    }

    @Then("The user clicks on the Zip Code button")
    public void theUserClicksOnTheZipCodeButton() {
           sitesPage.theUserClicksOnTheZipCodeButton();
    }

    @And("The user enters the information on the Zip Code item")
    public void theUserEntersTheInformationOnTheZipCodeItem() {
        sitesPage.theUserEntersTheInformationOnTheZipCodeItem();
    }

    @And("The user clicks on the counter on the {string} item")
    public void theUserClicksOnTheCounterOnTheItem(String arg0) {
           sitesPage.theUserClicksOnTheCounterOnTheItem(arg0);
    }

    @And("The user should be seen the New Site, Country title")
    public void theUserShouldBeSeenTheNewSiteCountryTitle() {
          sitesPage.theUserShouldBeSeenTheNewSiteCountryTitle();
    }

    @And("The user clicks on the Country item")
    public void theUserClicksOnTheCountryItem() {
        //Steps need to be written. There is a bug.
    }

    @And("The user enters the information on the Country item")
    public void theUserEntersTheInformationOnTheCountryItem() {
        //Steps need to be written. There is a bug.
    }

    @And("The user should be seen the New Site, City title")
    public void theUserShouldBeSeenTheNewSiteCityTitle() {
           sitesPage.theUserShouldBeSeenTheNewSiteCityTitle();
    }

    @Then("The user clicks on the City item")
    public void theUserClicksOnTheCityItem() {
           sitesPage.theUserClicksOnTheCityItem();
    }

    @Then("The user enters the information on the City item")
    public void theUserEntersTheInformationOnTheCityItem() {
          sitesPage.theUserEntersTheInformationOnTheCityItem();
    }

    @And("The user should be seen the New Site, District title")
    public void theUserShouldBeSeenTheNewSiteDistrictTitle() {
          sitesPage.theUserShouldBeSeenTheNewSiteDistrictTitle();
    }

    @Then("The user clicks on the District item")
    public void theUserClicksOnTheDistrictItem() {
           sitesPage.theUserClicksOnTheDistrictItem();
    }

    @And("The user enters the information on the District item")
    public void theUserEntersTheInformationOnTheDistrictItem() {
           sitesPage.theUserEntersTheInformationOnTheDistrictItem();
    }

    @And("The user should be seen the New Site, Street title")
    public void theUserShouldBeSeenTheNewSiteStreetTitle() {
          sitesPage.theUserShouldBeSeenTheNewSiteStreetTitle();
    }

    @Then("The user clicks on the Street item")
    public void theUserClicksOnTheStreetItem() {
           sitesPage.theUserClicksOnTheStreetItem();
    }

    @And("The user enters the information on the Street item")
    public void theUserEntersTheInformationOnTheStreetItem() {
           sitesPage.theUserEntersTheInformationOnTheStreetItem();
    }

    @And("The user cannot enter more than {int} characters in the {string} item on the {string} page")
    public void theUserCannotEnterMoreThanCharactersInTheItemOnThePage(int arg0, String arg1, String arg2) {
        //Manual Test
    }

    @And("The user clicks on the scroll bar on the {string} item")
    public void theUserClicksOnTheScrollBarOnTheItem(String arg0) {
           sitesPage.theUserClicksOnTheScrollBarOnTheItem(arg0);

    }

    @And("The user should be seen the {string} page")
    public void theUserShouldBeSeenThePage(String arg0) {
           sitesPage.theUserShouldBeSeenThePage(arg0);
    }

    @Then("The user makes changes to the desired category")
    public void theUserMakesChangesToTheDesiredCategory() {
           sitesPage.theUserMakesChangesToTheDesiredCategory();
    }

    @And("The user sees the confirmation message")
    public void theUserSeesTheConfirmationMessage() {
        sitesPage.theUserSeesTheConfirmationMessage();
    }

    @Then("The user clicks on the Save button")
    public void theUserClicksOnTheSaveButton() {
           sitesPage.saveButton.click();
    }

    @Then("User enters valid information on the New Site page")
    public void userEntersValidInformationOnTheNewSitePage() {
        BrowserUtils.clickWithJS(sitesPage.selectTheCompany);
        sitesPage.selectTheCompany.sendKeys("Ankasale",Keys.ENTER);
        BrowserUtils.waitFor(2);
        WebElement startBox = orderPage.boxName("Address Site");
        actions.click(startBox).
                sendKeys("Avcilar").
                sendKeys(Keys.TAB).
                sendKeys("23652").
                sendKeys(Keys.TAB).
                sendKeys("TR").
                sendKeys(Keys.TAB).
                sendKeys("Ankara").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("Ankara Caddesi").
                sendKeys(Keys.TAB).
                sendKeys("Home delivery").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).click().perform();
        BrowserUtils.waitFor(2);
    }
}
