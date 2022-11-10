package com.extentdemo.ExtentReportPratice;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginTest {
	
	
	@Test
	public void login() {
	    ExtentReports extent = new ExtentReports();
	    
	    
	    ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
	    spark.config().setReportName("my youtube channel");
	    spark.config().setDocumentTitle("ProjectName:javastrory");
	    spark.config().setTheme(Theme.DARK);
	    spark.config().setCss("uff-8");
	    
	    
	    extent.attachReporter(spark);
	    
	    
	    ExtentTest test = extent.createTest("Login Test");
	    test.log(Status.INFO, "Register the browser");
	    test.log(Status.INFO, "Login the browser");
	    test.log(Status.INFO, "user and search the browser");
	    test.log(Status.FAIL, "102 server fail");
	    Assert.fail();
	    test.log(Status.PASS, "Pass the browser another tab");
	    
	    
	    extent.flush();//return type extent reports that why is use extent reference
	    
	    
		//This program is not good pratice
	}

}
