package com.ApsrtcOnline;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class APSRTC_Header_Links 
{

	public static void main(String[] args) 
	{
		WebDriver driver= null;
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver =new FirefoxDriver();

		String url ="https://www.apsrtconline.in/oprs-web";
		driver.navigate().to(url);

		WebElement headerBlock=driver.findElement(By.className("menu"));
		List<WebElement> headerBlockLinks=headerBlock.findElements(By.tagName("a"));

		int headerBlockLinksCount=headerBlockLinks.size();
		System.out.println("The Total No.Of Links In The Header Block of APSRTC:"+headerBlockLinksCount);

		for(int m=0; m<headerBlockLinksCount; m++)
		{
			headerBlockLinks.get(m).getText();
			System.out.println(m+" "+"Links In The Header block of APSRTC:"+headerBlockLinks.get(m).getText());
		}



	}

}
