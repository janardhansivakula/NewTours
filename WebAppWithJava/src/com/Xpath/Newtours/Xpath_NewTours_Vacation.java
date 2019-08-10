package com.Xpath.Newtours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_NewTours_Vacation
{

	public static void main(String[] args)
	{
		//Automating the browser 
		
		System.setProperty("webdriver.ie.driver", "./DriverFiles/iedriver.exe");
		WebDriver driver =null;
		driver=new ChromeDriver();
	//navigating the URL	
	String url ="http://www.newtours.demoaut.com";
    driver.navigate().to(url);

    //<a href="mercuryunderconst.php?osCsid=7057cd51c86b761f9008d917e4ca82e3">Vacations</a>
    
         WebElement vacations_Link=driver.findElement(By.linkText("Vacations"));
         vacations_Link.click();
    //<img src="/images/forms/home.gif" width="118" height="23" border="0">
         
     WebElement backToHome_Link=driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']"));
     backToHome_Link.click();
         driver.quit();
           
    
	
		
		
	}

}
