package ch.mycomp.onboarding.pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepartmentsPage extends BasePage{

    @FindBy(id="department_company")
    public WebElement selectCompany;

    public void theUserSelectACompanyFromCompanyDropdown(String companyName) {
        globalSelectDropdownTargetElement(selectCompany,companyName);
    }


    public void enterDepartmentName(String departmentName, String boxname) {
        boxName(boxname).sendKeys(departmentName);
    }
}
