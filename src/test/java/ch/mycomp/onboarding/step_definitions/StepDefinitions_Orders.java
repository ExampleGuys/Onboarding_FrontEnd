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
import org.openqa.selenium.Keys;
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

    @And("The user select the company from ddm")
    public void theUserSelectTheCompanyFromDdm() {
        WebElement button2 = Driver.get().findElement(By.cssSelector("#Order_company"));
        BrowserUtils.clickWithJS(button2);
        BrowserUtils.waitFor(1);
        button2.sendKeys("Test Techno Consultant" + Keys.ENTER);


    }
    @And("The user select the shipping adress from ddm")
    public void theUserSelectTheShippingAdressFromDdm() {
        WebElement button2 = Driver.get().findElement(By.cssSelector("#Order_delivery_address"));
        BrowserUtils.clickWithJS(button2);
        BrowserUtils.waitFor(2);
        button2.sendKeys("Avcilar" + Keys.ENTER);
        assertTrue(button2.isDisplayed());


    }
    @And("The user select the date from datapicker")
    public void theUserSelectTheDateFromDatapicker() {
        WebElement button2 = Driver.get().findElement(By.cssSelector("#Order_delivery_date"));
        BrowserUtils.clickWithJS(button2);
        BrowserUtils.waitFor(1);
        button2.sendKeys("31-10-2023" + Keys.ENTER);
        assertTrue(orderPage.datapicker.isEnabled());


    }
    @And("The user select the priority from the ddm")
    public void theUserSelectThePriorityFromTheDdm() {
        WebElement button2 = Driver.get().findElement(By.cssSelector("#Order_priority"));
        BrowserUtils.clickWithJS(button2);
        BrowserUtils.waitFor(1);
        button2.sendKeys("Normal" + Keys.ENTER);
        assertTrue(orderPage.priorityDdm.isEnabled());

    }
    @And("The user select the approver from the ddm")
    public void theUserSelectTheApproverFromTheDdm() {

        WebElement button2 = Driver.get().findElement(By.cssSelector("#Order_approver"));
        BrowserUtils.clickWithJS(button2);
        BrowserUtils.waitFor(1);
        button2.sendKeys("test@yopmail.com - Test Tester" + Keys.ENTER);


    }
    @And("The user select the contact from the ddm")
    public void theUserSelectTheContactFromTheDdm() {

        WebElement button2 = Driver.get().findElement(By.cssSelector("#Order_contactUser"));
        BrowserUtils.clickWithJS(button2);
        BrowserUtils.waitFor(5);
        button2.sendKeys("gpt" + Keys.ENTER);
    }
    @And("The user clicks the {string} icon.")
    public void theUserClicksTheIcon(String iconName) {
        orderPage.clickPlusAccordingToOptionName(iconName);
        BrowserUtils.waitFor(1);

    }
    @And("The user should be able to add data to {string}")
    public void theUserShouldBeAbleToAddDataTo(String placeHolder) {
        String fakeDataInfo = fakeName();
        orderPage.boxName(placeHolder).sendKeys(fakeDataInfo);

        BrowserUtils.waitFor(1);
        assertEquals(orderPage.boxName(placeHolder).getAttribute("value"), fakeDataInfo);

    }


}