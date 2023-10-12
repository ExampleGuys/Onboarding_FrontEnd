package ch.mycomp.onboarding.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void assertionForTotalAmountOfPage(){
        assert(totalNumber.isDisplayed());
    }


}
