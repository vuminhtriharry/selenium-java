package findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HyperlinkTest {
    @Test
    void validateeStatusCodePageIsAppeared(){
        //WebDriver driver = new ChromeDriver();
        //driver.get("http://the-internet.herokuapp.com/status_codes");
        String baseUrl = "http://the-internet.herokuapp.com/status_codes";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        driver.findElement(By.linkText("200")).click();
        Assert.assertEquals(driver.getCurrentUrl(),baseUrl+"/200");
        //driver.findElement(By.linkText("here")).click();
        driver.navigate().back();

        driver.findElement(By.linkText("301")).click();
        Assert.assertEquals(driver.getCurrentUrl(),baseUrl+"/301");
        driver.navigate().back();

        driver.findElement(By.linkText("404")).click();
        Assert.assertEquals(driver.getCurrentUrl(),baseUrl+"/404");
        driver.navigate().back();

        driver.findElement(By.linkText("500")).click();
        Assert.assertEquals(driver.getCurrentUrl(),baseUrl+"/500");
        driver.navigate().back();
        driver.quit();
        /**
         * //E[@A='t'] -->//E[@href=''] //E[.='t']/@href
         *
         */
    }
}
