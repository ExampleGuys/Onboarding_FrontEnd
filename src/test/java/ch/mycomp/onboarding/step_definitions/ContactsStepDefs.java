package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContactsStepDefs extends ObjectIndex {


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
        BrowserUtils.waitFor(3);
        contactsPage.writeContactNameInTheTextBox(placeHolder);

    }

    @And("the user writes a contact name in {string} text area with numbers")
    public void theUserWritesAContactNameInTextAreaWithNumbers(String placeHolder) {
        contactsPage.writeContactNameWithNumber(placeHolder);

    }

    @And("the user writes Email address in {string} text area")
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
        BrowserUtils.clickElement(contactsPage.getButton(buttonName), 20);

    }

    @Then("user should be able to view {string} text at the top left of the page")
    public void userShouldBeAbleToViewTextAtTheTopLeftOfThePage(String textName) {
        BrowserUtils.waitForVisibility(contactsPage.message, 20);
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
        assertEquals(contactsPage.countContacts(), contactsInOnePage);
    }

    @Then("user should be able to click pagination-next-item button")
    public void userShouldBeAbleToClickPaginationNextItemButton() {
        assertTrue(contactsPage.paginationItemLinkForNextPage.isEnabled());
    }

    @And("the user clicks on the delete icon in the Actions section of a first element of contacts list")
    public void theUserClicksOnTheDeleteIconInTheActionsSectionOfAFirstElementOfContactsList() {
        BrowserUtils.clickElement(contactsPage.deleteIconForFirstRow, 20);
    }

    @And("the user clicks on {string} button on the ant-popover")
    public void theUserClicksOnButtonOnTheAntPopover(String deleteButton) {
        contactsPage.clickButton(deleteButton);

    }

    @Then("the user should be able to verify that created contact is deleted")
    public void theUserShouldBeAbleToVerifyThatCreatedContactIsDeleted() {
        assertTrue(contactsPage.toastMessageText().contains("success"));
    }

    @Then("user should be able to view Delete icon in the Contacts page")
    public void userShouldBeAbleToViewDeleteIconInTheContactsPage() {
        assertTrue(contactsPage.deleteIconForFirstRow.isDisplayed());
    }

    @Then("user should be able to view Edit icon in the Contacts page")
    public void userShouldBeAbleToViewEditIconInTheContactsPage() {
        assertTrue(contactsPage.editIconForFirstRow.isDisplayed());
    }

    @Then("user should be able to click Edit icon in the Contacts page")
    public void userShouldBeAbleToClickEditIconInTheContactsPage() {
        assertTrue(contactsPage.editIconForFirstRow.isEnabled());
    }

    @Then("user should be able to click Delete icon in the Contacts page")
    public void userShouldBeAbleToClickDeleteIconInTheContactsPage() {
        assertTrue(contactsPage.deleteIconForFirstRow.isEnabled());
    }

    @And("user clicks Delete icon")
    public void userClicksDeleteIcon() {
        BrowserUtils.clickElement(contactsPage.deleteIconForFirstRow, 20);
    }

    @Then("user should be able to click {string} button")
    public void userShouldBeAbleToClickButton(String cancelButton) {
        BrowserUtils.clickElement(contactsPage.getButton(cancelButton), 20);
        assertTrue(contactsPage.getButton(cancelButton).isEnabled());
    }

    @And("user clicks pagination-next-item to move next page")
    public void userClicksPaginationNextItemToMoveNextPage() {
        BrowserUtils.clickElement(contactsPage.paginationItemLinkForNextPage,20);
    }

    @Then("user should be able to verify that goes to the next page")
    public void userShouldBeAbleToVerifyThatGoesToTheNextPage() {
        assertTrue(Driver.driver.getCurrentUrl().contains("2"));
    }

    @And("user clicks pagination-prev-item to move previous page")
    public void userClicksPaginationPrevItemToMovePreviousPage() {
        BrowserUtils.clickElement(contactsPage.paginationItemLinkForPreviousPage,20);
    }

    @Then("user should be able to verify that goes back to the previous page")
    public void userShouldBeAbleToVerifyThatGoesBackToThePreviousPage() {
        assertTrue(Driver.driver.getCurrentUrl().contains("1"));
    }

    @Then("user should be able to observe latest created contact is at the top of the list")
    public void userShouldBeAbleToObserveLatestCreatedContactIsAtTheTopOfTheList() {
        contactsPage.checkContactNames();
    }
}


