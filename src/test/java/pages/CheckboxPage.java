package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import java.awt.*;

public class CheckboxPage extends BasePage{
    private String checkboxElement = "//form[@id='checkboxes']/input[%s]";


    public void open(){
        driver.get("http://the-internet.herokuapp.com/login");
    }
    public WebElement getCheckbox(String checkboxName){
        return driver.findElement(By.xpath(String.format(checkboxName)));
    }
    public void checkOn(String checkboxName){
        check(How.XPATH,String.format(checkboxName));
    }

}
