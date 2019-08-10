package com.ExcelOpertionDynamic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Operation_Dynamic 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		FileInputStream file=new FileInputStream("./src/com/ExcelSheet/FirstExcelSheet.xlsx");


		XSSFWorkbook workBook= new XSSFWorkbook(file);

		XSSFSheet sheet=workBook.getSheet("Sheet4");

		Row row=sheet.createRow(0);
		Cell cell0=row.createCell(0);
		cell0.setCellValue("UserName");
		Cell cell1= row.createCell(1);
		cell1.setCellValue("Password");
		Cell cell2 = row.createCell(2);
		cell2.setCellValue("Result");

		Row row1= sheet.createRow(1);
		Cell cell3 =row1.createCell(0);
		cell3.setCellValue("Admin");
		Cell cell4 = row1.createCell(1);
		cell4.setCellValue("admin123");
		Cell cell5 = row1.createCell(2);

		//<input type="text" name="userName" size="10"><input name="txtUsername" id="txtUsername" type="text">
		WebElement u_name= driver.findElement(By.id("txtUsername"));
		String username = cell3.getStringCellValue();
		u_name.sendKeys(username);

		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		WebElement pwd = driver.findElement(By.id("txtPassword"));
		String password = cell4.getStringCellValue();
		pwd.sendKeys(password);

		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

		WebElement SignIn= driver.findElement(By.id("btnLogin"));
		SignIn.click();

		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

		WebElement  Welcome = driver.findElement(By.id("welcome"));
		String Actual_Welcome = Welcome.getText();
		System.out.println("The Actual Text after Login:"+Actual_Welcome);
		String Expected_Welcome = "Admin";
		System.out.println("The Expected Text After Login:"+Expected_Welcome);
		
		if(Actual_Welcome.contains(Expected_Welcome))
		{

			System.out.println("After Login Title is Matched-PASS");
			cell5.setCellValue("The Title is matched--PASS");


		}
		else
		{
			System.out.println("After Login Title is Not Matched-FAIL");
			cell5.setCellValue("The Title is Not Matched--FAIL");

		}
        
		FileOutputStream file1= new FileOutputStream("./src/com/ExcelSheet/FirstExcelSheet.xlsx");
		workBook.write(file1);
		driver.close();
	}

}
