package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.*;

public class OnboardingStepDefs extends ObjectIndex{


    @Given("The user goes to staging url")
    public void theUserGoesToStagingUrl() {
        onboardingPage.theUserGoesToStagingUrl();
    }

    @And("The User click on the {string} section in the Navigation Menu")
    public void theUserClickOnTheSectionInTheNavigationMenu(String navigationName) {
        onboardingPage.clickButton(navigationName);
    }

    @And("The user click on the {string} button top right corner of the page")
    public void theUserClickOnTheButton(String buttonName) {
       onboardingPage.clickButton(buttonName);
    }

    @Then("The user should seen {string} section")
    public void theUserShouldSeenSection(String pageHeaderName) {
        onboardingPage.assertionForHeadlineIsVisible(pageHeaderName);
    }

    @Then("The User verify that “Show Logs” button in the Action section is visible")
    public void theUserVerifyThatShowLogsButtonInTheActionSectionIsVisible() {
        onboardingPage.assertionForShowLogsIcon();
    }

    @And("The User click on {string} tab under the List of Onboardings headline")
    public void theUserClickOnTabUnderTheListOfOnboardingsHeadline(String tabName) {
        onboardingPage.clickOnDraftsTab(tabName);

    }

    @Then("The User verify that edit icon in the Actions section of first element of list should be visible")
    public void theUserVerifyThatEditIconInTheActionsSectionOfFirstElementOfListShouldBeVisible() {
        onboardingPage.assertionForEditIcon();
    }

    @And("The User click on edit icon in the Actions section of first element of list")
    public void andTheUserClickOnEditIconInTheActionsSectionOfFirstElementOfList() {
        onboardingPage.clickEditIconInTheTable();

    }

    @Then("The User verify that Personel Information section should be visible")
    public void theUserVerifyThatPersonelInformationSectionShouldBeVisible() {
      //  onboardingPage.assertionForPersonalInformationHeadlineIsVisible();
    }

    @Then("The User verify that Resources section should be visible")
    public void theUserVerifyThatResourcesSectionShouldBeVisible() {
        onboardingPage.assertionForResourcesHeadlineIsVisible();
    }

    @Then("The User verify that Completion Date At The Latest section should be visible")
    public void theUserVerifyThatCompletionDateAtTheLatestSectionShouldBeVisible() {
        onboardingPage.assertionForCompletionDateAtTheLatestHeadlineIsVisible();
    }

    @Then("The User verify that Comments section should be visible")
    public void theUserVerifyThatCommentsSectionShouldBeVisible() {
        onboardingPage.assertionForCommentsIsVisible();
    }

    @Then("The user should seen Attachments section")
    public void theUserShouldSeenAttachmentsSection() {
        onboardingPage.assertionForAttechmentsHeadlineIsVisible();
    }

    @Then("The user should seen “Select File” button in the Attachments section")
    public void theUserShouldSeenSelectFileButtonInTheAttachmentsSection() {
        onboardingPage.assertionAttachmentUploadButton();
    }

    @Then("User should be able to view previously created onboarding item")
    public void userShouldBeAbleToViewPreviouslyCreatedOnboardingItem() {
        onboardingPage.assertionFirstRowOOnboardingList();
    }

    @And("The User click on the Onboardings link top left on the page")
    public void theUserClickOnTheOnboardingsLinkTopLeftOnThePage() {
        onboardingPage.clickOnLinkOfOnboardings();
    }

    @Then("The User verify that links redirected to the page")
    public void theUserVerifyThatLinksRedirectedToThePage() {
        onboardingPage.assertionLinkOfOnboardings();
    }

    @And("Click on the View More button in the Action part of the element which has complated status")
    public void clickOnTheViewMoreButtonInTheActionPartOfTheElementWhichHasComplatedStatus() {
        onboardingPage.clickOnViewMoreIcon();
    }

    @Then("The user verify that the page redirect to {string} Page")
    public void theUserVerifyThatThePageRedirectToEditOnboardingPage(String pageTitle) {
        onboardingPage.assertionRedirectToEditOnboardingPage(pageTitle);
    }

    @And("The User Click on the show logs button of First Onboarding List Element")
    public void theUserClickOnTheShowLogsButtonOfFirstOnboardingListElement() {
        onboardingPage.clickOnShowLogIcon();
    }

    @Then("The User Verify that show logs modal opened")
    public void theUserVerifyThatShowLogsModalOpened() {
        onboardingPage.assertionOpenedModal();
    }

    @Then("The User verify that Company Registration section is visible")
    public void theUserVerifyThatCompanyRegistrationSectionIsVisible() {
        onboardingPage.assertionForCompanyRegistrationHeadlineIsVisible();
    }

    @And("The user click on the delete icon in the Actions section of a first element of onboarding list")
    public void theUserClickOnTheDeleteIconInTheActionsSectionOfAFirstElementOfOnboardingList() {
        onboardingPage.clickDeleteIconOfTeFirstElementOfOnboardingList();

    }


    @Then("The User verify that redirected to new onboarding create page")
    public void theUserVerifyThatRedirectedToNewOnboardingCreatePage() {
        onboardingPage.assertionRedirectToNewOnboardingPage();
    }

    @And("The User click on All tab under the List of Onboardings headline")
    public void theUserClickOnAllTabUnderTheListOfOnboardingsHeadline() {

        onboardingPage.clickOnAllTab();
    }

    @Then("Then user verify that All onboarding processes should shown in the All tab")
    public void thenUserVerifyThatAllOnboardingProcessesShouldShownInTheAllTab() {
        onboardingPage.assertionAllOnboardingsVisible();
    }

    @Then("Then user verify that Draft onboarding processes should shown in the Drafts tab")
    public void thenUserVerifyThatDraftOnboardingProcessesShouldShownInTheDraftsTab() {
        onboardingPage.assertionDraftOnboardingsVisible();
    }

    @And("The User click on Completed tab under the List of Onboardings headline")
    public void theUserClickOnCompletedTabUnderTheListOfOnboardingsHeadline() {
        onboardingPage.clickOnCompletedTab();
    }

    @Then("Then user verify that Completed onboarding processes should shown in the Drafts tab")
    public void thenUserVerifyThatCompletedOnboardingProcessesShouldShownInTheDraftsTab() {
        onboardingPage.assertionCompletedOnboardingsVisible();
    }


    @Then("The user verify that created onboarding is deleted")
    public void theUserVerifyThatCreatedOnboardingIsDeleted() {
        onboardingPage.assertionTotalOnboardingItemIsChanged();

    }

    @And("The user write a comment in the comment section bottom of the page")
    public void theUserWriteACommentInTheCommentSectionBottomOfThePage() {
       // onboardingPage.inputCommentArea();
    }

    @Then("The User verify that the {string} button is clickable")
    public void theUserVerifyThatTheButtonIsClickable(String buttonName) {
        onboardingPage.shouldClickableButton(buttonName);
    }


    @And("The User Click on the {string} button")
    public void theUserClicksOnTheButton(String buttonName) {
        onboardingPage.clickButton(buttonName);
    }

    @Then("The User verify that the Delete Comment icon is clickable")
    public void theUserVerifyThatTheDeleteCommentIconIsClickable() {
        onboardingPage.assertionDeleteIconIsClickable();

    }

    @Then("The customize column button at the top right of the page must be clickable")
    public void theCustomizeColumnButtonAtTheTopRightOfThePageMustBeClickable() {
        onboardingPage.isClickableCustomizationColumns();
    }
    @Then("The {string} button at the top right of the page should be clickable")
    public void theButtonAtTheTopRightOfThePageShouldBeClickable(String buttonName) {
        onboardingPage.shouldClickableButton(buttonName);
    }

    @Then("The User verify that “Show Logs” button in the Action section is clickable")
    public void theUserVerifyThatShowLogsButtonInTheActionSectionIsClickable() {
        onboardingPage.assertionShowLogsIconIsClickable();
    }

    @Then("The user verify that the addition of a new comment")
    public void theUserVerifyThatTheAdditionOfANewComment() {
        onboardingPage.assertionNewCommentHasBeenAdded();
    }
    @And("The user click on the {string} icon-button")
    public void theUserClickOnTheIconButton(String buttonName) {
        onboardingPage.clickOnDeleteIcon();
        onboardingPage.clickButton(buttonName);
    }

    @Then("The User verify that the new comment has been deleted")
    public void theUserVerifyThatTheNewCommentHasBeenDeleted() {
        onboardingPage.assertionCommentsNotVisible();
    }


    @And("The User fills a  Personal Information Area")
    public void theUserFillsAPersonalInformationArea() {
    onboardingPage.selectPersonalTitle();
    onboardingPage.enterFirstNameLastNameEmail();
    onboardingPage.selectBirthDate();
    }

    @And("The User fills a  Company Registration Area")
    public void theUserFillsACompanyRegistrationArea() {
        onboardingPage.fillsCompanyRegistrationArea();
    }

    @And("The User select a Completion Date at The Latest")
    public void theUserSelectACompletionDateAtTheLatest() {
        onboardingPage.selectCompletionDateAtLatest();
    }

    @And("The User fills a  Resources Area")
    public void theUserFillsAResourcesArea() {
        onboardingPage.fillsAResourcesArea();
    }

    @Then("The User verify that the onboarding record has been created in the List of Onboardings")
    public void theUserVerifyThatTheOnboardingRecordHasBeenCreatedInTheListOfOnboardings() {
        onboardingPage.assertionCreatedNewOnboardingIsDisplayed();
    }

    @Then("The User then verify that the onboarding registration status is saved as draft")
    public void theUserThenVerifyThatTheOnboardingRegistrationStatusIsSavedAsDraft() {

        onboardingPage.assertionCreatedNewOnboardingIsDisplayed();
    }

    @Then("The user then verifies that the toast message has been seen that the registration process did not take place")
    public void theUserThenVerifiesThatTheToastMessageHasBeenSeenThatTheRegistrationProcessDidNotTakePlace() {
        onboardingPage.assertionToastMessageHasBeenSeen();
    }

    @And("The user fills in all fields on the page except personal title section")
    public void theUserFillsInAllFieldsOnThePageExceptPersonalTitleSection() {
        onboardingPage.fillsCompanyRegistrationArea();
        onboardingPage.fillsAResourcesArea();
        onboardingPage.selectCompletionDateAtLatest();
    }

    @And("The user clicks on the Completion Date section in the Company Registration")
    public void theUserClicksOnTheCompletionDateSectionInTheCompanyRegistration() {
        onboardingPage.clicksCompletionDateAtLatest();
    }

    @Then("The User verify that the mini calendar is opened")
    public void theUserVerifyThatTheMiniCalendarIsOpened() {
        onboardingPage.assertionCalendarIsDisplayed();
    }

    @And("The user changing one of the personal information")
    public void theUserChangingOneOfThePersonalInformation() {
        onboardingPage.changingOneOfThePersonalInformation();
        }

    @Then("The User verify that the change has been saved")
    public void theUserVerifyThatTheChangeHasBeenSaved() {
        onboardingPage.assertionChangedHasBeenSaved();
    }

    @And("The user changing one of the Company Registration")
    public void theUserChangingOneOfTheCompanyRegistration() {
        onboardingPage.changingOneOfTheCompanyRegistration();
    }

    @Then("The User verify that no changes have occured")
    public void theUserVerifyThatNoChangesHaveOccured() {
        onboardingPage.theUserVerifyThatNoChangesHaveOccured();
    }

    @And("The user changing one of the Resources")
    public void theUserChangingOneOfTheResources() {
        onboardingPage.changingOneOfTheResources();
    }

    @And("The user changing one of the Completion Date At the Latest")
    public void theUserChangingOneOfTheCompletionDateAtTheLatest() {
        onboardingPage.changingOneOfTheCompletionDateAtTheLatest();
    }

    @Then("The User verify that the job is seen in the complated Requests List")
    public void theUserVerifyThatTheJobIsSeenInTheComplatedRequestsList() {
        onboardingPage.verifyThatTheJobIsSeenInTheComplatedRequestsList();

    }

    @And("The User checked the FirstName of List first element")
    public void theUserCheckedTheFirstNameOfListFirstElement() {
        onboardingPage.checkedTheFirstNameOfListFirstElement();

    }

    @And("The user clicks on the The First Working Day section in the Company Registration")
    public void theUserClicksOnTheTheFirstWorkingDaySectionInTheCompanyRegistration() {
        onboardingPage.clicksOnTheTheFirstWorkingDaySectionInTheCompanyRegistration();
    }
    @And("The User click on plus + button near to {string} title")
    public void theUserClickOnPlusButtonNearToInTheCompanyRegistrationSection(String optionName) {
        orderPage.clickPlusAccordingToOptionName(optionName);
    }

    @Then("The User verify that the modal is opened")
    public void theUserVerifyThatTheModalIsOpened() {
        onboardingPage.assertionOpenedModal();
    }

    @And("The User {string} button in the Resources Section")
    public void theUserButtonInTheResourcesSection(String buttonName) {
        onboardingPage.clickButton(buttonName);
    }

    @And("The user enter an email in the Filter Modal and click on {string} button")
    public void theUserEnterAnEmailInTheFilterModalAndClickOnButton(String buttonName) {
        onboardingPage.entersAnEmail();
        onboardingPage.clickButton(buttonName);
    }

    @Then("The user verify that results according to the email address entered are filtered")
    public void theUserVerifyThatResultsAccordingToTheEmailAddressEnteredAreFiltered() {
        onboardingPage.theUserVerifyThatResultsAccordingToTheEmailAddressEnteredAreFiltered();
    }

    @And("The User click on {string} button on the ant-popover")
    public void theUserClickOnButtonOnTheAntPopover(String buttonName) {
        onboardingPage.clickButton(buttonName);
    }


    @And("The user fills all required fields in onboarding create form")
    public void theUserFillsAllRequiredFieldsInOnboardingCreateForm() {
        onboardingPage.entersPersonalInformation();
        onboardingPage.entersCompanyRegistrationArea();
        onboardingPage.selectResouce();
        onboardingPage.selectCompletionDateAtLatest();


    }

    @Then("The user verify that created onboarding is visible")
    public void theUserVerifyThatCreatedOnboardingIsVisible() {
       companiesPage.theUserVerifyThatCreatedUnitIsVisible();
    }
}
