package findElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest {
    @Test
    void withValidCredentials(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//label[.='Username']/following-sibling::*")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//label[.='Username']/..input"));
        driver.findElement(By.xpath("//label[.='Username']/../../..//input[@id='password']"));
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        //driver.findElement(By.xpath("//button[@type='submit']")).click(); //ro nghia nhat,dehieu nhat
        //driver.findElement(By.xpath("//*[.='Login']")).click(); //= Chinh xac
        //driver.findElement(By.xpath("//i[contains(.,'Login')]")).click(); //CACH AN TOAN NHAT (dau . = text() )
        //driver.findElement(By.xpath("//button//*[contains(.,'Login')]")).click();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "http://the-internet.herokuapp.com/secure",
                "Login Failed!!!!!");
        driver.quit();

    }
}
