package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrdersStepDefs extends ObjectIndex {


    @When("user logs in with the valid credentials as {string} and {string}")
    public void userLogsInWithTheValidCredentialsAsAnd(String username, String password) {
        loginPage.login(username,password);
    }

    @And("Click on the {string} section in the Navigation Menu")
    public void clickOnTheSectionInTheNavigationMenu(String navigationName) {
        orderPage.clickOnTheSectionInTheNavigationMenu(navigationName);

    }

    @And("The user click on the {string} button.")
    public void theUserClickOnTheButton(String buttonName) {
       contactsPage.clickButton(buttonName);
    }

    @Then("The User should be redirected to the new order creation page")
    public void theUserShouldBeRedirectedToTheNewOrderCreationPage() {
        orderPage.theUserShouldBeRedirectedToTheNewOrderCreationPage();

    }

    @And("The user should be able to add data to {string} with {string}")
    public void theUserShouldBeAbleToCreateNewCompany(String placeHolder, String companyName) {
        orderPage.theUserShouldBeAbleToCreateNewCompany(placeHolder,companyName);

    }

    @And("The user should be able to see a warning message as {string}")
    public void theUserShouldBeAbleToSeeAWarningMessageAs(String message) {
        orderPage.theUserShouldBeAbleToSeeAWarningMessageAs(message);

    }

    @And("The user select the company from ddm")
    public void theUserSelectTheCompanyFromDdm() {
        orderPage.theUserSelectTheCompanyFromDdm();


    }

    @And("The user select the shipping adress from ddm")
    public void theUserSelectTheShippingAdressFromDdm() {
        orderPage.theUserSelectTheShippingAdressFromDdm();

    }

    @And("The user select the date from datapicker")
    public void theUserSelectTheDateFromDatapicker() {
        orderPage.theUserSelectTheDateFromDatapicker();

    }

    @And("The user select the priority from the ddm")
    public void theUserSelectThePriorityFromTheDdm() {
        orderPage.theUserSelectThePriorityFromTheDdm();

    }

    @And("The user select the approver from the ddm")
    public void theUserSelectTheApproverFromTheDdm() {
        orderPage.theUserSelectTheApproverFromTheDdm();

    }

    @And("The user select the contact from the ddm")
    public void theUserSelectTheContactFromTheDdm() {
        orderPage.theUserSelectTheContactFromTheDdm();

    }

    @And("The user clicks the {string} icon.")
    public void theUserClicksTheIcon(String iconName) {
        orderPage.clickPlusAccordingToOptionName(iconName);
    }

    @And("The user should be able to add data to {string}")
    public void theUserShouldBeAbleToAddDataTo(String placeHolder) {
        orderPage.theUserShouldBeAbleToAddDataTo(placeHolder);


    }

    @And("The user should be able to add Email adress to {string}")
    public void theUserShouldBeAbleToAddEmailAdressTo(String placeHolder) {
        orderPage.theUserShouldBeAbleToAddEmailAdressTo(placeHolder);

    }

    @Then("the user should be able to redirect back to the List of Orders page again.")
    public void theUserShouldBeAbleToRedirectBackToTheListOfOrdersPageAgain() {
        orderPage.theUserShouldBeAbleToRedirectBackToTheListOfOrdersPageAgain();


    }


    @And("user fills in all required fields properly")
    public void userFillsInAllRequiredFieldsProperly() {
        orderPage.userFillsInAllRequiredFieldsProperly();

    }

    @Then("The user should be able to type up to fivehundred characters in the Description field.")
        public void theUserShouldBeAbleToTypeUpToFivehundredCharactersInTheDescriptionField() {
        orderPage.theUserShouldBeAbleToTypeUpToFivehundredCharactersInTheDescriptionField();
    }

    @Then("The user should seen New Order Information section")
    public void theUserShouldSeenNewOrderInformationSection() {
        orderPage.theUserShouldSeenNewOrderInformationSection();
    }

    @Then("The user should be able to see {string} section")
    public void theUserShouldBeAbleToSeeSection(String header) {
        orderPage.headerConfirmation(header);


    }

    @Then("Then user should be able to click on the Delete Comment icon")
    public void thenUserShouldBeAbleToClickOnTheDeleteCommentIcon() {

        orderPage.thenUserShouldBeAbleToClickOnTheDeleteCommentIcon();

    }

    @And("The user click on the delete icon in the Actions section of a first element of orders list")
    public void theUserClickOnTheDeleteIconInTheActionsSectionOfAFirstElementOfOrdersList() {
        onboardingPage.clickDeleteIconOfTeFirstElementOfOnboardingList();
    }

    @Then("The user verify that created order is deleted")
    public void theUserVerifyThatCreatedOrderIsDeleted() {
        onboardingPage.assertionTotalOnboardingItemIsChanged();
    }


    @Then("user should be able to enter information in the {string} box")
    public void userShouldBeAbleToEditInformationInTheBox(String placeHolder) {
        orderPage.userShouldBeAbleToEditInformationInTheBox(placeHolder);

    }

    @Then("the user should be able to choose an option as catagory ddm on the edit order page.")
    public void theUserShouldBeAbleToChooseAnOptionAsCatagoryDdmOnTheEditOrderPage() {
        orderPage.theUserShouldBeAbleToChooseAnOptionAsCatagoryDdmOnTheEditOrderPage();


    }

    @Then("the user should be able to choose an option from Resource dropdown menu on the edit order page.")
    public void theUserShouldBeAbleToChooseAnOptionFromResourceDropDowmMenuOnTheEditOrderPage() {
        orderPage.theUserShouldBeAbleToChooseAnOptionFromResourceDropDowmMenuOnTheEditOrderPage();


    }

    @Then("the user should be able to choose a quantity under the Resource, on the Edit Order page")
    public void theUserShouldBeAbleToChooseAQuantityUnderTheResourceOnTheEditOrderPage() {
        orderPage.theUserShouldBeAbleToChooseAQuantityUnderTheResourceOnTheEditOrderPage();


    }

    @And("The user select the employee from ddm")
    public void theUserSelectTheEmployeeFromDdm() {
        orderPage.theUserSelectTheEmployeeFromDdm();

    }
}