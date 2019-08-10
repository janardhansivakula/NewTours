package com.ExcelReadOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Operation 
{

	public static void main(String[] args) throws IOException 
	{   //identify the path of the file
        FileInputStream file = new FileInputStream("./src/com/ExcelSheet/FirstExcelSheet.xlsx");;
        //Identifying The WorkBook From File
        XSSFWorkbook workBook=new XSSFWorkbook(file);
        //identifying The Sheet From the workbook
        XSSFSheet sheet=workBook.getSheet("sheet1");
              Row row=sheet.getRow(0);
              Cell Cell=row.getCell(0);
        String data=Cell.getStringCellValue();
        System.out.println(data);
	}

}
