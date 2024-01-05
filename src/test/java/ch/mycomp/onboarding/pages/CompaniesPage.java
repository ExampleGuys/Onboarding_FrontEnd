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



    @FindBy(xpath = "//span[@aria-label='delete'][1]")
    public WebElement deleteIconFirstElementOfTable;
    public void theUserEnterDataToField(String boxName) {
        boxName(boxName).sendKeys(faker.company().name());
        BrowserUtils.waitFor(2);
    }

    public void theUserVerifyThatNewCompanyCreated(String Message) {

       BrowserUtils.assertContains(toastMessageText(),Message);
    }

    public void theUserVerifyThatCreatedUnitIsVisible() {
        assertTrue(tableElements.size()>1);

    }

    public void theUserClickOnFirstElementOfCompaniesTable() {
       BrowserUtils.waitFor(3);
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
