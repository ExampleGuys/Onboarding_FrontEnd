package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.LoginPage;
import ch.mycomp.onboarding.pages.OnboardingPage;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StepDefinitions_Onboarding {

    LoginPage loginPage = new LoginPage();

    OnboardingPage onboardingPage=new OnboardingPage();

    @Given("The user goes to staging url")
    public void the_user_goes_to_staging_url() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @And("User logs into the web application with the given test data as a requester")
    public void userLogsIntoTheWebApplicationWithTheGivenTestDataAsARequester() {
    loginPage.login();
    }

    @And("The User click on the {string} section in the Navigation Menu")
    public void theUserClickOnTheSectionInTheNavigationMenu(String navigationName) {
        WebElement sidebar = Driver.get().findElement(By.xpath("//span[text()='" + navigationName + "']"));
        BrowserUtils.clickWithJS(sidebar);
    }

    @And("The user click on the {string} button top right corner of the page")
    public void theUserClickOnTheButton(String buttonName) {
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        BrowserUtils.clickWithJS(button);

    }

    @Then("the user should seen Personal Information section")
    public void theUserShouldSeenPersonalInformationSection() {
        assert (onboardingPage.headlinePersonalInformation.isDisplayed());
    }
}
