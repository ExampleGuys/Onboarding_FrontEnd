package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public abstract class BasePage {

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
    public String getItemErorMessageText(String itemErorMessageText){
        WebElement itemName =Driver.get().findElement(By.xpath("//div[text()='" + itemErorMessageText + "']"));
        BrowserUtils.waitForVisibility(itemName,3);
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

    public String getPageTitle(String pageTitle) {
        return Driver.get().getTitle();
    }

    public WebElement selectfromPageNumberDropDown(String numberPerPage){
        WebElement numberOfPageDisplay = Driver.get().findElement(By.xpath("(//div[@class='rc-virtual-list-holder-inner'])/div/div[text()='" + numberPerPage + "']"));
        BrowserUtils.waitForVisibility(numberOfPageDisplay,5);
        return numberOfPageDisplay;
    }

    public void isClickableCustomizationColumns() {
        BrowserUtils.waitForVisibility(customizationColumnSelectButton,20);
        assertTrue(customizationColumnSelectButton.isEnabled());
    }

    public void clickButton(String buttonName) {
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        BrowserUtils.clickWithJS(button);
    }
}
