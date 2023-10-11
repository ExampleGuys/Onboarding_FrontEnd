package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.ContactsPage;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

public class StepDefinitions_Contacts extends BrowserUtils {

    ContactsPage contactsPage = new ContactsPage();

    @And("Click on the {string} section in the Navigation Menu")
    public void clickOnTheSectionInTheNavigationMenu(String navigationMenuItemName) {
        contactsPage.clickItemsOnTheNavigationMenu(navigationMenuItemName);
        BrowserUtils.waitFor(3);

    }

    @Then("user should be able to view {string} button")
    public void user_should_be_able_to_view_button(String buttonName) {
        assertTrue("New Contact button is not displayed", contactsPage.getButton(buttonName).isDisplayed());
    }


}
