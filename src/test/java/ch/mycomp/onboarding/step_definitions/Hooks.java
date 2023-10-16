package ch.mycomp.onboarding.step_definitions;

import ch.mycomp.onboarding.utilities.BrowserUtils;
import ch.mycomp.onboarding.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

   @Before
   public void setUp(Scenario scenario){

       Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       Driver.get().manage().window().maximize();
       System.out.println(scenario.getName());
   }

    @AfterStep
    public void step(Scenario step) {
        System.out.println("Step is " + step.getStatus());

    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        BrowserUtils.waitFor(3);
        Driver.closeDriver();
        System.out.println("Scenario is = " + scenario.getStatus());
    }



}
