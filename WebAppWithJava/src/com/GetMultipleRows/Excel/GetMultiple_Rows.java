package com.GetMultipleRows.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetMultiple_Rows
{

	public static void main(String[] args) throws IOException 
	{
      FileInputStream file = new FileInputStream("./src/com/GetMultipleRows/Excel/MythirdExcel.xlsx");
      
      XSSFWorkbook workbook =new XSSFWorkbook(file);
      
      XSSFSheet sheet=workbook.getSheet("Sheet3");
      
           int rowCount=sheet.getLastRowNum();
           
              for(int k=0; k<=rowCount; k++)
              {
        	       Row row=sheet.getRow(k);
        	       int cellCount=row.getLastCellNum();
        	       
        	       for(int l=0; l<cellCount; l++)
        	         {
        	        	   String data=row.getCell(l).getStringCellValue();
        	        	   System.out.print(data+" ");
        	         }
        	         System.out.println();
        	         
           }
     }
}
