package com.Screenshots;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot_Bing
{

	public static void main(String[] args) 
	{
      WebDriver driver =null;	
      System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
      driver =new ChromeDriver();
      
     String url ="http://www.amazon.in";
     driver.navigate().to(url);
     
     driver.manage().window().maximize();
     
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     WebElement helloSignInLink=driver.findElement(By.id("nav-link-accountList"));
     Actions act=new Actions(driver);
     act.moveToElement(helloSignInLink).perform();
     
     driver.findElement(By.linkText("Your Account")).click();;
     
                  
     
     
      
      //driver.close();
	}
}
