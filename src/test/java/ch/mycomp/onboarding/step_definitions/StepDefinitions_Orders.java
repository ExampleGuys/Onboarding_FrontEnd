package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.LoginPage;
import ch.mycomp.onboarding.pages.OrderPage;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.module.Configuration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StepDefinitions_Orders extends BrowserUtils {

    LoginPage loginPage = new LoginPage();

    OrderPage orderPage = new OrderPage();

    @When("user logs in with the valid credentials")
    public void user_logs_in_with_the_valid_credentials() {

        // signInPage.emailSaid.sendKeys(ConfigReader.getProperty("email));
        //  signInPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));

        loginPage.login(ConfigurationReader.get("emailSaid"), ConfigurationReader.get("passwordSaid"));
        loginPage.signInButton.click();
        BrowserUtils.waitFor(3);

    }

    @And("Click on the {string} section in the Navigation Menu")
    public void clickOnTheSectionInTheNavigationMenu(String navigationName) {

        WebElement sidebar = Driver.get().findElement(By.xpath("//span[text()='" + navigationName + "']"));
        BrowserUtils.clickWithJS(sidebar);
        BrowserUtils.waitFor(3);

    }

    @And("The user click on the {string} button.")
    public void theUserClickOnTheButton(String buttonName) {
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        BrowserUtils.clickWithJS(button);

    }

    @Then("the user should be redirected to the new order creation page")
    public void theUserShouldBeRedirectedToTheNewOrderCreationPage() {
        assertTrue(Driver.get().getCurrentUrl().contains("create"));

    }

    @And("The user should be able to add data to {string} with {string}")
    public void theUserShouldBeAbleToCreateNewCompany(String placeHolder, String companyNAme) {
        String fakeDataInfo = fakeName();
        orderPage.boxName(placeHolder).sendKeys(companyNAme);
        BrowserUtils.waitFor(1);
        assertEquals(orderPage.boxName(placeHolder).getAttribute("value"), companyNAme);

    }

    @And("The user should be able to see a warning message as {string}")
    public void theUserShouldBeAbleToSeeAWarningMessageAs(String message) {
        assertEquals(orderPage.getPopupsMessage(), message);


    }
}