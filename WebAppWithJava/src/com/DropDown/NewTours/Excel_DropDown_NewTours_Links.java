package com.DropDown.NewTours;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_DropDown_NewTours_Links
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=null;

		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		String url="http://newtours.demoaut.com";
		driver.navigate().to(url);
		System.out.println("The Url Of the Newtours is:"+url);

		WebElement register=driver.findElement(By.linkText("REGISTER"));

		register.click();

		WebElement country=driver.findElement(By.name("country"));

		country.click();

		List<WebElement> countries =country.findElements(By.tagName("option"));

		int countriesCount=countries.size();
		System.out.println("The Total Number Of Countries are:"+countriesCount);

		FileInputStream file =new FileInputStream("./src/com/ExcelSheet/FirstExcelSheet.xlsx");

		XSSFWorkbook workBook=new XSSFWorkbook(file);

		XSSFSheet sheet =workBook.getSheet("Sheet5");

		
		for(int l=0; l<countriesCount; l++)
		{
			String countryName=countries.get(l).getText();
			System.out.println(l+"-"+countryName);

			Row row=sheet.createRow(l);
			Cell cell =row.createCell(l);

			cell.setCellValue(countryName);

			FileOutputStream fos=new FileOutputStream("./src/com/ExcelSheet/FirstExcelSheet.xlsx");

			workBook.write(fos);
	    }
    }
}
