package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    @FindBy(xpath = "//a[@href='/sign-up']")
    public WebElement signUpLinkLocator;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement buttonSignUp;

    @FindBy(xpath = "(//*[@viewBox='64 64 896 896'])[17]")
    public WebElement generatePasswordNewUser;

    @FindBy(xpath = ("//*[@autocomplete='new-password']"))
    public WebElement passwordTextFieldNewUser;

    @FindBy(xpath = ("//*[@placeholder='Enter password again']"))
    public WebElement passwordAgainTextFieldNewUser;

    public void checkSignUpButton() {
        BrowserUtils.verifyElementDisplayed(buttonSignUp);
    }

    @FindBy(xpath = ("//input[@placeholder='Enter first name']"))
    public WebElement firstNameTextFieldNewUser;

}
