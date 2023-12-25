package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderPage extends BasePage{

    ResourcesPage resourcesPage = new ResourcesPage();
    @FindBy(css = "div[class='ant-form-item-control-input-content'] span textarea[id='Order_description']")
    public WebElement orderEnterDescriptionInfo;
    @FindBy(xpath = "(//span [@class='ant-input-data-count'])[1]")
    public WebElement order500InputDataCount;

    @FindBy(css="#Order_delivery_date")
    public WebElement datapicker;

    @FindBy(css="#Order_priority")
    public WebElement priorityDdm;


	@FindBy(xpath = "//span [@class='anticon anticon-delete']")
	public WebElement deleteIcon;

	@FindBy(css="#Order_resources_0_resourceCategory")
	public WebElement selectCategoryDdm;

    @FindBy(css="#Order_resources_0_quantity")
    public WebElement resourcesQuantityDdm;

	@FindBy(css="#Order_resources_0_selectedResources")
	public WebElement resourcesDdm;



    public void clickPlusAccordingToOptionName(String optionName) {
        Driver.get().findElement(By.xpath("//span[text()='" + optionName + "']/..//button")).click();

    }

    public String getPopupsMessage() {
        WebElement popUpElement = Driver.get().findElement(By.xpath("//div[@role='status']"));
        String message = BrowserUtils.getTextWithJS(Driver.get(), popUpElement);

        return message;
    }






    public void headerConfirmation (String header) {

        WebElement headerInfo = Driver.get().findElement(By.xpath("//*[text()='"+ header +"']"));
        String message = BrowserUtils.getTextWithJS(Driver.get(), headerInfo);
        Assert.assertEquals(header,message);
        BrowserUtils.waitFor(4);


    }




    public void theUserShouldBeRedirectedToTheNewOrderCreationPage() {
        assertTrue(Driver.get().getCurrentUrl().contains("create"));
    }

    public void theUserShouldBeAbleToCreateNewCompany(String placeHolder, String companyName) {
        String fakeDataInfo = BrowserUtils.fakeName();
        boxName(placeHolder).sendKeys(companyName);
        assertEquals(boxName(placeHolder).getAttribute("value"), companyName);

    }

    public void theUserShouldBeAbleToSeeAWarningMessageAs(String message) {
        BrowserUtils.waitFor(2);
        assertEquals(getPopupsMessage(), message);
    }

    public void theUserSelectTheCompanyFromDdm() {
        WebElement button2 = Driver.get().findElement(By.cssSelector("#Order_company"));
        BrowserUtils.clickWithJS(button2);
        button2.sendKeys("Test Techno Consultant" + Keys.ENTER);
    }

    public void theUserSelectTheEmployeeFromDdm(String employee) {
        WebElement button = Driver.get().findElement(By.cssSelector("#order_forEmployee"));
        button.sendKeys(employee+ Keys.ENTER);

    }

    public void theUserSelectTheShippingAdressFromDdm() {
        WebElement button2 = Driver.get().findElement(By.cssSelector("#Order_delivery_address"));
        BrowserUtils.clickWithJS(button2);
        BrowserUtils.waitFor(2);
        button2.sendKeys("Avcilar" + Keys.ENTER);
        assertTrue(button2.isDisplayed());
    }

    public void theUserSelectTheDateFromDatapicker() {
        WebElement button2 = Driver.get().findElement(By.cssSelector("#Order_delivery_date"));
        BrowserUtils.clickWithJS(button2);
        button2.sendKeys("30-11-2023" + Keys.ENTER);
        assertTrue(datapicker.isEnabled());
    }

    public void theUserSelectThePriorityFromTheDdm() {

    }

    public void theUserSelectTheApproverFromTheDdm() {
        WebElement button2 = Driver.get().findElement(By.cssSelector("#Order_approver"));
        BrowserUtils.clickWithJS(button2);
        button2.sendKeys("test@yopmail.com - Test Tester" + Keys.ENTER);
    }

    public void theUserSelectTheContactFromTheDdm() {
        WebElement button2 = Driver.get().findElement(By.cssSelector("#Order_contactUser"));
        BrowserUtils.clickWithJS(button2);
        button2.sendKeys("gpt" + Keys.ENTER);
    }

    public void clickOnTheSectionInTheNavigationMenu(String navigationName) {
        WebElement sidebar = Driver.get().findElement(By.xpath("//span[text()='" + navigationName + "']"));
        BrowserUtils.clickWithJS(sidebar);
    }

    public void theUserShouldBeAbleToAddDataTo(String placeHolder) {
        String fakeDataInfo = BrowserUtils.fakeName();
        boxName(placeHolder).clear();
        boxName(placeHolder).sendKeys(fakeDataInfo);
        assertEquals(boxName(placeHolder).getAttribute("value"), fakeDataInfo);
    }

    public void theUserShouldBeAbleToAddEmailAdressTo(String placeHolder) {
        String fakeEmailInfo = BrowserUtils.fakeEmailAdress();
        boxName(placeHolder).sendKeys(fakeEmailInfo);
        BrowserUtils.waitFor(1);
        assertEquals(boxName(placeHolder).getAttribute("value"), fakeEmailInfo);
    }

    public void theUserShouldBeAbleToRedirectBackToTheListOfOrdersPageAgain() {
        assertTrue(Driver.get().getCurrentUrl().contains("order"));
    }

    public void userFillsInAllRequiredFieldsProperly() {
        WebElement baslamakutusu = boxName("Enter first name");
        String password = "AB123@ab";

        actions.click(baslamakutusu).
                sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys("Avcilar" + Keys.ENTER).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(password).perform();

        BrowserUtils.waitFor(2);
        actions.sendKeys(Keys.TAB).sendKeys(password)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).click().perform();


    }

    public void theUserShouldBeAbleToTypeUpToFivehundredCharactersInTheDescriptionField() {
        String str= faker.lorem().characters(510);
        int strlength = str.length(); //510

        boxName("Enter description").sendKeys(str);

        int textlength = orderEnterDescriptionInfo.getText().length();

        String str500 = order500InputDataCount.getText();//500 / 500

        int bosluk = str500.indexOf(" "); //3

        int fivehundred = Integer.parseInt((str500.substring(0,bosluk))); //500 int

        assertEquals(textlength,fivehundred);

        // Assert.assertNotEquals(strlength,textlength);
    }

    public void theUserShouldSeenNewOrderInformationSection() {
        Assert.assertTrue(Driver.driver.getCurrentUrl().contains("create"));

    }

    public void thenUserShouldBeAbleToClickOnTheDeleteCommentIcon() {
        deleteIcon.click();
        Assert.assertTrue(deleteIcon.isEnabled());
        WebElement deleteConfirmation = Driver.get().findElement(By.xpath("//span[text()='Delete']"));
        BrowserUtils.clickWithJS(deleteConfirmation);

        // Assert.assertFalse(orderPage.deleteIcon.isEnabled());
    }

    public void userShouldBeAbleToEditInformationInTheBox(String placeHolder) {
        String fakeDataInfo = BrowserUtils.fakeName();
        boxName(placeHolder).clear();
        boxName(placeHolder).sendKeys(" "+fakeDataInfo);

        BrowserUtils.waitFor(1);
        assertTrue(boxName(placeHolder).getAttribute("value").contains(fakeDataInfo));
    }

    public void theUserShouldBeAbleToChooseAnOptionAsCatagoryDdmOnTheEditOrderPage() {
        resourcesPage.addResourcesButton.click();
        BrowserUtils.waitFor(2);
        selectCategoryDdm.click();
        BrowserUtils.waitFor(2);
        //  BrowserUtils.waitForVisibility(orderPage.clickDdm("Select Category"),10);
        selectCategoryDdm.sendKeys("Telefon"+Keys.ENTER);
        Assert.assertTrue(selectCategoryDdm.isEnabled());
    }

    public void theUserShouldBeAbleToChooseAnOptionFromResourceDropDowmMenuOnTheEditOrderPage() {
        resourcesQuantityDdm.sendKeys("5");
        Assert.assertTrue(resourcesQuantityDdm.isEnabled());
    }

    public void theUserShouldBeAbleToChooseAQuantityUnderTheResourceOnTheEditOrderPage() {
        resourcesDdm.sendKeys("Apple");
        Assert.assertTrue(resourcesDdm.isEnabled());
    }

    @FindBy(id="order_forEmployee")
    public WebElement forEmployee;
    public void enterName_Description() {
        boxName("Enter name").sendKeys(faker.name().firstName());
        boxName("Enter description").sendKeys(faker.lorem().fixedString(200));


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
        BrowserUtils.clickElement(preferredDeliveryDay,20);
    }

    @FindBy(id="order_site")
    public WebElement orderSite;
    public void selectSite(String site) {
        globalSelectDropdownTargetElement(orderSite, site);
    }

    public void enterReasonForRequest() {
        boxName("Enter reason for request").sendKeys(faker.lorem().fixedString(200));
    }
    @FindBy(id="order_orderItems_0_resource")
    public WebElement resourceDDM;

    @FindBy(id = "order_orderItems_0_resourceItems")
    public WebElement resourceItem;
    public void selectResouce() {
        clickButton("Add resource");
        globalSelectDropdownTargetElement(resourceDDM,ConfigurationReader.get("resourceDDM"));
        globalSelectDropdownTargetElement(resourceItem,ConfigurationReader.get("resourceItemDDM"));
        boxName("Enter quantity").sendKeys("1");

    }
    @FindBy(id="order_lineManagers")
    public WebElement lineManagerDDM;

    @FindBy(id="order_supplier")
    public WebElement supplierDDM;
    public void selectProcessForAdmin() {
        lineManagerDDM.click();
       globalSelectDropdownTargetElement(lineManagerDDM,ConfigurationReader.get("lineManagerDDM"));
       supplierDDM.click();
       globalSelectDropdownTargetElement(supplierDDM,ConfigurationReader.get("supplierDDM"));
    }
    @FindBy(id="order_forEmployee")
    public WebElement employeeDDM;
    public void selectEmployee() {
        forEmployee.click();
        globalSelectDropdownTargetElement(employeeDDM, ConfigurationReader.get("employeeDDM"));
    }


    public void selectProcessforLM() {
        supplierDDM.click();
        globalSelectDropdownTargetElement(supplierDDM,ConfigurationReader.get("supplierDDM"));
    }
    @FindBy(id="order_company")
    public WebElement companyDDM;
    public void selectCompany(String companyName) {
        globalSelectDropdownTargetElement(companyDDM,companyName);
    }

    public void selectLineManager(String lineManager) {
        lineManagerDDM.click();
        globalSelectDropdownTargetElement(lineManagerDDM,lineManager);
    }

    public void selectSupplier(String supplierName) {
        supplierDDM.click();
        globalSelectDropdownTargetElement(supplierDDM,supplierName);
    }

    public void selectResource(String resourceName) {
        globalSelectDropdownTargetElement(resourceDDM,resourceName);
    }

    public void selectResourceItem(String resourceItemName) {
        globalSelectDropdownTargetElement(resourceItem,resourceItemName);
    }
}
