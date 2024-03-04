package ch.mycomp.onboarding.step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SitesStepDefs extends ObjectIndex {
    @And("The user enter site name in in the {string} field")
    public void theUserEnterSiteNameInInTheField(String boxName) {
           sitesPage.theUserEnterSiteNameInInTheField(boxName);
    }

        @And("The user select country as a {string}")
        public void theUserSelectCountryAsA(String boxName) {
            sitesPage.theUserSelectCountryAsA(boxName);
        }

        @And("The user enter city name in the {string} field")
        public void theUserEnterCityNameInTheField(String boxName) {
        sitesPage.theUserEnterCityNameInTheField(boxName);
        }

    @And("The user enter zip code in the {string} field")
    public void theUserEnterZipCodeInTheField(String boxName) {
        sitesPage.theUserEnterZipCodeInTheField(boxName);
    }

    @And("The user enter street name in the {string} field")
    public void theUserEnterStreetNameInTheField(String boxName) {
        sitesPage.theUserEnterStreetNameInTheField(boxName);
    }

    @And("The user enter street number in the {string} field")
    public void theUserEnterStreetNumberInTheField(String boxName) {
        sitesPage.theUserEnterStreetNumberInTheField(boxName);
    }

    @And("The user select a Company from company dropdown {string} for create site")
    public void theUserSelectACompanyFromCompanyDropdownForCreateSite(String companyName) {
        sitesPage.selectCompany(companyName);
    }

    @And("The user select site group as a {string} in the site group ddm")
    public void theUserSelectSiteGroupInTheSiteGroupDdm(String siteGroup) {
        sitesPage.theUserSelectSiteGroupInTheSiteGroupDdm(siteGroup);
    }

    @Then("The user verify that created site is visible")
    public void theUserVerifyThatCreatedSiteIsVisible() {
        companiesPage.theUserVerifyThatCreatedUnitIsVisible();
    }
}
