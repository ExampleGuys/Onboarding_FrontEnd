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

    //Resources > Category Name Title Resources Site
    @FindBy(xpath = "//th[text()='Category Name']")
    public WebElement categoryNameTitleResourcesSeit;//label[@title='Category Name']

    //Resources > Category Name Title New Resources Site
    @FindBy(xpath = "//label[@title='Category Name']")
    public WebElement categoryNameTitleNewResourcesSeit;

    //Resources >clickOnResources
    @FindBy(xpath = "(//a[@href='resources'])[1]")
    public WebElement clickOnResourcesCategory;


    //Resources > Category Name Title
    @FindBy(xpath = "//th[text()='Category Name']")
    public WebElement categoryNameTitle;

    @FindBy(xpath = "(//li[@class='ant-menu-item ant-menu-item-only-child'])[7]")
    public WebElement resourcesCategory;

    //Resources >newResourcesButton
    @FindBy(xpath = "//span[text()='New Resource']")
    public WebElement newResourcesButton;

    //Resources >newResourcesPage
    @FindBy(xpath = "//section[@class='ant-layout css-14bavl3']")
    public WebElement newResourcesPage;


    //Resources >newResourcesEnterResourcesName
    @FindBy(xpath = "//input[@id='resource_resources_0_name']")
    public WebElement newResourcesEnterResourcesName;

    //Resources >Select responsible people
    @FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
    public WebElement selectResponsiblePeople;

    //Resources > page10]
    @FindBy(xpath = "//span[@title='10 / page']")
    public WebElement page10;

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
    @FindBy(xpath = ("(//span[@class='ant-switch-inner'])[2]"))//span[@class='ant-switch-inner']
    public WebElement quantitySelectionSwitch;

    //Resources >autoAddtoOnboardingTitle
    @FindBy(xpath = ("//label[normalize-space()='Auto Add to Onboarding']"))
    public WebElement autoAddtoOnboardingTitle;

    //Resources >Contacts Title
    @FindBy(xpath = ("(//span[text()='Contacts'])[2]"))
    public WebElement newResourcescontactsTitle;

    //Resources >autoAddtoOnboardingTitleSwitch
    @FindBy(xpath = ("(//span[@class='ant-switch-inner'])[3]"))//button[@role='switch']
    public WebElement autoAddtoOnboardingTitleSwitch;

    //Resources >newResourcesNameTitle
    @FindBy(xpath = ("//label[normalize-space()='Resource Name']"))
    public WebElement newResourcesNameTitle;

    //Resources >newResourcesResourcesTitle
    @FindBy(xpath = ("//h2[text()='Resources']"))
    public WebElement newResourcesResourcesTitle;

    //Resources >newResourcesContacts+Button
    @FindBy(xpath = ("(//button[@type='button'])[5]"))
    public WebElement newResourcesContactsButton;

    //Resources >newResourcesCreateContactsPage
    @FindBy(xpath = ("//div[@class='ant-modal-content']"))
    public WebElement newResourcesCreateContactsPage;

    //Resources >newResourcesCategoryNameTitle
    @FindBy(xpath = ("//label[@title='Category Name']"))
    public WebElement newResourcesCategoryNameTitle;

    //Resources >newResourcesCompanyMessage
    @FindBy(xpath = ("(//div[@class='ant-form-item-explain-error'])[1]"))
    public WebElement newResourcesCompanyMessage;

    //Resources >newResourcesCategoryNameMessage
    @FindBy(xpath = ("(//div[@class='ant-form-item-explain-error'])[2]"))
    public WebElement newResourcesCategoryNameMessage;

    //Resources >newResourcesNameMessage
    @FindBy(xpath = ("(//div[@class='ant-form-item-explain-error'])[3]"))
    public WebElement newResourcesNameMessage;

    //Resources >newResourcesContactsMessage
    @FindBy(xpath = ("(//div[@class='ant-form-item-explain-error'])[4]"))
    public WebElement newResourcesContactsMessage;

    //Resources >newResourcesAddResourcesButton
    @FindBy(xpath = ("//span[normalize-space()='Add resource']"))
    public WebElement newResourcesAddResourcesButton;

    //Resources >newResourcesCreateContactsPageCancelButton
    @FindBy(xpath = ("//span[normalize-space()='Cancel']"))
    public WebElement newResourcesCreateContactsPageCancelButton;

    //Resources >newResourcesCreateContactsPageXButton
    @FindBy(xpath = ("(//button[@type='button'])[9]"))
    public WebElement newResourcesCreateContactsPageXButton;

    //Resources >newResourcesAddResourcesNewItem
    @FindBy(xpath = ("(//div[@class='ant-form-item css-14bavl3'])[12]"))
    public WebElement newResourcesAddResourcesNewItem;

    //Resources >listOfResourcesTitleText
    @FindBy(xpath = "//div[text()='List of Resources']")
    public WebElement listOfResourcesTitleText;

    //Resources > resourcesNameTitle
    @FindBy(xpath = "//label[@title='Resource Name']")
    public WebElement resourcesNameTitle;

    //Resources > categoryNameErrorMessage
    @FindBy(xpath = "//div[text()='Please fill out all required fields correctly.']")
    public WebElement categoryNameErrorMessage;

    //Resources > List of Resources altindaki ilk sütun/searchBoxFirstLine
    @FindBy(xpath = "(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")
    public WebElement searchBoxFirstLine;

    // email
    @FindBy(id = "email")
    public WebElement emailFidan;

    @FindBy(xpath = "(//div[@class='ant-form-item-control-input-content'])[1]")
    public WebElement emailInput;

    @FindBy(xpath = "(//div[@class='ant-form-item-control-input-content'])[2]")
    public WebElement passwordInput;

    @FindBy(xpath = "//aside[@class='ant-layout-sider ant-layout-sider-dark ant-layout-sider-has-trigger']")
    public WebElement daschboardNavigationMenu;

    @FindBy(id = "root")
    public WebElement daschboardPage;

    @FindBy(xpath = "//div[@class='ant-layout-sider-children']")
    public WebElement daschboardNavigationMenu2;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    // password]
    @FindBy(id = "password")
    public WebElement passwordFidan;

    // signIn]
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;

    //Sites/Resources > listOf_]
    @FindBy(xpath = "//div[@class='ant-card-head-title']")
    public WebElement listOf_;

    //Sites/Resources > company_]
    @FindBy(xpath = "//th[normalize-space()='Company']")
    public WebElement company_;

    //Sites/Resources > createdBy-]
    @FindBy(xpath = "//th[text()='Created By']")//th[normalize-space()='Created By']
    public WebElement createdBy_;

    //Sites/Resources > createdAt]
    @FindBy(xpath = "//th[text()='Created At']")//th[normalize-space()='Created At']
    public WebElement createdAt;

    //Sites/Resources > columns]
    @FindBy(xpath = "//thead[@class='ant-table-thead']") //td[@class='ant-table-cell'
    public WebElement columns;

    //Sites/Resources > searchBoxButton]
    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement searchBoxButton;

    //Sites/Resources > editButton]
    @FindBy(xpath = "(//div[@class='ant-col css-14bavl3'])[1]")
    public WebElement editButton;

    //Sites/Resources > deleteButton]
    @FindBy(xpath = "(//span[@class='anticon anticon-delete'])[1]")
    //(//div[@class='ant-col css-14bavl3'])[2] //(//button[@type='button'])[4]
    public WebElement deleteButton;

    //Sites/Resources > total_
    @FindBy(xpath = "//li[@class='ant-pagination-total-text']")
    public WebElement total_;

    //Sites/Resources > total_1Page]
    @FindBy(xpath = "//a[normalize-space()='1']")
    public WebElement total_1Page;

    //Sites/Resources > total_2Page]
    @FindBy(xpath = "//a[normalize-space()='2']")
    public WebElement total_2Page;

    //Sites/Resources > page20]
    @FindBy(xpath = "//span[@title='20 / page']")
    public WebElement page20;

    //Sites/Resources > new_Title]
    @FindBy(xpath = "//div[@class='ant-card-head-title']")
    public WebElement new_Title;

    //Sites/Resources > new_Company+Button]
    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement new_CompanyButton;

    //Sites/Resources > saveButton]
    @FindBy(xpath = "//span[@aria-label='save']")
    public WebElement saveButton;

    //Sites/Resources > message]
    @FindBy(xpath = "//div[@class='go3958317564']")
    public WebElement message;

    //Sites/Resources > selectTheCompany]
    @FindBy(xpath = "//input[@id='resource_company']")
    public WebElement selectTheCompany;

    //Sites/Resources > deleteButtonDelete]
    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement deleteButtonDelete;

    //Sites/Resources > deletePopconfirm]
    @FindBy(xpath = "//div[@class='ant-popconfirm-inner-content']")
    public WebElement deletePopconfirm;

    //Sites/Resources > newResorceDeletePopconfirm]
    @FindBy(xpath = "//div[text()='Delete Resource']")
    public WebElement newResorceDeletePopconfirm;

    //Sites/Resources > new_BackButton]
    @FindBy(xpath = "//button[@class='ant-btn css-14bavl3 ant-btn-default ant-btn-lg']")
    public WebElement new_BackButton;

    //Sites/Resources > new_CompanyTitle]
    @FindBy(xpath = "//span[normalize-space()='Company']")
    public WebElement new_Company;

    //New Resources > resourceDeletButton]
    @FindBy(xpath = "(//button[@type='button'])[6]")//span[text()='Delete']
    public WebElement resourceDeletButton;

    //Sites/Resources > deleteButtonCancel]
    @FindBy(xpath = "//button[@class='ant-btn css-14bavl3 ant-btn-default ant-btn-sm']")
    public WebElement deleteButtonCancel;

    //Sites/Resources > new_CreateButton]
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement new_CreateButton;//span[text()='Create']

    //Sites/Resources > new_CreateButton2
    @FindBy(xpath = "//span[text()='Create']")
    public WebElement new_CreateButton2;

    //Sites/Resources > new_CreateErrorMesage]
    @FindBy(xpath = "//div[@class='go3958317564']")
    public WebElement new_CreateErrorMesage;

    //Sites/Resources > createContactAlert2]
    @FindBy(xpath = "//div[text()='Create Contact']")
    public WebElement createContactAlert2;

    //Sites/Resources > createContactAlert1]
    @FindBy(xpath = "//div[@class='ant-tooltip css-14bavl3 ant-tooltip-placement-top']")
    public WebElement createContactAlert1;

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

    public void theUserShouldBeTheTitleOnThePage(String arg0, String arg1) {
        BrowserUtils.waitForVisibility(listOf_, 1);
    }

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

    public void theUserClicksOnTheSearchByNameSearchBox() {
        searchBoxButton.click();
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

    public void theUserShouldBeSeenTheTitle(String arg0) {
        getSectionName(arg0);
        BrowserUtils.waitFor(2);
        BrowserUtils.waitForVisibility(categoryNameTitleNewResourcesSeit, 1);
    }

    public void theUserShouldBeSeenTheSelectionTypeTitle() {
        BrowserUtils.waitForVisibility(selectionTypeTitle, 1);
    }

    public void theUserShouldBeSeenTheSingleSelectionTitle() {
        BrowserUtils.waitForVisibility(singleSelectionType, 1);
    }

    public void theUserClicksOnTheSingleSelectionButton() {
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

    public void theUserShouldBeSeenTheResourcesTitle() {
        BrowserUtils.verifyElementDisplayed(resourcesTitle);
    }

    public void theUserShouldBeTheSeenRecourcesNameTitle() {
        BrowserUtils.verifyElementDisplayed(resourcesNameTitle);
    }

    public void theUserShouldBeSeenTheContactsTitle() {
        BrowserUtils.verifyElementDisplayed(newResourcescontactsTitle);
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
    public void theUserShouldBeSeenTheCreateContactPage() {
        BrowserUtils.verifyElementDisplayed(newResourcesCreateContactsPage);
    }
    public void theUserClicksTheXButton() {
       newResourcesCreateContactsPageXButton.click();
    }
    public void theUserClicksTheBackButton() {
       new_BackButton.click();
    }
    public void theUserShouldBeTheSeenEnterCategoryNameTextBox() {
        BrowserUtils.verifyElementDisplayed(categoryNameTitleNewResourcesSeit);
    }
    public void theUserClicksOnTheEnterCategoryNameItem() {
        categoryNameTitleNewResourcesSeit.click();
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
    public void theUserShouldSeeTheMessage(String arg0) {
        Assert.assertTrue(message.getText().contains("Resource successfully created"));

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
    public void userEntersValidInformationOnTheNewResourcePage() {
        BrowserUtils.clickWithJS(selectTheCompany);
        selectTheCompany.sendKeys("Test Techno Consultant", Keys.ENTER);
        BrowserUtils.waitFor(2);
        WebElement startBox = boxName("Enter category name");
        actions.click(startBox).
                sendKeys("Telefon").
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
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
    public void theUserShouldBeTheStringTitle(String arg0, String arg1, String arg2, String arg3) {
        assertTrue(listOf_.isDisplayed());
        assertTrue(categoryNameTitle.isDisplayed());
        assertTrue(createdBy_.isDisplayed());
        assertTrue(createdAt.isDisplayed());
    }
}