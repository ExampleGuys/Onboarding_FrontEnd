package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OnboardingPage extends BasePage {

    @FindBy(id = "onboarding_personTitle")
    public WebElement personalTitle;




    public void selectPersonalTitle() {
        personalTitle.click();
        String[] personalTitleList = {"Mr", "Mrs", "Miss", "Ms", "Dr (Male)", "Dr (Female)"};
        int random = (int) (Math.random() * personalTitleList.length);
        String randomTitle = personalTitleList[random];
        WebElement personalTitle = Driver.get().findElement(By.xpath("//div[@title='" + randomTitle + "']"));
        personalTitle.click();
    }

    public void selectBirthDate() {
        boxName("Select birth date").click();
        LocalDate today = LocalDate.now();
        LocalDate birthday = today.minusYears(16);
        String birthdayPersonal = birthday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        WebElement birthDate = Driver.get().findElement(By.xpath("//*[@title='" + birthdayPersonal + "']"));
        birthDate.click();
    }
    @FindBy(id = "onboarding_site")
    public WebElement site;

    @FindBy(id="onboarding_department")
    public WebElement department;

    @FindBy(id = "onboarding_resources_0_resource")
    public WebElement resourceDDM;

    @FindBy(id = "onboarding_resources_0_resourceItems")
    public WebElement resourceItem;

    public void selectFirstWorkingDay(){
        boxName("Select first working day").click();
        LocalDate today = LocalDate.now();
        LocalDate firstWorkDay = today.plusWeeks(1);
        String personalFirstWorkDay = firstWorkDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        WebElement workingDay = Driver.get().findElement(By.xpath("//td[@title='" + personalFirstWorkDay + "']"));
        BrowserUtils.clickWithJS(workingDay);
    }
    public void selectCompletionDateAtLatest() {
        boxName("Select completion date").click();
        LocalDate today = LocalDate.now();
        LocalDate complDay = today.plusWeeks(1);
        String completeDate = complDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        WebElement comp_date = Driver.get().findElement(By.xpath("(//tr//td[@title='" + completeDate + "'])[2]"));
        BrowserUtils.clickWithJS(comp_date);

    }

    @FindBy(id="onboarding_company")
    public WebElement companyDDM;
    public void selectCompany(String companyName) {
        globalSelectDropdownTargetElement(companyDDM,companyName);

    }

    public void theUserEnterInToField(String fieldName, String boxName) {

        switch (fieldName){
            case "firstName":
            case "middleName":
                boxName(boxName).sendKeys(faker.name().firstName());
                break;
            case "lastName":
                boxName(boxName).sendKeys(faker.name().lastName());
                break;
            case "privateEmail":
                boxName(boxName).sendKeys(faker.internet().emailAddress());
                break;
            case "orderName":
                boxName(boxName).sendKeys(faker.commerce().productName());
                break;



        }



    }

    public void selectDepartment(String departmentName) {
        globalSelectDropdownTargetElement(department,departmentName);
    }

    public void selectResource(String resourceName) {
        globalSelectDropdownTargetElement(resourceDDM, resourceName);

    }

    public void selectResourceItem(String resourceItemName) {
        globalSelectDropdownTargetElement(resourceItem,resourceItemName);
    }

    public void selectSite(String siteName) {
        globalSelectDropdownTargetElement(site,siteName);
    }
}