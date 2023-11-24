package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Instant;

import static org.junit.Assert.assertTrue;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//div[@class='go3958317564']")
    public WebElement message;

    @FindBy(xpath = "//li[@class='ant-pagination-total-text']")
    public WebElement paginationTotalText;

    @FindBy(xpath = "//div[@aria-label='Page Size']")
    public WebElement pageSelectOptionsDropDown;

    @FindBy(xpath = "(//button[@class='ant-pagination-item-link'])[1]")
    public WebElement paginationItemLinkForPreviousPage;

    @FindBy(xpath = "(//button[@class='ant-pagination-item-link'])[2]")
    public WebElement paginationItemLinkForNextPage;

    @FindBy(xpath = "//button//span[@aria-label='appstore-add']")
    public WebElement customizationColumnSelectButton;

    @FindBy(xpath = "(//button//span[@aria-label='delete'])[1]")
    public WebElement deleteIconForFirstRow;

    @FindBy(xpath = "(//button//span[@aria-label='edit'])[1]")
    public WebElement editIconForFirstRow;

    @FindBy(xpath = "//button[@type='button']//span[text()='Delete']")
    public WebElement deleteButtonAntPopOver;

    @FindBy(id = "resource_company")
    public WebElement globalInputCompanyDropdown;


    Faker faker=new Faker();
    Actions actions = new Actions(Driver.get());
    String fakeContactName = faker.name().fullName();
    String fakeEmail = faker.internet().emailAddress();

    public String getTotalNumberOfThePageInformationText() {

        String[] arr = paginationTotalText.getText().split(" ");
        String totalNumberOfPage = arr[1];
        System.out.println("totalNumberOfPage = " + totalNumberOfPage);
        return totalNumberOfPage;

    }

    public String getSectionName(String sectionName) {
        WebElement section = Driver.get().findElement(By.xpath("//label[text()='" + sectionName + "']"));
        return section.getText();
    }

    public String getHeaderText(String headerText) {
        WebElement headerName = Driver.get().findElement(By.xpath("//thead/tr/th[text()='" + headerText + "']"));
        BrowserUtils.waitForVisibility(headerName, 5);
        return headerName.getText();
    }

    public String toastMessageText() {

        BrowserUtils.waitForVisibility(message, 5);
        return message.getText();
    }

    public String getItemErorMessageText(String itemErorMessageText) {
        WebElement itemName = Driver.get().findElement(By.xpath("//div[text()='" + itemErorMessageText + "']"));
        BrowserUtils.waitForVisibility(itemName, 3);
        return itemName.getText();
    }

    public String getBreadcrumbText(String breadcrumbLinkName) {
        WebElement titleName = Driver.get().findElement(By.xpath("//a[text()='" + breadcrumbLinkName + "']"));
        BrowserUtils.waitForVisibility(titleName, 5);
        return titleName.getText();
    }

    public WebElement getBreadcrumbWebElement(String breadcrumbLinkName) {
        WebElement titleName = Driver.get().findElement(By.xpath("//a[text()='" + breadcrumbLinkName + "']"));
        BrowserUtils.waitForVisibility(titleName, 5);
        return titleName;
    }

    public String getPageTitle() {
        return Driver.get().getTitle();
    }

    public WebElement selectfromPageNumberDropDown(String numberPerPage) {
        WebElement numberOfPageDisplay = Driver.get().findElement(By.xpath("(//div[@class='rc-virtual-list-holder-inner'])/div/div[text()='" + numberPerPage + "']"));
        BrowserUtils.waitForVisibility(numberOfPageDisplay, 5);
        return numberOfPageDisplay;
    }

    public void isClickableCustomizationColumns() {
        BrowserUtils.waitForVisibility(customizationColumnSelectButton, 20);
        BrowserUtils.verifyElementClickable(customizationColumnSelectButton);
    }

    public void clickButton(String buttonName) {
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        BrowserUtils.clickWithJS(button);
    }



    /**
     * Returns the current epoch time in seconds.
     *
     * @return The current epoch time in seconds.
     */
    public String getEpochTime() {
        Instant instant = Instant.now();
        long epochTime = instant.getEpochSecond();
        return String.valueOf(epochTime);
    }

    /**
     * Checks the state of the given element and clicks it if the state is different from the expected state.
     *
     * @param element The element to check and click.
     * @param expectedState The expected state of the element.
     *
     * @throws StaleElementReferenceException If the element no longer exists.
     * ElementNotVisibleException If the element is not visible.
     */
    public void checkAndClickElementIfStateDiffers(WebElement element, String expectedState) {
        String actualState = element.getAttribute("aria-checked");

        if (!actualState.equals(expectedState)) {
            element.click();
        }
    }

    /**
     * Selects the given target element from a global dropdown.
     *
     * @param inputElement The input element that triggers the dropdown.
     * @param targetElement The target element to select from the dropdown.
     *
     * @throws StaleElementReferenceException If the input element or target element no longer exists.
     * @throws TimeoutException If the target element is not visible or clickable within 20 seconds.
     */
    public void globalSelectDropdownTargetElement(WebElement inputElement, String targetElement) {
        BrowserUtils.clickElement(inputElement, 20);
        globalDropdownElementPicker(targetElement);
    }

    /**
     * Selects the given target element from a global dropdown.
     *
     * @param targetElement The target element to select from the dropdown.
     *
     * @throws StaleElementReferenceException If the target element no longer exists.
     * @throws TimeoutException If the target element is not visible or clickable within 20 seconds.
     */
    public void globalDropdownElementPicker(String targetElement) {
        WebElement element = Driver.get().findElement(By.xpath(" //div[@title='" + targetElement + "']//div[1]"));
        BrowserUtils.clickElement(element,20);
    }

    public String getPageHeaderName(String pageHeaderName){
        WebElement pageHeader = Driver.get().findElement(By.xpath("//div[text()='" + pageHeaderName + "']"));
        BrowserUtils.waitForVisibility(pageHeader, 20);
        return pageHeader.getText();
    }
    public WebElement boxName(String boxNameInfo) {
        return Driver.get().findElement(By.xpath("//*[@placeholder='" + boxNameInfo + "']"));
    }

    public void theUserGoesToStagingUrl() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    public void shouldSeenButton(String buttonName) {
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        BrowserUtils.verifyElementDisplayed(button);
    }

    public void shouldClickableButton(String buttonName) {
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        BrowserUtils.verifyElementClickable(button);
    }




}
