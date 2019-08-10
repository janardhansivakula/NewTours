package amazon.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAmazon_homepage 
{
	      public static void main(String[] args) throws InterruptedException 
		  {
		   WebDriver driver=null;
		   String url="http://opensource-demo.orangehrmlive.com";
		   System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get(url);
		   
		   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		   Thread.sleep(3000);
		   driver.findElement(By.id("btnLogin")).click();
		   
		   List<WebElement> links=driver.findElements(By.tagName("a"));
		   int linksCount=links.size();
		   System.out.println("the total number of links in newtours page are:"+linksCount);
			
		    for(int i=0;i<linksCount;i++)
			{
		      if(links.get(i).isDisplayed())
	     	  {
		    	   String linkNames =links.get(i).getText();
			    System.out.println(i+"-"+linkNames);
	     	  }
		      
		   }
		    
		     String expected_LoginTitle="Welcome";
		     System.out.println("the Expected Login Title Of ORHRM:"+expected_LoginTitle);
		     WebElement actual_WebElement=driver.findElement(By.id("welcome"));
		     String actual_WelcomeText=actual_WebElement.getText();
		     System.out.println("The Actual Welcome Text is:"+actual_WelcomeText);
		                    
		     if(actual_WelcomeText.contains(expected_LoginTitle))
		     {
		    	 System.out.println("Operation is success--PASS...");
		     }
		     else
		     {
		    	 System.out.println("Operation  is not successful---FAIL..");
		     }
		           Thread.sleep(2000);
		        driver.findElement(By.id("welcome")).click();;
		        driver.findElement(By.id("aboutDisplayLink")).click();
		                        Thread.sleep(8000);
		        driver.findElement(By.className("close")).click();
		        driver.findElement(By.linkText("Logout")).click();
		        Thread.sleep(2000);
		         
		        driver.close();
		}

}

	
