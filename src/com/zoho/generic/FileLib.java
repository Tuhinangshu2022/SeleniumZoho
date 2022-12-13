 
package com.zoho.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * Its a generic class for fetching and setting data
 * @author Tuhinangshu
 *
 */
public class FileLib {
	/**
	 * To get data from property file
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	
	
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	/**
	 * To get data from excel 
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getExcelData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb =WorkbookFactory.create(fis);
		Cell currentcell = wb.getSheet(sheet).getRow(row).getCell(cell);
		
		CellType ctype = currentcell.getCellType();
		
		String data = "";
		
		if(ctype == CellType.STRING) {
			data = currentcell.getStringCellValue();
			
		}
		else if(ctype == CellType.NUMERIC) {
			double value = currentcell.getNumericCellValue();
			int val = (int) value;
			data = ""+val;
		}
		
		return data;
		
	}
	
	
	
	/**
	 * to set data into excel 
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public void setExcelData(String sheet, int row, int cell, String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb =WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		wb.close();
	}

}
