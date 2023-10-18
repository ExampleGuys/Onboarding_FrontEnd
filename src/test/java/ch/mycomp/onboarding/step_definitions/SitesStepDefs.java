package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import org.junit.Assert;

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
        resourcesPage.deleteButton.click();
    }

    @And("The user should be seen the Ant-Popover should appear")
    public void theUserShouldBeSeenTheAntPopoverShouldAppear() {
        Assert.assertTrue(resourcesPage.deletePopconfirm.isDisplayed());
        BrowserUtils.waitFor(3);
    }

    @And("The user clicks on the Edit button")
    public void theUserClicksOnTheEditButton() {
           sitesPage.editSeiteTitle.click();
        BrowserUtils.waitFor(2);
    }
}
