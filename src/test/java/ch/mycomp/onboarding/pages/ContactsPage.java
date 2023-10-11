package ch.mycomp.onboarding.pages;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactsPage extends BasePage{

    public void clickItemsOnTheNavigationMenu(String navigationMenuItem) {
        WebElement sidebar = Driver.get().findElement(By.xpath("(//li[@role='menuitem'])//span[text()='" + navigationMenuItem + "']"));
        BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(sidebar);
        //sidebar.click();
    }

    public WebElement getButton(String buttonName){
        WebElement button = Driver.get().findElement(By.xpath("//span[text()='" + buttonName + "']"));
        return button;
    }
}
