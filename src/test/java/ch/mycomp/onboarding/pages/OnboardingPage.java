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

    @FindBy(xpath = "//h2[text()='Resources']")
    public WebElement headlineResources;

    public void assertionForResourcesHeadlineIsVisible(){
        assert(headlineResources.isDisplayed());
    }
    @FindBy(xpath = "//h2[text()='Completion Date at The Latest']")
    public WebElement headlineCompletionDateAtTheLatest;

    public void assertionForCompletionDateAtTheLatestHeadlineIsVisible(){
        assert(headlineCompletionDateAtTheLatest.isDisplayed());
    }
    @FindBy(xpath = "//h2[text()='Comments']")
    public WebElement headlineComments;

    public void assertionForCommentsIsVisible(){
        assert(headlineComments.isDisplayed());
    }
}
