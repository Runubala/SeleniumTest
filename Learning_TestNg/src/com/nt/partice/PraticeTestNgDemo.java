package com.nt.partice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PraticeTestNgDemo {
	
	//precedence wise Execution
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is my before suite annotation");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is my before Test annotation");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is my before Class annotation");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is my before Method annotation");
	}
	@Test
	public void loginTest() {
		System.out.println("This is my Test case");
	}
	@Test
	public void registation() {
		System.out.println("This is my Test registation");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is my after method annotation");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("This is my after class annotation");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("This is my after Test annotation");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is my after suite annotation");
	
	}
	

}
