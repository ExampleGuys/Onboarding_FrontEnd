package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class OnboardingPage extends BasePage{

    // Onboarding>Create new Onboarding> Personal Information Headline
    @FindBy(xpath = "//h2[text()='Personal Information']")
    public WebElement headlinePersonalInformation;
    public void assertionForPersonalInformationHeadlineIsVisible(){
        assert(headlinePersonalInformation.isDisplayed());
    }

    // Onboarding>Create new Onboarding> Company Registration Headline
    @FindBy(xpath = "//h2[text()='Company Registration']")
    public WebElement headlineCompanyRegistration;
    public void assertionForCompanyRegistrationHeadlineIsVisible(){
        assert(headlineCompanyRegistration.isDisplayed());
    }
    // Onboarding>Create new Onboarding> Resources Headline
    @FindBy(xpath = "//h2[text()='Resources']")
    public WebElement headlineResources;

    public void assertionForResourcesHeadlineIsVisible(){
        assert(headlineResources.isDisplayed());
    }
    // Onboarding>Create new Onboarding> Completion Date at Latest Headline
    @FindBy(xpath = "//h2[text()='Completion Date at The Latest']")
    public WebElement headlineCompletionDateAtTheLatest;

    public void assertionForCompletionDateAtTheLatestHeadlineIsVisible(){
        assert(headlineCompletionDateAtTheLatest.isDisplayed());
    }
    // Onboarding>Create new Onboarding> Comments Headline
    @FindBy(xpath = "//h2[text()='Comments']")
    public WebElement headlineComments;

    public void assertionForCommentsIsVisible(){
        assert(headlineComments.isDisplayed());
    }
    // Onboarding> List Of OnBoarding > Show Logs button
    @FindBy(xpath = "(//*[@class='ant-space-item'])[4]")
    public WebElement buttonShowLogs;

    public void assertionForShowLogsIcon(){
        assert(buttonShowLogs.isDisplayed());
    }

    @FindBy(xpath = "//div[text()='Drafts']")
    public WebElement draftsTab;

    public void clickOnDraftsTab(){
        draftsTab.click();
    }

    @FindBy (xpath = "(//tbody[@class='ant-table-tbody']//tr[1]/td[9]//button)[2]")
    public WebElement editIconInTheTableFirstRowInTheActionSection;

    public void clickEditIconInTheTable(){
       editIconInTheTableFirstRowInTheActionSection.click();

    }

    @FindBy(xpath = "//h2[text()='Attachments']")
    public WebElement headlineAttechmentsSection;

    public void assertionForAttechmentsHeadlineIsVisible(){
        assert(headlineAttechmentsSection.isDisplayed());
    }

    @FindBy (xpath = "//span[@aria-label='upload']")
    public WebElement attahmentUpload;

    public void assertionAttachmentUploadButton(){
        assert (attahmentUpload.isDisplayed());
    }
    @FindBy(xpath = "//tbody[@class='ant-table-tbody']//tr[1]")
    public WebElement firstRowinTheListOfOnboardingTable;
    public void assertionFirstRowOOnboardingList(){
        assert firstRowinTheListOfOnboardingTable.isDisplayed();
    }

    @FindBy(xpath = "//a[text()='Onboardings']")
    public WebElement linkOfOnboardings;

    public void clickOnLinkOfOnboardings(){
        BrowserUtils.clickElement(linkOfOnboardings,20);    }
    public void assertionLinkOfOnboardings(){
        BrowserUtils.clickElement(linkOfOnboardings,20);
        String expectedUrl = "https://staging.onboarding.mycomp.ch/onboarding";
        String actualUrl=Driver.get().getCurrentUrl();
        assertEquals(expectedUrl,actualUrl);

    }
}
