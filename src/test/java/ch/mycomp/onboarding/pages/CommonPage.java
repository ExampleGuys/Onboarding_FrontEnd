package ch.mycomp.onboarding.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage extends BasePage{

    // > Giristeki listOf_Title]
    @FindBy(xpath = "//div[text()='List of Resources']")
    public WebElement listOf_Title;

    // > Giristeki createdAtTitle]
    @FindBy(xpath = "//th[text()='Created At']")//th[normalize-space()='Created At']
    public WebElement createdAtTitle;

    // > Giristeki createdBy-Title]
    @FindBy(xpath = "//th[text()='Created By']")//th[normalize-space()='Created By']
    public WebElement createdByTitle;

    // > searchBoxButton]
    @FindBy(xpath = "//span[@class='ant-input-wrapper ant-input-group css-14bavl3']") //(//input[@placeholder='Search by name...'])[1]
    public WebElement searchBoxButton;
}
