package ch.mycomp.onboarding.pages;


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
}