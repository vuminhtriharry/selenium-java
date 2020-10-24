package findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * <select id='dropdown'>
 *     <option value='1'>option1</option>
 *     <option value='2'>option2</option>
 * </select>
 */

public class DropdownTest {
    @Test
    void validateOption1IsSelected(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        //dropdown.selectByValue("Option 1");
        //dropdown.selectByVisibleText("Option 1");
        dropdown.selectByIndex(1);
        Assert.assertTrue(driver.findElement(By.xpath("//option[@value='1']")).isSelected());
        //driver.quit();

    }
}
