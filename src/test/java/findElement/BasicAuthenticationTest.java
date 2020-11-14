package findElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAuthenticationTest {
    @Test
    void loginWithValidCredentials(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/basic_auth");
        driver.quit();
    }
}