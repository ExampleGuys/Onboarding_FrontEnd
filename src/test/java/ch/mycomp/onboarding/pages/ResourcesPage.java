package ch.mycomp.onboarding.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResourcesPage extends BasePage{

    //Resources >resourcesSite
    @FindBy(xpath = "(//div[@class='ant-row css-14bavl3'])[1]")
    public WebElement resourcesSite;

    //Resources >listOfResourcesTitleText
    @FindBy(xpath = "//div[text()='List of Resources']")
    public WebElement listOfResourcesTitleText;

    //Resources > Category Name Title
    @FindBy(xpath = "//label[@title='Category Name']")
    public WebElement categoryNameTitle;

    //Resources > List of Resources altindaki ilk sütun/searchBoxFirstLine
    @FindBy(xpath = "(//tr[@class='ant-table-row ant-table-row-level-0'])[1]")
    public WebElement searchBoxFirstLine;







}
