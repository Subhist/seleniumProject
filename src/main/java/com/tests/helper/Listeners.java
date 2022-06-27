package com.tests.helper;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.tests.config.BaseSetUp;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseSetUp implements ITestListener {

    ExtentReports extentReports;

    ExtentTest test;
    private  static  ThreadLocal<ExtentTest> threadLocal=new ThreadLocal<ExtentTest>();

    {
        try {
            extentReports = ExtentReportGenerator.extentReportGeneration();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onTestStart(ITestResult result) {
         test=extentReports.createTest(result.getMethod().getMethodName());
         threadLocal.set(test);
    }

    public void onTestSuccess(ITestResult result) {
        threadLocal.get().log(Status.PASS, "Successful");
    }

    public void onTestFailure(ITestResult result) {
       threadLocal.get().fail(result.getThrowable());


    }

    public void onFinish(ITestContext context) {
        extentReports.flush();
    }

}
