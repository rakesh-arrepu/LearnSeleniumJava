package com.learnselenium.excelutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {
	public static void main(String args[]) throws IOException {

		File file = new File("/Users/rakesh_arrepu/Documents/TestData.xlsx");// C:\\Documents\\TestData.xlsx
		FileInputStream inputStream = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		System.out.println("Sheets in workbook- " + wb.getNumberOfSheets());
		XSSFSheet sheet = wb.getSheetAt(0);
		int totRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total Rows in sheet " + totRows);
		for(int i=0;i<totRows;i++) {
			int cells = sheet.getRow(i).getPhysicalNumberOfCells();
			System.out.println("No of Cells present: "+ cells);
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<cells;j++) {
				XSSFCell cell = row.getCell(j); 
				String cellData="";
				if(i!=0 && j==4) {
					double num = cell.getNumericCellValue();
					cellData = String.valueOf(num);
				} else {
				 cellData = cell.getStringCellValue();
				}
				
				System.out.println("The value present in Row: "+ i + "and cell: "+ j +"is: "+cellData);
			}
		}
		
		

	}

}
