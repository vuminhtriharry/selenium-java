package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.awt.*;

public class Browser {
    private static WebDriver driver;

    public static void launch(String browserName) {
        switch (browserName) {
            case "ie": {
                driver = new InternetExplorerDriver();
                break;
            }
            case "firefox": {
                FirefoxBinary firefoxBinary = new FirefoxBinary();
                firefoxBinary.addCommandLineOptions("--headless");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setBinary(firefoxBinary);
                driver = new FirefoxDriver(firefoxOptions);
                break;
            }
            case "chrome": {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setHeadless(true);
                driver = new ChromeDriver(chromeOptions);
                break;
            }
            case "safari": {
                driver = new SafariDriver();
                break;
            }
            default:
                throw new IllegalArgumentException("The browser: " + browserName + " does not support!");
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quit(){
        driver.quit();
    }
}
