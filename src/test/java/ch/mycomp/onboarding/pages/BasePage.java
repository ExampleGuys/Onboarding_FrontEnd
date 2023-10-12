package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='go3958317564']")
    public WebElement message;

    public String getSectionName(String sectionName) {
        WebElement section = Driver.get().findElement(By.xpath("//label[text()='" + sectionName + "']"));
        return section.getText();
    }

    public String getHeaderText(String headerText) {
        WebElement headerName = Driver.get().findElement(By.xpath("//thead/tr/th[text()='" + headerText + "']"));
        BrowserUtils.waitForVisibility(headerName,5);
        return headerName.getText();
    }

    public String toastMessageText() {

        BrowserUtils.waitForVisibility(message, 3);
        return message.getText();
    }

    // Total Page amounts bottom of the page
    @FindBy (xpath = "//li[@class='ant-pagination-total-text']")
    public WebElement totalNumber;

}
