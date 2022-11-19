package com.nt.partice;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Repo {

	@DataProvider
	
	public static Object[][] getData(Method name){
		System.out.println("Test case which has the method is:" +name.getName());
		
		Object[][] data = new Object[3][4];
		
		data[0][0]="username1";
		data[0][1]=101;
		data[0][2]="Runubala@gmail.com1";
		data[0][3]=877871;
		
		data[1][0]="username2";
		data[1][1]=102;
		data[1][2]="Runubala@gmail.com2";
		data[1][3]=877872;
		
		data[2][0]="username3";
		data[2][1]=103;
		data[2][2]="Runubala@gmail.com3";
		data[2][3]=877873;
		
		return data;
	
	}
}
