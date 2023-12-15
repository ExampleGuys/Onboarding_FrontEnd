package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.*;
import ch.mycomp.onboarding.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.hu.De;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ObjectIndex {

    LoginPage loginPage = new LoginPage();

    CompaniesPage companiesPage =new CompaniesPage();
    DepartmentsPage departmentsPage = new DepartmentsPage();

    OrderPage orderPage = new OrderPage();

    OnboardingPage onboardingPage = new OnboardingPage();

    ResourcesPage resourcesPage = new ResourcesPage();

    SitesPage sitesPage = new SitesPage();

    UsersPage usersPage = new UsersPage();

    ContactsPage contactsPage = new ContactsPage();

    OffboardingPage offboardingPage = new OffboardingPage();
    RegisterPage registerPage = new RegisterPage();
    Actions actions = new Actions(Driver.get());

    PracticePage practicePage = new PracticePage();
    Faker faker = new Faker();


}
