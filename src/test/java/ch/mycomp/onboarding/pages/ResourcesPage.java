package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResourcesPage extends BasePage {

    public void enterCategoryName(String boxname) {
        boxName(boxname).sendKeys(faker.commerce().productName());
    }

    public void enterResourceName(String boxName) {
        boxName(boxName).sendKeys(faker.commerce().material());
    }
    @FindBy(xpath ="//*[@class='ant-select-selection-overflow']")
    public WebElement resourceSupplierDDM;
    public void selectSupplier() {
        globalSelectDropdownTargetElement(resourceSupplierDDM,ConfigurationReader.get("supplierDDM"));
       boxName("Enter resource name").click();
       BrowserUtils.waitFor(2);
    }
    @FindBy(id="resource_company")
    public WebElement companyDDM;
    public void selectCompany(String companyName) {
        globalSelectDropdownTargetElement(companyDDM,companyName);

    }

    public void enterResourcePrice() {
        boxName("Enter price").sendKeys("900");
    }
}