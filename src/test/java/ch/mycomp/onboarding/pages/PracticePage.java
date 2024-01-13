package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

import static ch.mycomp.onboarding.utilities.Driver.driver;

public class PracticePage extends BasePage {

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

    @FindBy(xpath = "//*[text()='supplier_test@yopmail.com | Supplier Test']")
    WebElement firstElementOfList;
    public void selectSupplierInfo(String supplierEmail, String supplierName) {
        supplierDDM.click();
        while (!firstElementOfList.isDisplayed()){
            driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
        }
        BrowserUtils.waitFor(5);
        globalSelectDropdownTargetElement(supplierDDM, supplierEmail + " | " + supplierName);

    }


    public void addResourceInTheField(String value, String boxname) {
        int count = 1;
        WebElement resourceName = Driver.get().findElement(By.id("resource_items_" + count + "_name"));
        resourceName.sendKeys(value);
    }

    public void addSupplierInTheField(String supplierEmail, String supplierName) {
        int count = 1;
        WebElement supplier = Driver.get().findElement(By.xpath("//*[@id='resource_items_" + count + "_suppliers']"));
        globalSelectDropdownTargetElement(supplier, supplierEmail + " | " + supplierName);
    }

    public void addNewField(String value, String boxName) {
        boxName(boxName).sendKeys(value);

    }

    public void enterCompanyCode(String boxName) {
        String code = "";
        String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H","I", "J"};
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            code += letters[random.nextInt(letters.length)];
        }

        boxName(boxName).sendKeys(code);
    }

    @FindBy(id = "user_company")
    WebElement companyDDM;

    public void selectCompany(String companyName) {
        globalSelectDropdownTargetElement(companyDDM, companyName);
    }

    @FindBy(id="user_site")
    WebElement siteDDM;
    public void selectSite(String siteName) {
        globalSelectDropdownTargetElement(siteDDM,siteName);
    }
    @FindBy(id="resource_company")
    WebElement resourceCompanyDDM;
    public void selectCompanyResourcePage(String companyName) {
        globalSelectDropdownTargetElement(resourceCompanyDDM,companyName);
    }

    public void selectSupplierResourcePage(String supplier) {
        supplierDDM.click();
        globalSelectDropdownTargetElement(supplierDDM,supplier);
    }

        @FindBy(id="onboarding_company")
        WebElement onboardingCompanyDDM;
    public void selectCompanyOnboardingPage(String companyName) {
        globalSelectDropdownTargetElement(onboardingCompanyDDM,companyName);
    }

    @FindBy(xpath = "//tbody/tr[2]/td[6]/span")
    WebElement roleNameInTable;
    public void theUserVerifyThatLastCreatedUsersRoleIs(String roleName) {
        Assert.assertEquals(roleName,roleNameInTable.getText());
    }

    public void theUserUpgradeTheRoleTo(String actualRole, String upgradeRole) {
        WebElement roleDDM = Driver.get().findElement(By.xpath(" //div/span[text()='" +actualRole + "']"));
        roleDDM.click();
        WebElement newRole = Driver.get().findElement(By.xpath(" //div/div[text()='" +upgradeRole + "']"));
        newRole.click();
    }
}
