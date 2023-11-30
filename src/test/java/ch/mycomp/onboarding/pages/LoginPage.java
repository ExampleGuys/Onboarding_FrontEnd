package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
//import jdk.internal.event.Event;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.*;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//div[@class='ant-card ant-card-bordered css-14bavl3']")
    public WebElement signInModal;


    //Email input
    @FindBy(id = "email")
    public WebElement emailInput;

    // Password Input
    @FindBy(id = "password")
    public WebElement passwordInput;

    // SignIn Button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    // Forgot Link
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/main/div/div[2]/form/a[1]")
    public WebElement forgotLink;

    // Forgot Password page
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/main/div/div[1]/div/div")
    public WebElement forgotPasswordPage;

    // Reset Password button
    @FindBy(xpath = "//*[text()='Reset Password']")
    public WebElement resetPasswordButton;

    // Eye-icon of password text field
    @FindBy(xpath = "//*[@aria-label='eye-invisible']")
    public WebElement eyeIconforPassword;

    // Password in encrypted
    @FindBy(xpath = "(//div[@class='ant-form-item-control-input-content'])[2]")
    public WebElement passwordInEncrypted;

    public void login(String email, String password) {
        emailInput.sendKeys(ConfigurationReader.get(email));
        passwordInput.sendKeys(ConfigurationReader.get(password));
        signInButton.click();
    }

    public void checkLoginSuccessToastMessage() {
        String actualToastMessage = toastMessageText();
        String expectedToastMessage = "You've successfully signed in";

        System.out.println("actualToastMessage = " + actualToastMessage);
        System.out.println("expectedToastMessage = " + expectedToastMessage);

        assertEquals(expectedToastMessage,actualToastMessage);
    }

    public void theUserVerifyThatTheSignInModalIsVisible(){
        BrowserUtils.waitForVisibility(signInModal,30);
        assertTrue(signInModal.isDisplayed());
    }

    public void theUserVerifyThatTheEmailTextFieldShouldBeClicakble() {
       assertTrue(emailInput.isEnabled());
    }

    public void TheUserVerifyThatThePasswordTextFieldShouldBeClickable() {
        assertTrue(passwordInput.isEnabled());
    }

    public void TheUserVerifyThatTheForgetPasswordLinkShouldBeClickable(){
        assertTrue(forgotLink.isEnabled());
    }

    public void TheForgetPasswordLinkShouldBeVisible() {
        assertTrue(forgotLink.isDisplayed());


    }
    public void theUserEnterPasswordInPasswordArea() {

        passwordInput.sendKeys("AB123@ab");
    }

    public void TheUserVerifyThatThePasswordIsWrittenInTheEncryptedForm() {
        String expectedPassword = "";
        assertEquals (expectedPassword,passwordInEncrypted.getText());
        System.out.println("Actual Password : " + passwordInEncrypted.getText());


    }

    public void theUserVerifyThatTheEyeIconShouldBeVisibleOnThePasswordTextField() {
        assertTrue(eyeIconforPassword.isDisplayed());
    }

    public void theUserClickOnTheEyeIconThePasswordTextField() {
       BrowserUtils.clickWithJS(eyeIconforPassword);
    }

    public void theUserVerifyThatThePasswordIsVisible() {
        String expectedPassword = "AB123@ab";
        assertEquals (expectedPassword,passwordInput.getAttribute("value"));
        System.out.println("Actual Password : " + passwordInput.getAttribute("value"));

    }

    public void theUserClickOnForgotPasswordLinkInTheSignInPage() {
        BrowserUtils.clickElement(forgotLink,20);
    }

    public void theUserVerifyThatTheForgotPasswordPageIsOpen() {
        assertTrue(forgotPasswordPage.isDisplayed());
    }

    public void connotLogin(String email, String password, String warningMessage) {
        emailInput.sendKeys(ConfigurationReader.get(email));
        passwordInput.sendKeys(ConfigurationReader.get(password));
        signInButton.click();

        assertEquals(warningMessage,toastMessageText());
    }

    public void theUserVerifyThatResetPasswordButtonShouldBeClickable() {
        assertTrue(resetPasswordButton.isEnabled());
    }
}
