package com.TestNGProgrammes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrangeHRM_Login_Admin_AddEmployee_EmployeeList extends BaseClass 
{
	@Test
	public void LoginORHMR() throws IOException, InterruptedException
	{
		//<input name="txtUsername" id="txtUsername" type="text">
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

		FileInputStream fis = new FileInputStream("./src/com/ExcelSheet/SecondExcel.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet =workBook.getSheet("Sheet2");

		Row row =sheet.getRow(1);
		String row1Ofcell0=row.getCell(0).getStringCellValue();
		String row1Ofcell1=row.getCell(1).getStringCellValue();
		WebElement userName=driver.findElement(By.id("txtUsername"));
		//Thread.sleep(7000);
		userName.sendKeys(row1Ofcell0);
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(row1Ofcell1);
		WebElement logInButton=driver.findElement(By.id("btnLogin"));
		//Thread.sleep(5000);
		logInButton.click();
		System.out.println("the ORHMR login Is Successful");
		//<a href="/orangehrm-4.2/symfony/web/index.php/pim/viewPimModule"
		//id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		WebElement pimElmnt=driver.findElement(By.id("menu_pim_viewPimModule"));

		Actions acts = new Actions(driver);
		acts.moveToElement(pimElmnt).perform();
		//id="menu_pim_addEmployee"
		WebElement addEmp=driver.findElement(By.id("menu_pim_addEmployee"));
		addEmp.click();
		//id="firstName"
		Thread.sleep(2000);
		//driver.switchTo().frame("rightMenu");
		Row row2=sheet.getRow(3);
		//String row3OfCell0=row2.getCell(0).getStringCellValue();
		//String row3OfCell1=row2.getCell(1).getStringCellValue();

		WebElement firstname=driver.findElement(By.id("firstName"));
		Thread.sleep(3000);
		firstname.sendKeys(row2.getCell(0).getStringCellValue());
		//id="lastName"
		WebElement lastname=driver.findElement(By.id("lastName"));
		lastname.sendKeys(row2.getCell(1).getStringCellValue());
		//id="btnSave"
		WebElement saveButton=driver.findElement(By.id("btnSave"));
		saveButton.click();

		//id="menu_pim_viewEmployeeList"
		WebElement empList=driver.findElement(By.id("menu_pim_viewEmployeeList"));
		empList.click();
		//id="ohrmList_chkSelectAll"
		WebElement checkBoxSel=driver.findElement(By.id("ohrmList_chkSelectAll"));
		Thread.sleep(3000);
		checkBoxSel.click();

		// //*[@id="resultTable"]/tbody/tr[1]/td[2]
		// //*[@id="resultTable"]/tbody/tr[13]/td[8]

		WebElement emplListBlock=driver.findElement(By.xpath("//*[@id=\'resultTable\']/tbody"));
		List<WebElement> rowsTable=emplListBlock.findElements(By.tagName("tr"));
		int rowsCount=rowsTable.size();
		//int rowCount=sheet.getLastRowNum();
		//System.out.println("The Total Rows in the Employee List Element:"+rowCount);

		for(int r=0; r<rowsCount; r++)
		{
			List<WebElement>columnsTable=rowsTable.get(r).findElements(By.tagName("td"));
			int columnsCount=columnsTable.size();
			Row row3=sheet.createRow(r);
			for(int c=0; c<columnsCount; c++ )
			{
				String columnName=columnsTable.get(c).getText();
				System.out.print(columnName+" ");
				Cell cell5=row3.createCell(c);
				cell5.setCellValue(columnName);
				FileOutputStream fos = new FileOutputStream("./src/com/Result/ORHRM.xlsx");
				workBook.write(fos);
			}
			System.out.println();
			//id="btnDelete"
			WebElement clickDeleteButton=driver.findElement(By.id("btnDelete"));
			clickDeleteButton.click();
			////*[@id="dialogDeleteBtn"]
			WebElement clickOkButton=driver.findElement(By.xpath("//*[@id=\'dialogDeleteBtn\']"));
			Thread.sleep(4000);
			clickOkButton.click();
		}
	}
}
