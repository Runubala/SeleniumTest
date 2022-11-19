package com.nt.partice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider="getData")//link the getData method(@Dataparovider)
	public void  DataMatrix(String Username,String Password,int mobile,String Browser ) {

	}
	
	@DataProvider//helps us write data driven test case
	public Object[][] getData() {
		
		Object[][] data = new Object[3][4];
		
		data[0][0]="Username";
		data[0][1]="Password";
		data[0][2]=7077865;
		data[0][3]="MOzilla";
		
		data[1][0]="Username1";
		data[1][1]="Password1";
		data[1][2]=70778651;
		data[1][3]="Firefox1";
		
		data[2][0]="Username2";
		data[2][1]="Password2";
		data[2][2]=70779872;
		data[2][3]="Chrome2";
				
		return data ;
		
	}

}
