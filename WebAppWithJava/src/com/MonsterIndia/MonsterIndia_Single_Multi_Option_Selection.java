package com.MonsterIndia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonsterIndia_Single_Multi_Option_Selection 
{

	public static void main(String[] args)
	{
	    WebDriver driver=null;
	    System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	    String url="http://my.monsterindia.com/sponsored-popup.html";
	    driver = new ChromeDriver();
	    driver.navigate().to(url);
	    
	}

}
