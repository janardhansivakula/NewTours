package com.newtours.all.links;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class NewTours_All_Links_HomePage 
{

	public static void main(String[] args) throws IOException  
	{
		WebDriver driver=null;
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver=new FirefoxDriver();
		//driver=new ChromeDriver();
		String url="http://www.newtours.demoaut.com/";
		System.out.println("The Url:"+url);
		driver.get(url);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		List<WebElement> links=driver.findElements(By.tagName("a"));
		int linksCount=links.size();
		System.out.println("The Total no.of links in Newtours Home Page are:"+linksCount);

		for(int s=0; s<linksCount; s++)
		{

			String linkName=links.get(s).getText();
			System.out.println("the link names are in newtours Homepage:"+linkName);

			links.get(s).click();
			File newtours_Screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(newtours_Screenshots,new File("./Screenshot/"+linkName+".png"));

			System.out.println("The Current Browser Title:"+driver.getTitle());
			System.out.println("The Current Browser URL:"+driver.getCurrentUrl());
			System.out.println();

			driver.navigate().back();
			//recalling the array list for remaining links execution. 
			links=driver.findElements(By.tagName("a"));
		}

		//for taking a screen shots for all link elements in newtours application


	}
	//driver.close();
}





