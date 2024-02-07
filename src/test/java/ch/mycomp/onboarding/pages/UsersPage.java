package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UsersPage extends BasePage {

    @FindBy(id="user_company")
    public WebElement usercompanyDDM;


    @FindBy(id="user_role")
    public WebElement userRoleDDM;

    @FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
    public WebElement userDepartmentDDM;

    @FindBy(id="user_site")
    public WebElement userSiteDDM;

    @FindBy(xpath = "(//span[@aria-label='barcode'])[2]")
    public WebElement generatePassword;
    
   public void enterFirstMiddleLastName() {
        boxName("Enter first name").sendKeys(faker.name().firstName());
        boxName("Enter middle name").sendKeys(faker.name().firstName());
        boxName("Enter last name").sendKeys(faker.name().lastName());
    }

    public void selectRole(String role) {
        globalSelectDropdownTargetElement(userRoleDDM,role);
    }

    public void selectDepartment() {
        globalSelectDropdownTargetElement(userDepartmentDDM, ConfigurationReader.get("departmentDDM"));
    }

    public void selectSite(String siteName) {
       globalSelectDropdownTargetElement(userSiteDDM,siteName);
    }

    public void enterPrivateEmail() {
        boxName("Enter private email").sendKeys(faker.internet().emailAddress());
        
    }

    public void clickGeneratePassword() {
       BrowserUtils.clickElement(generatePassword,20);
    }
    public void enterPassword() {
        BrowserUtils.clickElement(generatePassword,20);
    }

    @FindBy(id="user_company")
    WebElement companyDDM;
    public void selectCompany(String companyName) {
        globalSelectDropdownTargetElement(companyDDM,companyName);
    }
}

