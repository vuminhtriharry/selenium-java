package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;

import java.util.concurrent.BlockingDeque;

public class LoginPage extends BasePage{
    /**
     */
    private By usernameTxt = By.id("username");
    private By passwordTxt =By.id("password");
    private String loginBtn = "//button[@type='submit']";
    private By logoutBtn = By.xpath("//a[contains(@href,'logout')]");

    public void open(){driver.get("http://the-internet.herokuapp.com/login"); }

    public boolean isLoggedIn(){
        System.out.println(getCurrentUrl());
        return getCurrentUrl().equals("http://the-internet.herokuapp.com/secure");
    }
    public void login(String username,String password){
        fill(usernameTxt,username);
        fill(passwordTxt,password);
        click(How.XPATH, loginBtn);
        waitForElementPresent(logoutBtn);
    }
}