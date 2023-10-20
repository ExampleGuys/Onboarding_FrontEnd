package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.*;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SitesStepDefs extends ObjectIndex {


       @And("The user must be able to click on the Sites link")
    public void theUserMustBeAbleToClickOnTheSitesLink() {
        sitesPage.sitesLink2.click();
    }

    @And("The user should be seen the List of Sites title")
    public void theUserShouldBeSeenTheListOfSitesTitle() {
        resourcesPage.listOf_.isDisplayed();

    }
    @And("The user should be seen the Site title")
    public void theUserShouldBeSeenTheSiteTitle() {
        Assert.assertTrue(sitesPage.siteTitle.isDisplayed());
    }

    @And("The user should be seen the Created By title")
    public void theUserShouldBeSeenTheCreatedByTitle() {
        Assert.assertTrue(resourcesPage.createdBy_.isDisplayed());
    }

    @And("The user should be seen the Created At title")
    public void theUserShouldBeSeenTheCreatedAtTitle() {
        Assert.assertTrue(resourcesPage.createdAt.isDisplayed());
    }

    @And("The user clicks on the Delete button")
    public void theUserClicksOnTheDeleteButton() {
        sitesPage.deleteButton.click();
    }

    @And("The user should be seen the Ant-Popover should appear")
    public void theUserShouldBeSeenTheAntPopoverShouldAppear() {
        Assert.assertTrue(resourcesPage.deletePopconfirm.isDisplayed());
        BrowserUtils.waitFor(3);
    }

    @And("The user clicks on the Edit button")
    public void theUserClicksOnTheEditButton() {
           sitesPage.editButton.click();
        BrowserUtils.waitFor(2);
    }

    @And("The user should be seen the Sites page")
    public void theUserShouldBeSeenTheSitesPage() {
           Assert.assertTrue(sitesPage.sitePage.isDisplayed());
    }

    @Then("The user clicks on the {string} item")
    public void theUserClicksOnTheItem(String arg0) {
           sitesPage.newSeiteEnterForDirections.click();
    }

    @Then("The user should be able to type up to fivehundred characters in the Description field")
    public void theUserShouldBeAbleToTypeUpToFivehundredCharactersInTheDescriptionField() {
        String str= faker.lorem().characters(510);
        int strlength = str.length(); //510

        orderPage.boxName("Enter for directions").sendKeys(str);

        int textlength = sitesPage.newSeiteEnterForDirections.getText().length();

        String str500 = sitesPage.newSeiteForDirections500.getText();//500 / 500

        int space = str500.indexOf(" "); //3

        int fivehundred = Integer.parseInt((str500.substring(0,space))); //500 int

        Assert.assertEquals(textlength,fivehundred);
    }

    @And("The user should see the number of characters they entered at the bottom right")
    public void theUserShouldSeeTheNumberOfCharactersTheyEnteredAtTheBottomRight() {
           Assert.assertTrue(sitesPage.newSeiteForDirections500.isDisplayed());
    }

    @Then("User enters invalid information on the {string} page")
    public void userEntersInvalidInformationOnThePage(String arg0) {
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
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).click().perform();

    }

    @Then("The user sees the error message")
    public void theUserSeesTheErrorMessage() {
          // Assert.assertTrue(sitesPage.);
    }

    @And("The user should be able to click on the Search by Site search box")
    public void theUserShouldBeAbleToClickOnTheSearchBySiteSearchBox() {
           resourcesPage.searchBoxText.click();
    }

    @And("The user must be able to search in the Search by Site search box")
    public void theUserMustBeAbleToSearchInTheSearchBySiteSearchBox() {
          actions.moveToElement(resourcesPage.searchBoxText).sendKeys("Avcilar").perform();
    }

    @Then("The user clicks on the Sites Sites Delete button")
    public void theUserClicksOnTheSitesSitesDeleteButton() {
           resourcesPage.deleteButtonDelete.click();
    }

    @And("The user should see the delete messagee Site successfully deleted")
    public void theUserShouldSeeTheDeleteMessageeSiteSuccessfullyDeleted() {
        Assert.assertTrue(resourcesPage.message.getText().contains("Site successfully deleted"));
        BrowserUtils.waitFor(3);
    }

    @And("The user should be seen the New Site Site title")
    public void theUserShouldBeSeenTheNewSiteSiteTitle() {
           Assert.assertTrue(sitesPage.newSeiteSiteTitle.isDisplayed());
    }

    @And("The user should be seen the New Site, Zip Code title")
    public void theUserShouldBeSeenTheNewSiteZipCodeTitle() {
           Assert.assertTrue(sitesPage.newSeiteZipCodeTitle.isDisplayed());
    }

    @And("The user clicks on the Adress Site button")
    public void theUserClicksOnTheAdressSiteButton() {
           sitesPage.newSeiteAdressSite.click();
    }

    @And("User enters valid information on the {string} item")
    public void userEntersValidInformationOnTheItem(String arg0) {
           actions.moveToElement(sitesPage.newSeiteAdressSite).sendKeys("Aselsan").perform();
    }

    @Then("The user clicks on the Zip Code button")
    public void theUserClicksOnTheZipCodeButton() {
           sitesPage.newSeiteEnterZipCode.click();
    }

    @And("The user enters the information on the Zip Code item")
    public void theUserEntersTheInformationOnTheZipCodeItem() {
           actions.moveToElement(sitesPage.newSeiteEnterZipCode).sendKeys("12365").perform();
    }

    @And("The user clicks on the counter on the {string} item")
    public void theUserClicksOnTheCounterOnTheItem(String arg0) {

    }

    @And("The user performs the function of the counter on the {string} item")
    public void theUserPerformsTheFunctionOfTheCounterOnTheItem(String arg0) {
    }

    @And("The user should be seen the New Site, Country title")
    public void theUserShouldBeSeenTheNewSiteCountryTitle() {
           Assert.assertTrue(sitesPage.newSeiteCountryTitle.isDisplayed());
    }
}
