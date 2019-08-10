package cm.orangehrm_links;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automatin_OrangeHRM 
{

	public static void main(String[] args) 
	{
		WebDriver driver =null;
		//System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver=new ChromeDriver(); 
		
		/*String url1="http://www.newtours.demoaut.com";
		driver.get(url1);
		java.util.List<WebElement>links1=driver.findElements(By.tagName("a"));*/
		
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
		driver=new FirefoxDriver();
		/*String url2="http://opensource-demo.orangehrmlive.com";
		driver.get(url2);
		  
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 
		driver.findElement(By.id("btnLogin")).click();
		 java.util.List<WebElement> links=driver.findElements(By.tagName("a"));
         int linksCount=links.size();
         System.out.println("The Total No.Of Links at OrangeHRM are:"+linksCount);
         String linkName=links.get(0).getText();*/
         		           
		 //System.out.println("The Total number Of Links names In newtours is:"+links1.indexOf(0));
		//System.out.println("The Total number Of Links names In newtours is:"+links1.));
		/*int linkscount1=links1.size();
		System.out.println("The Total Number Of Links in newtours Home Page are:"+linkscount1);
		
		           Iterator<WebElement> linksNames1 =links1.iterator();
		           while(linksNames1.hasNext()) 
		           {
					 System.out.println("The Total Names Of The Links in the newtours are:"+linksNames1.next());
				   }*/
		          
		   
		String url2 ="https://www.google.co.in";
		driver.navigate().to(url2);
		java.util.List<WebElement>links2=driver.findElements(By.tagName("a"));
		int linksCount2 =links2.size();
	    System.out.println("The total number of links in google Home Page:" +linksCount2);
		
		/*String url3 ="http://bing.com";
		driver.navigate().to(url3);
	    java.util.List<WebElement> links3 =driver.findElements(By.tagName("a"));
	    int linksCount3=links1.size();
	    System.out.println("The total number of Links of bing Home Page is:"+linksCount3);*/
	   	
	    /*driver.get("http://www.youtube.com");
        java.util.List<WebElement> links4 =driver.findElements(By.tagName("a"));
        int linksCount4 =links4.size();
        System.out.println("The Total No.Of Links Of Youtube Home Page is:"+linksCount4);
		Thread.sleep(10000);*/
		           driver.quit();
	}
}
