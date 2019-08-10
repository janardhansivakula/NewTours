package com.TestNGProgrammes;
	
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

  public class BaseClass 
  {
		WebDriver driver=null;
		//String url="https://www.timeanddate.com/worldclock/";    
        //String url="http://www.echoecho.com/htmlforms10.htm";
		//String url="http://www.newtours.demoaut.com";
		String url="https://127.0.0.1/orangehrm-4.2/symfony/web/index.php/auth/login";
		@BeforeTest
		public void setUp()
		{
			System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("The Chrome Browser is launched");
			driver.navigate().to(url);
			System.out.println("The URL is Navigated");
			
			driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			//driver.manage().deleteAllCookies();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
		@AfterTest
		public void closedBrowser()
		{
			System.out.println("The Browser Is Closed");
			driver.quit();
		}
}
