package com.nt.testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	
	@Test
	public void DemoTestng() {
		System.out.println("Hii i am Testng");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	public void DemoTestng1() {
		System.out.println("Hii i am Testng1");
	}
	@Test
	public void DemoTestng2() {
		System.out.println("Hii i am Testng2");
	}

}
