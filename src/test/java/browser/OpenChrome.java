package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("http://google.com.vn");
        driver.navigate().to("https://google.com.vn");
        driver.manage().window().fullscreen();
        driver.close();
        driver.quit();
    }
}
