package com.nt.Data_provider;

import org.testng.annotations.Test;

import com.nt.partice.Data_Repo;

public class Test_Dataprovider {
	
	@Test(priority=1,dataProviderClass=Data_Repo.class ,dataProvider = "getData")//link the @Dataprovider method
	public void Launchurl(String username,int emp_id,String email,int emp_no) {
		//System.out.println("Lunching the url.....");
		System.out.println(username+"...."+emp_id+"...."+email+"...."+emp_no);
		
	}
	@Test(priority=2,dataProviderClass=Data_Repo.class ,dataProvider = "getData")
	public void Login(String username,int emp_id,String email,int emp_no) {
		//System.out.println("login the url....");
		System.out.println(username+"...."+emp_id+"...."+email+"...."+emp_no);
		
	}
	@Test(priority=3,dataProviderClass=Data_Repo.class ,dataProvider = "getData")
	public void Using(String username,int emp_id,String email,int emp_no) {
		//System.out.println("using the url...");
		System.out.println(username+"...."+emp_id+"...."+email+"...."+emp_no);
	}
	
	@Test(priority=4,dataProviderClass=Data_Repo.class ,dataProvider = "getData")
	public void Logout(String username,int emp_id,String email,int emp_no) {
		//System.out.println("Logout the url..");
		System.out.println(username+"...."+emp_id+"...."+email+"...."+emp_no);
		
	}
}
