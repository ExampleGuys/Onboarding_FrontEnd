package ch.mycomp.onboarding.pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ResourcesPage extends BasePage {

    //Resources >resourcesSite
    @FindBy(xpath = "(//div[@class='ant-row css-14bavl3'])[1]")
    public WebElement resourcesSite;

    //Resources >listOfResourcesTitleText
    @FindBy(xpath = "//div[text()='List of Resources']")
    public WebElement listOfResourcesTitleText;

    //Resources > Category Name Title
    @FindBy(xpath = "//label[@title='Category Name']")
    public WebElement categoryNameTitle;

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

    //Sites/Resources > new_CompanyTitle]
    @FindBy(xpath = "//span[normalize-space()='Company']")
    public WebElement new_Company;

    //Sites/Resources > new_Company+Button]
    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement new_CompanyButton;

    //Sites/Resources > selectTheCompany]
    @FindBy(xpath = "//input[@id='Site_company']")
    public WebElement selectTheCompany;

    //Sites/Resources > deleteButtonDelete]
    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement deleteButtonDelete;

    //Sites/Resources > deleteButtonCancel]
    @FindBy(xpath = "//button[@class='ant-btn css-14bavl3 ant-btn-default ant-btn-sm']")
    public WebElement deleteButtonCancel;

    //Sites/Resources > deletePopconfirm]
    @FindBy(xpath = "//div[@class='ant-popconfirm-inner-content']")
    public WebElement deletePopconfirm;

    //Sites/Resources > new_BackButton]
    @FindBy(xpath = "//button[@class='ant-btn css-14bavl3 ant-btn-default ant-btn-lg']")
    public WebElement new_BackButton;

    //Sites/Resources > new_CreateButton]
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement new_CreateButton;

    //Sites/Resources > new_CreateErrorMesage]
    @FindBy(xpath = "//div[@'class='go3958317564']")
    public WebElement new_CreateErrorMesage;



}
