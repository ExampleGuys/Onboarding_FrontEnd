package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    @FindBy(xpath = "//a[@href='/sign-up']")
    public WebElement signUpLinkLocator;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement buttonSignUp;


    public void checkSignUpButton() {
        BrowserUtils.verifyElementDisplayed(buttonSignUp);
    }
}
