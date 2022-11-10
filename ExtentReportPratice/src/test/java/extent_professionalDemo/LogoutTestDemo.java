package extent_professionalDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import extentreportManager.ExtentMangerBase;

public class LogoutTestDemo {
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	
	@BeforeMethod
	public void Logout() {
		//System.out.println(System.getProperty("user.dir"));
		extent = ExtentMangerBase.getextentReport();
		test = extent.createTest("Logout Test");
		
		}
	@Test
	public void click() {
		test.log(Status.INFO, "Logout the browser in amazon");
	    test.log(Status.INFO, "using the browser  ");
	    test.log(Status.INFO, "search the browser");
	   // test.log(Status.FAIL, "102 server fail");
	    //Assert.fail();
	    test.log(Status.PASS, "click the browser another tab");
	    System.out.println("Hii");
		
	}
	@AfterMethod
	public void End() {
		extent.flush();
	}


}
