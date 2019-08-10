package com.Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenShots_Bing12 
{

	public static void main(String[] args) throws IOException
	{
		WebDriver driver =null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		String url="http://www.newtours.demoaut.com";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		File bing_Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Files.copy(bing_Screenshot,new File("./Screenshot/bing.png"));
		 
			
			
	}
		//driver.close();
}


