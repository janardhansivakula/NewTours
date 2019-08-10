package com.TestNGProgrammes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TimeAndDate_AllRows_FirstColumn 
{
	WebDriver driver=null;
	String url="https://www.timeanddate.com/worldclock/";
   
   @BeforeTest
   public void setUp()
   {
	  System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	  driver=new ChromeDriver();
	  System.out.println("The Chrome Browser is launched");
	  driver.navigate().to(url);
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
   @Test
   public void capturingAllRowsFirstColumndata()
   {
	  //html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	  //html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1] 
	  //html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
	   for(int l=1; l<=36; l++)
	   {
		          WebElement cityNameElement=driver.findElement(By.xpath("html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+l+"]/td[1]"));
		          String cityName=cityNameElement.getText();
		          System.out.println(l+"-"+"City name is:"+cityName);
	   }
   }
   
   @AfterTest
   public void closeBrowser()
   {
	   driver.quit();
	   System.out.println("the Browser is terminated");
   }
}
