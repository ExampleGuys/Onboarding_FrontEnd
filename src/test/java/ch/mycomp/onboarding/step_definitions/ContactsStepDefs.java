package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.ContactsPage;
import ch.mycomp.onboarding.pages.OrderPage;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContactsStepDefs extends BrowserUtils {

    ContactsPage contactsPage = new ContactsPage();
    OrderPage orderPage = new OrderPage();

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
        assertEquals("Column names did not match", contactsPage.getSectionName(sectionName), sectionName);
    }

    @Then("user should be able to see {string} column in the Contacts page")
    public void userShouldBeAbleToSeeColumnInThePage(String fullNameCompanyColumn) {
        assertEquals("Header names did not match", contactsPage.getHeaderText(fullNameCompanyColumn), fullNameCompanyColumn);

    }

    @Then("user should be able to see {string} message")
    public void userShouldBeAbleToSeeMessage(String message1) {
        assertEquals("Messages did not match", contactsPage.toastMessageText(), message1);

    }

    @And("the user writes a contact name in {string} text area")
    public void theUserWritesAContactNameInTextArea(String placeHolder) {
        contactsPage.writeContactNameInTheTextBox(placeHolder);

    }

    @And("the user writes Email address in {string} text area")
    public void theUserWritesEmailAddressInTextArea(String placeHolder) {
        contactsPage.writeEmailIsInTheTextBox(placeHolder);
    }

    @Then("user should be able to verify that new contact is in the contacts' list")
    public void userShouldBeAbleToVerifyThatNewContactIsInTheContactsList() {

        contactsPage.checkContactNames();
        contactsPage.checkEmailAddresses();

    }
}




