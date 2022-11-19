package com.nt.partice;

import org.testng.annotations.Test;

public class TestNGDemo2 {
	
	//if you do not set priority of test cases then it will alphabetical order of method name:->
	//it will execute.
	
	//you have prioritize all the test cases else TestNG will take Alphabetical order sequence in execution.
	
	@Test(priority = 1)
     public void vehicle() {
		System.out.println("This is my new vehicle");
	}
	@Test(priority = 2)
    public void car() {
		System.out.println("This is my new car");
	}
	@Test(priority = 3)
    public void bike() {
		System.out.println("This is my new bike");
	}
	@Test(priority = 4 ,enabled = false)
    public void bus() {
		System.out.println("This is my new bus");
	}
	@Test(priority = 5)
    public void truck() {
		System.out.println("This is my new truck");
	}
	@Test(priority = 6)
    public void train() {
		System.out.println("This is my new train");
	}
	

}
