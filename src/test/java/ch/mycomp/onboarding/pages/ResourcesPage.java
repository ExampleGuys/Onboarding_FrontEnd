package ch.mycomp.onboarding.pages;

import com.github.javafaker.Faker;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    // //Resources > Category Name Title
    // @FindBy(xpath = "//label[@title='Category Name']")
    // public WebElement categoryNameTitle;

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

    @FindBy(xpath = "(//div[@class='ant-layout-sider-children']")
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
    @FindBy(xpath = "//thead[@class='ant-table-thead']]") //td[@class='ant-table-cell'
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
    @FindBy(xpath = "//div[@'class='go3958317564']")
    public WebElement new_CreateErrorMesage;

    //Sites/Resources > createContactAlert2]
    @FindBy(xpath = "//div=[text()='Create Contact']")
    public WebElement createContactAlert2;

    //Sites/Resources > createContactAlert1]
    @FindBy(xpath = "//div=[@class='ant-tooltip css-14bavl3 ant-tooltip-placement-top']")
    public WebElement createContactAlert1;

}
