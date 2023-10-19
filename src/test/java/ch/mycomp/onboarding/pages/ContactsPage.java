package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.*;

public class ContactsPage extends BasePage {

    Faker faker = new Faker();
    OrderPage orderPage = new OrderPage();

    String fakeContactName = faker.name().fullName();
    String fakeEmail = faker.internet().emailAddress();

    @FindBy(xpath = "((//td[@class='ant-table-cell'])/b[1])[1]")
    public WebElement lastCreatedContactName;

    @FindBy(xpath = "((//td[@class='ant-table-cell'])/span[1])[1]")
    public WebElement lastCreatedEmail;

    @FindBy(xpath = "//div[@class='ant-card-body']")
    public WebElement listOfContactsTable;

    @FindBy(xpath = "(//tbody[@class='ant-table-tbody'])/tr")
    List<WebElement> contactsListInOnePage;

    public void clickItemsOnTheNavigationMenu(String navigationMenuItem) {
        WebElement sidebar = Driver.get().findElement(By.xpath("(//li[@role='menuitem'])//span[text()='" + navigationMenuItem + "']"));
        BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(sidebar);
    }

    public WebElement getButton(String buttonName) {
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        return button;
    }

    public void writeContactNameInTheTextBox(String placeHolder) {
        orderPage.boxName(placeHolder).sendKeys(fakeContactName);

    }

    public void writeContactNameWithNumber(String placeHolder) {
        orderPage.boxName(placeHolder).sendKeys("123" + fakeContactName + "123");
    }

    public void writeEmailInTheTextBox(String placeHolder) {
        orderPage.boxName(placeHolder).sendKeys(fakeEmail);

    }

    public void checkContactNames() {
        assertTrue(lastCreatedContactName.getText().equals(fakeContactName));
        System.out.println("lastCreatedContactName = " + lastCreatedContactName.getText());
        System.out.println("fakeContactName = " + fakeContactName);
    }

    public void checkEmailAddresses() {
        assertTrue(lastCreatedEmail.getText().equals(fakeEmail));
        System.out.println("lastCreatedEmail = " + lastCreatedEmail.getText());
        System.out.println("fakeEmail = " + fakeEmail);
    }

    public void clickCreateButtonWithoutWait(String buttonName) {
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        BrowserUtils.clickElement(button, 5);
    }

    public int countContacts() {
        return contactsListInOnePage.size();

    }

}
