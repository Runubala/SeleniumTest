package com.nt.partice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_V_S_Hard {
	
	@Test
	public void HardAssertLogic() {
		System.out.println("It is my first hardassert statement");
		Assert.assertTrue(true);
		
	    System.out.println("It is my second hardassert statement");
		Assert.assertTrue(false);
	
		System.out.println("It is my third hardassert statement");
		Assert.assertTrue(true);
	}
	
	@Test
	public void SoftAssertLogic() {
		
		SoftAssert sf = new SoftAssert();
		
		System.out.println("It is my first softassert statement");
		sf.assertTrue(true);
		
		System.out.println("It is my second softassert statement");
		sf.assertTrue(false);
		
		System.out.println("It is my third softassert statement");
		sf.assertTrue(true);
		
		sf.assertAll();
	}
	

}
