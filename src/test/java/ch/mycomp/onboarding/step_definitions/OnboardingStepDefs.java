package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.OnboardingPage;
import ch.mycomp.onboarding.pages.OrderPage;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.message.ReusableMessage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OnboardingStepDefs {



    OnboardingPage onboardingPage = new OnboardingPage();
    OrderPage orderPage = new OrderPage();

    @Given("The user goes to staging url")
    public void the_user_goes_to_staging_url() {
        Driver.get().get(ConfigurationReader.get("url"));
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
        onboardingPage.assertionForPersonalInformationHeadlineIsVisible();
    }

    @Then("the user should seen Company Registration section")
    public void theUserShouldSeenCompanyRegistrationSection() {
        onboardingPage.assertionForCompanyRegistrationHeadlineIsVisible();

    }

    @Then("the user should seen Resources section")
    public void theUserShouldSeenResourcesSection() {
        onboardingPage.assertionForResourcesHeadlineIsVisible();
    }

    @Then("the user should seen Completion Date at The Latest section")
    public void theUserShouldSeenCompletionDateAtTheLatestSection() {
        onboardingPage.assertionForCompletionDateAtTheLatestHeadlineIsVisible();
    }

    @Then("the user should seen Comments section")
    public void theUserShouldSeenCommentsSection() {
    onboardingPage.assertionForCommentsIsVisible();
    }


    @Then("The User verify that “Show Logs” button in the Action section is visible")
    public void theUserVerifyThatShowLogsButtonInTheActionSectionIsVisible() {
        onboardingPage.assertionForShowLogsIcon();
    }

    @And("The User click on {string} tab under the List of Onboardings headline")
    public void theUserClickOnTabUnderTheListOfOnboardingsHeadline(String tabName) {
        onboardingPage.clickOnDraftsTab();

    }

    @Then("The User verify that edit icon in the Actions section of first element of list should be visible")
    public void theUserVerifyThatEditIconInTheActionsSectionOfFirstElementOfListShouldBeVisible() {
        onboardingPage.assertionForShowLogsIcon();
    }

    @And("And The User click on edit icon in the Actions section of first element of list")
    public void andTheUserClickOnEditIconInTheActionsSectionOfFirstElementOfList() {
        onboardingPage.clickEditIconInTheTable();

    }

    @Then("The User verify that Personel Information section should be visible")
    public void theUserVerifyThatPersonelInformationSectionShouldBeVisible() {
        onboardingPage.assertionForPersonalInformationHeadlineIsVisible();
    }

    @Then("The User verify that Resources section should be visible")
    public void theUserVerifyThatResourcesSectionShouldBeVisible() {
        onboardingPage.assertionForResourcesHeadlineIsVisible();
    }
}
