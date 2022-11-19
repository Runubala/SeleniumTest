package com.nt.partice;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITest_contextPratice {
	
	
	@Test(priority = 1)
	public void SetUp(ITestContext context) {
		System.out.println("This is setup of our new laptop");
		context.setAttribute("Windows10", "Asus");
		System.out.println("Setting the attribute :"+context);
	}
	
	@Test(priority= 2 , dependsOnMethods = "SetUp")
	public void Logic(ITestContext context){
		System.out.println("This is logic functioning of our new laptop");
		String OperatingSystem = (String)context.getAttribute("Windows10");
		System.out.println("The set of os system for asus laptop is: "+OperatingSystem);
		context.setAttribute("Complex", "Devops+Agile");
	}
	
	@Test(priority= 3 ,dependsOnMethods = {"SetUp","Logic"})
	public void Exit(ITestContext context) {
		System.out.println("This is exit of our new laptop");
		String OperatingSystem = (String)context.getAttribute("Windows10");
		System.out.println("The set of os system for asus laptop is : "+OperatingSystem);
		
		String Complexity = (String)context.getAttribute("Complex");
		System.out.println("This logic complexity even at the exit point : "+Complexity);
	}
	

}
