package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OrderPage extends BasePage {


    public void theUserSelectTheEmployeeFromDdm(String employee) {
        WebElement button = Driver.get().findElement(By.cssSelector("#order_forEmployee"));
        button.sendKeys(employee + Keys.ENTER);

    }

    @FindBy(id = "order_priority")
    public WebElement priorityDDM;

    public void selectPriority() {
        priorityDDM.click();
        String[] priorityList = {"Highest", "High", "Normal", "Low", "Lowest"};
        int random = (int) (Math.random() * priorityList.length);
        String randomTitle = priorityList[random];
        WebElement priority = Driver.get().findElement(By.xpath("//div[@title='" + randomTitle + "']"));
        priority.click();
    }

    public void selectPrefferedDeliveryDate() {
        boxName("Select preferred delivery date").click();
        LocalDate today = LocalDate.now();
        LocalDate Day = today.plusWeeks(1);
        String deliveryDay = Day.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        WebElement preferredDeliveryDay = Driver.get().findElement(By.xpath("//td[@title='" + deliveryDay + "']"));
        BrowserUtils.clickElement(preferredDeliveryDay, 20);
    }

    @FindBy(id = "order_site")
    public WebElement orderSite;

    public void selectSite(String site) {
        globalSelectDropdownTargetElement(orderSite, site);
    }

    public void enterReasonForRequest() {
        boxName("Enter reason for request").sendKeys(faker.lorem().fixedString(200));
    }

    @FindBy(id = "order_orderItems_0_resourceTemplate")
    public WebElement resourceDDM;

    @FindBy(id = "order_orderItems_0_resourceTemplateItems")
    public WebElement resourceItem;

    @FindBy(id = "order_lineManagers")
    public WebElement lineManagerDDM;

    @FindBy(id = "order_supplier")
    public WebElement supplierDDM;



    @FindBy(id = "order_company")
    public WebElement companyDDM;

    public void selectCompany(String companyName) {
        globalSelectDropdownTargetElement(companyDDM, companyName);
    }

    public void selectLineManager(String lineManager) {
        lineManagerDDM.click();
        globalSelectDropdownTargetElement(lineManagerDDM, lineManager);
    }

    public void selectSupplier(String supplierName) {
        supplierDDM.click();
        globalSelectDropdownTargetElement(supplierDDM, supplierName);
    }

    public void selectResource(String resourceName) {
        globalSelectDropdownTargetElement(resourceDDM, resourceName);
    }

    public void selectResourceItem(String resourceItemName) {
        globalSelectDropdownTargetElement(resourceItem, resourceItemName);
    }

    @FindBy(xpath = "//input[@value='NEW_INVESTMENT']")
    WebElement radioButtonNewInwestment;
    public void theUserSelectInvestmentTypeAsANewInvestment() {
        BrowserUtils.clickElement(radioButtonNewInwestment,20);

    }
}
