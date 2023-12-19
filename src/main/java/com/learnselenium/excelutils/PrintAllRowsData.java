package com.learnselenium.excelutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintAllRowsData {
public static  void main(String args[]) throws IOException {
        
        //Create an object of File class to open xlsx file
        File file = new File("/Users/rakesh_arrepu/Documents/TestData.xlsx");// C:\\Documents\\TestData.xlsx
        
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        
        try (//Creating workbook instance that refers to .xls file
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {
			System.out.println("Sheets in workbook- "+ workbook.getNumberOfSheets());
			
			//Creating a Sheet object using the sheet Index- At index 0
			XSSFSheet sheet=workbook.getSheetAt(0);
			
			System.out.println("Rows: "+sheet.getPhysicalNumberOfRows());
			
			//Create a row object to retrieve row at index 1
			XSSFRow row=sheet.getRow(1);
			System.out.println("Cells: "+row.getPhysicalNumberOfCells());
			//Create a cell object to retreive cell at index 5
			XSSFCell cell=row.getCell(2);
			
			//Get the address in a variable
			String lastname= cell.getStringCellValue();
			
			//Printing the address
			System.out.println("lastname is :"+ lastname);
		}
    }

}
