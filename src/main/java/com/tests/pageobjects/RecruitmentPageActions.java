package com.tests.pageobjects;

import com.tests.config.BaseSetUp;
import com.tests.helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RecruitmentPageActions extends BaseSetUp {

    RecruitmentPageLocators recruitmentPageLocators;
    Helper helper;
    WebDriver driver;
    public RecruitmentPageActions(WebDriver driver) {
        this.driver=driver;
        this.helper=new Helper(driver);
        this.recruitmentPageLocators=new RecruitmentPageLocators(driver);

    }

    public void goToRecuitementsTab(){
        helper.click(recruitmentPageLocators.getRecruitmentTab());
    }

    public void addACandidate() throws Exception {
        helper.click(recruitmentPageLocators.getAddCandidateBtn());
        helper.click(recruitmentPageLocators.getFirstName());
        helper.sendValue(recruitmentPageLocators.getFirstName(), helper.generateRandomString());
        helper.sendValue(recruitmentPageLocators.getMiddleName(), helper.generateRandomString());
        helper.sendValue(recruitmentPageLocators.getLastName(), helper.generateRandomString());
        helper.sendValue(recruitmentPageLocators.getEmail(), helper.generateRandomString()+"@example.com");
        helper.sendValue(recruitmentPageLocators.getContactNumber(), helper.generateRandomNumber());
        Thread.sleep(5000);
//        helper.click(recruitmentPageLocators.getJobVacancies());
        Select select=new Select(driver.findElement(By.xpath("//select[@id='addCandidate_vacancy']")));
        System.out.println( select.getOptions());

        helper.sendValue(recruitmentPageLocators.getCandidateKeyWords(), helper.generateRandomString());


    }
}
