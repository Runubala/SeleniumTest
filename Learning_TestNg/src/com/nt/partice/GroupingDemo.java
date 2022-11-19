package com.nt.partice;

import org.testng.annotations.Test;


@Test(groups = "Groupingpratice")
public class GroupingDemo {
	
	
	@Test(groups ="smoke")
	public void TC1() {
		System.out.println("This is TC1 Logic");
	}
	
	@Test(groups = {"regression", "smoke",})
	public void TC2() {
		System.out.println("This is TC2 Logic");
	}
	
	@Test(groups = {"drug","regression", "smoke"})
	public void TC3() {
		System.out.println("This is TC3 Logic");
	}
	
	@Test(groups = {"Window.drug", "sanity"})//use regular expression
	public void TC4() {
		System.out.println("This is TC4 Logic");
	}
	@Test(groups = {"Linux.regression"})
	public void TC5() {
		System.out.println("This is TC5 Logic");
	}

}
