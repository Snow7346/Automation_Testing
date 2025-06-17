package com.dataDrivenUsingExcel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

  public class ReadDataFromExcelFile {
	String filepath = "/Users/arunprasad/Arun's Selenium WebDriver/Automation_project/LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
//  @Test
//  public void readDataFromExcelFile() {
//	    row = sheet.getRow(0);
//	    cell = row.getCell(0);
//	    System.out.println( cell.getStringCellValue());
//        System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
//        System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
//  }
  @Test
  public void readFullDataFromFile() {
	     int totalrows = sheet.getPhysicalNumberOfRows();
	     int totalcells = sheet.getRow(0).getPhysicalNumberOfCells();
         
	     for(int i=0;i<totalrows;i++) {
	    	 row = sheet.getRow(i);
	    	 for(int j = 0;j<totalcells;j++)
	    	 {
	    		cell = row.getCell(j);
	    		 System.out.print(cell.getStringCellValue()+ " |");
	    	 }
	    	 System.out.println();
	     }
  }
  
  @BeforeTest
  public void beforeTest() {
	  try {
	  file = new File(filepath);
	  fis = new FileInputStream(file);
	  wb = new XSSFWorkbook(fis);
	  sheet = wb.getSheet("LoginData");
	  
	  
	  }
	  catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.close();
	  fis.close();
	  
  }

}
