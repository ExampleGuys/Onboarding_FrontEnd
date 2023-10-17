package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.Driver;
import com.github.javafaker.Animal;
import com.github.javafaker.Faker;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.PortUnreachableException;

public class UsersPage extends BasePage{

    Faker faker = new Faker();

    String newUserFakeName = faker.name().fullName();

    String newUserFakeEmail = faker.internet().emailAddress();

    @FindBy(xpath = "//*[@id=\"root\"]/section/aside/div[1]/ul/li[4]/span")
    public WebElement usersElement;

    @FindBy(xpath = "(//div[@class='ant-row css-14bavl3'])[1]")
    public WebElement listofUsers;


    @FindBy(xpath = "(//*[@type='button'])[2]")
    public WebElement newUserButton;

    public void assertionForlistofUsersIsVisible() {
        assert (listofUsers.isDisplayed());


    }



    public WebElement firstNameNewUser(String firstNameNewUser) {
        return Driver.get().findElement(By.xpath("//*[@placeholder='" + firstNameNewUser + "']"));
    }

    public WebElement lastNameNewUser(String lastNameNewUser) {
        return Driver.get().findElement(By.xpath("//*[@placeholder='" + lastNameNewUser + "']"));
    }

    public WebElement personalEmailNewUser(String personalEmailNewUser) {
        return Driver.get().findElement(By.xpath("//*[@placeholder='" + personalEmailNewUser + "']"));
    }


    public WebElement roleNewUser(String roleNewUser) {
            return Driver.get().findElement(By.xpath("//*[@placeholder='" + roleNewUser + "']"));

    }

    public WebElement companyNewUser(String companyNewUser) {
        return Driver.get().findElement(By.xpath("//*[@placeholder='" + companyNewUser + "']"));

    }

    public WebElement passwordNewUser(String passwordNewUser) {
        return Driver.get().findElement(By.xpath("//*[@placeholder='" + passwordNewUser + "']"));

    }

    public WebElement passwordAgainNewUser(String passwordAgainNewUser) {
        return Driver.get().findElement(By.xpath("//*[@placeholder='" + passwordAgainNewUser + "']"));

    }



//    public WebElement roleNewUser(String roleNewUser) {
 //       return Driver.get().findElement(By.xpath("//*[@placeholder='" + roleNewUser + "']"));

//    }


    public WebElement roleNewUserddm(String roleNewUserddm) {
        return Driver.get().findElement(By.xpath("//*[text()='Select the role']"));
    }



    @FindBy(xpath = "//*[@placeholder='Enter first name']")
    public WebElement newUserFirstName;

    @FindBy(xpath = "//*[@placeholder='Enter last name']")
    public WebElement newUserLastName;

    @FindBy(xpath = "//*[@placeholder='Enter personal email']")
    public WebElement newUserPersonelEmail;

    @FindBy(xpath = "//*[@id=\"User_role\"]")
    public WebElement newUserRole;

    @FindBy(xpath = "//*[@aria-controls='User_company_list']")
    public WebElement newUserCompany;

    @FindBy(xpath = "//*[@id=\"User_firstName\"]")
    public WebElement newUserSite;

    @FindBy(xpath = "//*[@id=\"User_firstName\"]")
    public WebElement newUserPassword;

    @FindBy(xpath = "//*[@id=\"User_firstName\"]")
    public WebElement newUserPasswordAgain;

    @FindBy(xpath = "//*[@id=\"User_firstName\"]")
    public WebElement newUserCreatButton;


}
