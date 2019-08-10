package com.AutoIt.NewTours;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoIt_OrangeHRM extends BaseClass

{
	
   @Test(priority=1)
   public void orangHRM_AutoIt()
   {
	  WebElement userName=driver.findElement(By.id("txtUsername"));  
	  userName.sendKeys("Admin");
	  WebElement password=driver.findElement(By.id("txtPassword"));  
	  password.sendKeys("admin123");
	  WebElement signInButton=driver.findElement(By.id("btnLogin"));  
	  signInButton.click();
    }
   @Test(priority=2)
   public void pimElmnt() throws IOException, InterruptedException
   {
	  WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
	  Actions acts= new Actions(driver);
	  acts.moveToElement(pim).perform();
	 WebElement addEmp=driver.findElement(By.id("menu_pim_addEmployee"));
	 addEmp.click();
	 WebElement firstName=driver.findElement(By.id("firstName"));
	 firstName.sendKeys("Jaggu");
	 WebElement lastName=driver.findElement(By.id("lastName"));
	 lastName.sendKeys("Janu");
	// Thread.sleep(2000);
	WebElement selectFile=driver.findElement(By.id("photofile"));

	selectFile.click();
	 
	java.lang.Runtime.getRuntime().exec("E:\\Janardhan_Selenium_Java\\AutoIt\\src\\com\\AutoIt\\NewTours\\Baby.JPG_AutoIT.2.exe");
	  WebElement saveButton =driver.findElement(By.id("btnSave"));
	  saveButton.click();
	 
   }
   
}
