package testcases;


import browser.Browser;
import org.testng.annotations.Parameters;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    @Test
    void withValidCredentials(){

        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage
                .login("tomsmith" ,"SuperSecretPassword!");

        Assert.assertEquals(
                loginPage.isLoggedIn(),
                true);
    }
}