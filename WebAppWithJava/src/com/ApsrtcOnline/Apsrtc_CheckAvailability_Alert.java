package com.ApsrtcOnline;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Apsrtc_CheckAvailability_Alert
{
    private static Object Hyderabad;

	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver=null;
	  System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
	  driver=new ChromeDriver();
	  String url="https://www.apsrtconline.in/oprs-web/";
	  driver.navigate().to(url);
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
       //id="searchBtn"----Check availabaility Button
	      
	      
	     Alert alt= driver.switchTo().alert();
	     System.out.println("The text Of The alert message is:"+alt.getText());
	     alt.accept();
	     
	     //id="fromPlaceName"----from
	     //id="toPlaceName"----to
	     //id="txtJourneyDate"---departure date
	     //id="txtReturnJourneyDate"---arrival\
	     
	     /*driver.findElement(By.id("fromPlaceName"));
	     Actions Act=new Actions(driver);
	     act.sendKeys(Keys.
	     driver.findElement(By.id("toPlaceName")).sendKeys("Bezawada");
	     driver.findElement(By.id("txtJourneyDate")).sendKeys("25/07/2019");
	     driver.findElement(By.id("txtReturnJourneyDate")).sendKeys("30/07/2019");*/
	  
	     Thread.sleep(5000);
	     driver.findElement(By.id("searchBtn")).click();
	}

}
