
package com.excel.DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {
	
	XSSFWorkbook workbook = null;
	
	//constructor
	public ExcelLib(String path) throws IOException {
		
		File excelFile = new File(path);
		
		FileInputStream fis = new FileInputStream(excelFile);
		
		workbook = new XSSFWorkbook(fis);
		
		
	}
	
	public String getTestData(int cellNum, int rowNum) {
		
		//first sheet
		return workbook.getSheetAt(0).getRow(rowNum).getCell(cellNum).getStringCellValue();
		
		
		
		
	}
	
	
	
	
	
	
	
}