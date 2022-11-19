package com.nt.partice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun_partice {
	
//(when TestNg skip execution of a Test case for what ever reason and you want Test case to execute then we use alwaysRun= true)
// alwaysRun = true is not compare enabled = false (because it is not override enabled to always run
	
	@Test(priority =1)
	public void Begin() {
	    System.out.println("Let's start");
	    Assert.fail("We are failing the testcase");
	}
	
	@Test(priority =2, dependsOnMethods="Begin" , alwaysRun = true)
	public void Ready() {
	    System.out.println("we are ready");
	}
	@Test(priority =3 , dependsOnMethods={"Begin","Ready"} ,alwaysRun = true)
	public void Steady() {
	    System.out.println("The next sequence test case");
	}
	@Test(priority =4 , dependsOnMethods={"Begin","Ready","Steady"},alwaysRun = true)
	public void Running() {
	    System.out.println("Testng running");
	}
	@Test(priority =5 ,dependsOnMethods={"Begin","Ready","Steady","Running"})
	public void End() {
	    System.out.println("After running is end");
	}

	}
