package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class CompaniesPage extends BasePage{

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> tableElements;

    @FindBy(xpath = "(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")
    public WebElement firstElementNameOfTable;

    @FindBy(xpath = "//span[@aria-label='delete'][1]")
    public WebElement deleteIconFirstElementOfTable;
    public void theUserEnterDataToField(String boxName) {
        boxName(boxName).sendKeys(faker.company().name());
        BrowserUtils.waitFor(2);
    }

    public void theUserVerifyThatNewCompanyCreated(String message) {
        BrowserUtils.assertContains(toastMessageText(),message);
    }

    public void theUserVerifyThatCreatedUnitIsVisible() {
        assertTrue(tableElements.size()>1);

    }

    public void theUserClickOnFirstElementOfCompaniesTable() {
       BrowserUtils.clickElement(firstElementNameOfTable,20);
    }

    public void theUserUpdateDataToField(String boxName) {
        boxName(boxName).sendKeys("HELLO");
        BrowserUtils.waitFor(2);
    }

    public void theUserClickOnDeleteIconInTheFirstElementOfTable() {
        BrowserUtils.clickElement(deleteIconFirstElementOfTable,20);
        BrowserUtils.waitFor(2);
    }
}
