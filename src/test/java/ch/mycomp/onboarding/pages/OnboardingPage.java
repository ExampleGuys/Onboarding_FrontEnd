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
}
