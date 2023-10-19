package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.*;
import ch.mycomp.onboarding.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ObjectIndex {

    LoginPage loginPage = new LoginPage();

    OrderPage orderPage = new OrderPage();

    OnboardingPage onboardingPage = new OnboardingPage();

    ResourcesPage resourcesPage = new ResourcesPage();

    SitesPage sitesPage = new SitesPage();

    UsersPage usersPage = new UsersPage();

    ContactsPage contactsPage = new ContactsPage();

    RegisterPage registerPage = new RegisterPage();
    Actions actions = new Actions(Driver.get());

    Faker faker = new Faker();


}
