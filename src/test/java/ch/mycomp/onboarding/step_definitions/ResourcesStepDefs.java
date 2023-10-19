package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.BasePage;
import ch.mycomp.onboarding.pages.LoginPage;
import ch.mycomp.onboarding.pages.OrderPage;
import ch.mycomp.onboarding.pages.ResourcesPage;
import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static ch.mycomp.onboarding.utilities.BrowserUtils.fakeName;
import static ch.mycomp.onboarding.utilities.Driver.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ResourcesStepDefs extends ObjectIndex {


    @Given("The user goes to the sign-in page")
    public void theUserGoesToTheSignInPage() {
        Driver.get().get(ConfigurationReader.get("myCompStagingSignin"));
    }

    @When("The user enters valid logon credentials")
    public void theUserEntersValidLogonCredentials() {
        loginPage.login();
    }


    @Then("The user clicks on the {string} category")
    public void theUserClicksOnTheCategory(String navigationName) {
        WebElement sidebar = Driver.get().findElement(By.xpath("//span[text()='" + navigationName + "']"));
        BrowserUtils.clickWithJS(sidebar);
    }

    @Then("The user clicks on the {string} button")
    public void theUserClicksOnTheButton(String buttonName) {
        BrowserUtils.waitFor(2);
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        BrowserUtils.clickWithJS(button);
    }

    @And("The user should be seen the new recources item opened")
    public void theUserShouldBeSeenTheNewRecourcesItemOpened() {
        Assert.assertTrue(resourcesPage.addResourcesFirstLine.isDisplayed());
    }

    @And("The user should be seen the New Rwsources Page {string} page")
    public void theUserShouldBeSeenThePage(String arg0) {
        Assert.assertTrue(resourcesPage.newResourcesPage.isDisplayed());
    }

    @Then("The user clicks on the {string} link")
    public void theUserClicksOnTheLink(String arg0) {
        resourcesPage.resourcesLink.click();
    }

    @And("The user should be seen the {string} title")
    public void theUserShouldBeSeenTheTitle(String arg0) {
        resourcesPage.getSectionName(arg0);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(resourcesPage.categoryNameTitleNewResourcesSeit.isDisplayed());

    }

    @And("The user should be seen the selection type title")
    public void theUserShouldBeSeenTheSelectionTypeTitle() {
        Assert.assertTrue(resourcesPage.selectionTypeTitle.isDisplayed());
    }

    @And("The user should be seen the Single Selection title")
    public void theUserShouldBeSeenTheSingleSelectionTitle() {
        Assert.assertTrue(resourcesPage.singleSelectionType.isDisplayed());

    }

    @And("The user should be seen the Multiple Selection title")
    public void theUserShouldBeSeenTheMultipleSelectionTitle() {
        Assert.assertTrue(resourcesPage.multipleSelectionTitle.isDisplayed());

    }

    @And("The user clicks on the Single Selection button")
    public void theUserClicksOnTheSingleSelectionButton() {
        resourcesPage.singleSelectionTypeSwitch.click();
    }

    @And("The user should be seen the Resources Page {string} page")
    public void theUserShouldBeSeenTheResourcesPage(String arg0) {
        Assert.assertTrue(resourcesPage.listOfResourcesTitleText.isDisplayed());

    }

    @And("The user should be the {string} title on the {string} page")
    public void theUserShouldBeTheTitleOnThePage(String arg0, String arg1) {
          Assert.assertTrue(resourcesPage.listOf_.isDisplayed());
    }


    @And("The user should be the {string} {string} {string} {string} title")
    public void theUserShouldBeTheTitle(String arg0, String arg1, String arg2, String arg3) {

        //        Assert.assertTrue(commonPage.listOf_Title.isDisplayed());
        //        Assert.assertTrue(commonPage.createdAtTitle.isDisplayed());
        //        Assert.assertTrue(commonPage.createdByTitle.isDisplayed());
        //        Assert.assertTrue(resourcesPage.categoryNameTitle.isDisplayed());
        // BrowserUtils.waitForVisibility(commonPage.listOf_Title,20);

        //   String actualResultlistOf_Title = commonPage.listOf_Title.getText();
        String expectedResult = arg0;
        //  Assert.assertEquals(expectedResult,actualResultlistOf_Title);
    }

    @Then("The user clicks on the Search by name search box")
    public void theUserClicksOnTheSearchByNameSearchBox() {
        resourcesPage.searchBoxButton.click();
    }

    @And("User searches in the search box")
    public void userSearchesInTheSearchBox() {
        resourcesPage.searchBoxButton.getText();
        Assert.assertTrue(resourcesPage.searchBoxFirstLine.isDisplayed());
    }

    @And("The user should be seen the Resources page")
    public void theUserShouldBeSeenTheResourcesPage() {
        Assert.assertTrue(resourcesPage.resourcesSite.isDisplayed());
    }

    @And("The user should be seen the New Resource page")
    public void theUserShouldBeSeenTheNewResourcePage() {
        Assert.assertTrue(resourcesPage.newResourcesPage.isDisplayed());
    }

    @And("The user should be seen the Quantity Selection title")
    public void theUserShouldBeSeenTheQuantitySelectionTitle() {
        Assert.assertTrue(resourcesPage.quantitySelectionTitle.isDisplayed());
    }

    @Then("The user should be seen the Selection title")
    public void theUserShouldBeSeenTheSelectionTitle() {
        Assert.assertTrue(resourcesPage.selectionTitle.isDisplayed());
    }

    @And("User should be seen No Selection title")
    public void userShouldBeSeenNoSelectionTitle() {
        Assert.assertTrue(resourcesPage.noSelectionTitle.isDisplayed());
    }

    @And("The user clicks on the Selection button")
    public void theUserClicksOnTheSelectionButton() {
        resourcesPage.selectionTypeSwitch.click();
    }

    @And("The user should be seen the Auto Add to Onboarding title")
    public void theUserShouldBeSeenTheAutoAddToOnboardingTitle() {
        Assert.assertTrue(resourcesPage.autoAddtoOnboardingTitle.isDisplayed());
    }

    @Then("The user should be seen the Manual title")
    public void theUserShouldBeSeenTheManualTitle() {
        Assert.assertTrue(resourcesPage.manualTitle.isDisplayed());

    }

    @And("The user should be seen the Auto-add title")
    public void theUserShouldBeSeenTheAutoAddTitle() {
        Assert.assertTrue(resourcesPage.autoAddTitle.isDisplayed());
    }

    @And("The user clicks on the Manual button")
    public void theUserClicksOnTheManualButton() {
        resourcesPage.autoAddtoOnboardingTitleSwitch.click();
    }

    @And("The user should be seen the Resources title")
    public void theUserShouldBeSeenTheResourcesTitle() {
        Assert.assertTrue(resourcesPage.resourcesTitle.isDisplayed());
    }

    @And("The user should be the seen Recources Name title")
    public void theUserShouldBeTheSeenRecourcesNameTitle() {
        Assert.assertTrue(resourcesPage.resourcesNameTitle.isDisplayed());
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
        WebElement hover = driver.findElement(By.xpath("//button[@type='submit']"));
        actions.moveToElement(hover).build().perform();
        if (hover.isDisplayed()) {
            System.out.println("Create Contact Alert is Displayed");

        }else {
            System.out.println("Create Contact Alert could not be displayed");
        }
    }

    @Then("The user clicks the x button")
    public void theUserClicksTheXButton() {
        resourcesPage.newResourcesCreateContactsPageXButton.click();
    }

    @Then("The user clicks the Back button")
    public void theUserClicksTheBackButton() {
        resourcesPage.new_BackButton.click();
    }


    @Then("The user clicks on the Enter category name item")
    public void theUserClicksOnTheEnterCategoryNameItem() {
        resourcesPage.categoryNameTitleNewResourcesSeit.click();
    }

    @Then("The user should be the seen Enter category name text box")
    public void theUserShouldBeTheSeenEnterCategoryNameTextBox() {
        Assert.assertTrue(resourcesPage.categoryNameTitleNewResourcesSeit.isDisplayed());
    }

    @And("The user only write in {string} text box")
    public void theUserOnlyWriteInTextBox(String arg0) {
        WebElement enterCategoryName = orderPage.boxName("Enter category name");
        actions.click(enterCategoryName).
                sendKeys(faker.options().toString()).
                sendKeys(Keys.ENTER).
                perform();

        BrowserUtils.waitFor(2);

    }

    @And("Sees the error message {string}")
    public String seesTheErrorMessage(String itemErorMessageText) {

            WebElement itemName =Driver.get().findElement(By.xpath("//div[text()='" + itemErorMessageText + "']"));
            BrowserUtils.waitForVisibility(itemName,3);
            return itemName.getText();
    }

    @Then("The user clicks on the Enter resource name text box")
    public void theUserClicksOnTheEnterResourceNameTextBox() {
        resourcesPage.newResourcesEnterResourcesName.click();
    }

    @Then("Relevant information into the enter Enter resource name text box")
    public void relevantInformationIntoTheEnterEnterResourceNameTextBox() {
        WebElement enterResourceName = orderPage.boxName("Enter resource name");
        actions.click(enterResourceName).
                sendKeys(faker.name().name()).
                perform();

        BrowserUtils.waitFor(2);
    }


    @Then("The user should be the confirmation message")
    public String theUserShouldBeTheConfirmationMessage() {
        resourcesPage.toastMessageText();
        BrowserUtils.waitForVisibility(resourcesPage.message, 3);
        return resourcesPage.message.getText();
    }

    @Then("The User should be able to add data to {string} with {string}")
    public void theUserShouldBeAbleToAddDataToWith(String placeHolder, String companyNAme) {
        String fakeDataInfo = fakeName();
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
        Assert.assertTrue(resourcesPage.searchBoxFirstLine.isDisplayed());
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
        Assert.assertTrue(resourcesPage.categoryNameErrorMessage.getText().contains("Please fill out all required fields correctly."));
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
        Assert.assertTrue(resourcesPage.message.getText().contains("Resource successfully created"));

    }

    @Then("The user clicks on the Create button")
    public void theUserClicksOnTheCreateButton() {
        resourcesPage.new_CreateButton2.click();
        BrowserUtils.waitFor(2);
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
        resourcesPage.resourceDeletButton.click();
        BrowserUtils.waitFor(2);

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
        Assert.assertTrue(resourcesPage.addResourcesDeleteLine.isDisplayed());
        BrowserUtils.waitFor(2);

    }

    @And("The user clicks on the New Resources Resource Delete button")
    public void theUserClicksOnTheNewResourcesResourceDeleteButton() {
        resourcesPage.deleteButtonDelete.click();
    }

    @Then("User enters invalid information on the New Resource page")
    public void userEntersInvalidInformationOnTheNewResourcePage() {
        BrowserUtils.clickWithJS(resourcesPage.selectTheCompany);
        resourcesPage.selectTheCompany.sendKeys("Ankasale",Keys.ENTER);
        BrowserUtils.waitFor(2);
        WebElement startBox = orderPage.boxName("Enter category name");
        actions.click(startBox).
                sendKeys("Yemek").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("Yusuf Köfte").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
    }

    @Then("The user should see the messagee {string}")
    public void theUserShouldSeeTheMessagee(String arg0) {
        Assert.assertTrue(resourcesPage.message.getText().contains("Please fill out all required fields correctly."));
    }
}

