package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.OnboardingPage;
import ch.mycomp.onboarding.pages.OrderPage;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.message.ReusableMessage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OnboardingStepDefs {



    static OnboardingPage onboardingPage = new OnboardingPage();
    OrderPage orderPage = new OrderPage();

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
}
