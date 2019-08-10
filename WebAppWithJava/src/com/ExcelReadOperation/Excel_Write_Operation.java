package com.ExcelReadOperation;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_Operation 
{

	public static void main(String[] args) throws IOException  
	{
       FileInputStream file = new FileInputStream("./src/com/ExcelSheet/FirstExcelSheet.xlsx");
       
      XSSFWorkbook workBook =new XSSFWorkbook(file);
      
      XSSFSheet sheet =workBook.getSheet("sheet1");
      
      Row row=sheet.createRow(4);
      
      Cell cell=row.createCell(8);
      
    cell.setCellValue("4Th Row ANd 8th Column");
    
   FileOutputStream file2 =new FileOutputStream("./src/com/ExcelSheet/FirstExcelSheet.xlsx");  
    
    workBook.write(file2);
    
      
      
       
	}

}
