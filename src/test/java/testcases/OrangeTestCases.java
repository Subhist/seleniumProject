package testcases;

import com.tests.config.BaseSetUp;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeTestCases extends BaseSetUp {

    Logger log=Logger.getLogger(OrangeTestCases.class);
    SoftAssert softAssert=new SoftAssert();

    @Test(priority = 1)
    public void test1() throws Exception {
        landingPageActions.login();
        log.info("USer has logeed in");
        softAssert.assertTrue(landingPageLocators.getDashBoardTab().isDisplayed());
    }


    @Test(priority = 2)
    public void addANewCandidate() throws Exception {
        recruitmentPageActions.goToRecuitementsTab();
        recruitmentPageActions.addACandidate();
    }


//    @BeforeClass
//    public void launchBrowserAndLogin() throws Exception {
//        landingPageLocators.clickOngoogleIn();
//        landingPageLocators.enterGmailId();
//        landingPageLocators.clickOnGmailNextButton();
//        landingPageLocators.enterGmailPassword();
//
//        landingPageLocators.passwordNextButton();
//        log.info("User has logged in");
//
//
//    }
//
//
////
//    @Test
//    public void testReactToThePost() throws Exception {
//
//
//        homePageLocators.clickOnChannels();
//        homePageLocators.enterChannelName();
//        homePageLocators.selectTheChannel();
//        log.info("The channel has been selected");
//        softAssert.assertTrue(helper.getTitle("Interview Channel").contains("Interview Channel"));
//        interviewChannelLocators.selectFromfWrapper();
//        softAssert.assertTrue(interviewChannelLocators.getGoTopost().isDisplayed());
//        interviewChannelLocators.clickOnThreeDotsMenuOfRandomPosts();
//        interviewChannelLocators.clickOnViewPostsButton();
//        softAssert.assertTrue(interviewChannelLocators.getParticularPagePost().isDisplayed());
//        postViewLocators.hoverOverReactionButton();
//        postViewLocators.randomReact();
//        log.info("The user has reacted on this post");
//        softAssert.assertTrue(postViewLocators.getNewlyAddedReaction().getText().contains(postViewLocators.getUserReactedIcon().getText()));
//        softAssert.assertAll();
//
//
//
//
//
//    }
//
////
//    @Test
//    public void testScheduleAnewPost() throws Exception {
//        Thread.sleep(12000);
//        homePageLocators.clickOnChannels();
//        homePageLocators.enterChannelName();
//        homePageLocators.selectTheChannel();
//        log.info("The channel has been selected");
//        softAssert.assertTrue(helper.getTitle("Interview Channel").contains("Interview Channel"));
//        interviewChannelLocators.writePost();
//        softAssert.assertTrue(interviewChannelLocators.getPostdata().equalsIgnoreCase(interviewChannelLocators.getWriteThePost().getText()));
//        interviewChannelLocators.clickOnPostOptions();
//        interviewChannelLocators.clickOnShareAsAnAnnouncement();
//        log.info("The Post has been created as an announcement");
//        interviewChannelLocators.clickSelectTimeOfPost();
//        interviewChannelLocators.clickOnCustomToPublish();
//        interviewChannelLocators.clickSelectDateFromCalender();
//        log.info("The User has verified that the post is scheduled");
//        softAssert.assertTrue(interviewChannelLocators.getNewContent().equalsIgnoreCase(interviewChannelLocators.getPostdata()));
//        softAssert.assertTrue(String.valueOf(interviewChannelLocators.getSelectedDateDetailsInString()).equalsIgnoreCase(interviewChannelLocators.getSelectedDateInDetails()));
//        softAssert.assertAll();
//
//    }
//
//
//    @Test
//    public void testToCreateAPage() throws Exception {
//        homePageLocators.clickOnPagesMenu();
//        homePageLocators.enterPagesSearch();
//        homePageLocators.selectThePage();
//        log.info("The Page has been selected");
//        softAssert.assertTrue(helper.getTitle("First Page").contains("First Page"));
//        pagesPageLocators.clickOnEditPage();
//        softAssert.assertTrue(pagesPageLocators.getManagePageButton().isDisplayed());
//        pagesPageLocators.clickonManagePage();
//        log.info("The user is in manage page");
//        pagesPageLocators.currentPageMoreOptions();
//        pagesPageLocators.selectOptionsInMoreOptions();
//        pagesPageLocators.enterNewPageName();
//        pagesPageLocators.clickOnCreatePage();
//        log.info("The user created a new sub page");
//        softAssert.assertTrue(pagesPageLocators.getCreatedPageName().getText().equalsIgnoreCase(pagesPageLocators.getPageName()));
//
//
//
//    }
}
