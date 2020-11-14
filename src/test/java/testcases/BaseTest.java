package testcases;

import browser.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseTest {

    @Parameters({"browserName"})
    @BeforeClass
    void setUp(String browserName) {
        Browser.launch(browserName);
    }

    @AfterClass
    void tearDown() {
        Browser.quit();
    }
}
