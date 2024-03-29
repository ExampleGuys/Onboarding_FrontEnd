package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class OffboardingPage extends BasePage{
    public String selectEmployee;
    @FindBy(id="offboarding_employee")
    public WebElement employeeDDM;
    public void selectEmployee() {
        BrowserUtils.waitFor(2);
       globalSelectDropdownTargetElement(employeeDDM,selectEmployee);
    }

    public void selectLastWorkingDay() {
        boxName("Select last working day").click();
        LocalDate today = LocalDate.now();
        LocalDate lastWorkDay = today.plusWeeks(1);
        String personalLastWorkDay = lastWorkDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        WebElement workingDay = Driver.get().findElement(By.xpath("//td[@title='" + personalLastWorkDay + "']"));
        BrowserUtils.clickWithJS(workingDay);
    }

    @FindBy(xpath = "//input[@placeholder='Enter first name']")
    public WebElement draftFirstName;
    @FindBy(xpath = "//input[@placeholder='Enter middle name']")
    public WebElement draftMiddleName;
    @FindBy(xpath = "//input[@placeholder='Enter last name']")
    public WebElement draftLastName;
    @FindBy(xpath = "//input[@placeholder='Enter private email']")
    public WebElement draftPrivateEmail;

    public void determineOnboardingEmployee() {

    BrowserUtils.waitFor(2);
    draftPrivateEmail.click();
    String email = boxName("Enter private email").getAttribute("value");

    draftFirstName.click();
    String firstName= boxName("Enter first name").getAttribute("value");

    draftMiddleName.click();
    String middleName=boxName("Enter middle name").getAttribute("value");

    draftLastName.click();
    String lastName=boxName("Enter last name").getAttribute("value");

    selectEmployee = email+" | "+firstName+" "+middleName+" "+lastName;
        System.out.println(selectEmployee);
    }

    @FindBy(xpath = "(//*[text()='Not Started'])[1]")
    public WebElement resourcesStatus;
    @FindBy(xpath = "(//*[@aria-label='close'])[1]")
    WebElement closeIcon;
    @FindBy(xpath = "(//button//span[text()='OK'])[2]")
    WebElement okButton;
    @FindBy(xpath = "(//div//span[@class='ant-radio-button'])[3]")
    WebElement completedRadioButton;
    public void setOnboardingStatusToCompleted() {
        clickButton("Approve");
        clickButton("Save");
        BrowserUtils.clickElement(checkCircleForFirstRow,20);
        globalSelectDropdownTargetElement(resourcesStatus,"Completed");
        BrowserUtils.waitFor(2);
        BrowserUtils.clickElement(okButton,20);
        BrowserUtils.waitFor(2);
        BrowserUtils.clickElement(closeIcon,20);
        BrowserUtils.waitFor(4);
        BrowserUtils.clickElement(firstElementNameOfTable,20);
        BrowserUtils.waitFor(3);
        clickButton("Completed");
        clickButton("Save");
            }

    public void setOffboardingStatusToCompleted() {
        clickButton("Approve");
        clickButton("Save");
        BrowserUtils.clickElement(checkCircleForFirstRow,20);
        globalSelectDropdownTargetElement(resourcesStatus,"Completed");
        BrowserUtils.waitFor(2);
        BrowserUtils.clickElement(okButton,20);
        BrowserUtils.waitFor(2);
        BrowserUtils.clickElement(closeIcon,20);
        BrowserUtils.waitFor(2);
        BrowserUtils.clickElement(firstElementNameOfTable,20);
        clickButton("Completed");
        clickButton("Save");
    }
    @FindBy(id="offboarding_company")
    public WebElement companyDDM;
    public void selectCompany(String companyName) {
        globalSelectDropdownTargetElement(companyDDM,companyName);

    }
}
