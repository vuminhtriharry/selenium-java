package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * txt --> text box
 * btn --> button
 * lbl --> label
 * lnk --> link text
 * rad --> radio button
 * chk --> checkbox
 * dropdown --> drop down
 **/

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = Browser.getDriver();
    }

    public abstract void open();

    public void sleep(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void check(How how, String locator) {
        if (!driver.findElement(how.buildBy(locator)).isSelected()) {
            click(how, locator);
        }
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void click(How how, String locator) {
        driver.findElement(how.buildBy(locator)).click();
    }

    public void fill(How how, String locator, String withText) {
        driver.findElement(how.buildBy(locator)).clear();
        driver.findElement(how.buildBy(locator)).sendKeys(withText);
    }

    public void fill(By locator, String withText) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(withText);
    }

    public WebElement find(How how, String locator) {
        return driver.findElement(how.buildBy(locator));
    }

    public void waitForElementPresent(By locator) {
        Wait wait = new FluentWait(driver)
                .pollingEvery(Duration.ofMillis(200))
                .withTimeout(Duration.ofMillis(60000));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
