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

    @And("The user click on the {string} button")
    public void theUserClickOnTheButton(String buttonName) {
       orderPage.clickButton(buttonName);
    }


    @And("The user select the priority")
    public void theUserSelectThePriority() {
        orderPage.selectPriority();

    }
    @And("The user select employee as a {string} from ddm")
    public void theUserSelectTheEmployeeFromDdm(String employee) {
        orderPage.theUserSelectTheEmployeeFromDdm(employee);

    }
    @Then("The user verify that created order is visible")
    public void theUserVerifyThatCreatedOrderIsVisible() {
        companiesPage.theUserVerifyThatCreatedUnitIsVisible();
    }


    @And("The user select Preffered Delivery Date")
    public void theUserSelectPrefferedDeliveryDate() {
        orderPage.selectPrefferedDeliveryDate();

    }

    @And("The user select a shipping site as a {string}")
    public void theUserSelectAShippingSiteAsA(String site) {
        orderPage.selectSite(site);
    }

    @And("The user enter a Reason for Request")
    public void theUserEnterAReasonForRequest() {
        orderPage.enterReasonForRequest();
    }

    @And("The user select a Line Manager as a {string}")
    public void theUserSelectALineManagerAsA(String lineManager) {
        orderPage.selectLineManager(lineManager);
    }

    @And("The user select a Supplier as a {string}")
    public void theUserSelectASupplierAsA(String supplierName) {
        orderPage.selectSupplier(supplierName);
    }

    @And("The user select Resource as a {string} in the order modal")
    public void theUserSelectResourceAsAInTheOrderModal(String resourceName) {
        orderPage.selectResource(resourceName);
    }

    @And("The user select Resource Item as a {string} in the order modal")
    public void theUserSelectResourceItemAsAInTheOrderModal(String resourceItemName) {
        orderPage.selectResourceItem(resourceItemName);
    }

    @And("The user selects a Company from company dropdown {string} for create order")
    public void theUserSelectsACompanyFromCompanyDropdownForCreateOrder(String companyName) {
        orderPage.selectCompany(companyName);
    }

    @And("The user select investment type as a new investment")
    public void theUserSelectInvestmentTypeAsANewInvestment() {
        orderPage.theUserSelectInvestmentTypeAsANewInvestment();
    }
}