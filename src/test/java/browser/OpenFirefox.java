package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {
    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
        WebDriverManager.firefoxdriver().setup();
        new FirefoxDriver();
    }
}
