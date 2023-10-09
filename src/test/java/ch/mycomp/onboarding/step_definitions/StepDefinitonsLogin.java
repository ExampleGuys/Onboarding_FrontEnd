package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.LoginPage;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class StepDefinitonsLogin extends BrowserUtils {

    LoginPage loginPage = new LoginPage();

    @Given("The user goes to myCompSignin")
    public void theUserGoesToMyCompSignin() {
        Driver.get().get(ConfigurationReader.get("myCompSignin"));

    }

    @Then("the user verifies that the login screen visible after clicking on the login button.")
    public void theUserVerifiesThatTheLoginScreenVisibleAfterClickingOnTheLoginButton() {
       BrowserUtils.waitForVisibility(loginPage.signInFieldText,30);
       loginPage.signInFieldText.isEnabled();
    }

    @Then("the user verifies that all-login elements visible on the login box")
    public void theUserVerifiesThatAllLoginElementsVisibleOnTheLoginBox() {
        loginPage.signInFieldText.isDisplayed();

    }

    }
