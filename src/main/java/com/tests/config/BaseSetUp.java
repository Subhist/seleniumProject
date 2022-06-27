package com.tests.config;

import com.tests.helper.Helper;
import com.tests.pageobjects.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseSetUp {



   public WebDriver driver;
    public LandingPageLocators landingPageLocators;
    public LandingPageActions landingPageActions;
    public RecruitmentPageLocators recruitmentPageLocators;
    public RecruitmentPageActions recruitmentPageActions;

    protected Helper helper;


    @BeforeSuite
    @Parameters("browser")
    public void test1(String browser) throws Exception {


        if(browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();

           driver = new FirefoxDriver();

        }
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();



        }
        driver.get(Helper.getValue("url"));
        landingPageLocators = new LandingPageLocators(driver);
        landingPageActions=new LandingPageActions(driver);
        recruitmentPageLocators=new RecruitmentPageLocators(driver);
        recruitmentPageActions=new RecruitmentPageActions(driver);

        helper=new Helper(driver);



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



    }




    @AfterSuite
    public void teardown(){
        driver.quit();
    }

    @AfterMethod
    public void goToHomePage(ITestResult result) throws IOException {
        Helper helper=new Helper(driver);
        if (ITestResult.FAILURE == result.getStatus()) {
            helper.getScreenShot(result.getMethod().getMethodName());
        }

        WebElement homeTab=driver.findElement(By.id("menu_dashboard_index"));
        helper.click(homeTab);
    }


}
