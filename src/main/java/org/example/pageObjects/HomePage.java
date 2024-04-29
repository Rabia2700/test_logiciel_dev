package org.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {

    private WebDriver driver;

    private String url ="https://ztrain-web.vercel.app/home";
    @FindBy(css = "nav>div:nth-child(4)")
    private WebElement avatar;

    @FindBy(id = "email_login")
    private WebElement email_login;

    @FindBy(id = "password_login")
    private WebElement password;

    @FindBy(id = "btn_login")
    private WebElement btn_login;

    public void NavigateToHomePage(){
    this.get(url);
    }
    public void fill_email(String email){
    this.email_login.sendKeys("testeur@gmail.com");
    }




}