package ch.mycomp.onboarding.pages;

import com.github.javafaker.Faker;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.PortUnreachableException;

public class UsersPage extends BasePage{





    @FindBy(xpath = "//*[@id=\"root\"]/section/aside/div[1]/ul/li[4]/span")
    public WebElement usersElement;

    @FindBy(xpath = "(//div[@class='ant-row css-14bavl3'])[1]")
    public WebElement listofUsers;


    public void assertionForlistofUsersIsVisible() {
        assert (listofUsers.isDisplayed());


    }
}
