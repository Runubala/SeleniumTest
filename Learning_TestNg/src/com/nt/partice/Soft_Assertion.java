package com.nt.partice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
	
   @Test
   public void validation() {
	   
	   SoftAssert softassert = new SoftAssert();
	   
	  int i =10;int j =20;
	  System.out.println("Sum the int:"+(i+j));
	  softassert.assertTrue(true);
	   
	   
	   boolean b1 = 1<2;
	   boolean b2 = 2>3;
	   System.out.println("b2 is wrong statement");
	   softassert.assertEquals(b2, b1, "b2 is wrong statement");
	   
	   softassert.assertAll();//if you use assert all method so every test case logic will be failed
	   
	   
	   
	   
	
	   
   }

}
