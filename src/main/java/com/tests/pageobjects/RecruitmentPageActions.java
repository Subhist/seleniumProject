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
        helper.sendValue(recruitmentPageLocators.getFirstName(), "Subhist");
        helper.sendValue(recruitmentPageLocators.getMiddleName(), helper.generateRandomString());
        helper.sendValue(recruitmentPageLocators.getLastName(), helper.generateRandomString());
        helper.sendValue(recruitmentPageLocators.getEmail(), helper.generateRandomString()+"@example.com");
        helper.sendValue(recruitmentPageLocators.getContactNumber(), helper.generateRandomNumber());
        helper.waitForElementToBeVisible(recruitmentPageLocators.getJobVacancies());
        Select select=new Select(recruitmentPageLocators.getJobVacancies());
      select.selectByIndex(1);
      helper.click(recruitmentPageLocators.getOpenCalender());
      helper.click(recruitmentPageLocators.getSelectCurrentDate());

        helper.sendValue(recruitmentPageLocators.getCandidateKeyWords(), helper.generateRandomString());
        helper.click(recruitmentPageLocators.getConsent());


        helper.sendValue(recruitmentPageLocators.getUploadResume(),"/Users/subhist/Documents/seleniumProjects/seleniumProject/src/main/resources/Textssss.pdf");
        helper.click(recruitmentPageLocators.getSaveBtn());
        helper.waitForElementToBeVisible(recruitmentPageLocators.getSuccessMsg());




    }
}
