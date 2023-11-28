package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.*;

public class ContactsPage extends BasePage {


    @FindBy(xpath = "((//td[@class='ant-table-cell'])/b[1])[1]")
    public WebElement lastCreatedContactName;

    @FindBy(xpath = "((//td[@class='ant-table-cell'])/span[1])[1]")
    public WebElement lastCreatedEmail;

    @FindBy(xpath = "//div[@class='ant-card-body']")
    public WebElement listOfContactsTable;

    @FindBy(xpath = "(//tbody[@class='ant-table-tbody'])/tr")
    List<WebElement> contactsListInOnePage;




    public void writeContactNameInTheTextBox(String placeHolder) {
        boxName(placeHolder).sendKeys(fakeContactName);

    }

    public void editContactName(String placeHolder){
        boxName(placeHolder).sendKeys("updated");
    }

    public void writeContactNameWithNumber(String placeHolder) {
       boxName(placeHolder).sendKeys("123" + fakeContactName + "123");
    }

    public void writeEmailInTheTextBox(String placeHolder) {
       boxName(placeHolder).sendKeys(fakeEmail);

    }

    public void checkContactNames() {
        assertEquals(lastCreatedContactName.getText(), fakeContactName);
        System.out.println("lastCreatedContactName = " + lastCreatedContactName.getText());
        System.out.println("fakeContactName = " + fakeContactName);
    }

    public void checkEmailAddresses() {
        assertTrue(lastCreatedEmail.getText().equals(fakeEmail));
        System.out.println("lastCreatedEmail = " + lastCreatedEmail.getText());
        System.out.println("fakeEmail = " + fakeEmail);
    }

    public int countContacts() {
        return contactsListInOnePage.size();

    }

    public void userShouldBeAbleToSeeSectionInTheNewContactPage(String sectionName) {
        assertEquals("Column names did not match", getSectionName(sectionName), sectionName);

    }

    public void userShouldBeAbleToSeeColumnInThePage(String fullNameCompanyColumn) {
        assertEquals("Header names did not match", getHeaderText(fullNameCompanyColumn), fullNameCompanyColumn);
    }

    public void userShouldBeAbleToSeeMessage(String message1) {
        BrowserUtils.waitFor(2);
        assertEquals(toastMessageText(), message1);
    }

    public void theUserWritesAContactNameInTextArea(String placeHolder) {
        BrowserUtils.waitForVisibility(boxName(placeHolder),20);
        writeContactNameInTheTextBox(placeHolder);
    }

    public void userShouldBeAbleToVerifyThatUserShouldNotBeAbleCreateAContact() {
        assertEquals("Please fill out all required fields correctly.", toastMessageText());
    }

    public void theUserShouldBeAbleToViewTextAtTheTopLeftOfThePage(String textName) {
        BrowserUtils.waitForVisibility(message, 20);
        BrowserUtils.assertContains(getBreadcrumbText(textName), textName);
    }

    public void userShouldBeAbleToSeeContactsInformationAsATable() {

        BrowserUtils.verifyElementDisplayed(listOfContactsTable);
    }

    public void userShouldBeAbleToVerifyThatWritesACompanyNameByUsingNumbers() {

        BrowserUtils.assertContains(toastMessageText(),("contacts successfully created"));
    }

    public void userShouldBeAbleToViewBreadcrumbLinkOnThePage(String breadcrumbLink) {
        assertEquals(getBreadcrumbText(breadcrumbLink), breadcrumbLink);
    }

    public void userShouldBeAbleToClickableBreadcrumbLinkOnTheNewContactPage(String breadcrumbLink) {
        assertTrue(getBreadcrumbWebElement(breadcrumbLink).isEnabled());

    }

    public void userShouldBeAbleToVerifyThatGoesBackToThePage(String pageTitle) {
        assertEquals(getPageTitle(), pageTitle);
    }

    public void userScrollsUntilEndOfThePage() {
        BrowserUtils.scrollToElement(paginationTotalText);
    }

    public void userShouldBeAbleToObserveOnOnePage(String tenContacts) {
        int contactsInOnePage = Integer.parseInt(tenContacts);
        assertEquals(countContacts(), contactsInOnePage);
    }

    public void userShouldBeAbleToClickPaginationNextItemButton() {
        BrowserUtils.verifyElementClickable(paginationItemLinkForNextPage);
    }

    public void theUserClicksOnTheDeleteIconInTheActionsSectionOfAFirstElementOfContactsList() {
        BrowserUtils.clickElement(deleteIconForFirstRow, 20);
    }

    public void theUserShouldBeAbleToVerifyThatCreatedContactIsDeleted() {
        BrowserUtils.assertContains(toastMessageText(),"success");

    }

    public void userShouldBeAbleToViewDeleteIconInTheContactsPage() {
        BrowserUtils.verifyElementDisplayed(deleteIconForFirstRow);

    }

    public void userShouldBeAbleToViewEditIconInTheContactsPage() {
        BrowserUtils.verifyElementDisplayed(editIconForFirstRow);

    }

    public void userShouldBeAbleToClickEditIconInTheContactsPage() {
        BrowserUtils.verifyElementClickable(editIconForFirstRow);

    }

    public void userShouldBeAbleToClickDeleteIconInTheContactsPage() {
        BrowserUtils.verifyElementClickable(deleteIconForFirstRow);

    }

    public void userClicksDeleteIcon() {
        BrowserUtils.clickElement(deleteIconForFirstRow, 20);
    }

    public void userShouldBeAbleToVerifyThatGoesToTheNextPage() {
        String url = Driver.driver.getCurrentUrl();
        System.out.println(url);
        assertTrue(url.contains("2"));
    }

    public void userClicksPaginationPrevItemToMovePreviousPage() {
        BrowserUtils.clickElement(paginationItemLinkForPreviousPage,20);
    }

    public void userShouldBeAbleToVerifyThatGoesBackToThePreviousPage() {
        assertTrue(Driver.driver.getCurrentUrl().contains("1"));
    }

    public void userShouldBeAbleToClickOnPaginationNextItemButton() {
        BrowserUtils.clickElement(paginationItemLinkForNextPage,20);
    }

    public void userShouldBeAbleToViewContactsInformationUnderHeader(String headerName) {
        assertEquals(getPageHeaderName(headerName), headerName);
        assertTrue(listOfContactsTable.isDisplayed());
    }

    public void userWritesInTheTextArea(String placeHolder) {
        BrowserUtils.waitForVisibility(boxName(placeHolder),20);
        editContactName(placeHolder);
        BrowserUtils.waitFor(3);
    }

    public void userShouldBeAbleToSaveTheUpdatedCompanyName() {
        clickButton("Save");
        assertTrue(toastMessageText().contains("success"));
        assertTrue(lastCreatedContactName.getText().contains("updated"));
    }
}
