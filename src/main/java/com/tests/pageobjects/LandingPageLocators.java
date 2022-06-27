package com.tests.pageobjects;

import com.tests.helper.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageLocators {
    WebDriver driver;
    Helper helper;
    public LandingPageLocators(WebDriver driver) {
        this.driver=driver;
        helper= new Helper(driver);
        PageFactory.initElements(driver,this);
    }



    @FindBy(id = "txtUsername")
    private WebElement username;

    @FindBy(id = "txtPassword")
    private WebElement password;

    @FindBy(id = "btnLogin")
    private WebElement loginBtn;



    @FindBy(id = "menu_dashboard_index")
    private WebElement dashBoardTab;

    public WebElement getDashBoardTab() {
        return dashBoardTab;
    }

    public void setDashBoardTab(WebElement dashBoardTab) {
        this.dashBoardTab = dashBoardTab;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public void setLoginBtn(WebElement loginBtn) {
        this.loginBtn = loginBtn;
    }

    public WebElement getUsername() {
        return username;
    }

    public void setUsername(WebElement username) {
        this.username = username;
    }

    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }
}
