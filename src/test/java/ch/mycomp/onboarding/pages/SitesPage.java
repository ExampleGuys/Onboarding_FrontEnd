package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SitesPage extends BasePage {
        Actions actions = new Actions(Driver.get());

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
        public WebElement sitesLink2;//span[@role='button']

        //Sites > zipcodeCounterButton2]
        @FindBy(xpath = "(//span[@role='button'])[2]")
        public WebElement zipcodeCounterButton2;

        //Sites > zipcodeCounterButton1]
        @FindBy(xpath = "(//span[@role='button'])[1]")
        public WebElement zipcodeCounterButton1;

        //Sites/Resources > deleteButton]
        @FindBy(xpath = "(//button[@type='button'])[4]")
        //(//div[@class='ant-col css-14bavl3'])[2] //(//button[@type='button'])[4]
        public WebElement deleteButton;

        public  void heUserShouldBeSeenTheListOfSitesTitle(){

        }
        public  void theUserMustBeAbleToClickOnTheSitesLink(){
                BrowserUtils.waitForClickability(sitesLink2,1);
                BrowserUtils.waitForVisibility(sitesLink2,1);
        }

        public void theUserShouldBeSeenTheSiteTitle() {
                BrowserUtils.waitForVisibility(siteTitle,1);
        }
        public void theUserClicksOnTheDeleteButton() {
                deleteButton.click();
        }
        public void theUserClicksOnTheItem(String arg0) {
                BrowserUtils.waitForClickability(newSeiteEnterForDirections,1);
        }
        public WebElement boxName(String boxNameInfo) {
                return Driver.get().findElement(By.xpath("//*[@placeholder='" + boxNameInfo + "']"));
        }
        public void theUserShouldBeAbleToTypeUpToFivehundredCharactersInTheDescriptionField() {
                String str= faker.lorem().characters(510);
                int strlength = str.length(); //510
                boxName("Enter for directions").sendKeys(str);
                int textlength = newSeiteEnterForDirections.getText().length();
                String str500 = newSeiteForDirections500.getText();//500 / 500
                int space = str500.indexOf(" "); //3
                int fivehundred = Integer.parseInt((str500.substring(0,space))); //500 int
                Assert.assertEquals(textlength,fivehundred);
        }
        public void theUserShouldSeeTheNumberOfCharactersTheyEnteredAtTheBottomRight() {
                BrowserUtils.waitForVisibility(newSeiteForDirections500,1);
        }
        public void theUserClicksOnTheEditButton() {
                BrowserUtils.waitForClickability(editButton,1);
        }
        public void theUserShouldBeSeenTheNewSiteSiteTitle() {
                BrowserUtils.waitForVisibility(newSeiteSiteTitle,1);
        }
        public void theUserShouldBeSeenTheNewSiteZipCodeTitle() {
                BrowserUtils.waitForVisibility(newSeiteZipCodeTitle,1);
        }
        public void theUserClicksOnTheAdressSiteButton() {
               // BrowserUtils.waitForClickability(newSeiteAdressSite,1);
                newSeiteAdressSite.click();
        }
        public void userEntersValidInformationOnTheItem(String arg0) {
                actions.moveToElement(newSeiteAdressSite).sendKeys("Aselsan").perform();
        }
        public void theUserClicksOnTheZipCodeButton() {
                //BrowserUtils.waitForClickability(newSeiteEnterZipCode,1);
                newSeiteEnterZipCode.click();
        }
        public void theUserEntersTheInformationOnTheZipCodeItem() {
                actions.moveToElement(newSeiteEnterZipCode).sendKeys("12365").perform();
                BrowserUtils.waitFor(3);

        }
        public void theUserShouldBeSeenTheNewSiteCountryTitle() {
                BrowserUtils.waitForVisibility(newSeiteCountryTitle,1);
        }
        public void theUserShouldBeSeenTheNewSiteCityTitle() {
                BrowserUtils.waitForVisibility(newSeiteCityTitle,1);
        }
        public void theUserClicksOnTheCityItem() {
                //BrowserUtils.waitForClickability(newSeiteEnterCity,1);
                newSeiteEnterCity.click();
        }
        public void theUserShouldBeSeenTheNewSiteDistrictTitle() {
                BrowserUtils.waitForVisibility(newSeiteDistrictTitle,1);
        }
        public void theUserShouldBeSeenTheNewSiteStreetTitle() {
                BrowserUtils.verifyElementDisplayed(newSeiteStreetTitle);
        }
        public void theUserClicksOnTheStreetItem() {
               newSeiteEnterStreet.click();
        }
        public void theUserEntersTheInformationOnTheStreetItem() {
                actions.moveToElement(newSeiteEnterStreet).sendKeys("Ankara cad.").perform();
        }
        public void theUserClicksOnTheCounterOnTheItem(String arg0) {
               BrowserUtils.doubleClick(zipcodeCounterButton2);
               //zipcodeCounterButton2.click();
        }
        public void theUserEntersTheInformationOnTheDistrictItem() {
                actions.moveToElement(newSeiteEnterDistrict).sendKeys("Kaiserslautern").perform();
        }
        public void theUserClicksOnTheDistrictItem() {
                newSeiteEnterDistrict.click();
        }
        public void theUserEntersTheInformationOnTheCityItem() {
                actions.moveToElement(newSeiteEnterCity).sendKeys("Ankara").perform();
        }
        public void theUserShouldBeSeenTheSitesPage() {
                BrowserUtils.verifyElementDisplayed(sitePage);
        }
}
