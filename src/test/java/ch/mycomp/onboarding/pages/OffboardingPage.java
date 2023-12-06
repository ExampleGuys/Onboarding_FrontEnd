package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class OffboardingPage extends BasePage{
    public String selectEmployee;
    @FindBy(id = "offboarding_employee")
    public WebElement employeeDDM;
    public void selectEmployee() {
        employeeDDM.sendKeys(selectEmployee);
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

    @FindBy(id = "onboarding_firstName")
    public WebElement draftFirstName;
    @FindBy(id = "onboarding_middleName")
    public WebElement draftMiddleName;
    @FindBy(id = "onboarding_lastName")
    public WebElement draftLastName;
    @FindBy(id = "onboarding_privateEmail")
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
}
