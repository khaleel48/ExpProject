package com.freeStyle;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class StartExample {
	ExtentReports report;
	ExtentTest test;
	@BeforeClass
	public void setUp() {
		report=new ExtentReports("F:\\Reports\\FirstTest.html");
		test=report.startTest("exapmle testing report");
	}
	@AfterMethod
	public void screenShotToFailedCase(ITestResult result) {
		if (result.getStatus()==ITestResult.FAILURE) {
			String path=Utility.takeScreenShot();
			test.log(LogStatus.FAIL,""+test.addScreenCapture(path));
		}
	}
	@AfterClass
	public void tearDown() {
		
		report.flush();
		report.endTest(test);
	}

}
