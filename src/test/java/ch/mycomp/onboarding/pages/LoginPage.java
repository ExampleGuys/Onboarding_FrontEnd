package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
//import jdk.internal.event.Event;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.*;

public class LoginPage extends BasePage {


    // MyComp SignIn page
    @FindBy(xpath = "//div[@class='ant-card-head-title']")
    public WebElement myCompUrl;



    //Main Page
    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/img")
    public WebElement myCompPTitle;

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


    //Forgot Page Email
    @FindBy(id = "//a[text()='Forgot password']")
    public WebElement ForgotPasswordLink;


    // Reset Password button
    @FindBy(xpath = "//*[text()='Reset Password']")
    public WebElement resetPasswordButton;

    // Reset password email message (Password link sent to your email)
    @FindBy(xpath = "//div[@class ='go3958317564']")
    public WebElement toastMessageResetPassword;

    // All login-related elements
    @FindBy(xpath = "//div[@class=\"ant-card ant-card-bordered css-14bavl3\"]")
    public WebElement allLoginElements;

    //Toast Message
    @FindBy(xpath = "//div[@class ='go3958317564']")
    public WebElement toastMessages;

    //Error Message for the Invalid Email (Email must be a valid email)
    @FindBy(xpath = "//div[@class ='go3958317564']")
    public WebElement WrongEmailToastMessage;

    //Toast message for the wrong password (Credentials did not match)
    @FindBy(xpath = "//div[@class ='go3958317564']")
    public WebElement WrongPasswordToastMessage;

    //Toast message for the invalid email and the wrong password (Credentials did not match)
    @FindBy(xpath = "//div[@class ='go3958317564']")
    public WebElement invalidEmailWrongPasswordToastMessage;

    // Toast message for empty email field (Please fill out all required fields correctly)
    @FindBy(xpath = "//div[@class ='go3958317564']")
    public WebElement emptyEmailFieldToastMessage;

    // Toast message for empty password field (Please fill out all required fields correctly)
    @FindBy(xpath = "//div[@class ='go3958317564']")
    public WebElement emptyPasswordFieldToastMessage;

    // Eye-icon of password text field
    @FindBy(xpath = "//*[@aria-label='eye-invisible']")
    public WebElement eyeIconforPassword;

    // Password in encrypted
    @FindBy(xpath = "(//div[@class='ant-form-item-control-input-content'])[2]")
    public WebElement passwordInEncrypted;

    //  Unencrypted password

    @FindBy(xpath = "//input[@autocomplete='current-password']")
    public WebElement passwordInUnencrypted;


    @FindBy(xpath = "(//a[@class='link-desc'])[1]")
    public WebElement forgotPasswordLink;




    public void login() {

        emailInput.sendKeys(ConfigurationReader.get("superAdminUser"));
        passwordInput.sendKeys(ConfigurationReader.get("superAdmin_password"));
        signInButton.click();


    }

    public void login(String email, String password) {
        emailInput.sendKeys(ConfigurationReader.get(email));
        passwordInput.sendKeys(ConfigurationReader.get(password));
        signInButton.click();
    }


    public void toastMessagesSuccesfullySignedIn() {

        emailInput.sendKeys(ConfigurationReader.get("superAdminUser"));
        passwordInput.sendKeys(ConfigurationReader.get("superAdmin_password"));
        signInButton.click();
        String succesfullySignedIn = "You've successfully signed in";

    }

    public void toastMessagesInvalidEmail(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        String invalidEmailMessage = "Email must be a valid email";


    }

    public void toastMessagesWrongPassword() {

        emailInput.sendKeys(ConfigurationReader.get("superAdminUser"));
        passwordInput.sendKeys("12345678");
        String wrongPasswordMessage = "Credentials did not match";


    }

    public void emptyEmailTextField() {

        // loginpage.emailInput.sendKeys(ConfigurationReader.get("emailAhmet"));
        passwordInput.sendKeys(ConfigurationReader.get("superAdmin_password"));
        String emptyEmailTextFieldMessage = "Please fill out all required fields correctly";


    }

    public void emptyPasswordTextField() {

        emailInput.sendKeys(ConfigurationReader.get("superAdminUser"));
        // loginpage.passwordInput.sendKeys(ConfigurationReader.get("passwordAhmet"));
        String emptyPasswordTextFieldMessage = "Please fill out all required fields correctly";


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
