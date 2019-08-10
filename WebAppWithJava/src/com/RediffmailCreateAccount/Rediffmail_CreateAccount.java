package com.RediffmailCreateAccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffmail_CreateAccount {

	public static void main(String[] args) 
	{
	     WebDriver driver=null;
	     System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
	     driver = new FirefoxDriver(); 
	     String url="http://register.rediff.com/register/register.php?FormName=user_details";
	     driver.navigate().to(url);
	     
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     //The Below Coding will not working bcoz the properties of the  elements has changing automatically
	     /*//<input type="text" onblur="fieldTrack(this);" name="name6e7f4a72" value="" style="width:185px;" maxlength="61">
	     //<input type="text" onblur="fieldTrack(this);" name="name6e7f4a72" value="" style="width:185px;" maxlength="61">
         //<input type="text" onblur="fieldTrack(this);" name="name6e7f4a72" value="" style="width:185px;" maxlength="61">             
	      WebElement createAcc=driver.findElement(By.name("name6e7f4a72"));
	      createAcc.sendKeys("JEGGU");*/
	     
	     
	      //driver.findElement(By.xpath("//*[starts-with(@name,'name')]")).sendKeys("JOHNBOY");;
	    WebElement firstnameElement=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input"));
	    firstnameElement.sendKeys("Ganesh");;;;;;;;
	     
	    //<input type="text" name="login122e8b7c" value="" style="width:185px;" maxlength="30" onclick="javascript:UncheckAllOptions();" 
	    //onfocus="javascript:checkFullName(document.forms[0].name122e8b7c.value);" onblur="fieldTrack(this);">
	    //<input type="text" name="login099f6f44" value="" style="width:185px;" maxlength="30" onclick="javascript:UncheckAllOptions();" 
	    //onfocus="javascript:checkFullName(document.forms[0].name099f6f44.value);" onblur="fieldTrack(this);">
	    
	    driver.findElement(By.xpath("//*[starts-with(@name,'login')]")).sendKeys("janardhan");
	    
	    //<select name="DOB_Day287379fb" onchange="fieldTrack(this);"><option value="">Day</option><option value="01">01</option><option value="02">02</option><option value="03">03</option><option value="04">04</option><option value="05">05</option><option value="06">06</option><option value="07">07</option><option value="08">08</option><option value="09">09</option><option value="10">10</option><option value="11">11</option><option value="12">12</option><option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option><option value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option><option 
	    //value="29">29</option><option value="30">30</option><option value="31">31</option></select>
         //<select name="DOB_Day6f69c9d0" onchange="fieldTrack(this);"><option value="">Day</option><option value="01">01</option><option value="02">02</option><option value="03">03</option><option value="04">04</option><option value="05">05</option><option value="06">06</option><option value="07">07</option><option value="08">08</option><option value="09">09</option><option value="10">10</option><option value="11">11</option><option value="12">12</option><option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option><option value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option
	    //value="26">26</option><option value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option></select>
	    
	   WebElement dropDownElement=driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Day')]"));
	   dropDownElement.click();
	   
	   Select selection1 = new Select(dropDownElement);
	   //selection1.selectByIndex(25);
	  selection1.selectByValue("25");;
	   //selection1.selectByVisibleText("25");;
	}

}
