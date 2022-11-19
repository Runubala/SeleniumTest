package com.nt.partice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_demo {
	
	@Test
	public void High() {
		String expectedoutput = "we are learning english";
		String Actualoutput = "we are learning english and hindi";
		Assert.assertEquals(Actualoutput, expectedoutput);
		
	}
	@Test
	public void medium() {
		boolean b1 = 1<2;
		boolean b2 = 2>3;
		Assert.assertTrue(b2 !=b1, "2 can never be greather than 3");
		//Assert.fail("going to fail");
	}
	@Test
	public void low() {
	  byte b= 10;
	  byte b3 = 67;
	  Assert.assertEquals(b, b3);
	  Assert.fail("low fail");
	}
}
