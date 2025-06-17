package com.dataDrivenUsingExcel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class WriteMultiplelineDataIntoExcel {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
  @Test
  public void writeData() {
	  row =  sheet.createRow(0);
	  cell = row.createCell(0);
	  cell.setCellValue("Arun");
	  
	  cell = row.createCell(1);
	  cell.setCellValue("Gokul");
	  
	  row =  sheet.createRow(1);
	  cell = row.createCell(0);
	  cell.setCellValue("Karthik");
	  
	  cell = row.createCell(1);
	  cell.setCellValue("Abbas");
	  
	  row =  sheet.createRow(2);
	  cell = row.createCell(0);
	  cell.setCellValue("nitin");
	  
	  cell = row.createCell(1);
	  cell.setCellValue("swapnil");
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  try {
	  file = new File("MultipleLineData.xlsx");
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkbook();
	  sheet = wb.createSheet("MultipleData");
	  
  }catch(Exception e) {
	  System.out.println(e.getMessage());
  }
  }
  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);
	  wb.close();
	  fos.close();
	  
	  
	  
	  
  }

}
