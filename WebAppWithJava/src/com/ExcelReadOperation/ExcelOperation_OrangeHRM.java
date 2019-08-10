package com.ExcelReadOperation;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelOperation_OrangeHRM 
{

	public static void main(String[] args) 
	{
		WebDriver driver =null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		String url="https://opensource-demo.orangehrmlive.com";
	    driver=new ChromeDriver();
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
		
		

	    
	}

}
