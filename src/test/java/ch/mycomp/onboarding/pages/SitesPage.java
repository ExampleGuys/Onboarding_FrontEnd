package ch.mycomp.onboarding.pages;


import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SitesPage extends BasePage {

    public void theUserEnterSiteNameInInTheField(String boxName) {
        boxName(boxName).sendKeys(faker.address().cityName());
    }

    public void theUserEnterCountryNameInTheField(String boxName) {
        boxName(boxName).sendKeys(faker.country().name());
    }

    public void theUserEnterCityNameInTheField(String boxName) {
        boxName(boxName).sendKeys(faker.address().cityName());
    }

    public void theUserEnterZipCodeInTheField(String boxName) {
        boxName(boxName).sendKeys(faker.address().zipCode());
    }

    public void theUserEnterStreetNameInTheField(String boxName) {
        boxName(boxName).sendKeys(faker.address().streetName());
    }

    public void theUserEnterStreetNumberInTheField(String boxName) {
        boxName(boxName).sendKeys(faker.address().streetAddressNumber());
    }

    @FindBy(id = "site_company")
    WebElement companyDDM;
    public void selectCompany(String companyName) {
        globalSelectDropdownTargetElement(companyDDM,companyName);
    }
}