package findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest {
    @Test
    void withValidateCheckboxesIsChecked(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        //driver.findElement(By.xpath("form[@id='checkboxes']/input[1]")).click();
        //Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
        /*if(!driver.findElement(By.xpath("form[@id='checkboxes']/input[1]")).isSelected()){
            driver.findElement(By.xpath("form[@id='checkboxes']/input[1]")).click();
        }
        //driver.findElement(By.xpath("form[@id='checkboxes']/input[2]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkboxes']/input[1]")).isSelected());

        if(!driver.findElement(By.xpath("form[@id='checkboxes']/input[2]")).isSelected()){
            driver.findElement(By.xpath("form[@id='checkboxes']/input[2]")).click();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkboxes']/input[2]")).isSelected());
        driver.quit();*/
        WebElement checkbox1 =driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        WebElement checkbox2 =driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

        check(checkbox1);
        Assert.assertTrue(checkbox1.isSelected());

        check(checkbox2);
        Assert.assertTrue(checkbox1.isSelected());
    }
    private void check(WebElement element){
        if(!element.isSelected()){
            element.click();
        }

    }

}
