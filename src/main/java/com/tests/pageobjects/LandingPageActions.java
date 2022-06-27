package com.tests.pageobjects;

import com.tests.config.BaseSetUp;
import com.tests.helper.Helper;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class LandingPageActions extends BaseSetUp {

    LandingPageLocators landingPageLocators;
    Helper helper;

    public LandingPageActions(WebDriver driver)
    {

     this.landingPageLocators=new LandingPageLocators(driver);
     this.helper=new Helper(driver);
    }

    public void login() throws Exception {
        Properties properties=new Properties();
        FileInputStream fileInputStream=new FileInputStream("src/main/resources/config.properties");
        properties.load(fileInputStream);
        String username=properties.getProperty("username");
        String password=properties.getProperty("password");
        landingPageLocators.getUsername().sendKeys(username);
        landingPageLocators.getPassword().sendKeys(password);
        helper.click(landingPageLocators.getLoginBtn());
        helper.waitForElementToBeVisible(landingPageLocators.getDashBoardTab());


    }


}
