package testcases;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BT10BMIPage;

public class BT10BMITest extends BaseTest{


    @Test(description = "validate body mass index calculator")

    void tc01() {
        BT10BMIPage bmiPage = new BT10BMIPage();
        bmiPage.open();
        bmiPage.selectMetricTab();
        bmiPage.fillForm("27","male","180","65");
        Assert.assertEquals(bmiPage.getResult(),"BMI = 20.1 kg/m2 (Normal)");  // Expected

    }
     @Test(description = "validate body mass index calculator")

     void tc02() {       //TC name

         BT10BMIPage bmiPage = new BT10BMIPage();
         bmiPage.open();
         bmiPage.selectMetricTab();
         bmiPage.fillForm("27","male","180","180");
         Assert.assertEquals(bmiPage.getResult(),"BMI = 20.1 kg/m2 (Normal)");  // Expected

     }

}
