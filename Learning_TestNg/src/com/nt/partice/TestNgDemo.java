package com.nt.partice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo {
	
	//@BeforeMehod <=>@Test <=>@AfterMethod=This is a combination
	
	@BeforeMethod
	public void userRegistation() {
		System.out.println("is able to Registation");
		
	}
	@Test
	public void userLogin() {
		System.out.println("is able to Login");
		
	}
	@Test
	public void userContolMoney() {
		System.out.println("is able to transfer funds to another");
		
	}
	@AfterMethod
	public void userLogout() {
		System.out.println("is able to Logout");
		
	}
}
