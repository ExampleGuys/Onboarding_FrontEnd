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

public class UsersPage extends BasePage{

    JavascriptExecutor jse = (JavascriptExecutor) driver;






    static Actions actions = new Actions(Driver.get());





    @FindBy(xpath = "//*[@id=\"root\"]/section/aside/div[1]/ul/li[4]/span")
    public WebElement usersElement;

    @FindBy(xpath = "(//div[@class='ant-row css-14bavl3'])[1]")
    public WebElement listofUsers;


    public void assertionForlistofUsersIsVisible() {
        assert (listofUsers.isDisplayed());
    }


    @FindBy(xpath = "//span[@class='ant-breadcrumb-link']")
    public WebElement titleofUsers;


    public void scrollDown(){

        WebElement scrolldownpUsersPage= driver.
                findElement(By.xpath("//*[@id=\"root\"]/section/section/main/div[2]/div[2]/div/div[2]/div/div/div/ul"));
        actions.moveToElement(scrolldownpUsersPage).perform();
    }


    @FindBy(xpath = "//span[@class='ant-select-arrow']")
    public WebElement usersPageArrow;


    @FindBy(xpath = "/*[@id=\"root\"]/section/section/main/")
    public WebElement tenUsers;


    @FindBy(xpath = "//li[@class='ant-pagination-total-text']")
    public WebElement totalNumberOfUsers;

    @FindBy(xpath = "(//a[@rel='nofollow'])[1]")
    public WebElement theNumberofUsers;


}
