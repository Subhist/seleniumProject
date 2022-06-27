package com.tests.helper;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Helper {
    WebDriver driver;
    Actions actions;
    public Helper(WebDriver driver) {
        this.driver=driver;
        actions=new Actions(driver);
        PageFactory.initElements(driver, this);

    }

    WebDriverWait wait;




    //Wait for element to be visible and click
    public void click(WebElement element){
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(element)).click();

    }

    //Send values to the TextBox
    public void sendValue(WebElement element,String values){
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(values);
    }


    public void refresh(){
        driver.navigate().refresh();
    }




    //Wait till the element is clickable
    public void waitTillElementIsClickable(WebElement element){
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }


    //Wait for element to be visible
    public void waitForElementToBeVisible(WebElement element){
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(element));

    }


    //Click on element without waiting for element
    public void clickWithoutWaitingForElement(WebElement element){

        element.click();

    }






    //Read conf.properties file
    public static String getValue(String valueFor) throws Exception{
        Properties properties=new Properties();
        FileInputStream fileInputStream=new FileInputStream("src/main/resources/config.properties");
        properties.load(fileInputStream);
        return properties.getProperty(valueFor);

    }

    public String generateRandomString(){
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

    public String generateRandomNumber(){
        int length = 10;
        boolean useLetters = false;
        boolean useNumbers = true;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

    public void selectValueFromDropDown(String val){
        Select select=new Select(driver.findElement(By.name("addCandidate[vacancy]")));
        select.selectByVisibleText(val);


    }

    //Move to element using JavaScript and click
    public void moveToElementAndClick(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

    }

    public void getScreenShot(String testCasesName) throws IOException {

        TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
        File screen=takesScreenshot.getScreenshotAs(OutputType.FILE);
        String fileName = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss").format(new Date());
        FileUtils.copyFile(screen, new File("./reports/"+fileName+""+testCasesName+".png"));


        //  FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"/reports/"+testCasesName+".png") );
        //return destPath;
    }

    public void hoverOverElement(WebElement element){
        actions.moveToElement(element).perform();
    }

    public void doubleClick(WebElement element){
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        actions.doubleClick(element).perform();
    }

    //get title
    public String getTitle(String title){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleContains(title));
        return driver.getTitle();
    }



    //Move to element and click
    public void moveToElement(WebElement element){
        actions.moveToElement(element).perform();
        element.click();
        ;
    }

}
