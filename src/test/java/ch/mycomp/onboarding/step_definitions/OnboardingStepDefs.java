package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.*;

public class OnboardingStepDefs extends ObjectIndex{


    @Given("The user goes to staging url")
    public void the_user_goes_to_staging_url() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @And("The User click on the {string} section in the Navigation Menu")
    public void theUserClickOnTheSectionInTheNavigationMenu(String navigationName) {
        onboardingPage.clickTheButton(navigationName);
    }

    @And("The user click on the {string} button top right corner of the page")
    public void theUserClickOnTheButton(String buttonName) {
       onboardingPage.clickTheButton(buttonName);
    }

    @Then("the user should seen Personal Information section")
    public void theUserShouldSeenPersonalInformationSection() {
        onboardingPage.assertionForPersonalInformationHeadlineIsVisible();
    }

    @Then("the user should seen Company Registration section")
    public void theUserShouldSeenCompanyRegistrationSection() {
        onboardingPage.assertionForCompanyRegistrationHeadlineIsVisible();

    }

    @Then("the user should seen Resources section")
    public void theUserShouldSeenResourcesSection() {
        onboardingPage.assertionForResourcesHeadlineIsVisible();
    }

    @Then("the user should seen Completion Date at The Latest section")
    public void theUserShouldSeenCompletionDateAtTheLatestSection() {
        onboardingPage.assertionForCompletionDateAtTheLatestHeadlineIsVisible();
    }

    @Then("the user should seen Comments section")
    public void theUserShouldSeenCommentsSection() {
    onboardingPage.assertionForCommentsIsVisible();
    }


    @Then("The User verify that “Show Logs” button in the Action section is visible")
    public void theUserVerifyThatShowLogsButtonInTheActionSectionIsVisible() {
        onboardingPage.assertionForShowLogsIcon();
    }

    @And("The User click on {string} tab under the List of Onboardings headline")
    public void theUserClickOnTabUnderTheListOfOnboardingsHeadline(String tabName) {
        onboardingPage.clickOnDraftsTab();

    }

    @Then("The User verify that edit icon in the Actions section of first element of list should be visible")
    public void theUserVerifyThatEditIconInTheActionsSectionOfFirstElementOfListShouldBeVisible() {
        onboardingPage.assertionForShowLogsIcon();
    }

    @And("And The User click on edit icon in the Actions section of first element of list")
    public void andTheUserClickOnEditIconInTheActionsSectionOfFirstElementOfList() {
        onboardingPage.clickEditIconInTheTable();

    }

    @Then("The User verify that Personel Information section should be visible")
    public void theUserVerifyThatPersonelInformationSectionShouldBeVisible() {
        onboardingPage.assertionForPersonalInformationHeadlineIsVisible();
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

    @Then("the user should seen “Select File” button in the Attachments section")
    public void theUserShouldSeenSelectFileButtonInTheAttachmentsSection() {
        onboardingPage.assertionAttachmentUploadButton();
    }

    @Then("User should be able to view previously created onboarding item")
    public void userShouldBeAbleToViewPreviouslyCreatedOnboardingItem() {
        onboardingPage.assertionFirstRowOOnboardingList();
    }

    @And("The User click on the {string} link top left on the page")
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

    @Then("The user verify that the page redirect to Edit Onboarding Page")
    public void theUserVerifyThatThePageRedirectToEditOnboardingPage() {
        onboardingPage.assertionRedirectToEditOnboardingPage();
    }

    @And("The User Click on the show logs button of First Onboarding List Element")
    public void theUserClickOnTheShowLogsButtonOfFirstOnboardingListElement() {
        onboardingPage.clickOnShowLogIcon();
    }

    @Then("The User Verify that show logs modal opened")
    public void theUserVerifyThatShowLogsModalOpened() {
        onboardingPage.assertionShowLogsModal();
    }

    @Then("the User verify that Company Registration section is visible")
    public void theUserVerifyThatCompanyRegistrationSectionIsVisible() {
        onboardingPage.assertionForCompanyRegistrationHeadlineIsVisible();
    }

    @And("The user click on the delete icon in the Actions section of a first element of onboarding list")
    public void theUserClickOnTheDeleteIconInTheActionsSectionOfAFirstElementOfOnboardingList() {
        onboardingPage.clickDeleteIconOfTeFirstElementOfOnboardingList();

    }
    @And("The User Click on {string} button on the ant-popover")
    public void theUserClickOnButtonOnTheAntPopover(String buttonName) {
       onboardingPage.clickTheButton(buttonName);

    }

    @Then("The User verify that {string} button is working properly")
    public void theUserVerifyThatButtonIsWorkingProperly(String buttonName) {
        onboardingPage.clickTheButton(buttonName);
        onboardingPage.assertionCancelButtonWorkingProperly(buttonName);

    }

    @Then("The User verify that redirected to new onboarding create page")
    public void theUserVerifyThatRedirectedToNewOnboardingCreatePage() {
        onboardingPage.assertionRedirectToNewOnboardingPage();
    }

    @And("The User click on All tab under the List of Onboardings headline")
    public void theUserClickOnAllTabUnderTheListOfOnboardingsHeadline() {
        onboardingPage.clickOnDraftsTab();
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

    @Then("The User verify that {string} button should be clickable")
    public void theUserVerifyThatButtonShouldBeClickable(String buttonName) {
       onboardingPage.assertionXXXButtonClickable(buttonName);
    }

    @And("The user write a comment in the comment section bottom of the page")
    public void theUserWriteACommentInTheCommentSectionBottomOfThePage() {
        onboardingPage.inputCommentArea();
    }

    @Then("The User verify that the {string} button is clickable")
    public void theUserVerifyThatTheButtonIsClickable(String buttonName) {
        onboardingPage.assertionXXXButtonClickable(buttonName);
    }


    @And("the User Click on the {string} button")
    public void theUserClicksOnTheButton(String buttonName) {
        onboardingPage.clickTheButton(buttonName);
    }

    @Then("The User verify that the Delete Comment button is clickable")
    public void theUserVerifyThatTheDeleteCommentButtonIsClickable() {
        onboardingPage.assertionDeleteIconIsClickable();

    }

    @Then("The customize column button at the top right of the page must be clickable")
    public void theCustomizeColumnButtonAtTheTopRightOfThePageMustBeClickable() {
        onboardingPage.isClickableCustomizationColumns();
    }
    @Then("The {string} button at the top right of the page should be clickable")
    public void theButtonAtTheTopRightOfThePageShouldBeClickable(String buttonName) {
        onboardingPage.assertionXXXButtonClickable(buttonName);
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
        onboardingPage.clickTheButton(buttonName);
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
        onboardingPage.clickOnDraftsTab();
        onboardingPage.assertionNewOnboardingSavedInDraftsPage();
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
}
