package com.AutoIt.NewTours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass 

{
     WebDriver driver=null;
     String url="https://opensource-demo.orangehrmlive.com/";
     
     @BeforeTest
     public void setUp()
     {
    	 System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
    	 driver=new ChromeDriver();
    	 driver.get(url);
    	 
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     }
     @AfterTest
     public void closedBrowser()
     {
    	 /*driver.quit();
    	 System.out.println("Browser Closed");*/
     }
}
