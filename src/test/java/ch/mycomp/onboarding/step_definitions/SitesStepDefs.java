package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.pages.BasePage;
import ch.mycomp.onboarding.pages.LoginPage;
import ch.mycomp.onboarding.pages.SitesPage;
import ch.mycomp.onboarding.utilities.ConfigurationReader;
import ch.mycomp.onboarding.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;

public class SitesStepDefs {

    LoginPage loginPage = new LoginPage();

    static Actions actions = new Actions(Driver.get());

    static Faker faker = new Faker();

    SitesPage sitesPage=new SitesPage();

    @And("The user should be seen the Sites page")
    public void theUserShouldBeSeenTheSitesPage() {
    }

}
