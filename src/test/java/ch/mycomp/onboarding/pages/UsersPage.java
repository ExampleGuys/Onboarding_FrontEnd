package ch.mycomp.onboarding.pages;

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

import static ch.mycomp.onboarding.utilities.Driver.driver;

public class UsersPage extends BasePage {


    Actions actions = new Actions(driver);


    public void scrolldownPage() {

        WebElement downPage = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div[2]/div[2]/div/div[2]/div/div/div/ul"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", downPage);
        jse.executeScript("arguments[0].click();", downPage);


    }


    @FindBy(xpath = "//*[text()='List of Users']")
    public WebElement titleofUsers;

    @FindBy(xpath = "//*[@id=\"root\"]/section/aside/div[1]/ul/li[4]/span")
    public WebElement usersElement;

    @FindBy(xpath = "(//div[@class='ant-row css-14bavl3'])[1]")
    public WebElement listofUsers;

    public void assertionForlistofUsersIsVisible() {
        assert (listofUsers.isDisplayed());

    }


    @FindBy(xpath = "//*[@class='ant-select-arrow'] ")
    public WebElement usersPageArrow;


    @FindBy(xpath = "//*[@id=\"root\"]/section/aside/div[1]/ul/li[4]/span")
    public WebElement tenUsersChosen;

    public void actionsUsers() {

        WebElement usersList = driver.findElement(By.xpath("(//span[@role='img'])[38]\""));
        actions.contextClick(usersList).perform();


    }


    @FindBy(xpath = "(//*[@type='button'])[2]")
    public WebElement newUsersButton;

    @FindBy(xpath = "//*[@rel='nofollow'])[1]")
    public WebElement listOfTenUsers;

    public void assertionListOfTenUsersIsDisplayed() {
        assert (listOfTenUsers.isDisplayed());

    }

    @FindBy(xpath = "//li[@class='ant-pagination-total-text']")
    public WebElement totalNumberOfUsers;

    @FindBy(xpath = "//*[@id=\"User\"]/div/div[1]/div/div[7]/div/div/div[1]/label/div/button/span")
    public WebElement newUsersSiteArrow;


    @FindBy(xpath = "//*[@id=\"contact_zipCode\"]")
    public WebElement zipCodeTextField;


    @FindBy(xpath = "//*[@id=\"root\"]/section/section/main/div[2]/div[2]/div/div[2]/div/div/div/ul")
    public WebElement endOfUsersPage;

    //*[@placeholder='Enter first name']

    @FindBy(xpath = "//*[@placeholder='Enter first name']")
    public WebElement newUserEmailField;



    @FindBy(xpath = "//input[@placeholder='Enter password']")
    public WebElement newUserPasswordField;



    @FindBy(xpath = "//*[text()='Password must be between 8 and 20 characters']")
    public WebElement newUserPasswordWarningMessage;

}