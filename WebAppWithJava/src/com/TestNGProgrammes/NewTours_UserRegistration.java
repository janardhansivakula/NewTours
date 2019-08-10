package com.TestNGProgrammes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTours_UserRegistration extends BaseClass 
{
	@Test(priority=1)
	public void newTours_Register()
	{
		//<a href="mercuryregister.php?osCsid=b230ee78fb475da5bb2e71a11dc6be21">REGISTER</a>

		WebElement registerElmnt=driver.findElement(By.linkText("REGISTER"));
		registerElmnt.click();
	}

	@Test(priority=2)
	public void newTours_registration() throws IOException, InterruptedException
	{
		//<input maxlength="60" name="firstName" size="20">
		//<input maxlength="60" name="lastName" size="20">
		FileInputStream fis =  new FileInputStream("./src/com/ExcelSheet/MyThirdExcel.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet =workBook.getSheet("Sheet1");

		int rowCount=sheet.getLastRowNum();
		System.out.println("The Total Number Of Rows:"+rowCount);

		for(int k=0; k<=rowCount; k++)
		{
			Row row=sheet.getRow(k);
			driver.findElement(By.name("firstName")).sendKeys(row.getCell(0).getStringCellValue());
			driver.findElement(By.name("lastName")).sendKeys(row.getCell(1).getStringCellValue());
			//type casting
			double phoneNo=row.getCell(2).getNumericCellValue();
			long phoneNum=(long)phoneNo;
			String phoneNumber=Long.toString(phoneNum);
			driver.findElement(By.name("phone")).sendKeys(phoneNumber);
			driver.findElement(By.id("userName")).sendKeys(row.getCell(3).getStringCellValue());
			driver.findElement(By.name("address1")).sendKeys(row.getCell(4).getStringCellValue());
			driver.findElement(By.name("city")).sendKeys(row.getCell(5).getStringCellValue());
			driver.findElement(By.name("state")).sendKeys(row.getCell(6).getStringCellValue());
			//Type Casting
			double postal=row.getCell(7).getNumericCellValue();
			long postalNo=(long)postal;
			String postalCode=Long.toString(postalNo);
			driver.findElement(By.name("postalCode")).sendKeys(postalCode);
			driver.findElement(By.name("country")).sendKeys("INDIA");
			driver.findElement(By.id("email")).sendKeys(row.getCell(8).getStringCellValue());
			driver.findElement(By.name("password")).sendKeys(row.getCell(9).getStringCellValue());
			driver.findElement(By.name("confirmPassword")).sendKeys(row.getCell(10).getStringCellValue());
			driver.findElement(By.name("register")).click();

			String expected_UserName=row.getCell(8).getStringCellValue();
			System.out.println("The Expected User Name:"+expected_UserName);

			WebElement actula_RegisteredUserNameText=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b"));
			String act_userNameRegisteredText=actula_RegisteredUserNameText.getText();
			System.out.println("The Expected user Registered Name text:"+act_userNameRegisteredText);

			if(act_userNameRegisteredText.contains(expected_UserName))
			{
				System.out.println("The Registration Successful--PASS");
				row.createCell(11).setCellValue("The Registration Successful--PASS");
			}
			else
			{
				System.out.println("The Registration is Not Successful--FAIL");
				row.createCell(11).setCellValue("The Registration is Not Successful--FAIL");
			}
                //Thread.sleep(10000);
                //driver.navigate().back();
            
            FileOutputStream fos = new FileOutputStream("./src/com/ExcelSheet/FirstExcelSheet.xlsx");
               workBook.write(fos);
		}


	}

}
