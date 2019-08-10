package com.NewTours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
     WebDriver driver=null;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver= new ChromeDriver();
		
		
	}
}
