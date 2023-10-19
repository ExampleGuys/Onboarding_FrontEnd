package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage{

    @FindBy(css = "#Order_company")
    public WebElement ddm1;

    @FindBy(css = "div[class='ant-form-item-control-input-content'] span textarea[id='Order_description']")
    public WebElement orderEnterDescriptionInfo;
    @FindBy(xpath = "(//span [@class='ant-input-data-count'])[1]")
    public WebElement order500InputDataCount;

    @FindBy(css="#Order_delivery_date")
    public WebElement datapicker;

    @FindBy(css="#Order_priority")
    public WebElement priorityDdm;

	@FindBy(xpath = "//h4 [@class ='ant-list-item-meta-title']")
	public WebElement CommentDeleteConfirmationInfo;
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

    public WebElement boxName(String boxNameInfo) {
        return Driver.get().findElement(By.xpath("//*[@placeholder='" + boxNameInfo + "']"));
    }

    public WebElement ddmBox(String ddmInfo) {
        return Driver.get().findElement(By.cssSelector("[title='"+ddmInfo+"']"));
    }

    public WebElement boxNAme2(String boxNameInfo2) {
        return Driver.get().findElement(By.xpath("//span[text()='" + boxNameInfo2 + "']"));

    }

    public void headerConfirmation (String header) {

        WebElement headerInfo = Driver.get().findElement(By.xpath("//*[text()='"+ header +"']"));
        String message = BrowserUtils.getTextWithJS(Driver.get(), headerInfo);
        Assert.assertEquals(header,message);
        BrowserUtils.waitFor(4);


    }

    public WebElement clickDdm(String ddNAme){
        return Driver.get().findElement(By.xpath("//span[text()='"+ ddNAme+"']"));
    }


}
