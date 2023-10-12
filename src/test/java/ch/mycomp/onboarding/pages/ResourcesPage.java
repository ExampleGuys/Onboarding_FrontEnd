package ch.mycomp.onboarding.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourcesPage extends BasePage{

    //Resources >resourcesSite
    @FindBy(xpath = "(//div[@class='ant-row css-14bavl3'])[1]")
    public WebElement resourcesSite;

    //Resources >resourcesLink
    @FindBy(xpath = ("//a[contains(text(),'Resources')]"))
    public WebElement resourcesLink;

    //Resources >addResourcesFirstLine
    @FindBy(xpath = ("(//div[@class='ant-form-item-control-input-content'])[12]"))
    public WebElement addResourcesFirstLine;

    //Resources > Category Name Title Resources Site
    @FindBy(xpath = "//th[text()='Category Name']")
    public WebElement categoryNameTitleResourcesSeit;//label[@title='Category Name']

    //Resources > Category Name Title New Resources Site
    @FindBy(xpath = "//label[@title='Category Name']")
    public WebElement categoryNameTitleNewResourcesSeit;

        //Resources >clickOnResources
        @FindBy(xpath = "//a[@href='resources'])[1]")
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

        //Resources > page10]
        @FindBy(xpath = "//span[@title='10 / page']")
        public WebElement page10;

        //Resources >selectionTypeTitle
        @FindBy(xpath = ("//label[normalize-space()='Selection Type']"))
        public WebElement selectionTypeTitle;

        //Resources >singleSelectionTitle
        @FindBy(xpath = ("//span[text()='Single Selection']"))
        public WebElement singleSelectionType;

        //Resources >selectionTypeSwitch
        @FindBy(xpath = ("(//span[@class='ant-switch-inner'])[1]"))
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


    }


