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
import org.testng.annotations.Test;

public class CapturingAllRowsOfAllColumnsData extends BaseClass
{
   @Test
   public void capturingAllRwOfColumnsdata() throws IOException
   {
	FileInputStream fis = new FileInputStream("./src/com/ExcelSheet/FirstExcelSheet.xlsx");
	
	     XSSFWorkbook workBook =new XSSFWorkbook(fis);
	     XSSFSheet sheet = workBook.getSheet("Sheet6");
	    WebElement allRowsElement=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody"));
	    
	    List<WebElement> rowsDataElements=allRowsElement.findElements(By.tagName("tr"));
	                   int rowsDataCount=rowsDataElements.size();
	             
	       for(int rc=0; rc<rowsDataCount; rc++)
	       {
	    	  List <WebElement> columnsData=rowsDataElements.get(rc).findElements(By.tagName("td"));
	    	  System.out.println(columnsData);
	    	  
	    	      int columnsDataCount =columnsData.size();
	    	       Row row= sheet.createRow(rc);
	    	      for(int cc=0;cc<columnsDataCount;cc++)
	    	      {
	    	    	String cellData=columnsData.get(cc).getText();
	    	    	System.out.println(cellData+" ");
	    	        Cell cell=row.createCell(cc);
	    	        cell.setCellValue(cellData);
	    	        FileOutputStream fos = new FileOutputStream("./src/com/ExcelSheet/FirstExcelSheet.xlsx");
	    	    	workBook.write(fos);  
	    	      }
	    	      System.out.println();
	       }
     }
}
