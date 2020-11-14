package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxPage;

public class CheckboxTest extends testcases.BaseTest {
    @Test
    void validateCheckbox(){
        CheckboxPage checkboxPage = new CheckboxPage();
        checkboxPage.open();

        checkboxPage.checkOn("1");
        Assert.assertTrue(checkboxPage.getCheckbox("1").isSelected());

        checkboxPage.checkOn("2");
        Assert.assertTrue(checkboxPage.getCheckbox("2").isSelected());


    }


}
    /*private static void check(WebElement element){
        if(!element.isSelected()){
            element.click();
        }
    }
    private static void isChooseCheckbox(String a){
        if(a.equals("Checkbox1")){

            check(checkbox1);
            Assert.assertTrue(checkbox1.isSelected());
        }else if(a.equals("Checkbox2")){

            check(checkbox2);
            Assert.assertTrue(checkbox1.isSelected());
        }
    }
    */

