package ch.mycomp.onboarding.utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    private Driver() {

    }

    public static WebDriver driver;

    public static WebDriver get() {
        // Test
        if (driver == null) {
            // this line will tell which browser should open based on the value from properties file
            String browser = ConfigurationReader.get("browser");
            switch (browser) {
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("disable-infobars", "disable-notifications");
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case "chrome-headless":
                    driver = new ChromeDriver(new ChromeOptions().addArguments("headless"));
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "firefox-headless":
                    driver = new FirefoxDriver(new FirefoxOptions().addArguments("headless"));
                    break;
                case "ie":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Internet Explorer");
                    driver = new InternetExplorerDriver();
                    break;

                case "edge":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Edge");
                    driver = new EdgeDriver(new EdgeOptions().addArguments("headless"));
                    break;

                case "safari":
                    if (!System.getProperty("os.name").toLowerCase().contains("mac"))
                        throw new WebDriverException("Your OS doesn't support Safari");
                    driver = new SafariDriver();
                    break;
            }

        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }

}