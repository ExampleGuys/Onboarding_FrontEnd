package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ContactsStepDefs extends ObjectIndex {


    @Then("The User should seen {string} button")
    public void user_should_be_able_to_view_button(String buttonName) {
      contactsPage.shouldSeenButton(buttonName);
    }

    @Then("The User verifies that {string} button is clickable")
    public void userVerifiesThatButtonIsClickable(String buttonName) {
      contactsPage.shouldClickableButton(buttonName);
    }

    @Then("The User should be able to see {string} section in the New Contact page")
    public void userShouldBeAbleToSeeSectionInTheNewContactPage(String sectionName) {
        contactsPage.userShouldBeAbleToSeeSectionInTheNewContactPage(sectionName);
    }

    @Then("The User should be able to see {string} column in the Contacts page")
    public void userShouldBeAbleToSeeColumnInThePage(String fullNameCompanyColumn) {
        contactsPage.userShouldBeAbleToSeeColumnInThePage(fullNameCompanyColumn);

    }

    @Then("The User verify that {string} message should be seen")
    public void userShouldBeAbleToSeeMessage(String message1) {
        contactsPage.userShouldBeAbleToSeeMessage(message1);


    }

    @And("The user writes a contact name in {string} text area")
    public void theUserWritesAContactNameInTextArea(String placeHolder) {
        contactsPage.theUserWritesAContactNameInTextArea(placeHolder);


    }

    @And("The user writes a contact name in {string} text area with numbers")
    public void theUserWritesAContactNameInTextAreaWithNumbers(String placeHolder) {
        contactsPage.writeContactNameWithNumber(placeHolder);

    }

    @And("The user writes Email address in {string} text area")
    public void theUserWritesEmailAddressInTextArea(String placeHolder) {
        contactsPage.writeEmailInTheTextBox(placeHolder);
    }

    @Then("The User should be able to verify that new contact is in the contacts' list")
    public void userShouldBeAbleToVerifyThatNewContactIsInTheContactsList() {

        contactsPage.checkContactNames();
        contactsPage.checkEmailAddresses();

    }

    @Then("The User should be able to verify that user should not be able create a contact")
    public void userShouldBeAbleToVerifyThatUserShouldNotBeAbleCreateAContact() {
        contactsPage.userShouldBeAbleToVerifyThatUserShouldNotBeAbleCreateAContact();

    }



    @Then("The user should be able to view {string} text at the top left of the page")
    public void theUserShouldBeAbleToViewTextAtTheTopLeftOfThePage(String textName) {
        contactsPage.theUserShouldBeAbleToViewTextAtTheTopLeftOfThePage(textName);


    }

    @Then("The User should be able to see contacts information as a table")
    public void userShouldBeAbleToSeeContactsInformationAsATable() {
        contactsPage.userShouldBeAbleToSeeContactsInformationAsATable();

    }

    @Then("The User should be able to verify that writes a company name by using numbers")
    public void userShouldBeAbleToVerifyThatWritesACompanyNameByUsingNumbers() {
        contactsPage.userShouldBeAbleToVerifyThatWritesACompanyNameByUsingNumbers();

    }

    @Then("The User should be able to view {string} breadcrumb link on the New Contact page")
    public void userShouldBeAbleToViewBreadcrumbLinkOnThePage(String breadcrumbLink) {
        contactsPage.userShouldBeAbleToViewBreadcrumbLinkOnThePage(breadcrumbLink);

    }

    @Then("The User should be able to clickable {string} breadcrumb link on the New Contact page")
    public void userShouldBeAbleToClickableBreadcrumbLinkOnTheNewContactPage(String breadcrumbLink) {
        contactsPage.userShouldBeAbleToClickableBreadcrumbLinkOnTheNewContactPage(breadcrumbLink);

    }

    @Then("The User should be able to verify that goes back to the {string} page")
    public void userShouldBeAbleToVerifyThatGoesBackToThePage(String pageTitle) {
        contactsPage.userShouldBeAbleToVerifyThatGoesBackToThePage(pageTitle);

    }

    @And("The User scrolls until end of the page")
    public void userScrollsUntilEndOfThePage() {
        contactsPage.userScrollsUntilEndOfThePage();

    }

    @Then("The User should be able to observe the number of total contacts correctly")
    public void userShouldBeAbleToObserveTheNumberOfTotalContactsCorrectly() {
        contactsPage.getTotalNumberOfThePageInformationText();

    }

    @And("The user clicks page selection button")
    public void userClicksPageSelectionButton() {
        contactsPage.pageSelectOptionsDropDown.click();

    }

    @And("The user chooses {string}")
    public void userChooses(String numberOfPageSelection) {
        contactsPage.selectfromPageNumberDropDown(numberOfPageSelection).click();

    }

    @Then("The User should be able to observe {string} contacts on one page")
    public void userShouldBeAbleToObserveOnOnePage(String tenContacts) {

        contactsPage.userShouldBeAbleToObserveOnOnePage(tenContacts);

    }

    @Then("The User should be able to click pagination-next-item button")
    public void userShouldBeAbleToClickPaginationNextItemButton() {
        contactsPage.userShouldBeAbleToClickPaginationNextItemButton();

    }

    @And("The User click on the delete icon in the Actions section of a first element of contacts list")
    public void theUserClicksOnTheDeleteIconInTheActionsSectionOfAFirstElementOfContactsList() {
        contactsPage.theUserClicksOnTheDeleteIconInTheActionsSectionOfAFirstElementOfContactsList();

    }

    @And("The User clicks on {string} button on the ant-popover")
    public void theUserClicksOnButtonOnTheAntPopover(String deleteButton) {
        contactsPage.clickButton(deleteButton);

    }

    @Then("The User should be able to verify that created contact is deleted")
    public void theUserShouldBeAbleToVerifyThatCreatedContactIsDeleted() {
        contactsPage.theUserShouldBeAbleToVerifyThatCreatedContactIsDeleted();

    }

    @Then("The User should be able to view Delete icon in the Contacts page")
    public void userShouldBeAbleToViewDeleteIconInTheContactsPage() {
        contactsPage.userShouldBeAbleToViewDeleteIconInTheContactsPage();

    }

    @Then("The User should be able to view Edit icon in the Contacts page")
    public void userShouldBeAbleToViewEditIconInTheContactsPage() {
        contactsPage.userShouldBeAbleToViewEditIconInTheContactsPage();

    }

    @Then("The User should be able to click Edit icon in the Contacts page")
    public void userShouldBeAbleToClickEditIconInTheContactsPage() {
        contactsPage.userShouldBeAbleToClickEditIconInTheContactsPage();

    }

    @Then("The User should be able to click Delete icon in the Contacts page")
    public void userShouldBeAbleToClickDeleteIconInTheContactsPage() {
        contactsPage.userShouldBeAbleToClickDeleteIconInTheContactsPage();

    }

    @And("The User click on Delete icon")
    public void userClicksDeleteIcon() {
        contactsPage.userClicksDeleteIcon();

    }

    @Then("The User should be able to click {string} button")
    public void userShouldBeAbleToClickButton(String cancelButton) {
        contactsPage.shouldClickableButton(cancelButton);

    }

    @And("The User click on pagination-next-item to move next page")
    public void userClickOnPaginationNextItemToMoveNextPage() {
        contactsPage.userShouldBeAbleToClickOnPaginationNextItemButton();

    }

    @Then("The User should be able to verify that goes to the next page")
    public void userShouldBeAbleToVerifyThatGoesToTheNextPage() {
        contactsPage.userShouldBeAbleToVerifyThatGoesToTheNextPage();

    }

    @And("The User clicks pagination-prev-item to move previous page")
    public void userClicksPaginationPrevItemToMovePreviousPage() {
        contactsPage.userClicksPaginationPrevItemToMovePreviousPage();

    }

    @Then("The User should be able to verify that goes back to the previous page")
    public void userShouldBeAbleToVerifyThatGoesBackToThePreviousPage() {
        contactsPage.userShouldBeAbleToVerifyThatGoesBackToThePreviousPage();

    }

    @Then("The User should be able to observe latest created contact is at the top of the list")
    public void userShouldBeAbleToObserveLatestCreatedContactIsAtTheTopOfTheList() {
        contactsPage.checkContactNames();
    }

    @Then("The User should be able to view contacts' information under {string} header")
    public void userShouldBeAbleToViewContactsInformationUnderHeader(String headerName) {
        contactsPage.userShouldBeAbleToViewContactsInformationUnderHeader(headerName);


    }

    @And("The User click on Edit icon in first Element of List of Contacts in the Contacts page")
    public void userClicksEditIconUnderTheActionsColumnInTheContactsPage() {
        BrowserUtils.clickElement(contactsPage.editIconForFirstRow,20);
    }

    @And("The User writes updated in the {string} text area")
    public void userWritesInTheTextArea(String placeHolder) {
        contactsPage.userWritesInTheTextArea(placeHolder);

    }

    @Then("The User should be able to save the updated company name")
    public void userShouldBeAbleToSaveTheUpdatedCompanyName() {
        contactsPage.userShouldBeAbleToSaveTheUpdatedCompanyName();

    }

    @Then("The User should be able to view {string} message")
    public void userShouldBeAbleToViewMessage(String toastMessageText) {
        assertEquals(contactsPage.toastMessageText(),toastMessageText);
    }

    @Then("The User should be able to verify that enters the {string} page")
    public void userShouldBeAbleToVerifyThatEntersTheContactPage(String pageTitle) {
        contactsPage.userShouldBeAbleToVerifyThatGoesBackToThePage(pageTitle);
    }

    @Then("The User should be able to see {string} message")
    public void theUserShouldBeAbleToSeeMessage(String message2) {
        contactsPage.userShouldBeAbleToSeeMessage(message2);
    }
}


