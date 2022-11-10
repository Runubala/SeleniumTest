package extent_professionalDemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import extentreportManager.ExtentMangerBase;

public class LoginDemo {

	
	public static  ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	
	
	@BeforeMethod
	public void InitializeLogin() {
		System.out.println(System.getProperty("user.dir"));
		extent = ExtentMangerBase.getextentReport();
        test = extent.createTest("Login Test");
		
	}
	
	
	@Test
	public void Checking() {
		test.log(Status.INFO, "Register the browser");
	    test.log(Status.INFO, "Login the browser");
	    test.log(Status.INFO, "user and search the browser");
	    test.log(Status.FAIL, "102 server fail");
	    Assert.fail();
	    test.log(Status.PASS, "Pass the browser another tab");
		
	}
	

	@AfterMethod
	public void Finish() {
		extent.flush();
		
	}


}

