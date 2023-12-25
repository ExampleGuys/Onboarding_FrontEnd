package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static ch.mycomp.onboarding.utilities.Driver.driver;
import static org.junit.Assert.assertTrue;

public class ResourcesPage extends BasePage {

    //Resources >resourcesSite
    @FindBy(xpath = "(//div[@class='ant-row css-14bavl3'])[1]")
    public WebElement resourcesSite;

    //Resources >resourcesLink
    @FindBy(xpath = ("//a[contains(text(),'Resources')]"))
    public WebElement resourcesLink;

    //Resources >addResourcesFirstLine
    @FindBy(xpath = ("(//div[@class='ant-form-item-control-input-content'])[12]"))
    public WebElement addResourcesFirstLine;


    //Resources >addResourcesDeleteLine
    @FindBy(xpath = ("(//button[@type='button'])[5]"))
    public WebElement addResourcesDeleteLine;



    //Resources > Category Name Title New Resources Site
    @FindBy(xpath = "//label[@title='Category Name']")
    public WebElement categoryNameTitle;










    //Resources >newResourcesPage
    @FindBy(xpath = "//section[@class='ant-layout css-14bavl3']")
    public WebElement newResourcesPage;


    //Resources >newResourcesEnterResourcesName
    @FindBy(xpath = "//input[@id='resource_resources_0_name']")
    public WebElement newResourcesEnterResourcesName;

    //Resources >Select responsible people
    @FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
    public WebElement selectResponsiblePeople;


    //Resources >selectionTypeTitle
    @FindBy(xpath = ("//label[normalize-space()='Selection Type']"))
    public WebElement selectionTypeTitle;

    //Resources >singleSelectionTitle
    @FindBy(xpath = ("//span[text()='Single Selection']"))
    public WebElement singleSelectionType;

    //Resources >singleSelectionTypeSwitch
    @FindBy(xpath = ("(//span[@class='ant-switch-inner'])[1]"))
    public WebElement singleSelectionTypeSwitch;

    //Resources >SelectionTypeSwitch
    @FindBy(xpath = ("(//span[@class='ant-switch-inner'])[2]"))
    public WebElement selectionTypeSwitch;

    //Resources >Multiple Selection Title
    @FindBy(xpath = ("//span[text()='Multiple Selection']"))
    public WebElement multipleSelectionTitle;//span[text()='No Selection']

    //Resources >selection Title
    @FindBy(xpath = ("//span[text()='No Selection']"))
    public WebElement noSelectionTitle;

    //Resources >Selection Title
    @FindBy(xpath = ("//span[text()='Selection']"))
    public WebElement selectionTitle;

    //Resources >Manual Title
    @FindBy(xpath = ("//span[text()='Manual']"))
    public WebElement manualTitle;

    //Resources >resourcesTitle
    @FindBy(xpath = ("//h2[text()='Resources']"))
    public WebElement resourcesTitle;

    //Resources >Auto-add Title
    @FindBy(xpath = ("//span[text()='Auto-add']"))
    public WebElement autoAddTitle;

    //Resources >quantitySelectionTitle
    @FindBy(xpath = ("//label[normalize-space()='Quantity Selection']"))
    public WebElement quantitySelectionTitle;

    //Resources >quantitySelectionSwitch
    @FindBy(xpath = ("(//span[@class='ant-switch-inner'])[2]"))
    public WebElement quantitySelectionSwitch;

    //Resources >autoAddtoOnboardingTitle
    @FindBy(xpath = ("//label[normalize-space()='Auto Add to Onboarding']"))
    public WebElement autoAddtoOnboardingTitle;

    //Resources >Contacts Title
    @FindBy(xpath = ("(//span[text()='Contacts'])[2]"))
    public WebElement newResourcescontactsTitle;

    //Resources >autoAddtoOnboardingTitleSwitch
    @FindBy(xpath = ("(//span[@class='ant-switch-inner'])[3]"))
    public WebElement autoAddtoOnboardingTitleSwitch;





    //Resources >newResourcesContacts+Button
    @FindBy(xpath = ("(//button[@type='button'])[5]"))
    public WebElement newResourcesContactsButton;

    //Resources >newResourcesCreateContactsPage
    @FindBy(xpath = ("//div[@class='ant-modal-content']"))
    public WebElement newResourcesCreateContactsPage;

    //Resources >newResourcesAddResourcesButton
    @FindBy(xpath = ("//*[text()='Add resource']"))
    public WebElement addResourcesButton;

       //Resources >newResourcesCreateContactsPageXButton
    @FindBy(xpath = ("(//button[@type='button'])[9]"))
    public WebElement newResourcesCreateContactsPageXButton;

    //Resources >listOfResourcesTitleText
    @FindBy(xpath = "//div[@class='ant-card-head-title']")
    public WebElement listOfResourcesTitle;

    //Resources > resourcesNameTitle
    @FindBy(xpath = "//label[@title='Resource Name']")
    public WebElement resourcesNameTitle;

    //Resources > categoryNameErrorMessage
    @FindBy(xpath = "//div[text()='Please fill out all required fields correctly.']")
    public WebElement categoryNameErrorMessage;

    //Resources > List of Resources altindaki ilk sütun/searchBoxFirstLine
    @FindBy(xpath = "(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")
    public WebElement searchBoxFirstLine;





    //Sites/Resources > listOf_]
    @FindBy(xpath = "//div[@class='ant-card-head-title']")
    public WebElement listOf_;



    //Sites/Resources > createdBy-]
    @FindBy(xpath = "//th[text()='Created By']")//th[normalize-space()='Created By']
    public WebElement createdBy_;

    //Sites/Resources > createdAt]
    @FindBy(xpath = "//th[text()='Created At']")//th[normalize-space()='Created At']
    public WebElement createdAt;

    //Sites/Resources > searchBoxButton]
    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement searchBoxButton;


    //Sites/Resources > selectTheCompany]
    @FindBy(xpath = "//input[@id='resource_company']")
    public WebElement selectTheCompany;

    //Sites/Resources > deleteButtonDelete]
    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement deleteButtonDelete;

    //Sites/Resources > deletePopconfirm]
    @FindBy(xpath = "//div[@class='ant-popconfirm-inner-content']")
    public WebElement deletePopconfirm;


    //Sites/Resources > new_BackButton]
    @FindBy(xpath = "//button[@class='ant-btn css-14bavl3 ant-btn-default ant-btn-lg']")
    public WebElement new_BackButton;



    //New Resources > resourceDeletButton]
    @FindBy(xpath = "(//button[@type='button'])[6]")//span[text()='Delete']
    public WebElement resourceDeletButton;

    //Sites/Resources > deleteButtonCancel]
    @FindBy(xpath = "//button[@class='ant-btn css-14bavl3 ant-btn-default ant-btn-sm']")
    public WebElement deleteButtonCancel;



    //Sites/Resources > new_CreateButton2
    @FindBy(xpath = "//span[text()='Create']")
    public WebElement new_CreateButton2;


    //Sites/Resources > searchBoxText
    @FindBy(xpath = "//input[@placeholder='Search by site...']")
    public WebElement searchBoxText;

    @FindBy(xpath = "//*[@id='resource_name']")
    public WebElement inputCategoryNameTextboxLocator;

    @FindBy(xpath = "//div[@id='resource_isMultiSelection']//button")
    public WebElement buttonSelectionTypeLocator;

    @FindBy(xpath = "//*[@id='resource_hasQuantity']//button")
    public WebElement buttonQuantitySelectionLocator;

    @FindBy(xpath = "//*[@id='resource_defaultOnboardingDisplay']//button")
    public WebElement buttonAutoAddToOnboardingLocator;

    @FindBy(xpath = "//*[@id='resource_resources_0_name']")
    public WebElement inputResourcesNameNewResourceLocator;

    @FindBy(id = "resource_company")
    public WebElement inputCompanyDropdownResourcePageLocator;

    @FindBy(xpath = "//div[@class='ant-select-selector'][.//*[@id='resource_resources_0_contacts']]")
    public WebElement inputContactsDropdownResourcePageLocator;

    @FindBy(xpath = "(//span[@aria-label='delete'])")
    public WebElement deleteIconResourcesSection;




    public void theUserEntersACategoryNameOnTheNewResourcePage() {
        String categoryName = "Automation_" + getEpochTime();
        System.out.println("Category Name is = " + categoryName);
        BrowserUtils.sendKeysMethod(inputCategoryNameTextboxLocator, categoryName, 20);
    }


    public void theUserSelectsSelectionTypeAs(String isChecked) {
        checkAndClickElementIfStateDiffers(buttonSelectionTypeLocator, isChecked);
    }

    public void theUserSelectsQuantitySelectionAs(String isChecked) {
        checkAndClickElementIfStateDiffers(buttonQuantitySelectionLocator, isChecked);
    }

    public void theUserSelectsAutoAddToOnboardingAs(String isChecked) {
        checkAndClickElementIfStateDiffers(buttonAutoAddToOnboardingLocator, isChecked);
    }

    public void theUserEntersAResourceNameOnTheNewResourcePage() {
        String resourceName = "Automation_" + getEpochTime();
        System.out.println("Resource Name is = " + resourceName);
        BrowserUtils.sendKeysMethod(inputResourcesNameNewResourceLocator, resourceName, 20);
    }

    public void theUserSelectsAContactFromContactsDropdown(String targetListElement) {
        globalSelectDropdownTargetElement(inputContactsDropdownResourcePageLocator, targetListElement);
    }

    public void theUserSelectsACompanyFromCompanyDropdown(String targetListElement) {
        globalSelectDropdownTargetElement(inputCompanyDropdownResourcePageLocator, targetListElement);
    }

    public void theUserGoesToTheSignInPage() {
        Driver.get().get(ConfigurationReader.get("myCompStagingSignin"));
    }

    public void theUserClicksOnTheCategory(String navigationName) {
        WebElement sidebar = Driver.get().findElement(By.xpath("//span[text()='" + navigationName + "']"));
        BrowserUtils.clickWithJS(sidebar);

    }

    public void theUserClicksOnTheCreateButton() {
        BrowserUtils.clickElement(new_CreateButton2, 20);
    }

    public void theUserShouldBeSeenTheListOfSitesTitle() {
        BrowserUtils.verifyElementDisplayed(listOf_);

    }

    public void theUserShouldBeSeenTheCreatedByTitle() {
        Assert.assertTrue(createdBy_.isDisplayed());
    }

    public void theUserShouldBeSeenTheCreatedAtTitle() {
        Assert.assertTrue(createdAt.isDisplayed());
    }

    public void theUserShouldBeSeenTheAntPopoverShouldAppear() {
        BrowserUtils.verifyElementDisplayed(deletePopconfirm);
        BrowserUtils.waitFor(3);
    }

    public void theUserClicksOnTheButton(String buttonName) {
        BrowserUtils.waitFor(2);
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        BrowserUtils.clickWithJS(button);
    }

    public void theUserShouldBeAbleToClickOnTheSearchBySiteSearchBox() {
        searchBoxText.click();
    }

    public void theUserMustBeAbleToSearchInTheSearchBySiteSearchBox() {
        actions.moveToElement(searchBoxText).sendKeys("Avcilar").perform();
        BrowserUtils.waitFor(2);
    }

    public void theUserClicksOnTheSitesSitesDeleteButton() {
        BrowserUtils.waitForClickability(deleteButtonDelete, 1);
    }

    public void theUserShouldBeSeenTheNewRecourcesItemOpened() {
        BrowserUtils.waitForVisibility(addResourcesFirstLine, 1);
    }

    public void theUserShouldBeSeenTheResourcesPage() {
        BrowserUtils.waitForVisibility(resourcesSite, 1);
    }

    public void theUserShouldBeTheTitleOnThePage(String titleName) {
        WebElement button = Driver.get().findElement(By.xpath("//div[text()='" + titleName + "']"));
        BrowserUtils.verifyElementDisplayed(button);

    }
    public void theUserClicksOnTheSearchByNameSearchBox(String placeHolder ) {

        BrowserUtils.verifyElementDisplayed(boxName(placeHolder));
    }

    public void userSearchesInTheSearchBox() {
        searchBoxButton.getText();
        BrowserUtils.waitForVisibility(searchBoxFirstLine, 1);
    }

    public void theUserShouldBeSeenTheNewResourcePage() {
        BrowserUtils.waitForVisibility(newResourcesPage, 1);
    }

    public void theUserClicksOnTheLink() {
        resourcesLink.click();
    }


    public void theUserShouldBeSeenTheSelectionTypeTitle() {
        BrowserUtils.waitForVisibility(selectionTypeTitle, 1);
    }

    public void theUserShouldBeSeenTheSingleSelectionTitle() {
        BrowserUtils.waitForVisibility(singleSelectionType, 1);
    }

    public void theUserClicksOnTheSingleSelectionSwitch() {
        singleSelectionTypeSwitch.click();
    }

    public void theUserShouldBeSeenTheMultipleSelectionTitle() {
        BrowserUtils.waitForVisibility(multipleSelectionTitle, 1);
    }

    public void theUserShouldBeSeenTheQuantitySelectionTitle() {
        BrowserUtils.waitForVisibility(quantitySelectionTitle, 1);
    }

    public void theUserShouldBeSeenTheSelectionTitle() {
        BrowserUtils.verifyElementDisplayed(selectionTitle);
    }

    public void theUserClicksOnTheSelectionButton() {
        selectionTypeSwitch.click();
    }

    public void userShouldBeSeenNoSelectionTitle() {
        BrowserUtils.verifyElementDisplayed(noSelectionTitle);
    }

    public void theUserShouldBeSeenTheManualTitle() {
        BrowserUtils.verifyElementDisplayed(manualTitle);
    }

    public void theUserClicksOnTheManualButton() {
        autoAddtoOnboardingTitleSwitch.click();
    }

    public void theUserShouldBeSeenTheAutoAddTitle() {
        BrowserUtils.verifyElementDisplayed(autoAddTitle);
    }

    public void theUserShouldBeTheSeenRecourcesNameTitle() {
        BrowserUtils.verifyElementDisplayed(resourcesNameTitle);
    }

    public void theUserHoversOverTheButtonNextToTheContactsTitleTheCreateContactAlertAppears() {
        WebElement hover = driver.findElement(By.xpath("//button[@type='submit']"));
        actions.moveToElement(hover).build().perform();
        if (hover.isDisplayed()) {
            System.out.println("Create Contact Alert is Displayed");

        } else {
            System.out.println("Create Contact Alert could not be displayed");
        }
    }

    public void theUserClicksTheXButton() {
       newResourcesCreateContactsPageXButton.click();
    }
    public void theUserClicksTheBackButton() {
       new_BackButton.click();
    }
    public void theUserShouldBeTheSeenEnterCategoryNameTextBox() {
        BrowserUtils.verifyElementDisplayed(categoryNameTitle);
    }
    public void theUserClicksOnTheEnterCategoryNameItem() {
        categoryNameTitle.click();
    }
    public void theUserOnlyWriteInTextBox(String arg0) {
        WebElement enterCategoryName = boxName("Enter category name");
        actions.click(enterCategoryName).
                sendKeys(faker.options().toString()).
                sendKeys(Keys.ENTER).
                perform();

        BrowserUtils.waitFor(2);

    }
    public void theUserShouldSeeTheErrorMessage(String arg0) {
        Assert.assertTrue(categoryNameErrorMessage.getText().contains("Please fill out all required fields correctly."));
    }
    public void theUserClicksOnTheEnterResourceNameTextBox() {
      newResourcesEnterResourcesName.click();
    }
    public void relevantInformationIntoTheEnterEnterResourceNameTextBox() {
        WebElement enterResourceName = boxName("Enter resource name");
        actions.click(enterResourceName).
                sendKeys(faker.name().name()).
                perform();

        BrowserUtils.waitFor(2);
    }

    public void theUserShouldBeTheEnteredInformationInAList() {
        BrowserUtils.verifyElementDisplayed(searchBoxFirstLine);
    }
    public void theUserClicksOnTheNewResourcesDeleteButton() {
        resourceDeletButton.click();
        BrowserUtils.waitFor(2);
    }
    public void theUserClicksOnTheNewResourcesResourceDeleteButton() {
        deleteButtonDelete.click();
    }
    public void verifyAppearThatTheAddResourceLineHasBeenDeleted() {
        BrowserUtils.verifyElementDisplayed(addResourcesDeleteLine);
        BrowserUtils.waitFor(2);
    }
    public void userEntersInvalidInformationOnTheNewResourcePage() {
        BrowserUtils.clickWithJS(selectTheCompany);
       selectTheCompany.sendKeys("Ankasale",Keys.ENTER);
        BrowserUtils.waitFor(2);
        WebElement startBox = boxName("Enter category name");
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
    public void theUserClicksOnTheResourcesDeleteButton() {
        resourceDeletButton.click();
        BrowserUtils.waitFor(2);
    }
    public void theUserClicksOnTheResourcesResourceDeleteButton() {
        deleteButtonDelete.click();
    }
    public void theUserClicksOnTheResourcesResourceCancelButton() {
        deleteButtonCancel.click();
    }

    public void theUserShouldBeTheStringTitle(String arg0, String arg1, String arg2, String arg3) {
        assertTrue(listOf_.isDisplayed());
        assertTrue(categoryNameTitle.isDisplayed());
        assertTrue(createdBy_.isDisplayed());
        assertTrue(createdAt.isDisplayed());
    }

    public void theUserShouldSeenAddResourceButton() {
        BrowserUtils.verifyElementDisplayed(addResourcesButton);
    }

    public void theUserVerifyThatTheSearchBoxIsClickable(String placeHolder) {
        BrowserUtils.verifyElementClickable(boxName(placeHolder));
    }


    public void theUserVerifyThatTitleIsVisible(String titleName) {
        WebElement button = Driver.get().findElement(By.xpath("//label[@title='" + titleName + "']"));
        BrowserUtils.verifyElementDisplayed(categoryNameTitle);

    }

    public void thetheUserVerifiesThatSingleSelectionSwitchIsClickable() {
        BrowserUtils.verifyElementClickable(singleSelectionTypeSwitch);
    }

    public void theUserVerifyThatQuantitySelectionSwitchIsClickable() {
        BrowserUtils.verifyElementClickable(quantitySelectionSwitch);
    }

    public void theUserVerifyThatAutoAddToOnboardingSwitchIsClickable() {
        BrowserUtils.verifyElementClickable(autoAddtoOnboardingTitleSwitch);
    }

    public void theUserVerifyThatDeleteIconIsVisible() {
        BrowserUtils.verifyElementDisplayed(deleteIconResourcesSection);
    }

    public void theUserVerifyThatDeleteIconIsClickable() {
        BrowserUtils.verifyElementClickable(deleteIconResourcesSection);

    }

/////////////////////////////////////////////////////////////////////////////

    public void enterCategoryName(String boxname) {
        boxName(boxname).sendKeys(faker.commerce().productName());
    }

    public void enterResourceName(String boxName) {
        boxName(boxName).sendKeys(faker.commerce().material());
    }
    @FindBy(xpath ="//*[@class='ant-select-selection-overflow']")
    public WebElement resourceSupplierDDM;
    public void selectSupplier() {
        globalSelectDropdownTargetElement(resourceSupplierDDM,ConfigurationReader.get("supplierDDM"));
       boxName("Enter resource name").click();
       BrowserUtils.waitFor(2);
    }
    @FindBy(id="resource_company")
    public WebElement companyDDM;
    public void selectCompany(String companyName) {
        globalSelectDropdownTargetElement(companyDDM,companyName);

    }

    public void enterResourcePrice() {
        boxName("Enter price").sendKeys("900");
    }
}