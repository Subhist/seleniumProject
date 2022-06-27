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
        softAssert.assertTrue(recruitmentPageLocators.getSuccessMsg().isDisplayed());
    }


}
