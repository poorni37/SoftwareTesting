package org.sim;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {

		// Mention Excel Sheet path

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenSample\\Excel\\Manual Testing TestCases.xlsx");

		// To read File

		FileInputStream fis = new FileInputStream(f);

		// create workbook
		Workbook wb = new XSSFWorkbook(fis);

		// get sheet from workbook
		Sheet my = wb.getSheet("Sheet1");

		// get row
//		Row row = my.getRow(2);

		// get cell
//		Cell cell = row.getCell(1);

//		System.out.println(cell);

		// iterate data in excel

//		for (int i = 0; i < my.getPhysicalNumberOfRows(); i++) {
//			Row iteraterow = my.getRow(i);
//
//			for (int j = 0; j < iteraterow.getPhysicalNumberOfCells(); j++) {
//				Cell iteratecell = iteraterow.getCell(j);
//
//				System.out.println(iteratecell);
//			}
//
//		}
//		
		
		//iterate all cells with data types
		
		for (int i = 0; i < my.getPhysicalNumberOfRows(); i++) {
			Row irow = my.getRow(i);

			for (int j = 0; j < irow.getPhysicalNumberOfCells(); j++) {
				Cell icell = irow.getCell(j);

			int cellType = icell.getCellType();
				
			if (cellType ==1) {
				String value = icell.getStringCellValue();
				
				System.out.println(value);
				
				
			}
			
			else if (DateUtil.isCellDateFormatted(icell)) {
				Date dateCellValue = icell.getDateCellValue();
				// convert date to string
				SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yy"); 
				String forvalue = s.format(dateCellValue);
				
				 System.out.println(forvalue);
			}  
				
			else {
				double d = icell.getNumericCellValue();
	
				long l = (long)d;
				
				// convert to string
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
				
			}
			
			   
			}

		}
		
		
		
	}
	
	

}
