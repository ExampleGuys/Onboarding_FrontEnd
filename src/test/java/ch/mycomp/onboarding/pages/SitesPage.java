package ch.mycomp.onboarding.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SitesPage extends BasePage{

        //Sites >clickOnSites ]
        @FindBy(xpath = "//a[normalize-space()='']")
        public WebElement clickOnSites;



        //Sites > siteCategory]
        @FindBy(xpath = "(//li[@class='ant-menu-item ant-menu-item-only-child'])[9]")
        public WebElement siteCategory;

        //Resources >sitesSite
        @FindBy(xpath = "(//div[@class='ant-row css-14bavl3'])[1]")
        public WebElement sitesSite;

        //Sites > columns1]-->Listede ilk satir
        @FindBy(xpath = "(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")
        public WebElement columns1;

        //Sites > page10]
        @FindBy(xpath = "//div[@title='10 / page']")//input[@id='rc_select_28_list_0']
        public WebElement page10;

        //Sites > newSeiteButton1]
        @FindBy(xpath = "//button[@class='ant-btn css-14bavl3 ant-btn-primary ant-btn-lg create-button']")
        public WebElement newSeiteButton1;

        //Sites > newSeiteButton2]
        @FindBy(xpath = "//span[normalize-space()='New Site']")
        public WebElement newSeiteButton2;


        //Sites > newSeiteSiteTitle]
        @FindBy(xpath = "//label[normalize-space()='Site']")
        public WebElement newSeiteSiteTitle;

        //Sites > newSeiteAdressSite]
        @FindBy(xpath = "(//div[@class='ant-form-item-control-input'])[2]")
        public WebElement newSeiteAdressSite;

        //Sites > newSeiteAdresseSeiteMesage]
        @FindBy(xpath = "(//div[@class='ant-form-item-explain-error'])[1]")
        public WebElement newSeiteAdresseSeiteMesage;

        //Sites > newSeiteZipCodeTitle]
        @FindBy(xpath = "//input[@id='Site_zipCode']")
        public WebElement newSeiteZipCodeTitle;

        //Sites > newSeiteEnterZipCode]
        @FindBy(xpath = "//label[normalize-space()='Zip Code']")
        public WebElement newSeiteEnterZipCode;

        //Sites > newSeiteZipCodeMesage]
        @FindBy(xpath = "(//div[@class='ant-form-item-explain-error'])[2]")
        public WebElement newSeiteZipCodeMesage;

        //Sites > newSeiteCountryTitle]
        @FindBy(xpath = "//label[normalize-space()='Country']")
        public WebElement newSeiteCountryTitle;

        //Sites > newSeiteEnterCountryMesage]
        @FindBy(xpath = "(//div[@class='ant-form-item-explain-error'])[3]")
        public WebElement newSeiteEnterCountryMesage;

        //Sites > newSeiteEnterCityMesage]
        @FindBy(xpath = "(//div[@class='ant-form-item-explain-error'])[4]")
        public WebElement newSeiteEnterCityMesage;

        //Sites > newSeiteEnterStreetMesage]
        @FindBy(xpath = "(//div[@class='ant-form-item-explain-error'])[5]")
        public WebElement newSeiteEnterStreetMesage;

        //Sites > newSeiteEnterCity]
        @FindBy(xpath = "//input[@id='Site_state']")
        public WebElement newSeiteEnterCity;

        //Sites > newSeiteCityTitle]
        @FindBy(xpath = "//label[normalize-space()='City']")
        public WebElement newSeiteCityTitle;

        //Sites > newSeiteDistrictTitle]
        @FindBy(xpath = "//label[normalize-space()='District']")
        public WebElement newSeiteDistrictTitle;

        //Sites > newSeiteEnterDistrict]
        @FindBy(xpath = "//input[@id='Site_city']")
        public WebElement newSeiteEnterDistrict;

        //Sites > newSeiteStreetTitle]
        @FindBy(xpath = "//label[normalize-space()='Street']")
        public WebElement newSeiteStreetTitle;

        //Sites > newSeiteEnterStreet]
        @FindBy(xpath = "//input[@id='Site_street']")
        public WebElement newSeiteEnterStreet;

        //Sites > newSeiteForDirectionsTitle]
        @FindBy(xpath = "//label[normalize-space()='For Directions']")
        public WebElement newSeiteForDirectionsTitle;

        //Sites > newSeiteEnterForDirections]
        @FindBy(xpath = "//textarea[@id='Site_forDirections']")
        public WebElement newSeiteEnterForDirections;

        //Sites > newSeiteForDirections500]
        @FindBy(xpath = "//span[@class='ant-input-data-count']")
        public WebElement newSeiteForDirections500;

        //Sites > siteTitle]
        @FindBy(xpath = "//th[text()='Site']") //th[normalize-space()='Site']//th[@class='ant-table-cell'])[2]
        public WebElement siteTitle;

        //Sites > selectTheCompany]
        @FindBy(id = "Site_company")
        public WebElement selectTheCompany;

        //Sites > selectTheCompanyAnkasale]
        @FindBy(xpath = "//span[text()='Ankasale']")
        public WebElement selectTheCompanyAnkasale;

        //Sites > sitePage]
        @FindBy(xpath = "(//div[@class='ant-row css-14bavl3'])[1]")
        public WebElement sitePage;

        //Sites > editButton]
        @FindBy(xpath = "(//button[@class='ant-btn css-14bavl3 ant-btn-circle ant-btn-default ant-btn-icon-only'])[1]")
        public WebElement editButton;

        //Sites > editSeiteTitle]
        @FindBy(xpath = "//div[@class='ant-card-head-title']")
        public WebElement editSeiteTitle;

        //Sites > sitesLink]
        @FindBy(xpath = "//a[contains(text(),'Sites')]")
        public WebElement sitesLink;

        //Sites > sitesLink2]
        @FindBy(xpath = "//span[@class='ant-breadcrumb-link']")
        public WebElement sitesLink2;



    }


