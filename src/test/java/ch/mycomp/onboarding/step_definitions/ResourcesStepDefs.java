package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static ch.mycomp.onboarding.utilities.Driver.driver;
import static org.junit.Assert.assertEquals;

public class ResourcesStepDefs extends ObjectIndex {

    @Given("The user goes to the sign-in page")
    public void theUserGoesToTheSignInPage() {
     resourcesPage.theUserGoesToTheSignInPage();

    }

    @When("The user enters valid login credentials")
    public void theUserEntersValidLogonCredentials() {
        loginPage.login();
    }


    @Then("The user clicks on the {string} category")
    public void theUserClicksOnTheCategory(String navigationName) {
        resourcesPage.theUserClicksOnTheCategory(navigationName);
    }

    @Then("The user clicks on the {string} button")
    public void theUserClicksOnTheButton(String buttonName) {
        resourcesPage.theUserClicksOnTheButton(buttonName);
    }

    @And("The user should be seen the new recources item opened")
    public void theUserShouldBeSeenTheNewRecourcesItemOpened() {
        resourcesPage.theUserShouldBeSeenTheNewRecourcesItemOpened();
    }

    @And("The user should be seen the New Rwsources Page {string} page")
    public void theUserShouldBeSeenThePage(String arg0) {
        Assert.assertTrue(resourcesPage.newResourcesPage.isDisplayed());
    }

    @Then("The user clicks on the {string} link")
    public void theUserClicksOnTheLink(String arg0) {
        resourcesPage.theUserClicksOnTheLink();
    }

    @And("The user should be seen the {string} title")
    public void theUserShouldBeSeenTheTitle(String arg0) {
        resourcesPage.theUserShouldBeSeenTheTitle(arg0);

    }

    @And("The user should be seen the selection type title")
    public void theUserShouldBeSeenTheSelectionTypeTitle() {
       resourcesPage.theUserShouldBeSeenTheSelectionTypeTitle();
    }

    @And("The user should be seen the Single Selection title")
    public void theUserShouldBeSeenTheSingleSelectionTitle() {
        resourcesPage.theUserShouldBeSeenTheSingleSelectionTitle();
    }

    @And("The user should be seen the Multiple Selection title")
    public void theUserShouldBeSeenTheMultipleSelectionTitle() {
        resourcesPage.theUserShouldBeSeenTheMultipleSelectionTitle();

    }

    @And("The user clicks on the Single Selection button")
    public void theUserClicksOnTheSingleSelectionButton() {
        resourcesPage.theUserClicksOnTheSingleSelectionButton();
    }

    @And("The user should be seen the Resources Page {string} page")
    public void theUserShouldBeSeenTheResourcesPage(String arg0) {
        Assert.assertTrue(resourcesPage.listOfResourcesTitleText.isDisplayed());

    }

    @And("The user should be the {string} title on the {string} page")
    public void theUserShouldBeTheTitleOnThePage(String arg0, String arg1) {
         resourcesPage.theUserShouldBeTheTitleOnThePage(arg0,arg1);
    }
    @Then("The user clicks on the Search by name search box")
    public void theUserClicksOnTheSearchByNameSearchBox() {
        resourcesPage.theUserClicksOnTheSearchByNameSearchBox();
    }

    @And("User searches in the search box")
    public void userSearchesInTheSearchBox() {
        resourcesPage.userSearchesInTheSearchBox();
    }

    @And("The user should be seen the Resources page")
    public void theUserShouldBeSeenTheResourcesPage() {
       resourcesPage.theUserShouldBeSeenTheResourcesPage();
    }

    @And("The user should be seen the New Resource page")
    public void theUserShouldBeSeenTheNewResourcePage() {
        resourcesPage.theUserShouldBeSeenTheNewResourcePage();
    }

    @And("The user should be seen the Quantity Selection title")
    public void theUserShouldBeSeenTheQuantitySelectionTitle() {
       resourcesPage.theUserShouldBeSeenTheQuantitySelectionTitle();
    }

    @Then("The user should be seen the Selection title")
    public void theUserShouldBeSeenTheSelectionTitle() {
        resourcesPage.theUserShouldBeSeenTheSelectionTitle();
    }

    @And("User should be seen No Selection title")
    public void userShouldBeSeenNoSelectionTitle() {
        resourcesPage.userShouldBeSeenNoSelectionTitle();
    }

    @And("The user clicks on the Selection button")
    public void theUserClicksOnTheSelectionButton() {
        resourcesPage.theUserClicksOnTheSelectionButton();
    }

    @And("The user should be seen the Auto Add to Onboarding title")
    public void theUserShouldBeSeenTheAutoAddToOnboardingTitle() {
        Assert.assertTrue(resourcesPage.autoAddtoOnboardingTitle.isDisplayed());
    }

    @Then("The user should be seen the Manual title")
    public void theUserShouldBeSeenTheManualTitle() {
       resourcesPage.theUserShouldBeSeenTheManualTitle();

    }

    @And("The user should be seen the Auto-add title")
    public void theUserShouldBeSeenTheAutoAddTitle() {
        resourcesPage.theUserShouldBeSeenTheAutoAddTitle();
    }

    @And("The user clicks on the Manual button")
    public void theUserClicksOnTheManualButton() {
        resourcesPage.theUserClicksOnTheManualButton();
    }

    @And("The user should be seen the Resources title")
    public void theUserShouldBeSeenTheResourcesTitle() {
       resourcesPage.theUserShouldBeSeenTheNewResourcePage();
    }

    @And("The user should be the seen Recources Name title")
    public void theUserShouldBeTheSeenRecourcesNameTitle() {
       resourcesPage.theUserShouldBeTheSeenRecourcesNameTitle();
    }

    @And("The user should be seen the Contacts + title")
    public void theUserShouldBeSeenTheContactsTitle() {
        Assert.assertTrue(resourcesPage.newResourcescontactsTitle.isDisplayed());
    }

    @And("The user clicks the + button")
    public void theUserClicksTheButton() {
        resourcesPage.newResourcesContactsButton.click();
    }

    @And("The user should be seen the Create Contact page")
    public void theUserShouldBeSeenTheCreateContactPage() {
        Assert.assertTrue(resourcesPage.newResourcesCreateContactsPage.isDisplayed());
    }

    @Then("The user hovers over the + button next to the Contacts title, the Create Contact alert appears")
    public void theUserHoversOverTheButtonNextToTheContactsTitleTheCreateContactAlertAppears() {
        resourcesPage.theUserHoversOverTheButtonNextToTheContactsTitleTheCreateContactAlertAppears();
    }

    @Then("The user clicks the x button")
    public void theUserClicksTheXButton() {
        resourcesPage.theUserClicksTheXButton();
    }

    @Then("The user clicks the Back button")
    public void theUserClicksTheBackButton() {
        resourcesPage.theUserClicksTheBackButton();
    }


    @Then("The user clicks on the Enter category name item")
    public void theUserClicksOnTheEnterCategoryNameItem() {
        resourcesPage.theUserClicksOnTheEnterCategoryNameItem();
    }

    @Then("The user should be the seen Enter category name text box")
    public void theUserShouldBeTheSeenEnterCategoryNameTextBox() {
        resourcesPage.theUserShouldBeTheSeenEnterCategoryNameTextBox();
    }

    @And("The user only write in {string} text box")
    public void theUserOnlyWriteInTextBox(String arg0) {
       resourcesPage.theUserOnlyWriteInTextBox(arg0);
    }

    @And("Sees the error message {string}")
    public String seesTheErrorMessage(String itemErorMessageText) {

            WebElement itemName =Driver.get().findElement(By.xpath("//div[text()='" + itemErorMessageText + "']"));
            BrowserUtils.waitForVisibility(itemName,3);
            return itemName.getText();
    }

    @Then("The user clicks on the Enter resource name text box")
    public void theUserClicksOnTheEnterResourceNameTextBox() {
        resourcesPage.theUserClicksOnTheEnterResourceNameTextBox();
    }

    @Then("Relevant information into the enter Enter resource name text box")
    public void relevantInformationIntoTheEnterEnterResourceNameTextBox() {
        resourcesPage.relevantInformationIntoTheEnterEnterResourceNameTextBox();
    }


    @Then("The user should be the confirmation message")
    public String theUserShouldBeTheConfirmationMessage() {
        resourcesPage.toastMessageText();
        BrowserUtils.waitForVisibility(resourcesPage.message, 3);
        return resourcesPage.message.getText();
    }

    @Then("The User should be able to add data to {string} with {string}")
    public void theUserShouldBeAbleToAddDataToWith(String placeHolder, String companyNAme) {
        String fakeDataInfo = BrowserUtils.fakeName();
        orderPage.boxName(placeHolder).sendKeys(companyNAme);
        BrowserUtils.waitFor(1);
        assertEquals(orderPage.boxName(placeHolder).getAttribute("value"), companyNAme);
    }

    @Then("The user select the Company from ddm")
    public void theUserSelectTheCompanyFromDdm() {
        WebElement button1 = Driver.get().findElement(By.cssSelector("#Resources_newResource_company"));
        BrowserUtils.clickWithJS(button1);
        BrowserUtils.waitFor(1);
        button1.sendKeys("CompanyName" + Keys.ENTER);
    }

    @Then("The user select the Category Name from ddm")
    public void theUserSelectTheCategoryNameFromDdm() {
        WebElement button2 = Driver.get().findElement(By.id("resource_name"));
        BrowserUtils.clickWithJS(button2);
        BrowserUtils.waitFor(1);
        button2.sendKeys("Yemek" + Keys.ENTER);
    }

    @Then("The user select the Resources Name from ddm")
    public void theUserSelectTheResourcesNameFromDdm() {
        WebElement button3 = Driver.get().findElement(By.id("resource_resources_0_name"));
        BrowserUtils.clickWithJS(button3);
        BrowserUtils.waitFor(1);
        button3.sendKeys("Yusuf Köfte" + Keys.ENTER);
    }

    @Then("The user select the Contacts from ddm")
    public void theUserSelectTheContactsFromDdm() {
        WebElement button4 = Driver.get().findElement(By.xpath("//div[@class='ant-select-selection-overflow']"));
        BrowserUtils.clickWithJS(button4);
        BrowserUtils.waitFor(1);
        button4.sendKeys("requester.test@yopmail.com" + Keys.ENTER);
    }

    @And("The user should be the entered information in a list")
    public void theUserShouldBeTheEnteredInformationInAList() {
       resourcesPage.theUserShouldBeTheEnteredInformationInAList();
    }

    @Then("The user clicks on the Select responsible people text box")
    public void theUserClicksOnTheSelectResponsiblePeopleTextBox() {
        resourcesPage.selectResponsiblePeople.click();
    }

    @And("Relevant information into the enter Select responsible people text box")
    public void relevantInformationIntoTheEnterSelectResponsiblePeopleTextBox() {
        WebElement selectResponsiblePeople = orderPage.boxName("Select responsible people");
        actions.click(selectResponsiblePeople).
                sendKeys(faker.options().toString()).
                perform();

        BrowserUtils.waitFor(2);
    }

    @Then("The user should be seen the Resource Name title")
    public void theUserShouldBeSeenTheResourceNameTitle( String arg0) {
       resourcesPage.getSectionName(arg0);
        Assert.assertTrue(resourcesPage.resourcesNameTitle.isDisplayed());

    }

    @And("The user should see the error message {string}")
    public void theUserShouldSeeTheErrorMessage(String arg0) {
        resourcesPage.theUserShouldSeeTheErrorMessage(arg0);
    }

    @Then("User enters valid information on the {string} page")
    public void userEntersValidInformationOnThePage(String arg0) {
        BrowserUtils.clickWithJS(resourcesPage.selectTheCompany);
        resourcesPage.selectTheCompany.sendKeys("Test Techno Consultant", Keys.ENTER);
        BrowserUtils.waitFor(2);
        WebElement startBox = orderPage.boxName("Enter category name");
        actions.click(startBox).
                sendKeys("Telefon").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("Apple").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("nokia@gmail.com - nokia", Keys.ENTER).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                perform();
        BrowserUtils.waitFor(2);

    }

    @Then("The user should see the message {string}")
    public void theUserShouldSeeTheMessage(String arg0) {
        assertEquals(resourcesPage.toastMessageText(),"Resource successfully created");
        //Assert.assertTrue(resourcesPage.message.getText().contains("Resource successfully created"));
    }

    @Then("The user clicks on the Create button")
    public void theUserClicksOnTheCreateButton() {
       resourcesPage.theUserClicksOnTheCreateButton();
    }

    @Then("The user should be the {string} heading on the {string} page")
    public void theUserShouldBeTheHeadingOnThePage(String arg0, String arg1) {
    //  Steps need to be written. There is a bug.
}

    @Then("The user enters the relevant information on the {string} page")
    public void theUserEntersTheRelevantInformationOnThePage(String arg0) {
      //  Steps need to be written. There is a bug.
    }

    @And("Under the {string} heading, the user sees what time they logged in")
    public void underTheHeadingTheUserSeesWhatTimeTheyLoggedIn(String arg0) {
        //Steps need to be written. There is a bug.
    }

    @Then("The user should be able to click on the {string} search box")
    public void theUserShouldBeAbleToClickOnTheSearchBox(String arg0) {
        //Steps need to be written. There is a bug.
    }

    @And("The user should be able to click on the icon next to the {string} search box.")
    public void theUserShouldBeAbleToClickOnTheIconNextToTheSearchBox(String arg0) {
        //Steps need to be written. There is a bug.
    }

    @And("The user clicks on the New Resources Delete button")
    public void theUserClicksOnTheNewResourcesDeleteButton() {
        resourcesPage.theUserClicksOnTheNewResourcesDeleteButton();

    }

    @And("The user should be seen the Ant-Popover should appear.")
    public void theUserShouldBeSeenTheAntPopoverShouldAppear() {
        WebElement hover = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
        actions.moveToElement(hover).build().perform();
        if (hover.isDisplayed()) {
            System.out.println("Create Contact Alert is Displayed");

        } else {
            System.out.println("Create Contact Alert could not be displayed");
        }
    }

    @And("Verify appear that the Add resource line has been deleted.")
    public void verifyAppearThatTheAddResourceLineHasBeenDeleted() {
       resourcesPage.verifyAppearThatTheAddResourceLineHasBeenDeleted();
    }

    @And("The user clicks on the New Resources Resource Delete button")
    public void theUserClicksOnTheNewResourcesResourceDeleteButton() {
        resourcesPage.theUserClicksOnTheNewResourcesResourceDeleteButton();
    }

    @Then("User enters invalid information on the New Resource page")
    public void userEntersInvalidInformationOnTheNewResourcePage() {
       resourcesPage.userEntersInvalidInformationOnTheNewResourcePage();
    }

    @Then("The user should see the messagee {string}")
    public void theUserShouldSeeTheMessagee(String arg0) {
        assertEquals(resourcesPage.toastMessageText(),"Please fill out all required fields correctly.");
    }

    @Then("The user clicks on the Resources Resource Delete button")
    public void theUserClicksOnTheResourcesResourceDeleteButton() {
        resourcesPage.theUserClicksOnTheResourcesResourceDeleteButton();
    }

    @And("The user should see the delete messagee {string}")
    public void theUserShouldSeeTheDeleteMessagee(String arg0) {
        assertEquals(resourcesPage.toastMessageText(),"Field option category successfully deleted");
    }

    @And("The user clicks on the Resources Delete button")
    public void theUserClicksOnTheResourcesDeleteButton() {
        resourcesPage.theUserClicksOnTheResourcesDeleteButton();
    }

    @Then("The user clicks on the Resources Resource Cancel button")
       public void theUserClicksOnTheResourcesResourceCancelButton() {
        resourcesPage.theUserClicksOnTheResourcesResourceCancelButton();
    }

    @Then("User enters valid information on the New Resource page")
    public void userEntersValidInformationOnTheNewResourcePage() {
       resourcesPage.userEntersInvalidInformationOnTheNewResourcePage();
    }

    @And("The user enters a Category Name on the new resource page")
    public void theUserEntersACategoryNameOnTheNewResourcePage() {
        resourcesPage.theUserEntersACategoryNameOnTheNewResourcePage();
    }

    @And("The user selects Selection Type as {string}")
    public void theUserSelectsSelectionTypeAs(String isChecked) {
        resourcesPage.theUserSelectsSelectionTypeAs(isChecked);

    }

    @And("The user selects Quantity Selection  as {string}")
    public void theUserSelectsQuantitySelectionAs(String isChecked) {
        resourcesPage.theUserSelectsQuantitySelectionAs(isChecked);
    }

    @And("The user selects Auto Add to Onboarding as {string}")
    public void theUserSelectsAutoAddToOnboardingAs(String isChecked) {
        resourcesPage.theUserSelectsAutoAddToOnboardingAs(isChecked);
    }

    @And("The user enters a Resource Name on the new resource page")
    public void theUserEntersAResourceNameOnTheNewResourcePage() {
        resourcesPage.theUserEntersAResourceNameOnTheNewResourcePage();
    }

    @And("The user selects a Contact from contacts dropdown {string}")
    public void theUserSelectsAContactFromContactsDropdown(String targetListElement) {
        resourcesPage.theUserSelectsAContactFromContactsDropdown(targetListElement);
    }

    @And("The user selects a Company from company dropdown {string}")
    public void theUserSelectsACompanyFromCompanyDropdown(String targetListElement) {
        resourcesPage.theUserSelectsACompanyFromCompanyDropdown(targetListElement);
    }

    @And("The user must be able to search in the {string} search box")
    public void theUserMustBeAbleToSearchInTheSearchBox(String arg0) {
        //Search box Test
    }
    public void theUserShouldSeeTheDeleteMessageeSiteSuccessfullyDeleted() {
        Assert.assertTrue(resourcesPage.message.getText().contains("Site successfully deleted"));
        BrowserUtils.waitFor(3);
    }

    @And("The user should be the String {string} {string} {string} {string} title")
    public void theUserShouldBeTheStringTitle(String arg0, String arg1, String arg2, String arg3) {
        resourcesPage.theUserShouldBeTheStringTitle(arg0,arg1,arg2,arg3);
    }
    @And("The user should see the delete messagee Please fill out all required fields correctly.")
    public void theUserShouldSeeTheDeleteMessageePleaseFillOutAllRequiredFieldsCorrectly() {
        assertEquals(resourcesPage.toastMessageText(),"Please fill out all required fields correctly.");
    }

    @And("User {string} must have entered incorrect character")
    public void userMustHaveEnteredIncorrectCharacter(String arg0) {
        // Manual Test
    }
}

