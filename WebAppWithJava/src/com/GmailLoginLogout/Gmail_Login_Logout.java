package com.GmailLoginLogout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login_Logout 
{

	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver=null;
       
       System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
       String url1 ="http://www.snapdeal.com";
       driver=new ChromeDriver();
       driver.navigate().to(url1);
    
       Thread.sleep(5000);
       driver.findElement(By.id("Email")).sendKeys("sivakulajanardhan259");
       driver.findElement(By.className("CwaK9")).click();;
	}

}
