package ch.mycomp.onboarding.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnboardingPage extends BasePage{

    // Onboarding>Create new Onboarding> Pesonal Information Headline
    @FindBy(xpath = "//h2[text()='Personal Information']")
    public WebElement headlinePersonalInformation;
}
