package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class OnboardingPage extends BasePage {
    public static String totalNumberOfItems;

    // Onboarding>Create new Onboarding> Personal Information Headline
    @FindBy(xpath = "//h2[text()='Personal Information']")
    public WebElement headlinePersonalInformation;

    // Onboarding>Create new Onboarding> Company Registration Headline
    @FindBy(xpath = "//h2[text()='Company Registration']")
    public WebElement headlineCompanyRegistration;

    // Onboarding>Create new Onboarding> Resources Headline
    @FindBy(xpath = "//h2[text()='Resources']")
    public WebElement headlineResources;

    // Onboarding>Create new Onboarding> Completion Date at Latest Headline
    @FindBy(xpath = "//h2[text()='Completion Date at The Latest']")
    public WebElement headlineCompletionDateAtTheLatest;

    // Onboarding>Create new Onboarding> Comments Headline
    @FindBy(xpath = "//h2[text()='Comments']")
    public WebElement headlineComments;

    // Onboarding> List Of OnBoarding > Show Logs button
    @FindBy(xpath = "(//*[@class='ant-space-item'])[4]")
    public WebElement buttonShowLogs;

    @FindBy(xpath = "//div[text()='Drafts']")
    public WebElement draftsTab;

    @FindBy(xpath = "(//tbody[@class='ant-table-tbody']//tr[1]/td[9]//button)[2]")
    public WebElement editIconInTheTableFirstRowInTheActionSection;
    @FindBy(xpath = "//h2[text()='Attachments']")
    public WebElement headlineAttechmentsSection;

    @FindBy(xpath = "//span[@aria-label='upload']")
    public WebElement attahmentUpload;

    @FindBy(xpath = "//tbody[@class='ant-table-tbody']//tr[1]")
    public WebElement firstRowinTheListOfOnboardingTable;

    @FindBy(xpath = "//a[text()='Onboardings']")
    public WebElement linkOfOnboardings;

    @FindBy(xpath = "//div[text()='Completed Requests']")
    public WebElement completedRequestsTab;

    @FindBy(xpath = "(//tbody[@class='ant-table-tbody']//tr[1]/td[9]//button)[2]")
    public WebElement iconViewMoreFirstRowofTable;
    @FindBy(xpath = "//*[@class='ant-modal-content']")
    WebElement modalShowLogs;
    @FindBy(xpath = "(//tbody[@class='ant-table-tbody']//tr[1]/td[9]//button)[3]")
    static WebElement deleteIconOfTheFirstElementOfOnboardingList;

    @FindBy(xpath = "//*[text()='Cancel']")
    WebElement buttonCancel;

    @FindBy(xpath = "//div[text()='All']")
    public WebElement AllTab;

    @FindBy(xpath = "//div[text()='Completed Requests']")
    public WebElement CompletedTab;

    @FindBy(xpath = "//li[@class='ant-pagination-total-text']")
    public static WebElement totalOnboardingSection;


    @FindBy(xpath = "//input[@placeholder='Enter a comment']")
    public WebElement inputCommentArea;

    @FindBy(xpath = "(//span[@aria-label='delete'])[6]")
    public WebElement deleteIconInTheCommentsSection;


    public void assertionDeleteIconIsClickable(){
        assert (deleteIconInTheCommentsSection.isEnabled());
    }

    public void assertionForPersonalInformationHeadlineIsVisible() {
        assert (headlinePersonalInformation.isDisplayed());
    }
    public void assertionForCompanyRegistrationHeadlineIsVisible() {
        Assert.assertTrue(headlineCompanyRegistration.isDisplayed());
    }
    public void assertionForResourcesHeadlineIsVisible() {
        Assert.assertTrue(headlineResources.isDisplayed());
    }
    public void assertionForCompletionDateAtTheLatestHeadlineIsVisible() {
        Assert.assertTrue(headlineCompletionDateAtTheLatest.isDisplayed());
    }
    public void assertionForCommentsIsVisible() {
        assert (headlineComments.isDisplayed());
    }
    public void assertionForShowLogsIcon() {
        assert (buttonShowLogs.isDisplayed());
    }
    public void clickOnDraftsTab() {
        BrowserUtils.clickElement(draftsTab,20);
    }
    public void clickEditIconInTheTable() {
        BrowserUtils.clickElement(editIconInTheTableFirstRowInTheActionSection,20);
    }
    public void assertionForAttechmentsHeadlineIsVisible() {
        assert (headlineAttechmentsSection.isDisplayed());
    }
    public void assertionAttachmentUploadButton() {
        assert (attahmentUpload.isDisplayed());
    }
    public void assertionFirstRowOOnboardingList() {
        assert firstRowinTheListOfOnboardingTable.isDisplayed();
    }
    public void clickOnLinkOfOnboardings() {
        BrowserUtils.clickElement(linkOfOnboardings, 20);
    }
    public void assertionLinkOfOnboardings() {
        BrowserUtils.clickElement(linkOfOnboardings, 20);
        String expectedUrl = "https://staging.onboarding.mycomp.ch/onboarding";
        String actualUrl = Driver.get().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }
    public void clickOnCompletedRequestsTab() {
        BrowserUtils.clickElement(completedRequestsTab, 20);
    }
    public void clickOnViewMoreIcon() {
        clickOnCompletedRequestsTab();
        BrowserUtils.waitForPageToLoad(3);
        BrowserUtils.clickElement(iconViewMoreFirstRowofTable,20);
    }
    public void assertionRedirectToEditOnboardingPage() {
        BrowserUtils.waitForPageToLoad(3);
        assertionForPersonalInformationHeadlineIsVisible();
    }

    public void clickOnShowLogIcon() {
        BrowserUtils.clickElement(buttonShowLogs, 20);
    }
    public void assertionShowLogsModal() {
        assert(modalShowLogs.isDisplayed());
    }
    public void clickDeleteIconOfTeFirstElementOfOnboardingList() {
        totalNumberOfItems = totalOnboardingSection.getText();
        BrowserUtils.clickElement(deleteIconOfTheFirstElementOfOnboardingList, 20);
    }
    public void assertionCancelButtonWorkingProperly(String buttonName) {
        assert (!(buttonCancel.isDisplayed()));
    }

    public void assertionRedirectToNewOnboardingPage() {
        String expectedUrl = "https://staging.onboarding.mycomp.ch/onboarding/create";
        String actualUrl = Driver.get().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }
    public void clickOnAllTab() {
        BrowserUtils.clickElement(AllTab,20);
    }

    public void assertionAllOnboardingsVisible() {
        String expectedUrl = "https://staging.onboarding.mycomp.ch/onboarding?page=&isCompleted=";
        String actualUrl = Driver.get().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    public void assertionDraftOnboardingsVisible() {
        String expectedUrl = "https://staging.onboarding.mycomp.ch/onboarding?page=&isCompleted=false";
        String actualUrl = Driver.get().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }
    public void clickOnCompletedTab() {
        BrowserUtils.clickElement(CompletedTab,20);
    }

    public void assertionCompletedOnboardingsVisible() {
        String expectedUrl = "https://staging.onboarding.mycomp.ch/onboarding?page=&isCompleted=true";
        String actualUrl = Driver.get().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }
    public void assertionTotalOnboardingItemIsChanged() {
        String totalNumberOfItemsActual = totalOnboardingSection.getText();
        Assert.assertEquals(totalNumberOfItems, totalNumberOfItemsActual);
    }

    public void clickTheButton(String buttonName) {
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        BrowserUtils.clickWithJS(button);
    }

    public void assertionXXXButtonClickable(String buttonName) {
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        assert (button.isEnabled());
    }
    public void inputCommentArea() {
        inputCommentArea.sendKeys("Hello");
    }


}