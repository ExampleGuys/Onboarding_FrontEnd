package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.ContactsPage;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StepDefinitions_Contacts extends BrowserUtils {

    ContactsPage contactsPage = new ContactsPage();


    @Then("user should be able to view {string} button")
    public void user_should_be_able_to_view_button(String buttonName) {
        assertTrue("New Contact button is not displayed", contactsPage.getButton(buttonName).isDisplayed());
    }

    @Then("user verifies that {string} button is clickable")
    public void userVerifiesThatButtonIsClickable(String buttonName) {
        assertTrue("New Contact is not clickable", contactsPage.getButton(buttonName).isEnabled());
    }

    @Then("user should be able to see {string} section in the New Contact page")
    public void userShouldBeAbleToSeeSectionInTheNewContactPage(String sectionName) {
        assertEquals("Column names did not match",contactsPage.getSectionName(sectionName),sectionName);
    }
}
