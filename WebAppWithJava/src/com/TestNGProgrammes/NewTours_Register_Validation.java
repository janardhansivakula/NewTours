package com.TestNGProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTours_Register_Validation extends BaseClass 
{
	
	@Test
	public void newTours_Register_Data() throws InterruptedException
	{
	   //<a href="mercuryregister.php">REGISTER</a>
		
	WebElement register=driver.findElement(By.linkText("REGISTER"));
	        register.click();
	WebElement registerBlock=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table"));
	          
	//To Automate The CONTACT INFORMATION Block
	//<input maxlength="60" name="firstName" size="20">
	//<input maxlength="60" name="lastName" size="20">
	//<input maxlength="20" name="phone" size="15">
	//<input name="userName" id="userName" size="35" maxlength="64">
	
	WebElement firstName=driver.findElement(By.name("firstName"));
    firstName.sendKeys("Janardhan");
    WebElement lastName=driver.findElement(By.name("lastName"));
    lastName.sendKeys("Sivakula");
    WebElement phoneNum=driver.findElement(By.name("phone"));
    phoneNum.sendKeys("9908465435");
    WebElement email=driver.findElement(By.id("userName"));
    email.sendKeys("sivakulajanardhan259@gmail.com");
	
    //To Automate MAILING INFORMATION Block
	//<input maxlength="60" name="address1" size="40">
	//<input maxlength="60" name="city" size="15">
	//<input maxlength="40" name="state">
	//<input maxlength="20" name="postalCode" size="15">
   //name="country"
	
    WebElement myAddress=driver.findElement(By.name("address1"));
    myAddress.sendKeys("Nellore,Ram Nagar");
    WebElement city=driver.findElement(By.name("city"));
    city.sendKeys("Nellore");
    WebElement state=driver.findElement(By.name("state"));
    state.sendKeys("AP");
    WebElement postalCodeNum=driver.findElement(By.name("postalCode"));
    postalCodeNum.sendKeys("524003");
    Thread.sleep(6000);
    WebElement countryName=driver.findElement(By.name("country"));
    countryName.click();
    
    //To Automate USER INFORMATION Block
    //<input name="email" id="email" size="20" maxlength="60">
    //<input maxlength="60" name="password" size="20" type="password">
    //<input maxlength="60" name="confirmPassword" size="20" type="password">
    //<input type="image" name="register" src="/images/forms/submit.gif?osCsid=78528265075f4a964832a47e17998024"
    //width="60" height="23" border="0">
    
    WebElement myUserName=driver.findElement(By.id("email"));
    myUserName.sendKeys("janardhan");
    WebElement myPassword=driver.findElement(By.name("password"));
    myPassword.sendKeys("JBjeggu@1432");
    WebElement myConfirmPassword=driver.findElement(By.name("confirmPassword"));
    myConfirmPassword.sendKeys("JBjeggu@1432");
    WebElement submit=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input"));
    submit.click();
    //Validate The Register page after submit the page
    
    String expected_TitleRegister="Mercury";
    System.out.println("The Expected title of");
	
	}
	
	

}
