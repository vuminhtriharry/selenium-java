package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BT10BMIPage extends BasePage{
    public BT10BMIPage(){
        PageFactory.initElements(Browser.getDriver(),this);
    }
    //@FindBy(xpath="//a[.='Metric Units']")
    String metricUnitTab = "//a[.='Metric Units']";

    @FindBy(xpath="cage")
    WebElement ageTxt;

    @FindBy(xpath="csex1")
    WebElement maleRad;

    @FindBy(xpath="csex2")
    WebElement femaleRad;

    @FindBy(xpath="cheightmeter")
    WebElement heightTxt;

     @FindBy(xpath="weightmeter")
     WebElement weightTxt;
    @Override
    public void open(){driver.get("https://www.calculator.net/bmi-calculator.html"); }

    public void selectMetricTab(){
        click(How.XPATH, metricUnitTab);
    }
    public void fillForm(String age, String gender, String height, String weight){
       weightTxt.clear();
     weightTxt.sendKeys("27");

       if(gender.equalsIgnoreCase("male"))
           driver.findElement(By.id("csex1")).click();
       else  driver.findElement(By.id("csex2")).click();

        driver.findElement(By.id("cheightmeter")).clear();
        driver.findElement(By.id("cheightmeter")).sendKeys("167");

        driver.findElement(By.id("ckg")).clear();
        driver.findElement(By.id("ckg")).sendKeys("61");
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
    }
    public String getResult(){
        return driver.findElement(By.className("bigtest")).getText();
    }
}

