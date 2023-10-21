package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class OnboardingPage extends BasePage {
    public static String totalNumberOfItems;

    // Onboarding>Create new Onboarding> Personal Information Headline
    @FindBy(xpath = "//h2[text()='Personal Information']")
    public WebElement headlinePersonalInformation;

    // Onboarding>Create new Onboarding> Company Registration Headline
    @FindBy(xpath = "//h2[text()='Company Registration']")
    public WebElement headlineCompanyRegistration;

    // Onboarding>Create new Onboarding> Resources Headline
    @FindBy(xpath = "//h2[text()='Resources']")
    public WebElement headlineResources;

    // Onboarding>Create new Onboarding> Completion Date at Latest Headline
    @FindBy(xpath = "//h2[text()='Completion Date at The Latest']")
    public WebElement headlineCompletionDateAtTheLatest;

    // Onboarding>Create new Onboarding> Comments Headline
    @FindBy(xpath = "//h2[text()='Comments']")
    public WebElement headlineComments;

    // Onboarding> List Of OnBoarding > Show Logs button
    @FindBy(xpath = "(//*[@class='ant-space-item'])[4]")
    public WebElement buttonShowLogs;

    @FindBy(xpath = "//div[text()='Drafts']")
    public WebElement draftsTab;

    @FindBy(xpath = "(//tbody[@class='ant-table-tbody']//tr[1]/td[9]//button)[2]")
    public WebElement editIconInTheTableFirstRowInTheActionSection;
    @FindBy(xpath = "//h2[text()='Attachments']")
    public WebElement headlineAttechmentsSection;

    @FindBy(xpath = "//span[@aria-label='upload']")
    public WebElement attahmentUpload;

    @FindBy(xpath = "//tbody[@class='ant-table-tbody']//tr[1]")
    public WebElement firstRowinTheListOfOnboardingTable;

    @FindBy(xpath = "//a[text()='Onboardings']")
    public WebElement linkOfOnboardings;

    @FindBy(xpath = "//div[text()='Completed Requests']")
    public WebElement completedRequestsTab;

    @FindBy(xpath = "(//tbody[@class='ant-table-tbody']//tr[1]/td[9]//button)[2]")
    public WebElement iconViewMoreFirstRowofTable;
    @FindBy(xpath = "//*[@class='ant-modal-content']")
    WebElement modalShowLogs;
    @FindBy(xpath = "(//tbody[@class='ant-table-tbody']//tr[1]/td[9]//button)[3]")
    static WebElement deleteIconOfTheFirstElementOfOnboardingList;

    @FindBy(xpath = "//*[text()='Cancel']")
    WebElement buttonCancel;

    @FindBy(xpath = "//div[text()='All']")
    public WebElement AllTab;

    @FindBy(xpath = "//div[text()='Completed Requests']")
    public WebElement CompletedTab;

    @FindBy(xpath = "//li[@class='ant-pagination-total-text']")
    public static WebElement totalOnboardingSection;


    @FindBy(xpath = "//input[@placeholder='Enter a comment']")
    public WebElement inputCommentArea;

    @FindBy(xpath = "(//span[@aria-label='delete'])[6]")
    public WebElement deleteIconInTheCommentsSection;

    @FindBy(xpath = "//h4[@class='ant-list-item-meta-title']")
    public WebElement addedCommentList;

    @FindBy(id = "onboarding_employee_personalTitle")
    public WebElement personalTitle;

    @FindBy(id = "onboarding_employee_firstName")
    public WebElement personalFirstName;

    @FindBy(id = "onboarding_employee_lastName")
    public WebElement personalLastName;

    @FindBy(id = "onboarding_employee_email")
    public WebElement personalEmail;

    @FindBy(id = "onboarding_birthDate")
    public WebElement personalBirthDate;

    @FindBy(id = "onboarding_employee_address")
    public WebElement selectCompanyAddress;

    @FindBy(id = "onboarding_firstWorkingDay")
    public WebElement firstWorkingDay;

    @FindBy(xpath = "//input[@id='onboarding_completionDate']")
    public WebElement completionDateAtLatest;
    @FindBy(xpath = "(//tbody//tr//td[@class='ant-table-cell'])[5][1]")
    WebElement createdTheNewOnboardingColumnAndRow;
    @FindBy(xpath = "//div[@class='ant-picker-date-panel']")
    public WebElement calendarPanel;

    public void assertionDeleteIconIsClickable() {
        assert (deleteIconInTheCommentsSection.isEnabled());
    }

    public void assertionForPersonalInformationHeadlineIsVisible() {
        assert (headlinePersonalInformation.isDisplayed());
    }

    public void assertionForCompanyRegistrationHeadlineIsVisible() {
        Assert.assertTrue(headlineCompanyRegistration.isDisplayed());
    }

    public void assertionForResourcesHeadlineIsVisible() {
        Assert.assertTrue(headlineResources.isDisplayed());
    }

    public void assertionForCompletionDateAtTheLatestHeadlineIsVisible() {
        Assert.assertTrue(headlineCompletionDateAtTheLatest.isDisplayed());
    }

    public void assertionForCommentsIsVisible() {
        assert (headlineComments.isDisplayed());
    }

    public void assertionForShowLogsIcon() {
        assert (buttonShowLogs.isDisplayed());
    }

    public void clickOnDraftsTab() {
        BrowserUtils.clickElement(draftsTab, 20);
    }

    public void clickEditIconInTheTable() {
        BrowserUtils.clickElement(editIconInTheTableFirstRowInTheActionSection, 20);
    }

    public void assertionForAttechmentsHeadlineIsVisible() {
        assert (headlineAttechmentsSection.isDisplayed());
    }

    public void assertionAttachmentUploadButton() {
        assert (attahmentUpload.isDisplayed());
    }

    public void assertionFirstRowOOnboardingList() {
        assert firstRowinTheListOfOnboardingTable.isDisplayed();
    }

    public void clickOnLinkOfOnboardings() {
        BrowserUtils.clickElement(linkOfOnboardings, 20);
    }

    public void assertionLinkOfOnboardings() {
        BrowserUtils.clickElement(linkOfOnboardings, 20);
        String expectedUrl = "https://staging.onboarding.mycomp.ch/onboarding";
        String actualUrl = Driver.get().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    public void clickOnCompletedRequestsTab() {
        BrowserUtils.clickElement(completedRequestsTab, 20);
    }

    public void clickOnViewMoreIcon() {
        clickOnCompletedRequestsTab();
        BrowserUtils.waitForPageToLoad(3);
        BrowserUtils.clickElement(iconViewMoreFirstRowofTable, 20);
    }

    public void assertionRedirectToEditOnboardingPage() {
        BrowserUtils.waitForPageToLoad(3);
        assertionForPersonalInformationHeadlineIsVisible();
    }

    public void clickOnShowLogIcon() {
        BrowserUtils.clickElement(buttonShowLogs, 20);
    }

    public void assertionShowLogsModal() {
        assert (modalShowLogs.isDisplayed());
    }

    public void clickDeleteIconOfTeFirstElementOfOnboardingList() {
        totalNumberOfItems = totalOnboardingSection.getText();
        BrowserUtils.clickElement(deleteIconOfTheFirstElementOfOnboardingList, 20);
    }

    public void assertionCancelButtonWorkingProperly(String buttonName) {
        assert (!(buttonCancel.isDisplayed()));
    }

    public void assertionRedirectToNewOnboardingPage() {
        String expectedUrl = "https://staging.onboarding.mycomp.ch/onboarding/create";
        String actualUrl = Driver.get().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    public void clickOnAllTab() {
        BrowserUtils.clickElement(AllTab, 20);
    }

    public void assertionAllOnboardingsVisible() {
        String expectedUrl = "https://staging.onboarding.mycomp.ch/onboarding?page=&isCompleted=";
        String actualUrl = Driver.get().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    public void assertionDraftOnboardingsVisible() {
        String expectedUrl = "https://staging.onboarding.mycomp.ch/onboarding?page=&isCompleted=false";
        String actualUrl = Driver.get().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    public void clickOnCompletedTab() {
        BrowserUtils.clickElement(CompletedTab, 20);
    }

    public void assertionCompletedOnboardingsVisible() {
        String expectedUrl = "https://staging.onboarding.mycomp.ch/onboarding?page=&isCompleted=true";
        String actualUrl = Driver.get().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    public void assertionTotalOnboardingItemIsChanged() {
        String totalNumberOfItemsActual = totalOnboardingSection.getText();
        Assert.assertEquals(totalNumberOfItems, totalNumberOfItemsActual);
    }

    public void clickTheButton(String buttonName) {
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        BrowserUtils.clickWithJS(button);
    }

    public void assertionXXXButtonClickable(String buttonName) {
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        assert (button.isEnabled());
    }

    public void inputCommentArea() {
        inputCommentArea.sendKeys("Hello");
    }


    public void assertionShowLogsIconIsClickable() {
        assert (buttonShowLogs.isEnabled());
    }

    public void assertionNewCommentHasBeenAdded() {
        assert (addedCommentList.isDisplayed());
    }

    public void clickOnDeleteIcon() {
        BrowserUtils.clickElement(deleteIconInTheCommentsSection, 20);
    }

    public void assertionCommentsNotVisible() {
        assert (!(addedCommentList.isDisplayed()));
    }

    public void selectPersonalTitle() {
        personalTitle.click();
        String[] personalTitleList = {"Mr", "Mrs", "Miss", "Ms", "Dr (Male)", "Dr (Female)"};
        int random = (int) (Math.random() * personalTitleList.length);
        String randomTitle = personalTitleList[random];
        WebElement personalTitle = Driver.get().findElement(By.xpath("//div[@title='" + randomTitle + "']"));
        personalTitle.click();
    }

    public void enterFirstNameLastNameEmail() {
        personalFirstName.sendKeys(faker.name().firstName());
        personalLastName.sendKeys(faker.name().lastName());
        personalEmail.sendKeys(faker.internet().emailAddress());
    }

    public void selectBirthDate() {
        personalBirthDate.click();
        LocalDate today = LocalDate.now();
        LocalDate birthday = today.minusYears(16);
        String birthdayPersonal = birthday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        WebElement birthDate = Driver.get().findElement(By.xpath("//*[@title='" + birthdayPersonal + "']"));
        birthDate.click();
    }

    public void fillsCompanyRegistrationArea() {
        selectCompanyAddress.click();
        WebElement adress = Driver.get().findElement(By.xpath("//div[@title='Avcilar']"));
        adress.click();
        firstWorkingDay.click();
        LocalDate today = LocalDate.now();
        LocalDate firstWorkDay = today.plusWeeks(1);
        String personalFirstWorkDay = firstWorkDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        WebElement workingDay = Driver.get().findElement(By.xpath("//*[@title='" + personalFirstWorkDay + "']"));
        workingDay.click();
    }

    public void selectCompletionDateAtLatest() {
        completionDateAtLatest.click();
        LocalDate today = LocalDate.now();
        LocalDate complationDay = today.plusWeeks(1);
        String resourceCompDate = complationDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        WebElement compDateAtLatest = Driver.get().findElement(By.xpath("(//tbody//tr//td[@title='" + resourceCompDate + "'])[2]"));
        compDateAtLatest.click();
    }

    public void fillsAResourcesArea() {
        WebElement deleteIcon = Driver.get().findElement(By.xpath("(//span[@aria-label='delete'])[1]"));
        List<WebElement> countDeleteIcon = Driver.get().findElements(By.xpath("//span[@aria-label='delete']"));

        for (int i = 0; i < countDeleteIcon.size(); i++) {
            deleteIcon.click();
            WebElement deleteButton = Driver.get().findElement(By.xpath("//button//span[text()='Delete']"));
            BrowserUtils.clickWithJS(deleteButton);
        }

    }

    public void assertionCreatedNewOnboardingIsDisplayed() {
       LocalDateTime now = LocalDateTime.now();
       String localDate= now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(localDate);
        System.out.println(createdTheNewOnboardingColumnAndRow.getText());
       assertNotEquals(createdTheNewOnboardingColumnAndRow.getText(),localDate);

    }

    public void assertionNewOnboardingSavedInDraftsPage() {
        LocalDateTime now = LocalDateTime.now();
        String localDate= now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(localDate);

        String[] date= createdTheNewOnboardingColumnAndRow.getText().split(" ");
        System.out.println(date[0]);
        assertEquals(date[0],localDate);

    }

    public void assertionToastMessageHasBeenSeen() {
        assertEquals(toastMessageText(),"Please fill out all required fields correctly.");
    }

    public void clicksCompletionDateAtLatest() {
        BrowserUtils.clickElement(completionDateAtLatest,20);
    }
    public void assertionCalendarIsDisplayed(){
        assert (calendarPanel.isDisplayed());
    }
}