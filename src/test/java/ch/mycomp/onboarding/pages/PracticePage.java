package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PracticePage extends BasePage{

    @FindBy(xpath = "(//span[@aria-label='delete'])[1]")
    WebElement deleteIconFirstElement;

    @FindBy(xpath = "//span[@aria-label='delete']")
    List<WebElement> deleteIconOfPage;

    @FindBy(xpath = "//div[@class='ant-empty-description']")
    WebElement noData;

    @FindBy(xpath = "//*[@class='ant-table-row ant-table-row-level-0']")
    WebElement firstRowOfList;

    public void deleteAllElements() {

        while (firstRowOfList.isDisplayed()) {
            deleteIconFirstElement.click();
            clickButton("Delete");

        }
    }


    public void verifyAllElementsDeleted() {
     Assert.assertTrue(noData.isDisplayed());
    }

    public void enterEmailforSupplier(String email, String boxName) {
        boxName(boxName).sendKeys(email);
    }

    public void enterValueInTheField(String value, String boxname) {
        boxName(boxname).sendKeys(value);
    }
}
