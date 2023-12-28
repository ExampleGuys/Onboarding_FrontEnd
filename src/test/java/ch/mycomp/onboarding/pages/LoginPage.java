package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
//import jdk.internal.event.Event;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.*;

public class LoginPage extends BasePage {




    //Email input
    @FindBy(id = "email")
    public WebElement emailInput;

    // Password Input
    @FindBy(id = "password")
    public WebElement passwordInput;

    // SignIn Button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;



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


    public void connotLogin(String email, String password, String warningMessage) {
        emailInput.sendKeys(ConfigurationReader.get(email));
        passwordInput.sendKeys(ConfigurationReader.get(password));
        signInButton.click();

        assertEquals(warningMessage,toastMessageText());
    }

}
