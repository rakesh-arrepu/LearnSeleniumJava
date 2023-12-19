package com.learnselenium.excelutils;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataReader {
	private static final String FILE_PATH = "./src/test/resources/TestData/qatech.xlsx";

	public static Object[][] readTestData() {
		try (Workbook workbook = WorkbookFactory.create(new FileInputStream(FILE_PATH))) {
			Sheet sheet = workbook.getSheetAt(0);
			int rowCount = sheet.getPhysicalNumberOfRows();
			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

			Object[][] data = new Object[rowCount - 1][colCount];

			for (int i = 1; i < rowCount; i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j < colCount; j++) {
					Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
					if(cell.getCellType() == CellType.STRING)
						data[i - 1][j] = cell.toString();
					else if(cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.BOOLEAN)
						data[i - 1][j] = String.valueOf(cell);
				}
			}

			return data;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
