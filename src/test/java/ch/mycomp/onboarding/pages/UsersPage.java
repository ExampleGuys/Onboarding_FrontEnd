package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import com.github.javafaker.Faker;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.PortUnreachableException;
import java.util.List;

import static ch.mycomp.onboarding.utilities.Driver.driver;

public class UsersPage extends BasePage {


    Actions actions = new Actions(driver);

    @FindBy(xpath = "//*[text()='List of Users']")
    public WebElement titleofUsers;

    @FindBy(xpath = "//*[@id=\"root\"]/section/aside/div[1]/ul/li[4]/span")
    public WebElement usersElement;

    @FindBy(xpath = "(//div[@class='ant-row css-14bavl3'])[1]")
    public WebElement listofUsers;
    @FindBy(xpath = "//*[@class='ant-select-arrow'] ")
    public WebElement usersPageArrow;

    @FindBy(xpath = "//*[@id=\"root\"]/section/aside/div[1]/ul/li[4]/span")
    public WebElement tenUsersChosen;

    @FindBy(xpath = "(//*[@type='button'])[2]")
    public WebElement newUsersButton;

    @FindBy(xpath = "(//*[@rel='nofollow'])[1]")
    public WebElement listOfTenUsers;

    @FindBy(xpath = "//li[@class='ant-pagination-total-text']")
    public WebElement totalNumberOfUsers;
    @FindBy(xpath = "//*[@id=\"User\"]/div/div[1]/div/div[7]/div/div/div[1]/label/div/button/span")
    public WebElement newUsersSiteArrow;

    @FindBy(xpath = "//*[@id=\"contact_zipCode\"]")
    public WebElement zipCodeTextField;

    @FindBy(xpath = "//*[@id=\"root\"]/section/section/main/div[2]/div[2]/div/div[2]/div/div/div/ul")
    public WebElement endOfUsersPage;

    @FindBy(xpath = "//*[@placeholder='Enter personal email']")
    public WebElement newUserEmailField;

    @FindBy(xpath = "//input[@placeholder='Enter password']")
    public WebElement newUserPasswordField;

    @FindBy(xpath = "//*[text()='Password must be between 8 and 20 characters']")
    public WebElement newUserPasswordWarningMessage;

    @FindBy(xpath = "//*[@placeholder='Enter first name']")
    public WebElement newUserFirstNameField;

    @FindBy(xpath = "//*[@placeholder='Enter last name']")
    public WebElement newUserLastNameField;

    @FindBy(xpath = "(//*[@class='ant-select-selection-search'])[1]")
    public WebElement newUserRoleField;

    @FindBy(xpath = "//*[@id='User_company']")
    public WebElement newUserCompanyField;

    @FindBy(xpath = "(//*[@class='ant-select-selector'])[3]")
    public WebElement newUserSiteField;

    @FindBy(xpath = "//*[@aria-label='barcode']")
    public WebElement newUserGeneratePasswordButton;

    @FindBy(xpath = "//*[@id=\"User\"]/div/div[3]/button[2]/span[2]")
    public WebElement newUserCreatedButton;

    @FindBy(xpath = "//*[@class='ant-table-row ant-table-row-level-0']")
    public WebElement usersTableRowNumber;

    public void scrolldownPage() {

        WebElement downPage = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div[2]/div[2]/div/div[2]/div/div/div/ul"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", downPage);
        jse.executeScript("arguments[0].click();", downPage);

    }

    public void assertionForlistofUsersIsVisible() {
        assert (listofUsers.isDisplayed());
    }

    public void actionsUsers() {

        WebElement usersList = driver.findElement(By.xpath("(//span[@role='img'])[38]"));
        actions.contextClick(usersList).perform();
    }

    public void assertionListOfTenUsersIsDisplayed() {
        assert (listOfTenUsers.isDisplayed());
    }

    public void theUserSelectsARoleFromTheRoleDropdown(String targetListElement) {
        globalSelectDropdownTargetElement(newUserRoleField, targetListElement);
    }

    public void theUserSelectsACompanyInTheCompanyBox(String targetListElement){
        globalSelectDropdownTargetElement(newUserCompanyField,targetListElement);

    }

    public void theUserSelectsASiteInTheSiteBox(String targetSite) {
        BrowserUtils.waitForClickability(newUserSiteField,20);
        globalSelectDropdownTargetElement(newUserSiteField,targetSite);
    }

    }

