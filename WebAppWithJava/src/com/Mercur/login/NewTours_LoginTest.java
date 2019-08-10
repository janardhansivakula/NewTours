package com.Mercur.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LoginTest {

	public static void main(String[] args) {
     
		
		WebDriver driver = null;
	
		
      String url12 ="http://newtours.demoaut.com/";
      
      //System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
      
      //driver= new ChromeDriver();
      
      //driver.get(url12);
      
      System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
      
      driver=new FirefoxDriver();
      
      driver.get(url12);
      
      driver.findElement(By.name("userName")).sendKeys("tutorial");;
      
      driver.findElement(By.name("password")).sendKeys("tutorial");
      
      driver.findElement(By.name("login")).click();
      
      //driver.close();
      
      
      
      
      

	}

}
