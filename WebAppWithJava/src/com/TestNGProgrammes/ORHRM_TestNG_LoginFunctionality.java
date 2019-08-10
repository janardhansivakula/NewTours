package com.TestNGProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ORHRM_TestNG_LoginFunctionality 
{
	WebDriver driver=null;


	@BeforeMethod
	public void beforeStartsTheChromeBrowser()
	{

		System.out.println("The Chrome Browser will be launch");
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("The Chrome Browser Is opened");

		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("The URL Is Navigated and ORHRM LOgin Page Opened");
		System.out.println("********************************************");


	}

	@Test
	public void OrangeHRMLogInFun()
	{
        System.out.println("First We Should Recognise and enter username");
		WebElement	userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		System.out.println("We Recognised and Entered The Username");

		System.out.println("Second We Should Recognise and Enter Password");
		WebElement	password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		System.out.println("We Recognised and Entered the Password");

		System.out.println("We should Recognise and click on login button");
		WebElement	logIn=driver.findElement(By.id("btnLogin"));
		logIn.click();;
		System.out.println("We Recgnised And Clicked On [Login] Button");
		System.out.println("Upto now The OrangeHRm Login Functionality is Successful");
		System.out.println("**********************************************************");

		System.out.println("After That We Should Validate weather It is Successfully Login or Not?");
		System.out.println("======================================================================");

		String expected_AftrLoginTitle="Welcome";
		System.out.println("The Expected Aftr login Title is:"+expected_AftrLoginTitle);

		System.out.println("We Should validate The Actual Title of the OrangeHRM");
		WebElement actual_Title=driver.findElement(By.id("welcome"));
		String actual_AftrLoginTitle=actual_Title.getText();
		System.out.println("The Actual After Login Title Is:"+actual_AftrLoginTitle);

		if(actual_AftrLoginTitle.contains(expected_AftrLoginTitle))
		{
			System.out.println("The ORHRM After Login Title Is matched--PASS");
		}
		else
		{
			System.out.println("The ORHRM after Login Tite is not Matched..FAIL");
		}
	}

	/*id="txtUsername"----id="txtPassword"----id="btnLogin"
	<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>*/

	@AfterMethod
	public void afterMethod ()
	{
		driver.quit();
		System.out.println("The Chrome Browser is Terminated");
	}
}