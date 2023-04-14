package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	public static void main(String[] args) throws IOException {

		// 1 - LOCATION

		File f = new File("C:\\Users\\Veera\\eclipse-workspace\\Maven_POM\\src\\test\\resources\\Excel\\data.xlsx");

		// 2 - inputstream

		FileInputStream fs = new FileInputStream(f);
		
		// 3 -work book
        Workbook w = new XSSFWorkbook(fs);

		// sheet name
		Sheet s = w.getSheet("sheet1");
		
		
		// row
		Row r = s.getRow(1);
		
		// cell
		Cell cell = r.getCell(1);
		System.out.println(cell);

		int rowCount = s.getPhysicalNumberOfRows();
		System.out.println("row-----size "+rowCount);
		
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row row = s.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell2 = row.getCell(j);
				System.out.println(cell2);
			}
		}
		
		
		
		
		
		
		
	}

}
