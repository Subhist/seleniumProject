package com.tests.pageobjects;

import com.tests.helper.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPageLocators {

    WebDriver driver;
    Helper helper;
    public RecruitmentPageLocators(WebDriver driver) {
        this.driver=driver;
        helper= new Helper(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "menu_recruitment_viewRecruitmentModule")
    private WebElement recruitmentTab;

    @FindBy(id = "btnAdd")
    private WebElement addCandidateBtn;

    @FindBy(id = "addCandidate_firstName")
    private WebElement firstName;

    @FindBy(id = "addCandidate_middleName")
    private WebElement middleName;

    @FindBy(id = "addCandidate_lastName")
    private WebElement lastName;

    @FindBy(id = "addCandidate_email")
    private WebElement email;

    @FindBy(id = "addCandidate_contactNo")
    private WebElement contactNumber;

    @FindBy(xpath = "//select[@id='addCandidate_vacancy']")
    private WebElement jobVacancies;


    @FindBy(id = "addCandidate_resume")
    private WebElement uploadResume;

    @FindBy(id = "addCandidate_keyWords")
    private WebElement candidateKeyWords;

    @FindBy(id = "addCandidate_comment")
    private WebElement candidateComment;

    @FindBy(id = "addCandidate_appliedDate")
    private WebElement openCalender;


    @FindBy(xpath = "//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']")
    private WebElement selectCurrentDate;

    @FindBy(id = "addCandidate_consentToKeepData")
    private WebElement consent;

    @FindBy(id = "btnSave")
    private WebElement saveBtn;

    @FindBy(xpath = "//div[@class='message success fadable']")
    private WebElement successMsg;

    public WebElement getSuccessMsg() {
        return successMsg;
    }

    public void setSuccessMsg(WebElement successMsg) {
        this.successMsg = successMsg;
    }

    public WebElement getSaveBtn() {
        return saveBtn;
    }

    public void setSaveBtn(WebElement saveBtn) {
        this.saveBtn = saveBtn;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public void setFirstName(WebElement firstName) {
        this.firstName = firstName;
    }

    public WebElement getMiddleName() {
        return middleName;
    }

    public void setMiddleName(WebElement middleName) {
        this.middleName = middleName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public void setLastName(WebElement lastName) {
        this.lastName = lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }

    public WebElement getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(WebElement contactNumber) {
        this.contactNumber = contactNumber;
    }

    public WebElement getJobVacancies() {
        return jobVacancies;
    }

    public void setJobVacancies(WebElement jobVacancies) {
        this.jobVacancies = jobVacancies;
    }

    public WebElement getUploadResume() {
        return uploadResume;
    }

    public void setUploadResume(WebElement uploadResume) {
        this.uploadResume = uploadResume;
    }

    public WebElement getCandidateKeyWords() {
        return candidateKeyWords;
    }

    public void setCandidateKeyWords(WebElement candidateKeyWords) {
        this.candidateKeyWords = candidateKeyWords;
    }

    public WebElement getCandidateComment() {
        return candidateComment;
    }

    public void setCandidateComment(WebElement candidateComment) {
        this.candidateComment = candidateComment;
    }

    public WebElement getOpenCalender() {
        return openCalender;
    }

    public void setOpenCalender(WebElement openCalender) {
        this.openCalender = openCalender;
    }

    public WebElement getSelectCurrentDate() {
        return selectCurrentDate;
    }

    public void setSelectCurrentDate(WebElement selectCurrentDate) {
        this.selectCurrentDate = selectCurrentDate;
    }

    public WebElement getConsent() {
        return consent;
    }

    public void setConsent(WebElement consent) {
        this.consent = consent;
    }

    public WebElement getRecruitmentTab() {
        return recruitmentTab;
    }

    public void setRecruitmentTab(WebElement recruitmentTab) {
        this.recruitmentTab = recruitmentTab;
    }

    public WebElement getAddCandidateBtn() {
        return addCandidateBtn;
    }

    public void setAddCandidateBtn(WebElement addCandidateBtn) {
        this.addCandidateBtn = addCandidateBtn;
    }
}
