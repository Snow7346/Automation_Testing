package com.dataDrivenUsingExcel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class WriteDataIntoExcelFile {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
    XSSFCell cell;
	
	
	
  @Test
  public void writeDataIntoFile(){
	 row = sheet.createRow(0);
	 cell = row.createCell(0);
	 cell.setCellValue("Arun");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  file = new File("MyFirstExcelFile.xlsx");
	  try {
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		//sheet = wb.createSheet(); this function create sheets by index
		sheet = wb.createSheet("MyFirstSheet");
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	  
	  
  }

  @AfterTest
  public void afterTest() throws IOException  {
	  wb.write(fos);
	  wb.close();
	  fos.close();
	  
  }

}
