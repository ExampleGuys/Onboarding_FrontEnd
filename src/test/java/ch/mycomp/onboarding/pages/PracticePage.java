package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
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

    @FindBy(id = "resource_items_0_suppliers")
    WebElement supplierDDM;

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

    public void selectSupplierInfo(String supplierEmail,String supplierName) {
        supplierDDM.click();
        globalSelectDropdownTargetElement(supplierDDM,supplierEmail+" | "+supplierName);

    }


    public void addResourceInTheField(String value, String boxname) {
    int count = 1;
    WebElement resourceName = Driver.get().findElement(By.id("resource_items_"+count+"_name"));
    resourceName.sendKeys(value);


    }


    public void addSupplierInTheField(String supplierEmail, String supplierName) {
        int count = 1;
        WebElement supplier = Driver.get().findElement(By.xpath("//*[@id='resource_items_"+count+"_suppliers']"));
      globalSelectDropdownTargetElement(supplier,supplierEmail+" | "+supplierName);
    }
}
