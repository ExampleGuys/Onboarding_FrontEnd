package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.ContactsPage;
import ch.mycomp.onboarding.pages.OrderPage;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
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

    @And("the user writes a contact name in {string} text area with numbers")
    public void theUserWritesAContactNameInTextAreaWithNumbers(String placeHolder) {
        contactsPage.writeContactNameWithNumber(placeHolder);

    }

    @And("the user writes email address in {string} text area")
    public void theUserWritesEmailAddressInTextArea(String placeHolder) {
        contactsPage.writeEmailInTheTextBox(placeHolder);
    }

    @Then("user should be able to verify that new contact is in the contacts' list")
    public void userShouldBeAbleToVerifyThatNewContactIsInTheContactsList() {

        contactsPage.checkContactNames();
        contactsPage.checkEmailAddresses();

    }

    @Then("user should be able to verify that user should not be able create a contact")
    public void userShouldBeAbleToVerifyThatUserShouldNotBeAbleCreateAContact() {
        assertTrue(contactsPage.toastMessageText().equals("Please fill out all required fields correctly."));
    }

    @And("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String buttonName) {
        contactsPage.clickCreateButtonWithoutWait(buttonName);
    }

    @Then("user should be able to view {string} text at the top left of the page")
    public void userShouldBeAbleToViewTextAtTheTopLeftOfThePage(String textName) {
        assertTrue("Breadcrumb links did not match", contactsPage.getBreadcrumbText(textName).equals(textName));

    }

    @Then("user should be able to see contacts information as a table")
    public void userShouldBeAbleToSeeContactsInformationAsATable() {
        assertTrue(contactsPage.listOfContactsTable.isDisplayed());
    }

    @Then("user should be able to verify that writes a company name by using numbers")
    public void userShouldBeAbleToVerifyThatWritesACompanyNameByUsingNumbers() {
        assertTrue(contactsPage.toastMessageText().contains("success"));
    }

    @Then("user should be able to view {string} breadcrumb link on the New Contact page")
    public void userShouldBeAbleToViewBreadcrumbLinkOnThePage(String breadcrumbLink) {
        assertTrue(contactsPage.getBreadcrumbText(breadcrumbLink).equals(breadcrumbLink));
    }

    @Then("user should be able to click {string} breadcrumb link on the New Contact page")
    public void userShouldBeAbleToClickBreadcrumbLinkOnTheNewContactPage(String breadcrumbLink) {
        assertTrue(contactsPage.getBreadcrumbWebElement(breadcrumbLink).isEnabled());

    }

    @Then("user should be able to verify that goes back to the {string} page")
    public void userShouldBeAbleToVerifyThatGoesBackToThePage(String pageTitle) {
        assertEquals("Page titles did not match", contactsPage.getPageTitle(pageTitle), pageTitle);
    }

    @And("user scrolls until end of the page")
    public void userScrollsUntilEndOfThePage() {
        BrowserUtils.scrollToElement(contactsPage.paginationTotalText);
    }

    @Then("user should be able to observe the number of total contacts correctly")
    public void userShouldBeAbleToObserveTheNumberOfTotalContactsCorrectly() {
        contactsPage.getTotalNumberOfThePageInformationText();

    }

    @And("user clicks page selection button")
    public void userClicksPageSelectionButton() {
        contactsPage.pageSelectOptionsDropDown.click();

    }

    @And("user chooses {string}")
    public void userChooses(String numberOfPageSelection) {
        contactsPage.selectfromPageNumberDropDown(numberOfPageSelection).click();

    }

    @Then("user should be able to observe {string} contacts on one page")
    public void userShouldBeAbleToObserveOnOnePage(String tenContacts) {

        int contactsInOnePage = Integer.parseInt(tenContacts);
        assertEquals(contactsPage.countContacts(),contactsInOnePage);
    }

    @Then("user should be able to click pagination-next-item button")
    public void userShouldBeAbleToClickPaginationNextItemButton() {
        assertTrue(contactsPage.paginationItemLinkForNextPage.isEnabled());
    }
}




